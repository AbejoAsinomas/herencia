package com.alejomarquez.herencia.dominio;

public class Bicicleta extends Vehiculo{

    private byte nroPinonoes;
    private double tamanoRueda;
    private String tipoFreno;

    public byte getNroPinonoes() {
        return nroPinonoes;
    }

    public double getTamanoRueda() {
        return tamanoRueda;
    }

    public String getTipoFreno() {
        return tipoFreno;
    }

    public void setNroPinonoes(byte nroPinonoes) {
        this.nroPinonoes = nroPinonoes;
    }

    public void setTamanoRueda(double tamanoRueda) {
        this.tamanoRueda = tamanoRueda;
    }

    public void setTipoFreno(String tipoFreno) {
        this.tipoFreno = tipoFreno;
    }
}
