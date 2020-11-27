/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor.Acceso;

import java.util.ArrayList;
import Modelo.Administrador;
import Modelo.Comida;

/**
 *
 * @author LENOVO
 */
public class AdministradorRepositoryImplArray implements IAdministradorRepository{

    private ArrayList<Administrador> listaAdministradores;
    private ArrayList<Comida> ListaDeComidas;
    
    public AdministradorRepositoryImplArray()
    {
        this.listaAdministradores= new ArrayList();
        Administrador objAdministrador= new Administrador("admin", "admin12345", "ADM", "MIN");
        this.listaAdministradores.add(objAdministrador);
        Administrador objAdministrador1 = new Administrador("qwerty", "qwertyuiop", "JD", "BS");
        this.listaAdministradores.add(objAdministrador1);
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

    @Override
    public Comida consultarComida(String Codigo, String Nombre, String Tipo) {
        System.out.println("ejecutando método consultar Comida");
        Comida objComida= null;
        for (int i = 0; i < ListaDeComidas.size(); i++) {
            if(ListaDeComidas.get(i).getCodigo().equalsIgnoreCase(Codigo) && ListaDeComidas.get(i).getNombre().equalsIgnoreCase(Nombre) && ListaDeComidas.get(i).getTipo().equalsIgnoreCase(Tipo) )
            {
                objComida=ListaDeComidas.get(i);
                System.out.println("Comida  encontrada");
                break;
            }
        }
        
        return objComida;
    }

    @Override
    public boolean existeComida(String Codigo, String Nombre, String Tipo) {
         boolean bandera=false;
        System.out.println("Codigo:"+Codigo+"Nombre: "+Nombre+"Tipo: "+Tipo);
        for (Comida objComida : ListaDeComidas) {
            if(objComida.getCodigo().equals(Codigo) && objComida.getNombre().equals(Nombre)&& objComida.getTipo().equals(Tipo))
            {
                bandera=true;
                break;
            }
        }
        return bandera;
    }
    
}
