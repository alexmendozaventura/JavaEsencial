/**
 * Video37 - Introducción a los métodos
 * */
public class Main1 {
    public static void main(String[] args) {
        CuentaBancariav1 cuentaAlex = new CuentaBancariav1();
        cuentaAlex.titular = "Alex Mendoza Ventura";
        cuentaAlex.saldo = 5_000;
        cuentaAlex.tipoDeCuenta = "nomina";

        //Uso de métodos
        cuentaAlex.sacarDinero(500);
        System.out.println("Ahora cuenta de Alex tiene " + cuentaAlex.saldo);

        cuentaAlex.ingresarDinero(1600);
        System.out.println("Después de ingresar dinero de cuenta de Alex tiene " +cuentaAlex.saldo);

        System.out.println("El tipo de cuenta de Alex es " + cuentaAlex.tipoDeCuenta);
        cuentaAlex.cambiarTipoCuenta("ahorro");
        System.out.println("El tipo de cuenta de Alex despues de cambiar el tipo de cuenta es " + cuentaAlex.tipoDeCuenta);

    }
}
