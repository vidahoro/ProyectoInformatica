package Modelo;

public class Administrador {

 private String login, constrasenia, Nombre, Apellido;

    public Administrador(String login, String constrasenia, String Nombre, String Apellido) {
        this.login = login;
        this.constrasenia = constrasenia;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getConstrasenia() {
        return constrasenia;
    }

    public void setConstrasenia(String constrasenia) {
        this.constrasenia = constrasenia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    
    
}