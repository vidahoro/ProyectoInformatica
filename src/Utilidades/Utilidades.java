package Utilidades;


import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author libardo
 */
public class Utilidades {

    /**
     * Genera un emergente de aventencia
     *
     * @param mns mensaje dentro de la ventana
     * @param titulo título de la ventana
     */
    public static void mensajeAdvertencia(String mns, String titulo) {
        JOptionPane.showMessageDialog(null, mns, titulo, JOptionPane.DEFAULT_OPTION, new ImageIcon("Recursos/warning.png"));
    }

    /**
     * Genera un emergente de error
     *
     * @param mns mensaje dentro de la ventana
     * @param titulo título de la ventana
     */
    public static void mensajeError(String mns, String titulo) {
        JOptionPane.showMessageDialog(null, mns, titulo, JOptionPane.DEFAULT_OPTION, new ImageIcon("Recursos/warning.png"));
    }

    /**
     * Genera un emergente de exito
     *
     * @param mns mensaje dentro de la ventana
     * @param titulo título de la ventana
     */
    public static void mensajeExito(String mns, String titulo) {
        JOptionPane.showMessageDialog(null, mns, titulo, JOptionPane.DEFAULT_OPTION, new ImageIcon("Recursos/exitoso.png"));
    }

    /**
     * Genera un emergente de confirmación con los botones Si ó No
     *
     * @param mns mensaje dentro de la ventana
     * @param titulo título de la ventana
     * @return Si ó No
     */
    public static int mensajeConfirmacion(String mns, String titulo) {
        return JOptionPane.showConfirmDialog(null, mns, titulo, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    }

}
