/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrador.Vista;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import sun.swing.table.DefaultTableCellHeaderRenderer;

/**
 *
 * @author Victor
 */
public class ImgTabla extends DefaultTableCellHeaderRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object o, boolean isSelected, boolean hasFocus, int row, int column) {
        if (o instanceof JLabel){
            JLabel JLabelImagen = (JLabel)o;
            return JLabelImagen;
        }
    return super.getTableCellRendererComponent(table, o, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
    }
   
}
