/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DTO;

/**
 *
 * @author Lenovo!
 */
public class PeticionDTO {
    private String accion;//iniciar sesión, registrar cliente, consultar cliente, listar clientes
    private String argumentos;// argumentos de la operación a ejecutar en el servidor
    // si voy a registrar un cliente en el atributo argumentos fijo el json que corresponde al objeto cliente a registrar

    public PeticionDTO(String accion, String argumentos) {
        this.accion = accion;
        this.argumentos = argumentos;
    }

    public PeticionDTO() {
      
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(String argumentos) {
        this.argumentos = argumentos;
    }

      
    
    
}
