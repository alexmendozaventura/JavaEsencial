/**
 * Video58 - Modificadores de acceso
 * */
package com.amendozv.cajero;

import com.amendozv.banco.CuentaBancariav2;

public class Main {
    public static void main(String[] args) {
        CuentaBancariav2 cuentaBancariav2 = new CuentaBancariav2(); //No se puede acceder debido a que el modificador de acceso de la clase es default y esta no puede ser accedida de un paquete distinto
        cuentaBancariav2.obtenerSaldo();
    }
}
