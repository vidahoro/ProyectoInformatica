/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author 57321
 */
public class JFrameDatosAdmin extends javax.swing.JFrame {

    /**
     * Creates new form JFrameDatosAdmin
     */
    public JFrameDatosAdmin() {
        initComponents();
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
        
        
    }
    
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
            java.util.logging.Logger.getLogger(JFrameGestionarComidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameGestionarComidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameGestionarComidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameGestionarComidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameDatosAdmin().setVisible(true);
            }
        });
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCentral = new javax.swing.JPanel();
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
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanelCentralLayout = new javax.swing.GroupLayout(jPanelCentral);
        jPanelCentral.setLayout(jPanelCentralLayout);
        jPanelCentralLayout.setHorizontalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 743, Short.MAX_VALUE)
        );
        jPanelCentralLayout.setVerticalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelHeader.setBackground(new java.awt.Color(26, 85, 118));
        jPanelHeader.setPreferredSize(new java.awt.Dimension(720, 107));

        jLabelSlogan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelSlogan.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSlogan.setText("Uno de los mejores de la ciudad");

        jLabelHeaderNombre.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelHeaderNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHeaderNombre.setText("Restaurante All Food");

        Image_restaurant_link.setText("IconoRes");

        Image_iconoadmin_link.setText("IconoAdmin");

        jLabelAdminName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAdminName.setText("AdminName");

        jButtonLogOut.setText("Cerrar Sesión");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeaderLayout.createSequentialGroup()
                        .addComponent(jButtonLogOut)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeaderLayout.createSequentialGroup()
                        .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Image_iconoadmin_link, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelAdminName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(52, 52, 52))))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 308, Short.MAX_VALUE)
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Datos Administrador");

        javax.swing.GroupLayout jPanelCenterLayout = new javax.swing.GroupLayout(jPanelCenter);
        jPanelCenter.setLayout(jPanelCenterLayout);
        jPanelCenterLayout.setHorizontalGroup(
            jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCenterLayout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addComponent(jLabel1)
                .addContainerGap(300, Short.MAX_VALUE))
        );
        jPanelCenterLayout.setVerticalGroup(
            jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(257, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelCenter, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(26, 85, 118));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(26, 85, 118)));
        jMenuBar1.setForeground(new java.awt.Color(26, 85, 118));
        jMenuBar1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jMenu1.setText("Gestionar Comidas");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tendencias");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Comidas más solicitadas");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Footer;
    private javax.swing.JLabel Image_Facebook_link;
    private javax.swing.JLabel Image_Twitter_link;
    private javax.swing.JLabel Image_iconoadmin_link;
    private javax.swing.JLabel Image_instagram_link;
    private javax.swing.JLabel Image_restaurant_link;
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAdminName;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelHeaderNombre;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelSlogan;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanelCenter;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelHeader;
    // End of variables declaration//GEN-END:variables
}
