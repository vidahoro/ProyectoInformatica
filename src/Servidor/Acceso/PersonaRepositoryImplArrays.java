/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor.Acceso;


import java.util.ArrayList;
import Modelo.Persona;


public class PersonaRepositoryImplArrays implements IPersonaRepository{

   private ArrayList<Persona> objPersonas;
        
    public PersonaRepositoryImplArrays()
    {
        this.objPersonas=new ArrayList();
        Persona objPersona= new Persona("12345","12345");
        this.objPersonas.add(objPersona);
    }
    /*
    public ArrayList<Persona> getListaAdministradores() {
    return objPersonas;
    }
    */
   @Override
    public boolean existePersona(String numeroIdentificacion, String contrasenia) {
        boolean bandera=false;

        for (Persona objPersona : objPersonas) {
            if(objPersona.getNumeroIdentificacion().equals(numeroIdentificacion) && objPersona.getContrasenia().equals(contrasenia))
            {
                bandera=true;
                break;
            }
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
    /*
    @Override
    public boolean existePersona(String tipoIdentificacion, String numeroIdentificacion)
    {
        boolean bandera=false;
        System.out.println("ejecutando método existe persona");
        for (int i = 0; i < objPersonas.size(); i++) {
             System.out.println("tipo: -" + objPersonas.get(i).getTipoIdentificacion()+ "-numero -" + objPersonas.get(i).getNumeroIdentificacion()+"-");
            if(objPersonas.get(i).getTipoIdentificacion().equalsIgnoreCase(tipoIdentificacion) && objPersonas.get(i).getNumeroIdentificacion().equalsIgnoreCase(numeroIdentificacion))
            {
                bandera=true;
                System.out.println("Persona encontrada");
                break;
            }
        }
        
        return bandera;
    } */
    
}
