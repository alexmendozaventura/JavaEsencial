/**
 * Video41 - Constantes
 * */
//Uso de clase
public class CuentaBancariav4 {
    //variables de instancia
    String titular;
    String tipoDeCuenta;
    double saldo;

    //Uso de constantes
    public static final String TIPO_AHORRO = "ahorro";
    public static final String TIPO_NOMINA = "nomina";
    final double COMISION = 1.2;

    //Uso de Constructor
    CuentaBancariav4(String t, String tipo, double s){
     titular = t;
     tipoDeCuenta = tipo;
     saldo = s;
    }

    public CuentaBancariav4(String t, double s) {
        titular = titular;
        //Uso de constantes
        tipoDeCuenta = TIPO_AHORRO;
        saldo = s;
    }

    CuentaBancariav4(){
        titular = "";
        //Uso de constantes
        tipoDeCuenta = TIPO_AHORRO;
        saldo = 0.0;
    }

    //Uso de metodos
    void sacarDinero(double cantidad){
        //Uso de return
        if (cantidad < 0){
            return;
        }
        double comision =0.0;

        //Uso de constantes
        if(tipoDeCuenta.equals(TIPO_AHORRO)){
            comision = COMISION;
        }

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
    void cambiarTipoCuenta(String nuevoTipo){
        tipoDeCuenta = nuevoTipo;
    }

    //Uso de return
    double obtenerSaldo(){
        return saldo;
    }

}
