/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrador.Vista;

import Administrador.Servicios.PersonaServicesInt;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import Modelo.Administrador;
//import Servidor.Acceso.AdministradorRepositoryImplArray;
import java.util.ArrayList;
/**
 *
 * @author Victor
 */
public class GUIMenuPrincipal extends javax.swing.JFrame {
    
    private PersonaServicesInt personaServices;
    private Administrador AdminReferencia;
    private ArrayList<Administrador> listaAdministradores;
    /**
     * Creates new form JFrameGestionarComidass
     */
    public GUIMenuPrincipal(PersonaServicesInt personaServices, String login, Administrador AdminReferencia) {
        initComponents();
        
        setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage("Recursos/restaurant.png");
        this.setIconImage(icon);
        this.personaServices=personaServices;
        this.AdminReferencia=AdminReferencia;
        vtnGestionarComidas objvtnGestionarComidas= new vtnGestionarComidas(this.personaServices);
        objvtnGestionarComidas.setVisible(true);
        this.jDesktopPaneCentral.add(objvtnGestionarComidas);
        
        /*
        vtnAgregarComida objvtnAgregarComida= new vtnAgregarComida();
        objvtnAgregarComida.setVisible(true);
        this.jDesktopPaneCentral.add(objvtnAgregarComida);        
        */
        
        
        Image img1 = new ImageIcon(getClass().getResource("/Recursos/restaurant.png")).getImage();        
        ImageIcon img2= new ImageIcon(img1.getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        this.Image_restaurant_link.setIcon(img2);
        this.Image_restaurant_link.setText("");
        
        Image img7 = new ImageIcon(getClass().getResource("/Recursos/Facebook.png")).getImage();        
        ImageIcon img8= new ImageIcon(img7.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
        this.Image_Facebook_link.setIcon(img8);
        this.Image_Facebook_link.setText("");
        
        
        Image img4 = new ImageIcon(getClass().getResource("/Recursos/Twitter.png")).getImage();        
        ImageIcon img3= new ImageIcon(img4.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
        this.Image_Twitter_link.setIcon(img3);
        this.Image_Twitter_link.setText("");
        
        
        Image img6 = new ImageIcon(getClass().getResource("/Recursos/instagram.png")).getImage();        
        ImageIcon img5= new ImageIcon(img6.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
        this.Image_instagram_link.setIcon(img5);
        this.Image_instagram_link.setText("");        
        
        Image img9 = new ImageIcon(getClass().getResource("/Recursos/IconoAdmin.png")).getImage();        
        ImageIcon img10= new ImageIcon(img9.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
        this.Image_iconoadmin_link.setIcon(img10);
        this.Image_iconoadmin_link.setText("");
        
        /*
        if(AdminReferencia == null){
            AdministradorRepositoryImplArray AdminRepo = new AdministradorRepositoryImplArray();
            listaAdministradores = AdminRepo.getListaAdministradores();
            for (int i = 0; i < listaAdministradores.size(); i++) {
                Administrador AdminAux = listaAdministradores.get(i);
                if(AdminAux.getLogin().equals(login)){
                    AdminReferencia = AdminAux;
                }
            }
        }
        */
          
        String AdminName = AdminReferencia.getNombre();
        jLabelAdminName.setText(AdminName);
        

        
      
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu4 = new javax.swing.JMenu();
        jDesktopPaneCentral = new javax.swing.JDesktopPane();
        jPanelMenu = new javax.swing.JPanel();
        jPanelGestionar = new javax.swing.JPanel();
        jLabelGestionar = new javax.swing.JLabel();
        jPanelTendencias = new javax.swing.JPanel();
        jLabelTendencias = new javax.swing.JLabel();
        jPanelComidas = new javax.swing.JPanel();
        jLabelComidas = new javax.swing.JLabel();
        jPanelHeader = new javax.swing.JPanel();
        jLabelSlogan = new javax.swing.JLabel();
        jLabelHeaderNombre = new javax.swing.JLabel();
        Image_restaurant_link = new javax.swing.JLabel();
        Image_iconoadmin_link = new javax.swing.JLabel();
        jLabelAdminName = new javax.swing.JLabel();
        jButtonLogOut = new javax.swing.JButton();
        Footer = new javax.swing.JPanel();
        jLabelNumero = new javax.swing.JLabel();
        Image_Facebook_link = new javax.swing.JLabel();
        Image_instagram_link = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        Image_Twitter_link = new javax.swing.JLabel();

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jDesktopPaneCentral.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPaneCentral.setPreferredSize(new java.awt.Dimension(720, 320));

        jPanelMenu.setBackground(new java.awt.Color(26, 85, 118));
        jPanelMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(26, 85, 118), 4));

        jPanelGestionar.setBackground(new java.awt.Color(242, 153, 74));
        jPanelGestionar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 153, 74), 3));

        jLabelGestionar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelGestionar.setForeground(new java.awt.Color(26, 85, 118));
        jLabelGestionar.setText("Gestionar Comidas");
        jLabelGestionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelGestionarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelGestionarLayout = new javax.swing.GroupLayout(jPanelGestionar);
        jPanelGestionar.setLayout(jPanelGestionarLayout);
        jPanelGestionarLayout.setHorizontalGroup(
            jPanelGestionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGestionarLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(jLabelGestionar)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanelGestionarLayout.setVerticalGroup(
            jPanelGestionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelGestionar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelTendencias.setBackground(new java.awt.Color(242, 153, 74));
        jPanelTendencias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 153, 74), 3));
        jPanelTendencias.setForeground(new java.awt.Color(26, 85, 118));

