/**
 * Video42 - Enumeraciones
 * */
//Uso de clase
public class CuentaBancariav5 {
    //variables de instancia
    String titular;
    double saldo;
    //Uso de enumerador
    TipoDeCuenta tipoDeCuenta;

    //Uso de constantes
    final double COMISION = 1.2;

    //Uso de Constructor
    CuentaBancariav5(String t, TipoDeCuenta tipo, double s){
     titular = t;
     tipoDeCuenta = tipo;
     saldo = s;
    }

    public CuentaBancariav5(String t, double s) {
        titular = titular;
        //Uso de enumerador
        tipoDeCuenta = TipoDeCuenta.AHORRO;
        saldo = s;
    }

    CuentaBancariav5(){
        titular = "";
        //Uso de enumerador
        tipoDeCuenta = TipoDeCuenta.AHORRO;
        saldo = 0.0;
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
            case NOMINA:return 0;
            default:return 0;
        }
    }

}
