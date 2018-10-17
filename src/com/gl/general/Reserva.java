package com.gl.general;

import com.gl.vehiculos.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class Reserva {

    private Integer ID;

    private List<Vehiculo> vehiculoList;

    private Agencia agencia;

    public Reserva() {
        vehiculoList = new ArrayList<>();
    }

    public void addVehiculo(Vehiculo vehiculo) {
        vehiculoList.add(vehiculo);
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public List<Vehiculo> getVehiculoList() {
        return vehiculoList;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }
}
