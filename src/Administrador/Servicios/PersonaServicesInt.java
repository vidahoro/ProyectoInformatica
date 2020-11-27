/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrador.Servicios;

import java.util.ArrayList;
import Modelo.Administrador;
import Modelo.Comida;

/**
 *
 * @author LENOVO
 */
public interface PersonaServicesInt {
    public int iniciarSesion(String usuario, String contrasenia);
    public int registrarPersona(String nombres, String apellidos,String  tipoIdentificacion,String  numeroIdentificacion, String imagenBase64);
    public Administrador consultarPersona(String login, String Password);
    public void editarAdmin(Administrador Admin);
    public ArrayList<Comida> listarComidas();
    public int AgregarComida(String Foto, String Codigo, String Nombre, String Tipo, float Valor);
    public int eliminarComida(Comida objComida);
    //public ArrayList<Administrador> listarPersonas();
    public int editarComida(String CodigoOld, Comida objComidaEditada);
    public Comida consultarComida(String Codigo, String Nombre, String Tipo);
}
