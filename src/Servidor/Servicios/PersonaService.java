/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor.Servicios;

import java.util.ArrayList;
import Modelo.Persona;
import Servidor.Acceso.IPersonaRepository;

/**
 *
 * @author LENOVO
 */
public class PersonaService {
    private IPersonaRepository repositorioPersonas;
    
    public PersonaService(IPersonaRepository repositorioPersonas)
    {
        this.repositorioPersonas=repositorioPersonas;
    }
    
    public boolean registrarPersona(Persona objPersona)
    {
        return this.repositorioPersonas.registrarPersona(objPersona);
    }
    
    public ArrayList<Persona> listarPersonas()
    {
        return this.repositorioPersonas.listarPersonas();
    }
    
    public Persona consultarPersona(String tipoIdentificacion, String numeroIdentificacion)
    {
        return this.repositorioPersonas.consultarPersona(tipoIdentificacion, numeroIdentificacion);
    }   
    
    public boolean existePersona(String numeroIdentificacion,String tipoIdentificacion, String contrasenia)
    {
        return this.repositorioPersonas.existePersona(numeroIdentificacion,tipoIdentificacion, contrasenia);
    }
}
