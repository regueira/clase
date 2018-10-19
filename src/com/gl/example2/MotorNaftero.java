package com.gl.example2;

import java.util.ArrayList;

public class MotorNaftero implements Motor {


    @Override
    public Boolean encender() {
        return true;
    }

    @Override
    public Boolean apagar() {
        return true;
    }

    @Override
    public void acelerar() {

    }

    @Override
    public Boolean cambioDeMarcha(Integer marcha) {
        return true;
    }

    public Boolean cargarNafta(){

        ArrayList<Motor> motores = new ArrayList<>();
        motores.add(new MotorNaftero());



        return true;
    }

}
