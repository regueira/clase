package com.gl.example2;

public interface Motor {

    Boolean encender();

    Boolean apagar();

    void acelerar();

    Boolean cambioDeMarcha( Integer marcha );
}
