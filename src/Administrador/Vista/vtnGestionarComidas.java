/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrador.Vista;

import Administrador.Servicios.PersonaServicesInt;
import Modelo.Comida;
import Servidor.Acceso.IComidaRepository;
import Utilidades.Utilidades;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author Victor
 */
public class vtnGestionarComidas extends javax.swing.JInternalFrame {
    private PersonaServicesInt personaServices;
    TableRowSorter trs;
    JLabel JLabelFoto;
    /**
     * Creates new form vtnGestionarComidas
     */
    public vtnGestionarComidas(PersonaServicesInt personaServices) {
        this.personaServices=personaServices;
        initComponents();
        
        this.jTableListaComidas.setDefaultRenderer(Object.class, new Render());
        llenarTabla();
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
        limpiarTabla();
        ArrayList<Comida> ListaDeComidas = this.personaServices.listarComidas();
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
        byte[] data;        
        System.out.println("Foto: " + objComidaPorListar.getFoto());
        data =  Base64.getDecoder().decode(objComidaPorListar.getFoto());
            
        ImageIcon imageIcon = new ImageIcon(data);
            
        Image img1= new ImageIcon(imageIcon.getImage()).getImage();
        ImageIcon img2=new ImageIcon(img1.getScaledInstance(30, 30, Image.SCALE_SMOOTH));                 

        JButton JButtonFoto = new JButton();
        JButtonFoto.setName("Foto");
        JButtonFoto.setIcon(img2);       
         
        JButton JButtonEliminarComida = new JButton();
        JButtonEliminarComida.setName("Eliminar");
        JButtonEliminarComida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Trash.png")));

        JButton JButtonEditarComida = new JButton();
        JButtonEditarComida.setName("Editar");
        JButtonEditarComida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/EditButton.png")));

        Object [] fila= { JButtonFoto,objComidaPorListar.getCodigo(),objComidaPorListar.getNombre(),
        objComidaPorListar.getTipo(), objComidaPorListar.getValor(), JButtonEliminarComida, JButtonEditarComida};
        
        DefaultTableModel model = (DefaultTableModel) this.jTableListaComidas.getModel();
        model.addRow(fila);

    }
    
