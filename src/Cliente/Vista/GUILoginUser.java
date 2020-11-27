/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente.Vista;

import Cliente.Servicios.PersonaServicesInt;
import Utilidades.Utilidades;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Victor
 */
public class GUILoginUser extends javax.swing.JFrame {
    
    private final PersonaServicesInt personaServices;
    /**
     * Creates new form NewJFrameUsuario
     */
    public GUILoginUser(PersonaServicesInt personaServices) {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        this.personaServices=personaServices;
        setLocationRelativeTo(null);
        
        Image icon = Toolkit.getDefaultToolkit().getImage("Recursos/restaurant.png");
        this.setIconImage(icon);

        
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
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHeader = new javax.swing.JPanel();
        Image_restaurant_link = new javax.swing.JLabel();
        jLabelHeaderNombre = new javax.swing.JLabel();
        jLabelSlogan = new javax.swing.JLabel();
        jPanelCentral = new javax.swing.JPanel();
        jPanelLogIN = new javax.swing.JPanel();
        jLabelIniciarSesion = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelContrasena = new javax.swing.JLabel();
        jPasswordFieldContrasenia = new javax.swing.JPasswordField();
        jButtonLogIN = new javax.swing.JButton();
        jLabelOlvidarC = new javax.swing.JLabel();
        jLabelTipoID = new javax.swing.JLabel();
        jComboBoxTipoID = new javax.swing.JComboBox<>();
        jLabelNoAccount = new javax.swing.JLabel();
        jLabelRegister = new javax.swing.JLabel();
        jPanelFooter = new javax.swing.JPanel();
        Image_Facebook_link = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelNumero = new javax.swing.JLabel();
        Image_Twitter_link = new javax.swing.JLabel();
        Image_instagram_link = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelHeader.setBackground(new java.awt.Color(26, 85, 118));

        Image_restaurant_link.setText("IconoRes");

        jLabelHeaderNombre.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelHeaderNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHeaderNombre.setText("Restaurante All Food");

        jLabelSlogan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelSlogan.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSlogan.setText("Uno de los mejores de la ciudad");

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Image_restaurant_link, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelSlogan, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                    .addComponent(jLabelHeaderNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelHeaderNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelSlogan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Image_restaurant_link, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelHeader, java.awt.BorderLayout.PAGE_START);

        jPanelLogIN.setBackground(new java.awt.Color(186, 204, 214));
        jPanelLogIN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(26, 85, 118), 2));

        jLabelIniciarSesion.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelIniciarSesion.setForeground(new java.awt.Color(26, 85, 118));
        jLabelIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIniciarSesion.setText("Iniciar Sesión");

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(26, 85, 118));
        jLabelUsuario.setText("Identificación:");

        jTextFieldUsuario.setToolTipText("Ingresar Número de Identificación");
        jTextFieldUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });

        jLabelContrasena.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelContrasena.setForeground(new java.awt.Color(26, 85, 118));
        jLabelContrasena.setText("Contraseña:");

        jPasswordFieldContrasenia.setToolTipText("Ingresar Contraseña");
        jPasswordFieldContrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldContraseniaKeyPressed(evt);
            }
        });

        jButtonLogIN.setBackground(new java.awt.Color(242, 153, 74));
        jButtonLogIN.setForeground(new java.awt.Color(26, 85, 118));
        jButtonLogIN.setText("Iniciar Sesión");
        jButtonLogIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogINActionPerformed(evt);
            }
        });

        jLabelOlvidarC.setBackground(new java.awt.Color(26, 85, 118));
        jLabelOlvidarC.setForeground(new java.awt.Color(26, 85, 118));
        jLabelOlvidarC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelOlvidarC.setText("¿Olvidaste tu contraseña?");

        jLabelTipoID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTipoID.setForeground(new java.awt.Color(26, 85, 118));
        jLabelTipoID.setText("Tipo de ID:");

        jComboBoxTipoID.setForeground(new java.awt.Color(26, 85, 118));
        jComboBoxTipoID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C.C.", "T.I.", "Registro Civil", "Cédula de Extranjeria" }));

        jLabelNoAccount.setBackground(new java.awt.Color(26, 85, 118));
        jLabelNoAccount.setForeground(new java.awt.Color(26, 85, 118));
        jLabelNoAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNoAccount.setText("¿No tienes una cuenta? ");

        jLabelRegister.setBackground(new java.awt.Color(26, 85, 118));
        jLabelRegister.setForeground(new java.awt.Color(242, 153, 74));
        jLabelRegister.setText("Registrate");

        javax.swing.GroupLayout jPanelLogINLayout = new javax.swing.GroupLayout(jPanelLogIN);
        jPanelLogIN.setLayout(jPanelLogINLayout);
        jPanelLogINLayout.setHorizontalGroup(
            jPanelLogINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogINLayout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addGroup(jPanelLogINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLogINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelContrasena, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLogINLayout.createSequentialGroup()
                            .addComponent(jLabelNoAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPasswordFieldContrasenia)
                        .addComponent(jLabelOlvidarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxTipoID, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelTipoID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jButtonLogIN, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanelLogINLayout.setVerticalGroup(
            jPanelLogINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogINLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabelIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTipoID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxTipoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelContrasena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonLogIN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelOlvidarC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLogINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRegister))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelCentralLayout = new javax.swing.GroupLayout(jPanelCentral);
        jPanelCentral.setLayout(jPanelCentralLayout);
        jPanelCentralLayout.setHorizontalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCentralLayout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(jPanelLogIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanelCentralLayout.setVerticalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jPanelLogIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelCentral, java.awt.BorderLayout.CENTER);

        jPanelFooter.setBackground(new java.awt.Color(26, 85, 118));

        Image_Facebook_link.setText("Facebook");

        jLabelDireccion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelDireccion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDireccion.setText("Dirección: Cra 18 No 62 an 056");

        jLabelNumero.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelNumero.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumero.setText("Número: 310 811 1199");

        Image_Twitter_link.setText("Twitter");

        Image_instagram_link.setText("Instagram");

        javax.swing.GroupLayout jPanelFooterLayout = new javax.swing.GroupLayout(jPanelFooter);
        jPanelFooter.setLayout(jPanelFooterLayout);
        jPanelFooterLayout.setHorizontalGroup(
            jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFooterLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDireccion)
                    .addComponent(jLabelNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(Image_Facebook_link)
                .addGap(64, 64, 64)
                .addComponent(Image_Twitter_link)
                .addGap(64, 64, 64)
                .addComponent(Image_instagram_link)
                .addGap(80, 80, 80))
        );
        jPanelFooterLayout.setVerticalGroup(
            jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFooterLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelDireccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNumero)
                .addGap(24, 24, 24))
            .addGroup(jPanelFooterLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Image_Facebook_link)
                    .addComponent(Image_Twitter_link)
                    .addComponent(Image_instagram_link))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelFooter, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jButtonLogINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogINActionPerformed
        // TODO add your handling code here:
        int resultado;
        if(jTextFieldUsuario.getText().equals("") || jPasswordFieldContrasenia.getText().equals("")){
            resultado = 2;
        }else{
            resultado=this.personaServices.iniciarSesion(jTextFieldUsuario.getText(),jComboBoxTipoID.getSelectedItem()+"", jPasswordFieldContrasenia.getText());
        }
        if(resultado==1)
        {
            GUIMenuComidas vtnMenu = new GUIMenuComidas(personaServices);
            vtnMenu.setExtendedState(MAXIMIZED_BOTH);
            this.setVisible(false);
            vtnMenu.setVisible(true);
        }
        else if(resultado==0)
        {
            Utilidades.mensajeAdvertencia("Error al realizar la conexión", "Atención");
        }
        else
        {
            Utilidades.mensajeAdvertencia("Usuario o contraseña incorrecta", "Atención");
        }
    }//GEN-LAST:event_jButtonLogINActionPerformed

    private void jPasswordFieldContraseniaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseniaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonLogINActionPerformed(null);
        }
    }//GEN-LAST:event_jPasswordFieldContraseniaKeyPressed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image_Facebook_link;
    private javax.swing.JLabel Image_Twitter_link;
    private javax.swing.JLabel Image_instagram_link;
    private javax.swing.JLabel Image_restaurant_link;
    private javax.swing.JButton jButtonLogIN;
    private javax.swing.JComboBox<String> jComboBoxTipoID;
    private javax.swing.JLabel jLabelContrasena;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelHeaderNombre;
    private javax.swing.JLabel jLabelIniciarSesion;
    private javax.swing.JLabel jLabelNoAccount;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelOlvidarC;
    private javax.swing.JLabel jLabelRegister;
    private javax.swing.JLabel jLabelSlogan;
    private javax.swing.JLabel jLabelTipoID;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelFooter;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelLogIN;
    private javax.swing.JPasswordField jPasswordFieldContrasenia;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
