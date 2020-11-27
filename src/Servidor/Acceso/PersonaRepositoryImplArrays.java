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
        Persona objPersona= new Persona("1234","T.I.","12345");
        this.objPersonas.add(objPersona);
    }

   @Override
    public boolean existePersona(String numeroIdentificacion,String tipoIdentificacion, String contrasenia) {
         System.out.println("NumeroID: "+numeroIdentificacion+"Tipo: "+tipoIdentificacion+"Contraseña: "+contrasenia);
        boolean bandera=false;

        for (Persona objPersona : objPersonas) {
            if(objPersona.getNumeroIdentificacion().equals(numeroIdentificacion) && objPersona.getTipoIdentificacion().equals(tipoIdentificacion) && objPersona.getContrasenia().equals(contrasenia))
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

    
}
