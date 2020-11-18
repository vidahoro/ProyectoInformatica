package Modelo.dominio;

/**
 *
 * @author Lenovo!
 */
public class Administrador {
    private String login;
    private String constrasenia;

    public Administrador(String login, String constrasenia) {
        this.login = login;
        this.constrasenia = constrasenia;
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
    
    
}
