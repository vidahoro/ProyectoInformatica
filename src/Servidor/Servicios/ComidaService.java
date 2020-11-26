/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor.Servicios;

import Modelo.Comida;
import Servidor.Acceso.IComidaRepository;
import java.util.ArrayList;


/**
 *
 * @author Victor
 */
public class ComidaService {
    
    private final IComidaRepository RepositorioComida;
    
    public ComidaService(IComidaRepository RepositorioComida ){
        this.RepositorioComida=RepositorioComida;    
    }
    
    public boolean AgregarComida(Comida objComida){    
        return this.RepositorioComida.AgregarComida(objComida);            
    }
    public ArrayList<Comida> listarComidas(){
        return this.RepositorioComida.listarComidas();
    }
    
    public boolean existeComida(String Codigo, String Nombre, String Tipo) {
        return this.RepositorioComida.existeComida(Codigo, Nombre, Tipo);
    }

    public ArrayList<Comida> listarComidasEspeciales(){
        return this.RepositorioComida.listarComidasEspeciales();
    }
        
    public boolean eliminarComida(Comida objComidaEliminar) {
        return this.RepositorioComida.eliminarComida(objComidaEliminar);
    }
    

    public boolean editarComida(String CodigoOld, String CodigoNew, String NombreNew, String TipoNew, String ValorNew, String FotoNew) {
        return this.RepositorioComida.editarComida(CodigoOld, CodigoNew, NombreNew, TipoNew, ValorNew, FotoNew);

    }
    
}
