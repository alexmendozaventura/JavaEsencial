/**
 * Video38 - Devolución de un valor con return
 * */
public class Main2 {
    public static void main(String[] args) {

        CuentaBancariav2 cuentaAlex = new CuentaBancariav2();
        cuentaAlex.titular = "Alex Mendoza Ventura";
        cuentaAlex.saldo = 5_000;
        cuentaAlex.tipoDeCuenta = "nomina";

        //Uso de return
        double saldo = cuentaAlex.obtenerSaldo();
        System.out.println("El saldo de la cuenta de Alex es "+saldo);

        cuentaAlex.sacarDinero(-1000);
        System.out.println("El saldo de juan tras sacar una cantidad negativa es " +cuentaAlex.obtenerSaldo());
    }
}