    private static String convertirImagenBase64(String urlImagen) {
        String imagenBase64="";
        try {        
            File file =  new File(urlImagen); 
            
            FileInputStream fileInputStreamReader = new FileInputStream(file);
            byte[] bytes = new byte[(int)file.length()];
            fileInputStreamReader.read(bytes);
            imagenBase64=new String(Base64.getEncoder().encode(bytes), "UTF-8");
            System.out.println("imagen en base 64: " + imagenBase64);            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(vtnAgregarComida.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(vtnAgregarComida.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(vtnAgregarComida.class.getName()).log(Level.SEVERE, null, ex);
        }            
            return imagenBase64;
    }
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jButtonAgregarComida = new javax.swing.JButton();
        jTextFieldBuscar = new javax.swing.JTextField();
        jScrollPaneTabla = new javax.swing.JScrollPane();
        jTableListaComidas = new javax.swing.JTable();
        jButtonActualizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestionar Comidas");
        setInheritsPopupMenu(true);

        jPanelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonAgregarComida.setBackground(new java.awt.Color(26, 85, 118));
        jButtonAgregarComida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonAgregarComida.setForeground(new java.awt.Color(242, 153, 74));
        jButtonAgregarComida.setText("Agregar Comida");
        jButtonAgregarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarComidaActionPerformed(evt);
            }
        });

        jTextFieldBuscar.setToolTipText("Buscar por código de Comida");
        jTextFieldBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscarActionPerformed(evt);
            }
        });

        jTableListaComidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Foto", "Código", "Nombre", "Tipo", "Valor", "Eliminar", "Editar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableListaComidas.setRowHeight(50);
        jTableListaComidas.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jTableListaComidas.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTableListaComidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListaComidasMouseClicked(evt);
            }
        });
        jScrollPaneTabla.setViewportView(jTableListaComidas);

        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jButtonActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jButtonAgregarComida)
                .addContainerGap(177, Short.MAX_VALUE))
            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldBuscar)
                        .addComponent(jScrollPaneTabla))
                    .addGap(49, 49, 49)))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonActualizar)
                    .addComponent(jButtonAgregarComida))
                .addContainerGap(307, Short.MAX_VALUE))
            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        getContentPane().add(jPanelPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
       
    private void jButtonAgregarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarComidaActionPerformed
        // TODO add your handling code here:
        vtnAgregarComida vtnAdd = new vtnAgregarComida(this.personaServices);
        vtnAdd.setVisible(true);
        this.getParent().add(vtnAdd);
    }//GEN-LAST:event_jButtonAgregarComidaActionPerformed

    private void jTextFieldBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarActionPerformed
        // TODO add your handling code here:
        /*
        DefaultTableModel dtm = new DefaultTableModel(); 
        jTextFieldBuscar.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(KeyEvent ke) {
               trs.setRowFilter(RowFilter.regexFilter("(?i)"+jTextFieldBuscar, 1));
            }
  
        });
        trs = new TableRowSorter(dtm);
        jTableListaComidas.setRowSorter(trs);  
        */
    }//GEN-LAST:event_jTextFieldBuscarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        // TODO add your handling code here:
        llenarTabla();
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jTableListaComidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListaComidasMouseClicked
        // TODO add your handling code here:
        int column = this.jTableListaComidas.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/jTableListaComidas.getRowHeight();
        
        if(row < jTableListaComidas.getRowCount() && row >= 0 && column < jTableListaComidas.getColumnCount() && column >= 0){
            Object value = jTableListaComidas.getValueAt(row, column);
            
            if(value instanceof JButton){
                
                ((JButton)value).doClick();
                JButton boton = (JButton) value;
                
                String Foto   = jTableListaComidas.getValueAt(row, 0).toString();
                String Codigo = jTableListaComidas.getValueAt(row, 1).toString();
                String Nombre = jTableListaComidas.getValueAt(row, 2).toString();
                String Tipo   = jTableListaComidas.getValueAt(row, 3).toString();
                float Valor   = (Float) jTableListaComidas.getValueAt(row, 4);
               
                if(boton.getName().equals("Eliminar")){
                    try{  
                        if(Utilidades.mensajeConfirmacion("¿Estás seguro de que quieres eliminar la comida " + Codigo + " " + Nombre+" ?", "Confirmación") == JOptionPane.YES_OPTION){
                            Comida objComidaEliminar = new Comida(Foto, Codigo, Nombre, Tipo, Valor);
                            int codigoResultado = personaServices.eliminarComida(objComidaEliminar);
                            if(codigoResultado==1) {
                                Utilidades.mensajeExito("Comida Eliminada Exitosamente", "Comida Eliminada");
                            }
                            else if(codigoResultado==0) {
                                Utilidades.mensajeAdvertencia("Error De Conexión", "Error En El Registro");         
                            }
                            else {
                                Utilidades.mensajeAdvertencia("Error al eliminar la comida", "Error");
                            }
                        }
                    }catch(Exception ex){
                        Utilidades.mensajeError("Error al eliminar usuario. Intentelo de nuevo más tarde", "Error");
                    }  
                }else if(boton.getName().equals("Editar")){
                   Comida objComidaEditar = new Comida(Foto, Codigo, Nombre, Tipo, Valor);
                   vtnEditarComida vtnEdit = new vtnEditarComida(this.personaServices, objComidaEditar);
                   vtnEdit.setVisible(true);
                   this.getParent().add(vtnEdit);                    
                }
            }
        }
    }//GEN-LAST:event_jTableListaComidasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonAgregarComida;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPaneTabla;
    private javax.swing.JTable jTableListaComidas;
    private javax.swing.JTextField jTextFieldBuscar;
    // End of variables declaration//GEN-END:variables
}
