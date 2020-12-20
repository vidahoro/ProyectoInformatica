/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor.Acceso;

import java.util.ArrayList;
import Modelo.Administrador;
import Servidor.Conexion.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class AdministradorRepositoryImplArray implements IAdministradorRepository{

    private final ConexionBD conexionABaseDeDatos;
    
    public AdministradorRepositoryImplArray()
    {
        conexionABaseDeDatos = new ConexionBD();
    }
        
    @Override
    public boolean existeAdministrador(String login, String contrasenia) {
        boolean bandera=false;
        System.out.println("Login:"+login+"contraseña: "+contrasenia);
        
        conexionABaseDeDatos.conectar();
        try{
            PreparedStatement sentencia = null;
            String consulta = "select * from administradores where administradores.login=? and administradores.contrasenia=?";
            sentencia = conexionABaseDeDatos.getConnection().prepareStatement(consulta);
            sentencia.setString(1, login);
            sentencia.setString(2, contrasenia);
            ResultSet res = sentencia.executeQuery();
            while(res.next()){
                bandera = true;
            }
            sentencia.close();
            conexionABaseDeDatos.desconectar();
        }catch(SQLException e){
            System.out.println("Error en la verificación: "+e.getMessage());
        }
        return bandera;
    }

    @Override
    public Administrador consultarPersona(String login, String contrasenia) {
        System.out.println("ejecutando método consultar persona");
        Administrador objAdmin= null;

        conexionABaseDeDatos.conectar();        
        try {            
            PreparedStatement sentencia = null;
            String consulta = "select administradores.contrasenia, administradores.Nombre, administradores.Apellido from administradores where administradores.login=?";
            sentencia = conexionABaseDeDatos.getConnection().prepareStatement(consulta);            
            sentencia.setString(1, login);
            ResultSet res = sentencia.executeQuery();
            while(res.next()){
                objAdmin= new Administrador();
                objAdmin.setLogin(login);
                objAdmin.setConstrasenia(res.getString("contrasenia"));
                objAdmin.setNombre(res.getString("Nombre"));
                objAdmin.setApellido(res.getString("Apellido"));
            }
            sentencia.close();
            conexionABaseDeDatos.desconectar();

        } catch (SQLException e) {
                  System.out.println("error en la consulta de un empleado: "+e.getMessage());         
        }        
        
        return objAdmin;
    }

    @Override
    public void editarAdmin(String user, String newname, String newlastname, String newpassword) {
        conexionABaseDeDatos.conectar();
        try{
            PreparedStatement sentencia = null;
            String consulta = "update administradores set administradores.contrasenia=?,"
                                                        + "administradores.Nombre=?,"
                                                        + "administradores.Apellido=? "
                                                        + "where administradores.login=?";
            sentencia = conexionABaseDeDatos.getConnection().prepareStatement(consulta);
            sentencia.setString(1, newpassword);
            sentencia.setString(2, newname);
            sentencia.setString(3, newlastname);
            sentencia.setString(4, user);
            sentencia.executeUpdate();
            sentencia.close();
            conexionABaseDeDatos.desconectar();           
        }catch (SQLException e){
                  System.out.println("error en la actualización: "+e.getMessage());         
        }
    }
    
}
