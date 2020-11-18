/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrador.Vista;

import Administrador.Servicios.Admin;
import Administrador.Servicios.PersonaServicesImpl;
/**
 *
 * @author 57321
 */
public class VistaPrincipalAdmin {
    
        public static void main(String[] args) {
       
        Admin objAdmin= new Admin("localhost", 5000);//al cliente se le envia la dirección ip del servidor y puerto del servidor
        PersonaServicesImpl objPersonaServices= new PersonaServicesImpl(objAdmin);
        
        GUILoginAdmin vtnLoginAdmin= new GUILoginAdmin(objPersonaServices);
        vtnLoginAdmin.setVisible(true);
       
    }
        
}
