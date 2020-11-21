/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor.Acceso;

import java.util.ArrayList;
import Modelo.Persona;

/**
 *
 * @author LENOVO
 */
public interface IPersonaRepository {
    public boolean existePersona(String numeroIdentificacion, String tipoIdentificacion, String contrasena);
    
}
