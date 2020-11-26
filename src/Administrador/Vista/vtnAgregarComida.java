/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Administrador.Vista;

import Administrador.Servicios.PersonaServicesInt;
import Utilidades.Utilidades;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Victor
 */
public class vtnAgregarComida extends javax.swing.JInternalFrame {
    private PersonaServicesInt personaServices;
    /** Creates new form vtnAgregarComida */
    public vtnAgregarComida(PersonaServicesInt personaServices) {
        initComponents();
        this.personaServices=personaServices;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelAgregarComida = new javax.swing.JLabel();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCode = new javax.swing.JTextField();
        jLabelName = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelTipo = new javax.swing.JLabel();
        jComboBoxTipoComida = new javax.swing.JComboBox<>();
        jLabelValor = new javax.swing.JLabel();
        jTextFieldPrice = new javax.swing.JTextField();
        jLabelFoto = new javax.swing.JLabel();
        jLabelCamposRequeridos = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jButtonSelectFile = new javax.swing.JButton();
        jLabelArchivoSeleccionado = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Agregar Comida");

        jLabelAgregarComida.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabelAgregarComida.setForeground(new java.awt.Color(26, 85, 118));
        jLabelAgregarComida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAgregarComida.setText("Agregar Comida");

        jLabelCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCodigo.setForeground(new java.awt.Color(26, 85, 118));
        jLabelCodigo.setText("*Código");

        jTextFieldCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodeActionPerformed(evt);
            }
        });

        jLabelName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(26, 85, 118));
        jLabelName.setText("*Nombre");

        jLabelTipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTipo.setForeground(new java.awt.Color(26, 85, 118));
        jLabelTipo.setText("*Tipo");

        jComboBoxTipoComida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Especial", "Comida Rápida", "Postre", "Bebida" }));
        jComboBoxTipoComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoComidaActionPerformed(evt);
            }
        });

        jLabelValor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelValor.setForeground(new java.awt.Color(26, 85, 118));
        jLabelValor.setText("*Valor");

        jTextFieldPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPriceActionPerformed(evt);
            }
        });

        jLabelFoto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFoto.setForeground(new java.awt.Color(26, 85, 118));
        jLabelFoto.setText("*Fotografia");

        jLabelCamposRequeridos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCamposRequeridos.setForeground(new java.awt.Color(26, 85, 118));
        jLabelCamposRequeridos.setText("*Campos requeridos");

        jButtonCancelar.setBackground(new java.awt.Color(242, 153, 74));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonAgregar.setBackground(new java.awt.Color(242, 153, 74));
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jButtonSelectFile.setText("Seleccionar Archivos");
        jButtonSelectFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelectFileActionPerformed(evt);
            }
        });

        jLabelArchivoSeleccionado.setText("No hay archivos seleccionados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAgregarComida, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCamposRequeridos)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButtonCancelar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                            .addComponent(jButtonAgregar))
                        .addComponent(jLabelFoto, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonSelectFile, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelValor, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelTipo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldCode, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jComboBoxTipoComida, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldPrice, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelArchivoSeleccionado, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabelAgregarComida)
                .addGap(18, 18, 18)
                .addComponent(jLabelCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxTipoComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelFoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelArchivoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSelectFile)
                .addGap(18, 18, 18)
                .addComponent(jLabelCamposRequeridos)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonAgregar))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodeActionPerformed

    private void jComboBoxTipoComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoComidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoComidaActionPerformed

    private void jTextFieldPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPriceActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSelectFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelectFileActionPerformed
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int  returnValue = jfc.showOpenDialog(null);
        
        if (returnValue==JFileChooser.APPROVE_OPTION){
            File selectedFile = jfc.getSelectedFile();
            this.jLabelArchivoSeleccionado.setText(selectedFile.getAbsolutePath());
            System.out.println(selectedFile.getAbsolutePath());
            
            
        }
    }//GEN-LAST:event_jButtonSelectFileActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        // TODO add your handling code here:                 
            String urlFoto, Foto, Codigo, Nombre, Tipo;
            float Valor;
            if(jTextFieldCode.getText().equals("") || jTextFieldNombre.getText().equals("") || jTextFieldPrice.getText().equals("")){
                Utilidades.mensajeAdvertencia("Error, Campos vacios", "Atención");
            }else if(comprobarNumeroValido(jTextFieldPrice.getText())==false){
                
            }else if(jLabelArchivoSeleccionado.getText().equals("No hay archivos seleccionados")){
                Utilidades.mensajeAdvertencia("Fotografía no seleccionada", "Atención");
            }else{
                urlFoto=jLabelArchivoSeleccionado.getText();
                Codigo=jTextFieldCode.getText();     
                Nombre=jTextFieldNombre.getText();
                Tipo=(String) jComboBoxTipoComida.getSelectedItem();
                Valor= Float.parseFloat(this.jTextFieldPrice.getText());
                Foto= convertirImagenBase64(urlFoto);
                int codigoResultado=this.personaServices.AgregarComida(Foto, Codigo, Nombre, Tipo, Valor);

                if(codigoResultado==1) {
                    Utilidades.mensajeExito("Registro Exitoso", "Registro Exitoso");
                }
                else if(codigoResultado==0) {
                    Utilidades.mensajeAdvertencia("Error De Conexión", "Error En El Registro");         
                }
                else {
                    Utilidades.mensajeAdvertencia("La comida ya se encuentra registrada en el sistema", "Error En El Registro");
                } 
            }
    }//GEN-LAST:event_jButtonAgregarActionPerformed

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
       
    private boolean comprobarNumeroValido(String numeroAConvertir)
    {
        boolean bandera=true;//la bandera indica si el numero es valido
        
        try
        {
            Float numeroConvertido;
            numeroConvertido=Float.parseFloat(numeroAConvertir);
        }
        catch(NumberFormatException objExcepcion)
        {
            System.out.println("Error numero no valido");
            Utilidades.mensajeError("Precio no válido", "Error");
            bandera=false;
        }
        
        return bandera;        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSelectFile;
    private javax.swing.JComboBox<String> jComboBoxTipoComida;
    private javax.swing.JLabel jLabelAgregarComida;
    private javax.swing.JLabel jLabelArchivoSeleccionado;
    private javax.swing.JLabel jLabelCamposRequeridos;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCode;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPrice;
    // End of variables declaration//GEN-END:variables

}
