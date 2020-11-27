/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor.Acceso;

import Modelo.Comida;
import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class ComidaRepositoryImplArray implements IComidaRepository {
    private ArrayList<Comida> ListaDeComidas;
    
   public ComidaRepositoryImplArray(){
       this.ListaDeComidas= new ArrayList();
    }
   
    @Override
    public boolean AgregarComida(Comida objcomida) {
        
       return this.ListaDeComidas.add(objcomida);
        
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
        System.out.println("ejcutando método existe comida");
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
