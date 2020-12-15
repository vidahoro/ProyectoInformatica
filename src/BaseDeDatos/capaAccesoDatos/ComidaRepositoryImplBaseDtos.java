/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDeDatos.capaAccesoDatos;

import BaseDeDatos.conexion.ConexionBD;
import Modelo.Comida;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Victor
 */
public class ComidaRepositoryImplBaseDtos implements IComidaRepository{
   private final ConexionBD conexionABaseDeDatos;
   
       public ComidaRepositoryImplBaseDtos()
    {
        conexionABaseDeDatos= new ConexionBD();
    }
    
   
    @Override
    public boolean registrarComida(Comida objcomida) {
       
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
    
}
