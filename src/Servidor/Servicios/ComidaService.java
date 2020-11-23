/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor.Servicios;

import Modelo.Comida;
import Servidor.Acceso.IComidaRepository;

/**
 *
 * @author Victor
 */
public class ComidaService {
    private IComidaRepository RepositorioComida;
    public ComidaService(IComidaRepository RepositorioComida ){
        this.RepositorioComida=RepositorioComida;
    
    }
    public boolean AgregarComida(Comida objComida){
    
        return this.RepositorioComida.AgregarComida(objComida);
        
    
    }
    
        
    
}
