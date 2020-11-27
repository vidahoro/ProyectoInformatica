/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor.Servicios;
import Modelo.Administrador;
import Servidor.Acceso.IAdministradorRepository;
/**
 *
 * @author Victor
 */
public class AdministradorService {
    
    private IAdministradorRepository repositorioAdministrador;
      
    public AdministradorService(IAdministradorRepository repositorioAdministrador)
    {
        this.repositorioAdministrador=repositorioAdministrador;
    }
    public boolean existeAdministrador(String login, String contrasenia)
    {
        return this.repositorioAdministrador.existeAdministrador(login, contrasenia);
    }
    public Administrador consultarPersona(String login, String contrasenia)
    {
        return this.repositorioAdministrador.consultarPersona(login, contrasenia);
    }

    public void editarAdmin(String user, String newname, String newlastname, String newpassword) {
        this.repositorioAdministrador.editarAdmin(user, newname, newlastname, newpassword);
    }
    
}
