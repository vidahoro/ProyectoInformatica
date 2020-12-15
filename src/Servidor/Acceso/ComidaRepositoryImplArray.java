/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor.Acceso;

import Servidor.Conexion.ConexionBD;
import Modelo.Comida;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class ComidaRepositoryImplArray implements IComidaRepository {
    private ArrayList<Comida> ListaDeComidas;
    private final ConexionBD conexionABaseDeDatos;
    
    public ComidaRepositoryImplArray(){
       this.ListaDeComidas= new ArrayList();
       conexionABaseDeDatos= new ConexionBD();
    }
   
    @Override
    public boolean AgregarComida(Comida objcomida) {
       /* 
       return this.ListaDeComidas.add(objcomida);
        */
              
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

    public ArrayList<Comida> getListaDeComidas() {
        return ListaDeComidas;
    }

    @Override
    public ArrayList<Comida> listarComidas() {
        return ListaDeComidas;        
    }

    @Override
    public boolean existeComida(String Codigo) {
        boolean bandera=false;
        System.out.println("ejecutando método existe comida");
        for (int i = 0; i < ListaDeComidas.size(); i++) {
            System.out.println("Codigo: -" + ListaDeComidas.get(i).getCodigo()+ "- Nombre -" + ListaDeComidas.get(i).getNombre()+" - Tipo -"+ListaDeComidas.get(i).getTipo());
            if(ListaDeComidas.get(i).getCodigo().equalsIgnoreCase(Codigo))
            {
                bandera=true;
                System.out.println("Comida encontrada");
                break;
            }
        }        
        return bandera;
    }

    @Override
    public boolean eliminarComida(Comida objComidaEliminar) {
        boolean bandera=false;
        for (int i = 0; i < ListaDeComidas.size(); i++) {
            if (ListaDeComidas.get(i).getCodigo().equals(objComidaEliminar.getCodigo())) {
                ListaDeComidas.remove(i);
                bandera=true;
                System.out.println("Comida Eliminada");
                break;
            }
        }
        return bandera;
    }

    @Override
    public boolean editarComida(String CodigoOld, String CodigoNew, String NombreNew, String TipoNew, String ValorNew, String FotoNew) {
        boolean bandera = false;
        float Valor = Float.parseFloat(ValorNew);
        Comida ComidaNueva = new Comida(FotoNew, CodigoNew, NombreNew, TipoNew, Valor);
        for (int i = 0; i < ListaDeComidas.size(); i++) {
            if (ListaDeComidas.get(i).getCodigo().equals(CodigoOld)) {
                ListaDeComidas.set(i, ComidaNueva);
                bandera = true;
                break;
            }
        }
        return bandera;
    }

    @Override
    public Comida consultarComida(String codigo) {
        Comida objComida = null;
        for (int i = 0; i < ListaDeComidas.size(); i++) {
            if (ListaDeComidas.get(i).getCodigo().equals(codigo)) {
                objComida = ListaDeComidas.get(i);
                break;
            }
        }
        return objComida;
    }
  
}
