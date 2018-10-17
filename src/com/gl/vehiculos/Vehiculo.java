package com.gl.vehiculos;

import com.gl.general.Garage;

public abstract class Vehiculo {

    private String modelo;

    private String marca;

    private String matricula;

    private Garage garage;

    public Vehiculo(String modelo, String marca, String matricula) {
        this.modelo = modelo;
        this.marca = marca;
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
