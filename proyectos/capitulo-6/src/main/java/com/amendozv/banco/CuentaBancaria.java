/**
 * Video57 - Paquetes
 * */
//Uso de paquetes
package com.amendozv.banco; //Se añade el paquete a la clase
public class CuentaBancaria {
    //variables de instancia
    String titular;
    double saldo;
    TipoDeCuenta tipoDeCuenta;

    //Uso de constantes
    final double COMISION = 1.2;

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

    CuentaBancaria(){
        //Uso de this
        this("",TipoDeCuenta.AHORRO,0.00);
    }

    //Uso de metodos
    void sacarDinero(double cantidad){
        //Uso de return
        if (cantidad < 0){
            return;
        }

        double comision = calcularComision();

        saldo-=cantidad;
        saldo-=comision;
    }
    void ingresarDinero(double cantidad){
        //Uso de return
        if (cantidad < 0){
            return;
        }
        saldo+=cantidad;
    }
    void cambiarTipoCuenta(TipoDeCuenta nuevoTipo){
        tipoDeCuenta = nuevoTipo;
    }

    //Uso de return
    double obtenerSaldo(){
        return saldo;
    }

    double calcularComision(){
        //Uso de enumerador
        switch (tipoDeCuenta){
            case AHORRO:return COMISION;
            default:return 0;
        }
    }
}
