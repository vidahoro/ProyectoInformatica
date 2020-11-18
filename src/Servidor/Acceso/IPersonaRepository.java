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
    public boolean registrarPersona(Persona objPersona);
    public ArrayList<Persona> listarPersonas();
    public Persona consultarPersona(String tipoIdentificacion, String numeroIdentificacion);    
    public boolean existePersona(String tipoIdentificacion, String numeroIdentificacion);
}
