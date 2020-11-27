/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor.Acceso;

import Modelo.Administrador;
import Modelo.Comida;

/**
 *
 * @author Victor
 */
public interface IAdministradorRepository {
    public boolean existeAdministrador(String login, String contrasenia);
    public Administrador consultarPersona(String login, String contrasenia);
    public void editarAdmin(String user, String newname, String newlastname, String newpassword);
    public Comida consultarComida(String Codigo, String Nombre, String Tipo);
    public boolean existeComida(String Codigo, String Nombre, String Tipo);
}
