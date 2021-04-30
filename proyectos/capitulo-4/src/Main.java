/**
 * Video35 - Variables de instancia
 * */
public class Main {
    public static void main(String[] args) {
        //Creación de objeto de tipo CuentaBancaria
        CuentaBancaria cuentaDeJuan = new CuentaBancaria();

        cuentaDeJuan.titular = "Alex Mendoza";
        cuentaDeJuan.tipoDeCuenta = "Nomina";
        cuentaDeJuan.saldo = 23_500;

        System.out.println("¿Cual es el saldo de la cuenta de Alex? "+cuentaDeJuan.saldo);
    }
}
