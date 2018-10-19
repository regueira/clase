package com.gl.general;

import com.gl.vehiculos.Vehiculo;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Reserva {

    private Integer ID;

    private List<Vehiculo> vehiculoList;

    private Agencia agencia;

    private LocalDate fechaInicio;

    public Reserva() {
        vehiculoList = new ArrayList<>();
        fechaInicio = LocalDate.of(2018, Month.OCTOBER, 17);

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
