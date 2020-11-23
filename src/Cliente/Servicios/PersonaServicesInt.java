/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente.Servicios;

import java.util.ArrayList;
import Modelo.dominio.Persona;

/**
 *
 * @author LENOVO
 */
public interface PersonaServicesInt {
    public int iniciarSesion(String numeroIdentificacion,String tipoIdentificacion, String contrasenia);
    public int registrarPersona(String nombres, String apellidos,String  tipoIdentificacion,String  numeroIdentificacion, String imagenBase64);
    public Persona consultarPersona(String tipoIdentificacion,String  numeroIdentificacion);
    public ArrayList<Persona> listarPersonas();
}
