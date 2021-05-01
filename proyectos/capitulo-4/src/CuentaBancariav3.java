/**
 * Video40 - Constructores
 * */
//Uso de clase
public class CuentaBancariav3 {
    //variables de instancia
    String titular;
    String tipoDeCuenta;
    double saldo;

    //Uso de Constructor
    CuentaBancariav3(String t, String tipo, double s){
     titular = t;
     tipoDeCuenta = tipo;
     saldo = s;
    }

    public CuentaBancariav3(String t, double s) {
        titular = titular;
        tipoDeCuenta = "ahorro";
        saldo = s;
    }

    CuentaBancariav3(){
        titular = "";
        tipoDeCuenta = "ahorro";
        saldo = 0.0;
    }

    //Uso de metodos
    void sacarDinero(double cantidad){
        //Uso de return
        if (cantidad < 0){
            return;
        }
        saldo-=cantidad;
    }
    void ingresarDinero(double cantidad){
        //Uso de return
        if (cantidad < 0){
            return;
        }
        saldo+=cantidad;
    }
    void cambiarTipoCuenta(String nuevoTipo){
        tipoDeCuenta = nuevoTipo;
    }

    //Uso de return
    double obtenerSaldo(){
        return saldo;
    }

}
