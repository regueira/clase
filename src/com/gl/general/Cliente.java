package com.gl.general;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nombre;

    private String apellido;

    private String DNI;

    private String direccion;

    private List<Reserva> reservaList;

    public Cliente(String nombre, String apellido, String DNI, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.direccion = direccion;
        this.reservaList = new ArrayList<>();
    }

    public void addReserva(Reserva reserva) {
        reservaList.add(reserva);
    }

    public List<Reserva> getReservaList() {
        return reservaList;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
