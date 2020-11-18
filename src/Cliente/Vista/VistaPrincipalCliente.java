/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente.Vista;

import Administrador.Servicios.PersonaServicesInt;
import Cliente.Servicios.PersonaServicesImpl;
import Cliente.Servicios.cliente;

/**
 *
 * @author 57321
 */
public class VistaPrincipalCliente {
    
        public static void main(String[] args) {
       
        cliente objCliente= new cliente("localhost", 5000);//al cliente se le envia la dirección ip del servidor y puerto del servidor
        PersonaServicesImpl objPersonaServices= new PersonaServicesImpl(objCliente);
        
        GUILoginUser vtnLoginCliente= new GUILoginUser(objPersonaServices);
        vtnLoginCliente.setVisible(true);
       
    }
        
}
