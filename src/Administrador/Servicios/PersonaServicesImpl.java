/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrador.Servicios;

import Modelo.Administrador;
import Modelo.Comida;
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

    private final Admin objCliente;
    
    public PersonaServicesImpl(Admin objCliente)
    {
        this.objCliente=objCliente;
    }
    
    @Override
    public int iniciarSesion(String usuario, String contrasenia) {
       int codigoResultado;
        try {
            objCliente.crearConexion();        
            Gson objConvertidor= new Gson();
            PeticionDTO objPeticion= new PeticionDTO();
            String argumentos=usuario+","+contrasenia;
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
    public Administrador consultarPersona(String login, String password) {
      
       Administrador objAdminRetornar = null;
        try {
            objCliente.crearConexion();
        
            Gson objConvertidor= new Gson();
            PeticionDTO objPeticion= new PeticionDTO();
            String argumentos= login+","+password;
            
            objPeticion.setAccion("identificarPersona");
            objPeticion.setArgumentos(argumentos);
            
            String JSON = objConvertidor.toJson(objPeticion);
            
            String respuestaJSON=objCliente.enviarPeticion(JSON);
            
            
            ResultadoDTO objResultado= objConvertidor.fromJson(respuestaJSON, ResultadoDTO.class); 
            objCliente.cerrarConexion();
        
            if(objResultado.getCodigoResultado()==1)
            {
                objAdminRetornar  = objConvertidor.fromJson(objResultado.getJSONResultado(), Administrador.class); 
            }
            
        } 
        catch (IOException ex) {
            objAdminRetornar=null;
        }
            
        return objAdminRetornar;
    }
/*
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
*/    

    @Override
    public void editarAdmin(Administrador Admin) {
        String login = Admin.getLogin();
        String password = Admin.getConstrasenia();
        String name = Admin.getNombre();
        String lastname = Admin.getApellido();
        try{
            objCliente.crearConexion();
            
            Gson objConvertidor= new Gson();
            PeticionDTO objPeticion= new PeticionDTO();
            String argumentos= login+","+name+","+lastname+","+password;
            
            objPeticion.setAccion("editarAdmin");
            objPeticion.setArgumentos(argumentos);
            
            String JSON = objConvertidor.toJson(objPeticion);
            String respuestaJSON=objCliente.enviarPeticion(JSON);
            
            ResultadoDTO objResultado= objConvertidor.fromJson(respuestaJSON, ResultadoDTO.class); 
            objCliente.cerrarConexion();
        }
        catch (IOException ex){
            
        }
    }
    
    @Override
    public ArrayList<Comida> listarComidas() {
        ArrayList<Comida> ListaDeComidas;
        
        try {
            objCliente.crearConexion();
        
            Gson objConvertidor= new Gson();
            PeticionDTO objPeticion= new PeticionDTO();            
            objPeticion.setAccion("listarComidas");            
            String JSON = objConvertidor.toJson(objPeticion);
            String respuestaJSON=objCliente.enviarPeticion(JSON);
           
            ResultadoDTO objResultado= objConvertidor.fromJson(respuestaJSON, ResultadoDTO.class); 
            String listaJSON = objResultado.getJSONResultado();
            java.lang.reflect.Type listType = new TypeToken<ArrayList<Comida>>(){}.getType();
            ListaDeComidas = objConvertidor.fromJson(listaJSON, listType);
            objCliente.cerrarConexion();
        
        } 
        catch (IOException ex) {
            ListaDeComidas=null;
        }
            
        
        return ListaDeComidas;
    
        
    }
    
    @Override
    public int AgregarComida(String Foto, String Codigo, String Nombre, String Tipo, float Valor) {
        int codigoResultado;
        try {
            this.objCliente.crearConexion();
            Gson gson= new Gson();
            PeticionDTO objPeticion= new PeticionDTO();
            ResultadoDTO objResultado= new ResultadoDTO();
            Comida objComida= new Comida(Foto, Codigo, Nombre, Tipo, Valor);
            String JSONPersona=gson.toJson(objComida);
            objPeticion.setAccion("AgregarComida");
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
    public int eliminarComida(Comida objComida) {
        int codigoResultado;
        try {
            this.objCliente.crearConexion();
            Gson gson= new Gson();
            PeticionDTO objPeticion= new PeticionDTO();
            ResultadoDTO objResultado= new ResultadoDTO();
            String JSONPersona=gson.toJson(objComida);
            objPeticion.setAccion("eliminarComida");
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
    public int editarComida(String CodigoOld, Comida objComidaEditada) {
        int codigoResultado;
        
        String CodigoNew = objComidaEditada.getCodigo();
        String FotoNew = objComidaEditada.getFoto();
        String TipoNew = objComidaEditada.getTipo();
        String ValorNew = Float.toString(objComidaEditada.getValor());
        String NombreNew = objComidaEditada.getNombre();
        try {
            this.objCliente.crearConexion();
            Gson gson= new Gson();
            PeticionDTO objPeticion= new PeticionDTO();
            ResultadoDTO objResultado= new ResultadoDTO();
            String argumentos= CodigoOld+","+CodigoNew+","+NombreNew+","+TipoNew+","+ValorNew+","+FotoNew;
            objPeticion.setAccion("editarComida");
            objPeticion.setArgumentos(argumentos);
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
    
}
