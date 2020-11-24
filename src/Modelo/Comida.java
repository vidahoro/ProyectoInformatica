package Modelo;

import java.util.*;

public class Comida {

    private String Codigo; 
    private String Nombre;
    private String Foto;
    private EnumTipoComida Tipo;
    private float Valor;

    public Comida(String Codigo, String Nombre, String Foto, EnumTipoComida Tipo, float Valor) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Foto = Foto;
        this.Tipo = Tipo;
        this.Valor = Valor;
    }

    
    
    
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String Foto) {
        this.Foto = Foto;
    }

    public EnumTipoComida getTipo() {
        return Tipo;
    }

    public void setTipo(EnumTipoComida Tipo) {
        this.Tipo = Tipo;
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }

    
}