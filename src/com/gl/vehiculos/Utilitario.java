package com.gl.vehiculos;

public class Utilitario extends Vehiculo{

    private String caja;

    public Utilitario(String modelo, String marca, String matricula, String caja) {
        super(modelo, marca, matricula);
        setCaja(caja);
    }

    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    @Override
    public String toString() {
        super.toString();
        return "Utilitario{" +
                "caja='" + caja + '\'' +
                '}';
    }
}
