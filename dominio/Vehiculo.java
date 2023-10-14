package com.alejomarquez.herencia.dominio;

public class Vehiculo {

    private String matricula;
    private String marca;
    private String linea;
    private short año;
    private String color;

    public void acelerar () {
        System.out.println("Aceleró");
    }
    public void frenar () {
        System.out.println("Frenó");
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getLinea() {
        return linea;
    }

    public short getAño() {
        return año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
