/**
 * Video55 - Proyecto Generador automático de movimientos bancarios
 * */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Clase que emula las funcionalidades de un cajero automático:
 * La clase tendrá una variable de instancia llamada cuentaBancariaActual de tipo CuentaBancaria
 * La clase tendrá un constructor que tendrá como parametros un String que identifica al usuario y otro String que contiene una contraseña
 * Como se trata de una emulación, en lugar de conectar a la base de datos del banco para que nos devuelva la cuenta bancaria del usuario,
 * para acceder se creara un objeto de la clase CuentaBancaria con un nombre cualquiera y saldo aleatorio
 * Esta clase tendrá los siguientes métodos:
 * mostrarSaldo() -> Mostrará por pantalla el saldo de la cuentaBancariaActual
 * ingresarDinero() -> Preguntará al usuario cuanto dinero quiere ingresar y lo ingresará en la cuentaBancariaActual
 * sacarDinero() -> Preguntará al usuario cuanto dinero quiere sacar y lo sacará de cuentaBancariaActual
 * consultarUltimosMovimientos -> Este metodo de momento no hará nada
 * salir() -> Dará las gracias al usuario por usar sus servicios
 * */
public class CajeroAutomaticov2 {

CuentaBancaria cuentaBancariaActual;

CajeroAutomaticov2(String identificador, String contrasena){
    double cantidadAleatoria = ThreadLocalRandom.current().nextDouble(0,50000);
    cuentaBancariaActual = new CuentaBancaria("Nombre cualquiera",cantidadAleatoria);
    }
    void mostrarSaldo(){
        System.out.println("Su saldo es " +cuentaBancariaActual.obtenerSaldo());
    }
    void ingresarDinero(){
        System.out.println("Cuanto dinero quiere ingresar");
        Scanner scanner = new Scanner(System.in);
        double cantidad = scanner.nextInt();
        cuentaBancariaActual.ingresarDinero(cantidad);
    }
    void sacarDinero(){
        System.out.println("Cuanto dinero quiere sacar");
        Scanner scanner = new Scanner(System.in);
        double cantidad = scanner.nextInt();
        cuentaBancariaActual.sacarDinero(cantidad);
    }

    void consultarUltimosMovimientos(){
        GeneradorAleatorioDeMovimientos generadorAleatorioDeMovimientos = new GeneradorAleatorioDeMovimientos();
        System.out.println("¿Cuantos movimientos quiere consultar?");
        Scanner scanner = new Scanner(System.in);
        int numDeMovimientos = scanner.nextInt();
        ArrayList<String> movimientos = generadorAleatorioDeMovimientos.obtenerMovimientos(numDeMovimientos,"euros");

        mostrarMovimientos(movimientos);

    }
    void mostrarMovimientos(ArrayList<String> movimientos){
        for (String movimiento: movimientos){
            System.out.println(movimiento);
        }
    }

    void salir(){
        System.out.println("Muchas gracias por utilizar nuestros servicios");
    }

}
