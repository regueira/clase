package com.gl.vehiculos;

public class Sedan extends Vehiculo{

    private Boolean baul;

    public Sedan(String modelo, String marca, String matricula, Boolean baul) {
        super(modelo, marca, matricula);
        setBaul(baul);
    }

    public Boolean isBaul() {
        return baul;
    }

    public void setBaul(Boolean baul) {
        this.baul = baul;
    }
}
