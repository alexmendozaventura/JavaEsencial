/**
 *Video70 - Proyecto Creación de las clases CuentaAhorro y CuentaNomina
 +*/
package com.amendozv.banco;
public class CuentaAhorro extends CuentaBancaria{
    private static final double COMISION = 0.12;
    @Override
    public void informarSobreCondicionesLegales() {
        System.out.println("Condiciones legales de la cuenta de Ahorro del banco ***");
        System.out.println("Según el acuerdo firmado por usted....");
        System.out.println("Las comisiones por retirada de dinero de su cuenta serán de " +COMISION + " euros");
    }

    public CuentaAhorro(String titular, TipoDeCuenta tipoDeCuenta, double saldo) {
        super(titular, tipoDeCuenta, saldo);
    }

    public CuentaAhorro(String titular, double saldo) {
        super(titular, saldo);
    }

    public CuentaAhorro() {
    }

    @Override
    public void sacarDinero(double cantidad) {
        //Uso de return
        if (cantidad < 0){
            return;
        }
        saldo-=cantidad;
        saldo-= COMISION;
    }
}
