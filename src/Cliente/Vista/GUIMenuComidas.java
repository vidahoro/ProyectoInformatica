/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente.Vista;




import Cliente.Servicios.PersonaServicesInt;

import Modelo.Comida;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;



/**
 *
 * @author 57321
 */
public class GUIMenuComidas extends javax.swing.JFrame {

 

    private final PersonaServicesInt personaServices;

    /**
     * Creates new form JFrameMenu
     */
    public GUIMenuComidas(PersonaServicesInt personaServices) {
        initComponents();
        
        this.personaServices=personaServices;
        setLocationRelativeTo(null);
        
        llenarTabla();
        /*
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
        */
    }
    private void llenarTablaEspecial(){
        limpiarTablaEspecial();
        ArrayList<Comida> ListaDeComidas = this.personaServices.listarComidas();
        for (Comida objcomida : ListaDeComidas) {
            llenarFilaEspecial(objcomida);
        }  
    }
    private void limpiarTablaEspecial(){
    
    
    }
    private void llenarFilaEspecial(Comida objcomida){
    
    }

    private void llenarTabla(){
        limpiarTabla();
        ArrayList<Comida> ListaDeComidas = this.personaServices.listarComidas();
        for (Comida objcomida : ListaDeComidas) {
            llenarFila(objcomida);
        }
    }
    
    private void limpiarTabla(){
        DefaultTableModel modeloB = (DefaultTableModel) this.jTableBebidas.getModel();
        int filasB= this.jTableBebidas.getRowCount();
        for (int i=0; filasB>i;i++ ){
            modeloB.removeRow(0);        
        }
        DefaultTableModel modeloCR = (DefaultTableModel) this.jTableFastFood.getModel();
        int filasCR= this.jTableFastFood.getRowCount();
        for (int i=0; filasCR>i;i++ ){
            modeloCR.removeRow(0);        
        }
        DefaultTableModel modeloE = (DefaultTableModel) this.jTableEspecial.getModel();
        int filasE= this.jTableEspecial.getRowCount();
        for (int i=0; filasE>i;i++ ){
            modeloE.removeRow(0);        
        }
        DefaultTableModel modeloP = (DefaultTableModel) this.jTablePostres.getModel();
        int filasP= this.jTablePostres.getRowCount();
        for (int i=0; filasP>i;i++ ){
            modeloP.removeRow(0);        
        }
        DefaultTableModel modeloPA = (DefaultTableModel) this.jTablePedidoActual.getModel();
        int filasPA= this.jTablePedidoActual.getRowCount();
        for (int i=0; filasPA>i;i++ ){
            modeloPA.removeRow(0);        
        }
    }
    
