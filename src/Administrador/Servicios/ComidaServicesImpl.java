/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrador.Servicios;

import Modelo.Comida;
import Modelo.EnumTipoComida;
import com.google.gson.Gson;
import java.io.IOException;
import Administrador.Servicios.Admin;
import Cliente.Servicios.cliente;
import Modelo.DTO.PeticionDTO;
import Modelo.DTO.ResultadoDTO;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
/**
 *
 * @author Victor
 */
public class ComidaServicesImpl implements ComidaServicesInt {
    private final Admin objadmin;
    private  cliente objCliente;

    public ComidaServicesImpl(Admin objadmin) {
        this.objadmin= objadmin;
    }
    
    
    @Override
    public int registrarComida(String Foto, String Codigo, String Nombre, String Tipo, float Valor) {
        int codigoResultado;
        try {
            this.objadmin.crearConexion();
            Gson gson= new Gson();
            PeticionDTO objPeticion= new PeticionDTO();
            ResultadoDTO objResultado= new ResultadoDTO();
            Comida objComida= new Comida(Foto, Codigo, Nombre, Tipo, Valor);
            String JSONPersona=gson.toJson(objComida);
            objPeticion.setAccion("AgregarComida");
            objPeticion.setArgumentos(JSONPersona);
            String JSONPeticion=gson.toJson(objPeticion);
            String resultado=objadmin.enviarPeticion(JSONPeticion);
            objResultado=gson.fromJson(resultado, ResultadoDTO.class);
            codigoResultado= objResultado.getCodigoResultado();
            objadmin.cerrarConexion();
        } catch (IOException ex) {
           codigoResultado=0;
        }
        return codigoResultado;
    }

    @Override
    public ArrayList<Comida> listarComidas() {
                ArrayList<Comida> ListaDeComidas;
        
        try {
            objCliente.crearConexion();
        
            Gson objConvertidor= new Gson();
            PeticionDTO objPeticion= new PeticionDTO();            
            objPeticion.setAccion("listarPersonas");            
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
    
}
