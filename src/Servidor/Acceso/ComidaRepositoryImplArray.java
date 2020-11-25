/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor.Acceso;


import Cliente.Servicios.cliente;
import Modelo.Comida;
import Modelo.DTO.PeticionDTO;
import Modelo.DTO.ResultadoDTO;
import Modelo.EnumTipoComida;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class ComidaRepositoryImplArray implements IComidaRepository {
    private ArrayList<Comida> ListaDeComidas;
    private  cliente objCliente;
    
   public ComidaRepositoryImplArray(){
       this.ListaDeComidas= new ArrayList();
       Comida objComida = new Comida("", "1", "comida1", "Bebida", 12);
       this.ListaDeComidas.add(objComida);
      
   }
   
     @Override
    public boolean AgregarComida(Comida objcomida) {
        
       return this.ListaDeComidas.add(objcomida);
        
    }

    public ArrayList<Comida> getListaDeComidas() {
        return ListaDeComidas;
    }

    @Override
    public ArrayList<Comida> listarComidas() {
    /* 
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
            
       */ 
        return ListaDeComidas;
    
        
        
        
    }

    @Override
    public Comida consultarComida(String Codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean existeComida(String numeroIdentificacion, String tipoIdentificacion, String contrasenia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


  
  
    
    
    
}
