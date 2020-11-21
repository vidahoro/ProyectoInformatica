/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor.Acceso;

import java.util.ArrayList;
import Modelo.Administrador;

/**
 *
 * @author LENOVO
 */
public class AdministradorRepositoryImplArray implements IAdministradorRepository{

    private ArrayList<Administrador> listaAdministradores;
    
    public AdministradorRepositoryImplArray()
    {
        this.listaAdministradores= new ArrayList();
        Administrador objAdministrador= new Administrador("admin", "admin12345");
        this.listaAdministradores.add(objAdministrador);
        Administrador objAdministrador1= new Administrador("Vic", "Holiwi");
        this.listaAdministradores.add(objAdministrador1);
    }
    @Override
    public boolean existeAdministrador(String login, String contrasenia) {
        boolean bandera=false;
        
        for (Administrador objAdministrador : listaAdministradores) {
            if(objAdministrador.getLogin().equals(login) && objAdministrador.getConstrasenia().equals(contrasenia))
            {
                bandera=true;
                break;
            }
        }
        return bandera;
    }
    
}
