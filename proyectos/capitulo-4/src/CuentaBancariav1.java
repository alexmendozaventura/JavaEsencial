/**
 * Video37 - Introducción a los métodos
 * */
//Uso de clase
public class CuentaBancariav1 {
    //variables de instancia
    String titular;
    String tipoDeCuenta;
    double saldo;

    //Uso de metodos
    void sacarDinero(double cantidad){
        saldo-=cantidad;
    }
    void ingresarDinero(double cantidad){
        saldo+=cantidad;
    }
    void cambiarTipoCuenta(String nuevoTipo){
        tipoDeCuenta = nuevoTipo;
    }
}
