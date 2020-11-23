/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor.Acceso;

import Modelo.Comida;

/**
 *
 * @author Victor
 */
public interface IComidaRepository {
    public boolean AgregarComida(Comida objcomida);
    
}
