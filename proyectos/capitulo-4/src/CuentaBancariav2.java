/**
 * Video38 - Devolución de un valor con return
 * */
//Uso de clase
public class CuentaBancariav2 {
    //variables de instancia
    String titular;
    String tipoDeCuenta;
    double saldo;

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
