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
   
   public PersonaRepositoryImplArrays(){
   
       this.objPersonas=new ArrayList();
       Persona objPersona= new Persona("1061", "TI", "haha");
       this.objPersonas.add(objPersona);
   
   }
    @Override
    public boolean existePersona(String numeroIdentificacion, String tipoIdentificacion, String contrasena) {
        boolean bandera=false;
        
        for (Persona objPersona : objPersonas) {
            if(objPersona.getNumeroIdentificacion().equals(numeroIdentificacion) && objPersona.getTipoIdentificacion().equals(tipoIdentificacion) && objPersona.getcontrasena().equals(contrasena))
            {
                bandera=true;
                break;
            }
        }
        return bandera;
    }
   
   
    /*  
    public PersonaRepositoryImplArrays()
    {
        objPersonas=new ArrayList();
        Persona objPersona1= new  Persona("CC", "1.061", "juan", "lopez");
        objPersonas.add(objPersona1);
        Persona objPersona2= new  Persona("TI", "1.062", "catalina", "perez");        
        objPersonas.add(objPersona2);
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
    
    @Override
    public boolean existePersona(String tipoIdentificacion, String numeroIdentificacion)
    {
        boolean bandera=false;
        System.out.println("ejcutando método existe persona");
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
    }
    */
    /*
    @Override
    public boolean registrarPersona(Persona objPersona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Persona> listarPersonas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Persona consultarPersona(String tipoIdentificacion, String numeroIdentificacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean existePersona(String tipoIdentificacion, String numeroIdentificacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
}
