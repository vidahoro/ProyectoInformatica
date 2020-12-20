/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cocinero.Vista;

import Cocinero.Servicios.Cocinero;
import Cocinero.Servicios.CocineroServicesImpl;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author 57321
 */
public class VistaPrincipalCocinero {
    
    public static void main(String[] args) {
       
        Cocinero objCocinero= new Cocinero("localhost", 5000);//al cliente se le envia la dirección ip del servidor y puerto del servidor
        CocineroServicesImpl objPersonaServices= new CocineroServicesImpl(objCocinero);
        seleccionarLookAndField();
        GUICocinero vtnCocinero = new GUICocinero(objPersonaServices);
        vtnCocinero.setVisible(true);   
    }
    
    private static void seleccionarLookAndField(){
        for(UIManager.LookAndFeelInfo laf:UIManager.getInstalledLookAndFeels()){
            if("Nimbus".equals(laf.getName()))
                try {
                UIManager.setLookAndFeel(laf.getClassName());
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
                    
                }
        }
    }
}
