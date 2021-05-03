/**
 *Video70 - Proyecto Creación de las clases CuentaAhorro y CuentaNomina
 +*/
package com.amendozv.banco;
public abstract class CuentaBancaria {
    //variables de instancia
    private String titular;
    protected double saldo;
    private TipoDeCuenta tipoDeCuenta;

    //Uso de constantes
    private final double COMISION = 1.2;

    //Uso de Constructor
    CuentaBancaria(String titular, TipoDeCuenta tipoDeCuenta, double saldo){

        //Uso de this
        this.titular = titular;   //La palabra this hace referencia a la variable de instancia
        this.tipoDeCuenta = tipoDeCuenta;
        this.saldo = saldo;
    }

    public CuentaBancaria(String titular, double saldo) {
        //Uso de this
        this(titular,TipoDeCuenta.AHORRO,saldo); //La palabra this también se utiliza para una invoación explicita del constructor
    }

    public CuentaBancaria(){
        //Uso de this
        this("",TipoDeCuenta.AHORRO,0.00);
    }

    //Uso de metodos
    public void sacarDinero(double cantidad){
        //Uso de return
        if (cantidad < 0){
            return;
        }

        saldo-=cantidad;

    }
    public void ingresarDinero(double cantidad){
        //Uso de return
        if (cantidad < 0){
            return;
        }
        saldo+=cantidad;
    }
    protected void cambiarTipoCuenta(TipoDeCuenta nuevoTipo){
        tipoDeCuenta = nuevoTipo;
    }

    //Uso de return
    public double obtenerSaldo(){
        return saldo;
    }

    public abstract void informarSobreCondicionesLegales();

}
