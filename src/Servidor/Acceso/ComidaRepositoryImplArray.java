/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor.Acceso;


import Modelo.Comida;
import Modelo.EnumTipoComida;
import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class ComidaRepositoryImplArray implements IComidaRepository {
    private ArrayList<Comida> ListaDeComidas;
    
   public ComidaRepositoryImplArray(){
       this.ListaDeComidas= new ArrayList();
       Comida objComida = new Comida("123", "456", "hp", EnumTipoComida.Bebida, 12000);
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