    private void llenarFila(Comida objComidaPorListar)
    {   /*
        JButton JButtonEliminarUsuario = new JButton();
        JButtonEliminarUsuario.setName("Eliminar");
        JButtonEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Trash.png")));

        JButton JButtonEditarUsuario = new JButton();
        JButtonEditarUsuario.setName("Editar");
        JButtonEditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/EditButton.png")));
        */             
        Object [] fila= { objComidaPorListar.getFoto(), objComidaPorListar.getNombre(), objComidaPorListar.getValor()};
        
        if (objComidaPorListar.getTipo().equals("Especial")) {
            DefaultTableModel modelE = (DefaultTableModel) this.jTableEspecial.getModel();
            modelE.addRow(fila);
        }else if (objComidaPorListar.getTipo().equals("Comida Rápida")) {
            DefaultTableModel modelCR = (DefaultTableModel) this.jTableFastFood.getModel();
            modelCR.addRow(fila);
        }else if (objComidaPorListar.getTipo().equals("Postre")) {
            DefaultTableModel modelP = (DefaultTableModel) this.jTablePostres.getModel();
            modelP.addRow(fila);
        }else if (objComidaPorListar.getTipo().equals("Bebida")) {
            DefaultTableModel modelB = (DefaultTableModel) this.jTableBebidas.getModel();
            modelB.addRow(fila);
        }
        
        /*
        byte[] data;        
            System.out.println("imagen: " + objPersona.getImagen());
            data =  Base64.getDecoder().decode(objPersona.getImagen());
            
            ImageIcon imageIcon = new ImageIcon(data);
            
            Image img1= new ImageIcon(imageIcon.getImage()).getImage();
            ImageIcon img2=new ImageIcon(img1.getScaledInstance(30, 30, Image.SCALE_SMOOTH));                 
            this.jLabelImagenSeleccionada.setIcon(imageIcon);
        */
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
        jLabelSlogan = new javax.swing.JLabel();
        jLabelHeaderNombre = new javax.swing.JLabel();
        Image_restaurant_link = new javax.swing.JLabel();
        jPanelCentral = new javax.swing.JPanel();
        jLabelQuestion = new javax.swing.JLabel();
        jTabbedPaneMenu = new javax.swing.JTabbedPane();
        jScrollPaneEspecialTab = new javax.swing.JScrollPane();
        jTableEspecial = new javax.swing.JTable();
        jScrollPaneFastFoodTab = new javax.swing.JScrollPane();
        jTableFastFood = new javax.swing.JTable();
        jScrollPanePostresTab = new javax.swing.JScrollPane();
        jTablePostres = new javax.swing.JTable();
        jScrollPaneBebidasTab = new javax.swing.JScrollPane();
        jTableBebidas = new javax.swing.JTable();
        jScrollPaneActualTab = new javax.swing.JScrollPane();
        jTablePedidoActual = new javax.swing.JTable();
        jButtonCancelar = new javax.swing.JButton();
        jButtonOrdenar = new javax.swing.JButton();
        Footer = new javax.swing.JPanel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelNumero = new javax.swing.JLabel();
        Image_Facebook_link = new javax.swing.JLabel();
        Image_Twitter_link = new javax.swing.JLabel();
        Image_instagram_link = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelHeader.setBackground(new java.awt.Color(26, 85, 118));
        jPanelHeader.setPreferredSize(new java.awt.Dimension(714, 107));

        jLabelSlogan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelSlogan.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSlogan.setText("Uno de los mejores de la ciudad");

        jLabelHeaderNombre.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelHeaderNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHeaderNombre.setText("Restaurante All Food");

        Image_restaurant_link.setText("IconoRes");

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Image_restaurant_link)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelHeaderNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSlogan, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(264, Short.MAX_VALUE))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Image_restaurant_link)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addComponent(jLabelHeaderNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jLabelSlogan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelHeader, java.awt.BorderLayout.PAGE_START);

        jLabelQuestion.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelQuestion.setForeground(new java.awt.Color(26, 85, 118));
        jLabelQuestion.setText("¿Qué quieres comer hoy?");

        jTabbedPaneMenu.setBackground(new java.awt.Color(242, 153, 74));
        jTabbedPaneMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPaneMenu.setForeground(new java.awt.Color(26, 85, 118));
        jTabbedPaneMenu.setName(""); // NOI18N

        jTableEspecial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fotografía", "Nombre", "Valor", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneEspecialTab.setViewportView(jTableEspecial);

        jTabbedPaneMenu.addTab("Especial", jScrollPaneEspecialTab);

        jTableFastFood.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fotografía", "Nombre", "Valor", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneFastFoodTab.setViewportView(jTableFastFood);

        jTabbedPaneMenu.addTab("Comida Rápida", jScrollPaneFastFoodTab);

        jTablePostres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fotografía", "Nombre", "Valor", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPanePostresTab.setViewportView(jTablePostres);

        jTabbedPaneMenu.addTab("Postres", jScrollPanePostresTab);

        jTableBebidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fotografía", "Nombre", "Valor", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneBebidasTab.setViewportView(jTableBebidas);

        jTabbedPaneMenu.addTab("Bebidas", jScrollPaneBebidasTab);

        jTablePedidoActual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Valor", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneActualTab.setViewportView(jTablePedidoActual);

        jTabbedPaneMenu.addTab("Pedido Actual", jScrollPaneActualTab);

        jButtonCancelar.setBackground(new java.awt.Color(242, 153, 74));
        jButtonCancelar.setForeground(new java.awt.Color(26, 85, 118));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonOrdenar.setBackground(new java.awt.Color(242, 153, 74));
        jButtonOrdenar.setForeground(new java.awt.Color(26, 85, 118));
        jButtonOrdenar.setText("Ordenar");

        javax.swing.GroupLayout jPanelCentralLayout = new javax.swing.GroupLayout(jPanelCentral);
        jPanelCentral.setLayout(jPanelCentralLayout);
        jPanelCentralLayout.setHorizontalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelQuestion)
                    .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelCentralLayout.createSequentialGroup()
                            .addComponent(jButtonCancelar)
                            .addGap(386, 386, 386)
                            .addComponent(jButtonOrdenar))
                        .addComponent(jTabbedPaneMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCentralLayout.setVerticalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCentralLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabelQuestion)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPaneMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonOrdenar))
                .addContainerGap())
        );

        getContentPane().add(jPanelCentral, java.awt.BorderLayout.CENTER);

        Footer.setBackground(new java.awt.Color(26, 85, 118));
        Footer.setForeground(new java.awt.Color(26, 85, 118));
        Footer.setPreferredSize(new java.awt.Dimension(714, 91));

        jLabelDireccion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelDireccion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDireccion.setText("Dirección: Cra 18 No 62 an 056");

        jLabelNumero.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelNumero.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumero.setText("Número: 310 811 1199");

        Image_Facebook_link.setText("Facebook");

        Image_Twitter_link.setText("Twitter");

        Image_instagram_link.setText("Instagram");

        javax.swing.GroupLayout FooterLayout = new javax.swing.GroupLayout(Footer);
        Footer.setLayout(FooterLayout);
        FooterLayout.setHorizontalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNumero)
                    .addGroup(FooterLayout.createSequentialGroup()
                        .addComponent(jLabelDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                        .addComponent(Image_Facebook_link)
                        .addGap(46, 46, 46)
                        .addComponent(Image_Twitter_link)
                        .addGap(32, 32, 32)
                        .addComponent(Image_instagram_link)))
                .addGap(43, 43, 43))
        );
        FooterLayout.setVerticalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDireccion)
                    .addComponent(Image_Twitter_link)
                    .addComponent(Image_instagram_link)
                    .addComponent(Image_Facebook_link))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelNumero)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Footer, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        GUILoginUser vtnLogin = new GUILoginUser(personaServices);
        vtnLogin.setVisible(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Footer;
    private javax.swing.JLabel Image_Facebook_link;
    private javax.swing.JLabel Image_Twitter_link;
    private javax.swing.JLabel Image_instagram_link;
    private javax.swing.JLabel Image_restaurant_link;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonOrdenar;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelHeaderNombre;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelQuestion;
    private javax.swing.JLabel jLabelSlogan;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JScrollPane jScrollPaneActualTab;
    private javax.swing.JScrollPane jScrollPaneBebidasTab;
    private javax.swing.JScrollPane jScrollPaneEspecialTab;
    private javax.swing.JScrollPane jScrollPaneFastFoodTab;
    private javax.swing.JScrollPane jScrollPanePostresTab;
    private javax.swing.JTabbedPane jTabbedPaneMenu;
    private javax.swing.JTable jTableBebidas;
    private javax.swing.JTable jTableEspecial;
    private javax.swing.JTable jTableFastFood;
    private javax.swing.JTable jTablePedidoActual;
    private javax.swing.JTable jTablePostres;
    // End of variables declaration//GEN-END:variables
}
