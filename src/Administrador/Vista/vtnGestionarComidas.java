/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrador.Vista;


import Administrador.Servicios.ComidaServicesInt;
import Servidor.Acceso.ComidaRepositoryImplArray;
import Modelo.Comida;
import Servidor.Acceso.ComidaRepositoryImplArray;
import Servidor.Acceso.IComidaRepository;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.JButton;


/**
 *
 * @author Victor
 */
public class vtnGestionarComidas extends javax.swing.JInternalFrame {
    private ComidaServicesInt ComidaServices;
    //private Comida objcomida;
    /**
     * Creates new form vtnGestionarComidas
     */
    public vtnGestionarComidas() {
        initComponents();
    }
     private void InicializarTabla(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Foto");
        model.addColumn("Código");
        model.addColumn("Nombre");
        model.addColumn("Tipo");
        model.addColumn("Valor");
        model.addColumn("Acciones");
        this.jTableListaComidas.setModel(model);
    
    }  
    
    private void llenarTabla(){
        //DefaultTableModel model =(DefaultTableModel) this.jTableListaComidas.getModel();
       // limpiarTabla();
        ArrayList<Comida> ListaDeComidas = this.ComidaServices.listarComidas();
        for (Comida objcomida : ListaDeComidas) {
            llenarFila(objcomida);
        }        
         
     
    }
    private void limpiarTabla(){
        DefaultTableModel modelo = (DefaultTableModel) this.jTableListaComidas.getModel();
        int filas= this.jTableListaComidas.getRowCount();
        for (int i=0; filas>i;i++ ){
            modelo.removeRow(0);
        
        }
    }
    
    
    private void llenarFila(Comida objComidaPorListar)
    {
        
        JButton JButtonEliminarUsuario = new JButton();
        JButtonEliminarUsuario.setName("Eliminar");
        JButtonEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Trash.png")));

        JButton JButtonEditarUsuario = new JButton();
        JButtonEditarUsuario.setName("Editar");
        JButtonEditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/EditButton.png")));

        Object [] fila= { objComidaPorListar.getFoto(),objComidaPorListar.getCodigo(),objComidaPorListar.getNombre(),
            objComidaPorListar.getTipo(),JButtonEliminarUsuario, JButtonEditarUsuario};
        
       

        DefaultTableModel model = (DefaultTableModel) this.jTableListaComidas.getModel();
        model.addRow(fila);
        
        
        
        
    }
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonAgregarComida = new javax.swing.JButton();
        jTextFieldBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaComidas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestionar Comidas");
        setInheritsPopupMenu(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonAgregarComida.setBackground(new java.awt.Color(26, 85, 118));
        jButtonAgregarComida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonAgregarComida.setForeground(new java.awt.Color(242, 153, 74));
        jButtonAgregarComida.setText("Agregar Comida");
        jButtonAgregarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarComidaActionPerformed(evt);
            }
        });

        jTextFieldBuscar.setText("Buscar por código de Comida");
        jTextFieldBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscarActionPerformed(evt);
            }
        });

        jTableListaComidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Foto", "Código", "Nombre", "Tipo", "Valor", "Eliminar", "Editar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableListaComidas.setRowHeight(25);
        jScrollPane1.setViewportView(jTableListaComidas);

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jButton1)
                .addContainerGap(419, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldBuscar)
                            .addComponent(jScrollPane1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAgregarComida)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(49, 49, 49)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton1)
                .addContainerGap(316, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jButtonAgregarComida)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    
    
    
    private void jButtonAgregarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarComidaActionPerformed
        // TODO add your handling code here:
        vtnAgregarComida vtnAdd = new vtnAgregarComida();
        vtnAdd.setVisible(true);
        this.getParent().add(vtnAdd);
    }//GEN-LAST:event_jButtonAgregarComidaActionPerformed

    private void jTextFieldBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        llenarTabla();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAgregarComida;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListaComidas;
    private javax.swing.JTextField jTextFieldBuscar;
    // End of variables declaration//GEN-END:variables
}
