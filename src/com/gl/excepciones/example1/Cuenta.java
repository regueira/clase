package com.gl.excepciones.example1;

public class Cuenta {

    private Double saldo;

    public Cuenta(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double addSaldo (Double monto) {
        this.saldo += monto;
        return this.saldo;
    }

    public Double subtractSaldo (Double monto) {
        this.saldo -= monto;
        return this.saldo;
    }

}
