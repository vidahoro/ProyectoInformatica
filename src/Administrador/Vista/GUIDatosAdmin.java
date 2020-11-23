/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrador.Vista;

import Administrador.Servicios.PersonaServicesInt;
import java.awt.Image;
import javax.swing.ImageIcon;
import Modelo.Administrador;
import java.awt.Toolkit;
/**
 *
 * @author 57321
 */
public class GUIDatosAdmin extends javax.swing.JFrame {
    private Administrador AdminReferencia;
    private PersonaServicesInt personaServices;
    /**
     * Creates new form JFrameDatosAdmin
     */
    public GUIDatosAdmin(PersonaServicesInt personaServices, Administrador AdminReferencia) {
        initComponents();
        
        setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage("Recursos/restaurant.png");
        this.setIconImage(icon);
        this.AdminReferencia= AdminReferencia;
        this.personaServices=personaServices;
        
        Image img1 = new ImageIcon(getClass().getResource("/Recursos/restaurant.png")).getImage();        
        ImageIcon img2= new ImageIcon(img1.getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        this.Image_restaurant_link.setIcon(img2);
        this.Image_restaurant_link.setText("");
        
        Image img3 = new ImageIcon(getClass().getResource("/Recursos/Facebook.png")).getImage();        
        ImageIcon img4= new ImageIcon(img3.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
        this.Image_Facebook_link.setIcon(img4);
        this.Image_Facebook_link.setText("");
        
        Image img5 = new ImageIcon(getClass().getResource("/Recursos/Twitter.png")).getImage();        
        ImageIcon img6= new ImageIcon(img5.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
        this.Image_Twitter_link.setIcon(img6);
        this.Image_Twitter_link.setText("");
        
        Image img7 = new ImageIcon(getClass().getResource("/Recursos/instagram.png")).getImage();        
        ImageIcon img8= new ImageIcon(img7.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
        this.Image_instagram_link.setIcon(img8);
        this.Image_instagram_link.setText("");
        
        Image img9 = new ImageIcon(getClass().getResource("/Recursos/IconoAdmin.png")).getImage();        
        ImageIcon img10= new ImageIcon(img9.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
        this.Image_iconoadmin_link.setIcon(img10);
        this.Image_iconoadmin_link.setText("");
        
        String AdminName = AdminReferencia.getNombre();
        jLabelAdminName.setText(AdminName);
        
        jTextFieldNombre.setText(AdminReferencia.getNombre());
        jTextFieldApellido.setText(AdminReferencia.getApellido());
        jPasswordContrasenia.setText(AdminReferencia.getConstrasenia());
    }
    
    /**
     * @param args the command line arguments
     */

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        Image_Twitter_link = new javax.swing.JLabel();
        Image_instagram_link = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jPanelCenter = new javax.swing.JPanel();
        jLabelDatos = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jButtonEdit = new javax.swing.JButton();
        jPasswordContrasenia = new javax.swing.JPasswordField();
        jPanelMenu = new javax.swing.JPanel();
        jPanelGestionar = new javax.swing.JPanel();
        jLabelGestionar = new javax.swing.JLabel();
        jPanelTendencias = new javax.swing.JPanel();
        jLabelTendencias = new javax.swing.JLabel();
        jPanelComidas = new javax.swing.JPanel();
        jLabelComidas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelHeader.setBackground(new java.awt.Color(26, 85, 118));
        jPanelHeader.setPreferredSize(new java.awt.Dimension(720, 107));

        jLabelSlogan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelSlogan.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSlogan.setText("Uno de los mejores de la ciudad");

        jLabelHeaderNombre.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelHeaderNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHeaderNombre.setText("Restaurante All Food");

        Image_restaurant_link.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Image_restaurant_link.setText("IconoRes");

        Image_iconoadmin_link.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Image_iconoadmin_link.setText("IconoAdmin");

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
                .addGap(71, 71, 71)
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelHeaderNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSlogan, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelAdminName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Image_iconoadmin_link, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Image_restaurant_link)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelHeaderNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeaderLayout.createSequentialGroup()
                        .addComponent(Image_iconoadmin_link)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelAdminName)))
                .addGap(0, 0, 0)
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLogOut)
                    .addComponent(jLabelSlogan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanelHeader, java.awt.BorderLayout.PAGE_START);

        Footer.setBackground(new java.awt.Color(26, 85, 118));
        Footer.setForeground(new java.awt.Color(26, 85, 118));
        Footer.setPreferredSize(new java.awt.Dimension(748, 100));

        jLabelNumero.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelNumero.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumero.setText("Número: 310 811 1199");

