/**
 * Video58 - Modificadores de acceso
 * */
//Uso de paquetes
package com.amendozv.banco; //Se añade el paquete a la clase
public class CuentaBancariav2 {
    //variables de instancia
    private String titular;
    private double saldo;
    private TipoDeCuenta tipoDeCuenta;

    //Uso de constantes
    private final double COMISION = 1.2;

    //Uso de Constructor
    public CuentaBancariav2(String titular, TipoDeCuenta tipoDeCuenta, double saldo){

        //Uso de this
        this.titular = titular;   //La palabra this hace referencia a la variable de instancia
        this.tipoDeCuenta = tipoDeCuenta;
        this.saldo = saldo;
    }

    public CuentaBancariav2(String titular, double saldo) {
        //Uso de this
        this(titular,TipoDeCuenta.AHORRO,saldo); //La palabra this también se utiliza para una invoación explicita del constructor
    }

    public CuentaBancariav2(){
        //Uso de this
        this("",TipoDeCuenta.AHORRO,0.00);
    }

    //Uso de metodos
    public void sacarDinero(double cantidad){
        //Uso de return
        if (cantidad < 0){
            return;
        }

        double comision = calcularComision();

        saldo-=cantidad;
        saldo-=comision;
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

    private double calcularComision(){
        //Uso de enumerador
        switch (tipoDeCuenta){
            case AHORRO:return COMISION;
            default:return 0;
        }
    }
}
