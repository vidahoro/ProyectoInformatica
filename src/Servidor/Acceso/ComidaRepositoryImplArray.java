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
import Modelo.dominio.Persona;
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
    private ArrayList<Comida> listadoComidasEspeciales;
    private  cliente objCliente;
    
   public ComidaRepositoryImplArray(){
       this.ListaDeComidas= new ArrayList();
       Comida objComida = new Comida("/Recursos/exitoso.png", "1", "comida1", "Bebida", 12);
       //Comida objComida1 = new Comida("", "2" , "Changua", "Especial", 400000);
       this.ListaDeComidas.add(objComida);
       //this.ListaDeComidas.add(objComida1);
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
        return ListaDeComidas;        
    }

    @Override
    public Comida consultarComida(String Codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean existeComida(String Codigo, String Nombre, String Tipo) {
        boolean bandera=false;
        System.out.println("ejcutando método existe comida");
        for (int i = 0; i < ListaDeComidas.size(); i++) {
            System.out.println("Codigo: -" + ListaDeComidas.get(i).getCodigo()+ "- Nombre -" + ListaDeComidas.get(i).getNombre()+" - Tipo -"+ListaDeComidas.get(i).getTipo());
            if(ListaDeComidas.get(i).getCodigo().equalsIgnoreCase(Codigo) || ListaDeComidas.get(i).getNombre().equalsIgnoreCase(Nombre) && ListaDeComidas.get(i).getTipo().equalsIgnoreCase(Tipo))
            {
                bandera=true;
                System.out.println("Comida encontrada");
                break;
            }
        }
        
        return bandera;
    }

    /*
      @Override
      public ArrayList<Comida> listarComidasEspeciales(String Codigo, String Nombre, String Tipo) {
       ArrayList<Comida> listadoComidasEspeciales;
        
        try {
            objCliente.crearConexion();
        
            Gson objConvertidor= new Gson();
            PeticionDTO objPeticion= new PeticionDTO();            
            objPeticion.setAccion("listarComidasEspeciales");            
            String JSON = objConvertidor.toJson(objPeticion);
            String respuestaJSON=objCliente.enviarPeticion(JSON);
           
            ResultadoDTO objResultado= objConvertidor.fromJson(respuestaJSON, ResultadoDTO.class); 
            String listaJSON = objResultado.getJSONResultado();
            java.lang.reflect.Type listType = new TypeToken<ArrayList<Persona>>(){}.getType();
            listadoComidasEspeciales = objConvertidor.fromJson(listaJSON, listType);
            objCliente.cerrarConexion();
        
        } 
        catch (IOException ex) {
            listadoComidasEspeciales=null;
        }
            
        
        return listadoComidasEspeciales;
        
    } */
    @Override
    public ArrayList<Comida> listarComidasEspeciales() {
        return listadoComidasEspeciales;        
    }

    @Override
    public boolean eliminarComida(Comida objComidaEliminar) {
        boolean bandera=false;
        for (int i = 0; i < ListaDeComidas.size(); i++) {
            if (ListaDeComidas.get(i).getCodigo().equals(objComidaEliminar.getCodigo())) {
                ListaDeComidas.remove(i);
                bandera=true;
                System.out.println("Comida Eliminada");
                break;
            }
        }
        return bandera;
    }

    @Override
    public boolean editarComida(String CodigoOld, String CodigoNew, String NombreNew, String TipoNew, String ValorNew, String FotoNew) {
        boolean bandera = false;
        float Valor = Float.parseFloat(ValorNew);
        Comida ComidaNueva = new Comida(FotoNew, CodigoNew, NombreNew, TipoNew, Valor);
        for (int i = 0; i < ListaDeComidas.size(); i++) {
            if (ListaDeComidas.get(i).getCodigo().equals(CodigoOld)) {
                ListaDeComidas.set(i, ComidaNueva);
                bandera = true;
                break;
            }
        }
        return bandera;

    }
  
}
