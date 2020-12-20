/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor.Acceso;


import java.util.ArrayList;
import Modelo.Persona;
import Servidor.Conexion.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class PersonaRepositoryImplArrays implements IPersonaRepository{

    private ArrayList<Persona> objPersonas;
    private final ConexionBD conexionABaseDeDatos;
    
    public PersonaRepositoryImplArrays()
    {
        conexionABaseDeDatos = new ConexionBD();
    }

   @Override
    public boolean existePersona(String numeroIdentificacion,String tipoIdentificacion, String contrasenia) {
        System.out.println("NumeroID: "+numeroIdentificacion+"Tipo: "+tipoIdentificacion+"Contraseña: "+contrasenia);
        boolean bandera=false;

        conexionABaseDeDatos.conectar();
        try{
            PreparedStatement sentencia = null;
            String consulta = "select * from clientes where clientes.numeroIdentificacion=? and clientes.tipoIdentificacion=? and clientes.contrasenia=?";
            sentencia = conexionABaseDeDatos.getConnection().prepareStatement(consulta);
            sentencia.setString(1, numeroIdentificacion);
            sentencia.setString(2, tipoIdentificacion);
            sentencia.setString(3, contrasenia);
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
    public boolean registrarPersona(Persona objPersona)
    {
        return this.objPersonas.add(objPersona);
    }

    @Override
    public ArrayList<Persona> listarPersonas() {
        return objPersonas;
    }
    
    @Override
    public Persona consultarPersona(String tipoIdentificacion, String numeroIdentificacion)
    {
        System.out.println("ejecutando método consultar persona");
        Persona objPersona= null;
        for (int i = 0; i < objPersonas.size(); i++) {
            if(objPersonas.get(i).getTipoIdentificacion().equalsIgnoreCase(tipoIdentificacion) && objPersonas.get(i).getNumeroIdentificacion().equalsIgnoreCase(numeroIdentificacion))
            {
                objPersona=objPersonas.get(i);
                System.out.println("Persona encontrada");
                break;
            }
        }        
        return objPersona;
    }

    
}
