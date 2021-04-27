import java.util.Scanner;
/**
 *Video11 - Proyecto Creación de una interfaz para cajero automático
 **/

/** v1
 * Programa que emula la interfaz de un cajero automatico. El programa presentará las siguientes opciones al usuario:
 *
 * Eliga una de las siguientes opciones:
 * Escriba 1 para consultar saldo
 * Escriba 2 para ingresar dinero
 * Escriba 3 para sacar dinero
 * Escriba 4 para consultar los ultimos movimientos
 * Una vez escrita la opción, pulse la tecla Enter
 *
 * Una vez el usuario ha elegido la opción, el programa le mostrará por pantalla el número correspondiente a la opción elegida
 * */
public class Interfaz {
    public static void main(String[] args) {
        System.out.println("Eliga una de las siguientes opciones:\n\tEscriba 1 para consultar saldo: \n\tEscriba 2 para ingresar dinero\n\tEscriba 3 para sacar dinero\n\tEscriba 4 para consultar los ultimos movimientos");
        Scanner scanner = new Scanner(System.in);
        int opcionSeleccionada = scanner.nextInt();
        System.out.println("La opción que usted ha elegido es la " +opcionSeleccionada);
    }
}
