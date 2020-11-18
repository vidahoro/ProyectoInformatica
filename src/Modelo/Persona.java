package Modelo;



/**
 * 
 */
public class Persona {
    private String tipoIdentificacion;
    private String numeroIdentificacion;
    private String nombres;
    private String apellidos;
    /**
     * Default constructor
     
    /**
    public Persona() {
    }

    
    private EnumTipoID TipoID;

   
    private String ID;

    
    private String Contraseña;

    
    private String Nombre;

  
    private String Apellido;

   
    private EnumGenero Genero;


    
    public Set<Factura> Factura;
    
    */

    public Persona(String tipoIdentificacion, String numeroIdentificacion, String nombres, String apellidos) {
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public Persona() {
       
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    
    

}