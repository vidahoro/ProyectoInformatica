/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaUsuario;

/**
 *
 * @author Victor
 */
public class NewJFrameLoginUser extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrameUsuario
     */
    public NewJFrameLoginUser() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        Image_restaurant_link2 = new javax.swing.JLabel();
        jLabelHeaderNombre2 = new javax.swing.JLabel();
        jLabelSlogan2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabelIniciarSesion = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelError1 = new javax.swing.JLabel();
        jLabelContrasena = new javax.swing.JLabel();
        jPasswordFieldContrasenia = new javax.swing.JPasswordField();
        jLabelError2 = new javax.swing.JLabel();
        jButtonLogIN = new javax.swing.JButton();
        jLabelOlvidarC = new javax.swing.JLabel();
        jLabelUsuario1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabelOlvidarC1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Image_Facebook_link = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelNumero = new javax.swing.JLabel();
        Image_Twitter_link = new javax.swing.JLabel();
        Image_instagram_link = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(26, 85, 118));

        Image_restaurant_link2.setText("IconoRes");

        jLabelHeaderNombre2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelHeaderNombre2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHeaderNombre2.setText("Restaurante All Food");

        jLabelSlogan2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelSlogan2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSlogan2.setText("Uno de los mejores de la ciudad");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Image_restaurant_link2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelSlogan2, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                    .addComponent(jLabelHeaderNombre2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelHeaderNombre2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelSlogan2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Image_restaurant_link2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(26, 85, 118)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIniciarSesion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelIniciarSesion.setForeground(new java.awt.Color(26, 85, 118));
        jLabelIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIniciarSesion.setText("Iniciar Sesión");
        jPanel4.add(jLabelIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 43, 553, 28));

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(26, 85, 118));
        jLabelUsuario.setText("Identificación:");
        jPanel4.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 77, 255, 28));

        jTextFieldUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel4.add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 111, 255, 26));

        jLabelError1.setForeground(new java.awt.Color(255, 51, 51));
        jLabelError1.setText("ERROR");
        jPanel4.add(jLabelError1, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 143, -1, -1));

        jLabelContrasena.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelContrasena.setForeground(new java.awt.Color(26, 85, 118));
        jLabelContrasena.setText("Contraseña:");
        jPanel4.add(jLabelContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 227, 255, 25));
        jPanel4.add(jPasswordFieldContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 263, 214, -1));

        jLabelError2.setForeground(new java.awt.Color(255, 51, 51));
        jLabelError2.setText("ERROR");
        jPanel4.add(jLabelError2, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 294, -1, -1));

        jButtonLogIN.setBackground(new java.awt.Color(242, 153, 74));
        jButtonLogIN.setForeground(new java.awt.Color(26, 85, 118));
        jButtonLogIN.setText("Iniciar Sesión");
        jPanel4.add(jButtonLogIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 310, -1, -1));

        jLabelOlvidarC.setBackground(new java.awt.Color(26, 85, 118));
        jLabelOlvidarC.setForeground(new java.awt.Color(26, 85, 118));
        jLabelOlvidarC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelOlvidarC.setText("¿Olvidaste tu contraseña?");
        jPanel4.add(jLabelOlvidarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 344, 255, 22));

        jLabelUsuario1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelUsuario1.setForeground(new java.awt.Color(26, 85, 118));
        jLabelUsuario1.setText("Tipo de ID:");
        jPanel4.add(jLabelUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 168, 214, -1));

        jComboBox1.setForeground(new java.awt.Color(26, 85, 118));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C.C.", "T.I.", "Registro Civil", "Cédula de enxtranjeria" }));
        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 196, 255, -1));

        jLabelOlvidarC1.setBackground(new java.awt.Color(26, 85, 118));
        jLabelOlvidarC1.setForeground(new java.awt.Color(26, 85, 118));
        jLabelOlvidarC1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelOlvidarC1.setText("¿No tienes una cuenta? ");
        jPanel4.add(jLabelOlvidarC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 377, 135, 19));

        jLabel1.setBackground(new java.awt.Color(26, 85, 118));
        jLabel1.setForeground(new java.awt.Color(242, 153, 74));
        jLabel1.setText("Registrate");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 379, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        jPanel1.add(jPanel2);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel5.setBackground(new java.awt.Color(26, 85, 118));

        Image_Facebook_link.setText("Facebook");

        jLabelDireccion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelDireccion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDireccion.setText("Dirección: Cra 18 No 62 an 056");

        jLabelNumero.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelNumero.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumero.setText("Número: 310 811 1199");

        Image_Twitter_link.setText("Twitter");

        Image_instagram_link.setText("Instagram");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNumero)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabelDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Image_Facebook_link)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Image_Twitter_link)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Image_instagram_link)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDireccion)
                    .addComponent(Image_Facebook_link)
                    .addComponent(Image_Twitter_link)
                    .addComponent(Image_instagram_link))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelNumero)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrameLoginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrameLoginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrameLoginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrameLoginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrameLoginUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image_Facebook_link;
    private javax.swing.JLabel Image_Twitter_link;
    private javax.swing.JLabel Image_instagram_link;
    private javax.swing.JLabel Image_restaurant_link;
    private javax.swing.JLabel Image_restaurant_link1;
    private javax.swing.JLabel Image_restaurant_link2;
    private javax.swing.JButton jButtonLogIN;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelContrasena;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelError1;
    private javax.swing.JLabel jLabelError2;
    private javax.swing.JLabel jLabelHeaderNombre;
    private javax.swing.JLabel jLabelHeaderNombre1;
    private javax.swing.JLabel jLabelHeaderNombre2;
    private javax.swing.JLabel jLabelIniciarSesion;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelOlvidarC;
    private javax.swing.JLabel jLabelOlvidarC1;
    private javax.swing.JLabel jLabelSlogan;
    private javax.swing.JLabel jLabelSlogan1;
    private javax.swing.JLabel jLabelSlogan2;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JLabel jLabelUsuario1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelHeader1;
    private javax.swing.JPanel jPanelHeader2;
    private javax.swing.JPasswordField jPasswordFieldContrasenia;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