        jLabelTendencias.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTendencias.setForeground(new java.awt.Color(26, 85, 118));
        jLabelTendencias.setText("Tendencias");
        jLabelTendencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTendenciasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelTendenciasLayout = new javax.swing.GroupLayout(jPanelTendencias);
        jPanelTendencias.setLayout(jPanelTendenciasLayout);
        jPanelTendenciasLayout.setHorizontalGroup(
            jPanelTendenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTendenciasLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabelTendencias)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanelTendenciasLayout.setVerticalGroup(
            jPanelTendenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTendencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelComidas.setBackground(new java.awt.Color(242, 153, 74));
        jPanelComidas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 153, 74), 3));

        jLabelComidas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelComidas.setForeground(new java.awt.Color(26, 85, 118));
        jLabelComidas.setText("Comidas más solicitadas");

        javax.swing.GroupLayout jPanelComidasLayout = new javax.swing.GroupLayout(jPanelComidas);
        jPanelComidas.setLayout(jPanelComidasLayout);
        jPanelComidasLayout.setHorizontalGroup(
            jPanelComidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelComidasLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabelComidas)
                .addGap(37, 37, 37))
        );
        jPanelComidasLayout.setVerticalGroup(
            jPanelComidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelComidas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addComponent(jPanelGestionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTendencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelComidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGestionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelComidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelTendencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDesktopPaneCentral.setLayer(jPanelMenu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPaneCentralLayout = new javax.swing.GroupLayout(jDesktopPaneCentral);
        jDesktopPaneCentral.setLayout(jDesktopPaneCentralLayout);
        jDesktopPaneCentralLayout.setHorizontalGroup(
            jDesktopPaneCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPaneCentralLayout.setVerticalGroup(
            jDesktopPaneCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPaneCentralLayout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(270, Short.MAX_VALUE))
        );

        getContentPane().add(jDesktopPaneCentral, java.awt.BorderLayout.CENTER);

        jPanelHeader.setBackground(new java.awt.Color(26, 85, 118));
        jPanelHeader.setPreferredSize(new java.awt.Dimension(720, 107));

        jLabelSlogan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelSlogan.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSlogan.setText("Uno de los mejores de la ciudad");

        jLabelHeaderNombre.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelHeaderNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHeaderNombre.setText("Restaurante All Food");

        Image_restaurant_link.setText("IconoRes");

        Image_iconoadmin_link.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Image_iconoadmin_link.setText("IconoAdmin");
        Image_iconoadmin_link.setToolTipText("Datos Administrador");
        Image_iconoadmin_link.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Image_iconoadmin_link.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Image_iconoadmin_linkMouseClicked(evt);
            }
        });

        jLabelAdminName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAdminName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAdminName.setText("AdminName");

        jButtonLogOut.setBackground(new java.awt.Color(242, 153, 74));
        jButtonLogOut.setText("Cerrar Sesión");
        jButtonLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Image_restaurant_link)
                .addGap(70, 70, 70)
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSlogan, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHeaderNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Image_iconoadmin_link, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelAdminName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHeaderLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(Image_iconoadmin_link)
                        .addGap(2, 2, 2)
                        .addComponent(jLabelAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLogOut))
                    .addComponent(Image_restaurant_link)
                    .addGroup(jPanelHeaderLayout.createSequentialGroup()
                        .addComponent(jLabelHeaderNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabelSlogan)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelHeader, java.awt.BorderLayout.PAGE_START);

        Footer.setBackground(new java.awt.Color(26, 85, 118));
        Footer.setForeground(new java.awt.Color(26, 85, 118));
        Footer.setPreferredSize(new java.awt.Dimension(748, 100));

        jLabelNumero.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelNumero.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumero.setText("Número: 310 811 1199");

        Image_Facebook_link.setText("Facebook");

        Image_instagram_link.setText("Instagram");

        jLabelDireccion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelDireccion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDireccion.setText("Dirección: Cra 18 No 62 an 056");

        Image_Twitter_link.setText("Twitter");

        javax.swing.GroupLayout FooterLayout = new javax.swing.GroupLayout(Footer);
        Footer.setLayout(FooterLayout);
        FooterLayout.setHorizontalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FooterLayout.createSequentialGroup()
                        .addComponent(jLabelNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelDireccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(Image_Facebook_link)
                .addGap(64, 64, 64)
                .addComponent(Image_Twitter_link)
                .addGap(64, 64, 64)
                .addComponent(Image_instagram_link)
                .addGap(80, 80, 80))
        );
        FooterLayout.setVerticalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterLayout.createSequentialGroup()
                .addGroup(FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FooterLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Image_Facebook_link)
                            .addComponent(Image_instagram_link)
                            .addComponent(Image_Twitter_link)))
                    .addGroup(FooterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelDireccion)
                        .addGap(14, 14, 14)
                        .addComponent(jLabelNumero)))
                .addGap(32, 32, 32))
        );

        getContentPane().add(Footer, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelTendenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTendenciasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelTendenciasMouseClicked

    private void jLabelGestionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelGestionarMouseClicked
        // TODO add your handling code here:
        
        vtnGestionarComidas objvtnGestionarComidas= new vtnGestionarComidas(personaServices);
        this.jDesktopPaneCentral.add(objvtnGestionarComidas);
        objvtnGestionarComidas.setVisible(true);
        
    }//GEN-LAST:event_jLabelGestionarMouseClicked

    private void Image_iconoadmin_linkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image_iconoadmin_linkMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        GUIDatosAdmin vtnDatosAdmin = new GUIDatosAdmin(this.personaServices, AdminReferencia);
        vtnDatosAdmin.setVisible(true);
    }//GEN-LAST:event_Image_iconoadmin_linkMouseClicked

    private void jButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogOutActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        GUILoginAdmin vtnLogIn = new GUILoginAdmin(personaServices);
        vtnLogIn.setVisible(true);
    }//GEN-LAST:event_jButtonLogOutActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Footer;
    private javax.swing.JLabel Image_Facebook_link;
    private javax.swing.JLabel Image_Twitter_link;
    private javax.swing.JLabel Image_iconoadmin_link;
    private javax.swing.JLabel Image_instagram_link;
    private javax.swing.JLabel Image_restaurant_link;
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JDesktopPane jDesktopPaneCentral;
    private javax.swing.JLabel jLabelAdminName;
    private javax.swing.JLabel jLabelComidas;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelGestionar;
    private javax.swing.JLabel jLabelHeaderNombre;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelSlogan;
    private javax.swing.JLabel jLabelTendencias;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JPanel jPanelComidas;
    private javax.swing.JPanel jPanelGestionar;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelTendencias;
    // End of variables declaration//GEN-END:variables
}
