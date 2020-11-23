/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor.Acceso;

import Modelo.Comida;
import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class ComidaRepositoryImplArray implements IComidaRepository {
    private ArrayList<Comida> comidas;
    
   public ComidaRepositoryImplArray(){
       this.comidas= new ArrayList<Comida>();
       
       
   }

    @Override
    public boolean AgregarComida(Comida objcomida) {
        
        return this.comidas.add(objcomida);
        
    }
  
    
    
    
}
