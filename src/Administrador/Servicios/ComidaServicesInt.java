/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrador.Servicios;

import Modelo.Comida;
import Modelo.EnumTipoComida;
import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public interface ComidaServicesInt {
    public int registrarComida(String Foto, String Codigo, String Nombre, String Tipo, float Valor);
     public ArrayList<Comida> listarComidas();
}
