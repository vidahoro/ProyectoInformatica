/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente.Vista;

import Cliente.Servicios.cliente;
import Cliente.Servicios.PersonaServicesImpl;
/**
 *
 * @author 57321
 */
public class VistaPrincipalCliente {
    
        public static void main(String[] args) {
       
        cliente objAdmin= new cliente("localhost", 5000);//al cliente se le envia la dirección ip del servidor y puerto del servidor
        PersonaServicesImpl objPersonaServices= new PersonaServicesImpl(objAdmin);
        
        GUILoginUser vtnLoginUser= new GUILoginUser(objPersonaServices);
        vtnLoginUser.setVisible(true);
       
    }
        
}
