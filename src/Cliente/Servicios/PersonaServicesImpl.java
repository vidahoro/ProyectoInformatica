/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente.Servicios;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Modelo.dominio.Persona;
import Modelo.DTO.PeticionDTO;
import Modelo.DTO.ResultadoDTO;

/**
 *
 * @author LENOVO
 */
public class PersonaServicesImpl implements PersonaServicesInt{

    private final cliente objCliente;
    
    public PersonaServicesImpl(cliente objCliente)
    {
        this.objCliente=objCliente;
    }
    
    @Override
    public int iniciarSesion(String numeroIdentificacion, String tipoIdentificacion, String contrasena) {
       int codigoResultado;
        try {
            objCliente.crearConexion();        
            Gson objConvertidor= new Gson();
            PeticionDTO objPeticion= new PeticionDTO();
            String argumentos=numeroIdentificacion+","+tipoIdentificacion+","+contrasena;
            objPeticion.setAccion("iniciarSesion");
            objPeticion.setArgumentos(argumentos);
            String JSON = objConvertidor.toJson(objPeticion);
            String respuestaJSON=objCliente.enviarPeticion(JSON);//cliente se bloquea

            ResultadoDTO objResultado= objConvertidor.fromJson(respuestaJSON, ResultadoDTO.class); 
            codigoResultado= objResultado.getCodigoResultado();
            objCliente.cerrarConexion();
        } catch (IOException ex) {
            codigoResultado=0;
        }
        
        return codigoResultado;    
    }

    @Override
    public int registrarPersona(String nombres, String apellidos, String tipoIdentificacion, String numeroIdentificacion, String imagenBase64) {
       
        int codigoResultado;
        try {
            this.objCliente.crearConexion();
            Gson gson= new Gson();
            PeticionDTO objPeticion= new PeticionDTO();
            ResultadoDTO objResultado= new ResultadoDTO();
            Persona objPersona= new Persona(tipoIdentificacion, numeroIdentificacion, nombres, apellidos,imagenBase64);
            String JSONPersona=gson.toJson(objPersona);
            objPeticion.setAccion("registrarPersona");
            objPeticion.setArgumentos(JSONPersona);
            String JSONPeticion=gson.toJson(objPeticion);
            String resultado=objCliente.enviarPeticion(JSONPeticion);
            objResultado=gson.fromJson(resultado, ResultadoDTO.class);
            codigoResultado= objResultado.getCodigoResultado();
            objCliente.cerrarConexion();
        } catch (IOException ex) {
           codigoResultado=0;
        }
        return codigoResultado;
    }

    @Override
    public Persona consultarPersona(String tipoIdentificacion, String numeroIdentificacion) {
      
       Persona objPersonaRetornar = null;
        try {
            objCliente.crearConexion();
        
            Gson objConvertidor= new Gson();
            PeticionDTO objPeticion= new PeticionDTO();
            String argumentos= tipoIdentificacion+","+numeroIdentificacion;
            
            objPeticion.setAccion("identificarPersona");
            objPeticion.setArgumentos(argumentos);
            
            String JSON = objConvertidor.toJson(objPeticion);
            
            String respuestaJSON=objCliente.enviarPeticion(JSON);
            
            
            ResultadoDTO objResultado= objConvertidor.fromJson(respuestaJSON, ResultadoDTO.class); 
            objCliente.cerrarConexion();
        
            if(objResultado.getCodigoResultado()==1)
            {
                objPersonaRetornar  = objConvertidor.fromJson(objResultado.getJSONResultado(), Persona.class); 
            }
            
        } 
        catch (IOException ex) {
            objPersonaRetornar=null;
        }
            
        return objPersonaRetornar;
    }

    @Override
    public ArrayList<Persona> listarPersonas() {
        ArrayList<Persona> listadoPersonas;
        
        try {
            objCliente.crearConexion();
        
            Gson objConvertidor= new Gson();
            PeticionDTO objPeticion= new PeticionDTO();            
            objPeticion.setAccion("listarPersonas");            
            String JSON = objConvertidor.toJson(objPeticion);
            String respuestaJSON=objCliente.enviarPeticion(JSON);
           
            ResultadoDTO objResultado= objConvertidor.fromJson(respuestaJSON, ResultadoDTO.class); 
            String listaJSON = objResultado.getJSONResultado();
            java.lang.reflect.Type listType = new TypeToken<ArrayList<Persona>>(){}.getType();
           listadoPersonas = objConvertidor.fromJson(listaJSON, listType);
            objCliente.cerrarConexion();
        
        } 
        catch (IOException ex) {
            listadoPersonas=null;
        }
            
        
        return listadoPersonas;
    }
    
}
