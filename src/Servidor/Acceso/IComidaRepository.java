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
public interface IComidaRepository {
    public boolean AgregarComida(Comida objcomida);
    public ArrayList<Comida> listarComidas();
    public Comida consultarComida(String Codigo);    
    public boolean existeComida(String Codigo,String Nombre, String Tipo);

    public ArrayList<Comida> listarComidasEspeciales();

    public boolean eliminarComida(Comida objComidaEliminar);
    public boolean editarComida(String CodigoOld, String CodigoNew, String NombreNew, String TipoNew, String ValorNew, String FotoNew);
    

}
