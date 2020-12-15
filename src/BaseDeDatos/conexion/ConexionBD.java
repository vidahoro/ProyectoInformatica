/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDeDatos.conexion;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Victor
 */
public class ConexionBD {
    private Connection objConexionBaseDatos;    
   private String nombreBaseDatos;
   private String login;
   private String password;
   private String url;
    
   
    public ConexionBD() {
        objConexionBaseDatos=null;
        nombreBaseDatos="bdrestaurante";   // Cambiar nombre de la base de datos
        login="root";
        password="root";
        url = "jdbc:mysql://localhost/"+nombreBaseDatos;
    }
    /**Permite hacer la conexion con la base de datos    
     */
    public int conectar(){
        int bandera=-1;
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
           //crea una instancia de la controlador de la base de datos
            objConexionBaseDatos = DriverManager.getConnection(url,login,password);
            // gnera una conexión con la base de datos
             bandera=1;
        }
        catch(SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return bandera;
    }
    /**Cierra la conexion con la base de datos
     *
     */
   public void desconectar(){
       try{
            objConexionBaseDatos.close();
        }

        catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
   }
     /**Retorna un objeto que almacena la referencia a la conexion con la base de datos
     *
     */
    public Connection getConnection(){
      return objConexionBaseDatos;
   }
 
}
