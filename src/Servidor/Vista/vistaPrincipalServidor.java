/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor.Vista;


import Servidor.Controlador.Controlador;
import java.io.IOException;
import Servidor.Acceso.AdministradorRepositoryImplArray;
import Servidor.Acceso.PersonaRepositoryImplArrays;
import Servidor.Server.servidor;
import Servidor.Servicios.AdministradorService;
import Servidor.Servicios.PersonaService;

/**
 *
 * @author Victor
 */
public class vistaPrincipalServidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              try {         
            AdministradorService objAdministradorService= new AdministradorService(new AdministradorRepositoryImplArray());
            PersonaService objPersonaService= new PersonaService(new PersonaRepositoryImplArrays());
            Controlador objControlador= new Controlador(objAdministradorService,objPersonaService);
            servidor objServidor= new servidor(5000,objControlador);
            objServidor.ejecutarServidor();
        } catch (IOException ex) {
            System.out.println("Error al ejecutar el servidor");
        }
        
        
    }
    
}
