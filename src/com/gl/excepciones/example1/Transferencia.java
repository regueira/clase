package com.gl.excepciones.example1;

public class Transferencia {

    public void transfer(Cuenta cuentaOrigen, Cuenta cuentaDestino, Double monto) throws MontoInvalidoException {

        if (monto <= 0) {
            throw new MontoInvalidoException("El valor no puede ser cero");
        }

        if (cuentaOrigen.getSaldo() < monto) {
            throw new MontoInvalidoException("El monto no debe superar el sado origen");
        }

        System.out.println("----- Antes de la transferencia ----");
        System.out.println("Saldo cuenta Origen: " + cuentaOrigen.getSaldo());
        System.out.println("Saldo cuenta Destino: " + cuentaDestino.getSaldo());

        // Logica de transfencia.
        Double saldoOrigen = cuentaOrigen.subtractSaldo(monto);
        Double saldoDestino = cuentaDestino.addSaldo(monto);

        System.out.println("----- Despues de la transferencia ----");
        System.out.println("Saldo cuenta Origen: " + saldoOrigen);
        System.out.println("Saldo cuenta Destino: " + saldoDestino);
    }

}
