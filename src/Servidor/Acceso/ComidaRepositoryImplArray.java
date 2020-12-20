/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor.Acceso;

import Servidor.Conexion.ConexionBD;
import Modelo.Comida;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class ComidaRepositoryImplArray implements IComidaRepository {
    
    private final ConexionBD conexionABaseDeDatos;
    
    public ComidaRepositoryImplArray(){
       conexionABaseDeDatos= new ConexionBD();
    }
   
    @Override
    public boolean AgregarComida(Comida objcomida) {

        conexionABaseDeDatos.conectar();
        int resultado=-1;
        try {            
            PreparedStatement sentencia = null;
            String consulta = "insert into comidas(comidas.Foto,comidas.Codigo,comidas.Nombre,comidas.Tipo,comidas.Valor) values(?,?,?,?,?)";
            sentencia = conexionABaseDeDatos.getConnection().prepareStatement(consulta);
            
            sentencia.setString(1, objcomida.getFoto());
            sentencia.setString(2, objcomida.getCodigo());
            sentencia.setString(3, objcomida.getNombre());
            sentencia.setString(4, objcomida.getTipo());
            sentencia.setFloat(5, objcomida.getValor());
            resultado = sentencia.executeUpdate(); 
            sentencia.close();
            conexionABaseDeDatos.desconectar();

        } catch (SQLException e) {
                  System.out.println("error en la inserción: "+e.getMessage());         
        }
        
        return resultado == 1;
    
    }

    @Override
    public ArrayList<Comida> listarComidas() {
        ArrayList<Comida> Comidas = new ArrayList();
        
        conexionABaseDeDatos.conectar();
        try{
            PreparedStatement sentencia = null;
            String consulta = "select * from comidas";
            sentencia = conexionABaseDeDatos.getConnection().prepareStatement(consulta);            
            ResultSet res = sentencia.executeQuery();
            while(res.next()){
                Comida objComida= new Comida(null, null, null, null, 0);
                objComida.setCodigo(res.getString("Codigo"));
                objComida.setFoto(res.getString("Foto"));
                objComida.setNombre(res.getString("Nombre"));
                objComida.setTipo(res.getString("Tipo"));
                objComida.setValor(res.getFloat("Valor"));
                Comidas.add(objComida);
            }
            sentencia.close();
            conexionABaseDeDatos.desconectar();
        }catch(SQLException e){
            System.out.println("error en la inserción: "+e.getMessage()); 
        }
        return Comidas;
    }

    @Override
    public boolean existeComida(String Codigo) {
        boolean bandera=false;
        System.out.println("ejecutando método existe comida");
        
        conexionABaseDeDatos.conectar();        
        try {            
            PreparedStatement sentencia = null;
            String consulta = "select comidas.Foto, comidas.Nombre, comidas.Tipo, comidas.Valor from comidas where comidas.Codigo=?";
            sentencia = conexionABaseDeDatos.getConnection().prepareStatement(consulta);            
            sentencia.setString(1, Codigo);
            ResultSet res = sentencia.executeQuery();
            while(res.next()){
                bandera=true;
            }
            sentencia.close();
            conexionABaseDeDatos.desconectar();

        } catch (SQLException e) {
                  System.out.println("error en la consulta de un empleado: "+e.getMessage());         
        } 
        return bandera;
    }

    @Override
    public boolean eliminarComida(Comida objComida) {
        
        
        
        conexionABaseDeDatos.conectar();
        int resultado=-1;
        try {            
            PreparedStatement sentencia = null;
            String consulta = "delete from comidas where comidas.Codigo=?";
            sentencia = conexionABaseDeDatos.getConnection().prepareStatement(consulta);            
            sentencia.setString(1, objComida.getCodigo());
            resultado = sentencia.executeUpdate(); 
            sentencia.close();
            conexionABaseDeDatos.desconectar();

        } catch (SQLException e) {
                  System.out.println("error en la eliminación: "+e.getMessage());         
        }
        
        return resultado == 1;
    }           

    @Override
    public boolean editarComida(String CodigoOld, String CodigoNew, String NombreNew, String TipoNew, String ValorNew, String FotoNew) {
        boolean bandera = false;
        float Valor = Float.parseFloat(ValorNew);
        
        conexionABaseDeDatos.conectar();
        try {            
            PreparedStatement sentencia = null;
            String consulta = "update comidas set comidas.Codigo=?,"
                                                + "comidas.Foto=?,"
                                                + "comidas.Nombre=?,"
                                                + "comidas.Tipo=?,"
                                                + "comidas.Valor=? "
                                                + "where comidas.Codigo=?";
            sentencia = conexionABaseDeDatos.getConnection().prepareStatement(consulta);
            sentencia.setString(1, CodigoNew);
            sentencia.setString(2, FotoNew);
            sentencia.setString(3, NombreNew);
            sentencia.setString(4, TipoNew);
            sentencia.setFloat(5, Valor);
            sentencia.setString(6, CodigoOld);
            sentencia.executeUpdate(); 
            sentencia.close();
            conexionABaseDeDatos.desconectar();
            bandera = true;
        } catch (SQLException e) {
                  System.out.println("error en la actualización: "+e.getMessage());         
        }
        return bandera;
    }

    @Override
    public Comida consultarComida(String Nombre) {
        Comida objComida = null;
        conexionABaseDeDatos.conectar(); 
        
        try {            
            PreparedStatement sentencia = null;
            String consulta = "select comidas.Codigo, comidas.Foto, comidas.Tipo, comidas.Valor from comidas where comidas.Nombre=?";
            sentencia = conexionABaseDeDatos.getConnection().prepareStatement(consulta);            
            sentencia.setString(1, Nombre);
            ResultSet res = sentencia.executeQuery();
            while(res.next()){
                objComida= new Comida();
                objComida.setNombre(Nombre);
                objComida.setFoto(res.getString("Foto"));
                objComida.setCodigo(res.getString("Codigo"));
                objComida.setTipo(res.getString("Tipo"));
                objComida.setValor(res.getFloat("Valor"));
            }
            sentencia.close();
            conexionABaseDeDatos.desconectar();

        } catch (SQLException e) {
                  System.out.println("error en la consulta de un empleado: "+e.getMessage());         
        } 
        return objComida;
    }
}
  

