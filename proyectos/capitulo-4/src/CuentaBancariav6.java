/**
 * Video44 - La palabra clave this
 * */
//Uso de clase
public class CuentaBancariav6 {
    //variables de instancia
    String titular;
    double saldo;
    TipoDeCuenta tipoDeCuenta;

    //Uso de constantes
    final double COMISION = 1.2;

    //Uso de Constructor
    CuentaBancariav6(String titular, TipoDeCuenta tipoDeCuenta, double saldo){

        //Uso de this
        this.titular = titular;   //La palabra this hace referencia a la variable de instancia
        this.tipoDeCuenta = tipoDeCuenta;
        this.saldo = saldo;
    }

    public CuentaBancariav6(String titular, double saldo) {
        //Uso de this
        this(titular,TipoDeCuenta.AHORRO,saldo); //La palabra this también se utiliza para una invoación explicita del constructor
    }

    CuentaBancariav6(){
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
