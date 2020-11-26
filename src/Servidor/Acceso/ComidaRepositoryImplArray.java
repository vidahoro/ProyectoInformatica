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
       Comida objComida = new Comida("/Recursos/exitoso.png", "1", "comida1", "Bebida", 12);
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
            if(ListaDeComidas.get(i).getCodigo().equalsIgnoreCase(Codigo) && ListaDeComidas.get(i).getNombre().equalsIgnoreCase(Nombre) && ListaDeComidas.get(i).getTipo().equalsIgnoreCase(Tipo))
            {
                bandera=true;
                System.out.println("Comida encontrada");
                break;
            }
        }
        
        return bandera;
    }
  
}
