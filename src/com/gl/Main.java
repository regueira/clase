package com.gl;

import com.gl.vehiculos.Sedan;
import com.gl.vehiculos.Utilitario;
import com.gl.vehiculos.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Vehiculo> vehiculoList = new ArrayList<>();

        vehiculoList.add(new Sedan("Focus", "Ford", "AC-123-RT", true));
        vehiculoList.add(new Sedan("Bora", "Volkswagen", "AB-233-ZZ", true));
        vehiculoList.add(new Sedan("408", "Peugeot", "AD-188-IM", true));
        vehiculoList.add(new Utilitario("F-100", "Ford", "AA-862-AN", "1000 Litros"));
        vehiculoList.add(new Utilitario("RAM", "Dodge", "AD-362-NM", "2000 Litros"));


        System.out.println(vehiculoList);

    }
}
