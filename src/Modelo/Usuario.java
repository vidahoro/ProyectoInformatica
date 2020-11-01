package Modelo;

import java.util.*;

/**
 * 
 */
public class Usuario {

    /**
     * Default constructor
     */
    public Usuario() {
    }

    /**
     * 
     */
    private EnumTipoID TipoID;

    /**
     * 
     */
    private String ID;

    /**
     * 
     */
    private String Contraseña;

    /**
     * 
     */
    private String Nombre;

    /**
     * 
     */
    private String Apellido;

    /**
     * 
     */
    private EnumGenero Genero;


    /**
     * 
     */
    public Set<Factura> Factura;

}