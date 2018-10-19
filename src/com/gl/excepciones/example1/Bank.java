package com.gl.excepciones.example1;

public class Bank {

    public static void main(String[] args) {
        Cuenta origen1 = new Cuenta(1000D);
        Cuenta destino1 = new Cuenta( 500D);

        Transferencia t1 = new Transferencia();


        try {
            t1.transfer(origen1, destino1, 0D);
        } catch (MontoInvalidoException e) {
            e.printStackTrace();
        }


        try {
            t1.transfer(origen1, destino1, 1100D);
        } catch (MontoInvalidoException e) {
            e.printStackTrace();
        }

        try {
            t1.transfer(origen1, destino1, 100D);
        } catch (MontoInvalidoException e) {
            e.printStackTrace();
        }
    }

}
