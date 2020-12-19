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
        /*
        this.listaAdministradores= new ArrayList();
        Administrador objAdministrador= new Administrador("admin", "admin12345", "ADM", "MIN");
        this.listaAdministradores.add(objAdministrador);
        Administrador objAdministrador1 = new Administrador("qwerty", "qwertyuiop", "JD", "BS");
        this.listaAdministradores.add(objAdministrador1);
    
        */
    }

    public ArrayList<Administrador> getListaAdministradores() {
        return listaAdministradores;
    }
        
    @Override
    public boolean existeAdministrador(String login, String contrasenia) {
        boolean bandera=false;
        System.out.println("Login:"+login+"contraseña: "+contrasenia);
        for (Administrador objAdministrador : listaAdministradores) {
            if(objAdministrador.getLogin().equals(login) && objAdministrador.getConstrasenia().equals(contrasenia))
            {
                bandera=true;
                break;
            }
        }
        return bandera;
    }

    @Override
    public Administrador consultarPersona(String login, String contrasenia) {
        System.out.println("ejecutando método consultar persona");
        Administrador objAdmin= null;
        for (int i = 0; i < listaAdministradores.size(); i++) {
            if(listaAdministradores.get(i).getLogin().equalsIgnoreCase(login) && listaAdministradores.get(i).getConstrasenia().equalsIgnoreCase(contrasenia))
            {
                objAdmin=listaAdministradores.get(i);
                System.out.println("Persona encontrada");
                break;
            }
        }
        
        return objAdmin;
    }

    @Override
    public void editarAdmin(String user, String newname, String newlastname, String newpassword) {
        for (int i = 0; i < listaAdministradores.size(); i++) {
            Administrador AdminAux = listaAdministradores.get(i);
            if (user.equals(AdminAux.getLogin())) {
                AdminAux.setNombre(newname);
                AdminAux.setApellido(newlastname);
                AdminAux.setConstrasenia(newpassword);
                listaAdministradores.set(i, AdminAux);
                break;
            }
        }
    }
    
}