        Image_Facebook_link.setText("Facebook");

        Image_Twitter_link.setText("Twitter");

        Image_instagram_link.setText("Instagram");

        jLabelDireccion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelDireccion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDireccion.setText("Dirección: Cra 18 No 62 an 056");

        javax.swing.GroupLayout FooterLayout = new javax.swing.GroupLayout(Footer);
        Footer.setLayout(FooterLayout);
        FooterLayout.setHorizontalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FooterLayout.createSequentialGroup()
                        .addComponent(jLabelNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                        .addComponent(Image_Facebook_link)
                        .addGap(44, 44, 44)
                        .addComponent(Image_Twitter_link)
                        .addGap(46, 46, 46)
                        .addComponent(Image_instagram_link)
                        .addGap(47, 47, 47))
                    .addGroup(FooterLayout.createSequentialGroup()
                        .addComponent(jLabelDireccion)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        FooterLayout.setVerticalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelDireccion)
                .addGroup(FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FooterLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Image_Facebook_link)
                            .addComponent(Image_Twitter_link)
                            .addComponent(Image_instagram_link)))
                    .addGroup(FooterLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabelNumero)))
                .addGap(21, 21, 21))
        );

        getContentPane().add(Footer, java.awt.BorderLayout.PAGE_END);

        jLabelDatos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelDatos.setForeground(new java.awt.Color(26, 85, 118));
        jLabelDatos.setText("Datos Administrador");

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(26, 85, 118));
        jLabelNombre.setText("Nombres:");

        jLabelApellido.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabelApellido.setForeground(new java.awt.Color(26, 85, 118));
        jLabelApellido.setText("Apellidos:");

        jLabelPassword.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(26, 85, 118));
        jLabelPassword.setText("Contraseña:");

        jTextFieldNombre.setEditable(false);

        jTextFieldApellido.setEditable(false);

        jButtonEdit.setText("Editar Datos");
        jButtonEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jPasswordContrasenia.setEditable(false);

        jPanelMenu.setBackground(new java.awt.Color(26, 85, 118));
        jPanelMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(26, 85, 118), 4));

        jPanelGestionar.setBackground(new java.awt.Color(242, 153, 74));
        jPanelGestionar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 153, 74), 3));

        jLabelGestionar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelGestionar.setForeground(new java.awt.Color(26, 85, 118));
        jLabelGestionar.setText("Gestionar Comidas");
        jLabelGestionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabelTendencias)
                .addContainerGap(37, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanelCenterLayout = new javax.swing.GroupLayout(jPanelCenter);
        jPanelCenter.setLayout(jPanelCenterLayout);
        jPanelCenterLayout.setHorizontalGroup(
            jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelCenterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelApellido)
                        .addComponent(jLabelPassword)
                        .addComponent(jLabelNombre)
                        .addComponent(jLabelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldNombre)
                        .addComponent(jTextFieldApellido)
                        .addComponent(jPasswordContrasenia))
                    .addComponent(jButtonEdit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCenterLayout.setVerticalGroup(
            jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCenterLayout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabelDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelApellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonEdit)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelGestionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelGestionarMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        GUIMenuPrincipal vtnMenu = new GUIMenuPrincipal(this.personaServices, null, AdminReferencia);
        vtnMenu.setVisible(true);
    }//GEN-LAST:event_jLabelGestionarMouseClicked

    private void jLabelTendenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTendenciasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelTendenciasMouseClicked

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        GUIEditDatosAdmin vtnEditAdmin = new GUIEditDatosAdmin(this.personaServices,AdminReferencia);
        vtnEditAdmin.setVisible(true);
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogOutActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        GUILoginAdmin vtnLogIn = new GUILoginAdmin(personaServices);
        vtnLogIn.setVisible(true);
    }//GEN-LAST:event_jButtonLogOutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Footer;
    private javax.swing.JLabel Image_Facebook_link;
    private javax.swing.JLabel Image_Twitter_link;
    private javax.swing.JLabel Image_iconoadmin_link;
    private javax.swing.JLabel Image_instagram_link;
    private javax.swing.JLabel Image_restaurant_link;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JLabel jLabelAdminName;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelComidas;
    private javax.swing.JLabel jLabelDatos;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelGestionar;
    private javax.swing.JLabel jLabelHeaderNombre;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelSlogan;
    private javax.swing.JLabel jLabelTendencias;
    private javax.swing.JPanel jPanelCenter;
    private javax.swing.JPanel jPanelComidas;
    private javax.swing.JPanel jPanelGestionar;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelTendencias;
    private javax.swing.JPasswordField jPasswordContrasenia;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
