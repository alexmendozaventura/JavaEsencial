/**
 * Video36 - Variables de referencia.
 * */

public class PasoPorReferencia {
    public static void main(String[] args) {

        //Uso de variable de primitivo
        int variable1 = 23;
        int variable2 = variable1;

        System.out.println("El valor de variable1 es "+variable1);
        System.out.println("El valor de variable2 es " +variable2);

        variable2 = 78;
        System.out.println("El valor de variable1 es "+variable1);
        System.out.println("El valor de variable2 es " +variable2);

        //Uso de variable de referencia a un objeto
        CuentaBancaria cuentaDeAlex = new CuentaBancaria();
        cuentaDeAlex.saldo = 23_500;

        CuentaBancaria cuentaDeClarie = cuentaDeAlex; //Al asignar la variable de referencia ambas apuntan al mismo objeto.
        cuentaDeClarie.saldo = 10_000;

        System.out.println("Saldo de Alex: "+cuentaDeAlex.saldo);
        System.out.println("Saldo de Clarie " +cuentaDeClarie.saldo);

    }
}
