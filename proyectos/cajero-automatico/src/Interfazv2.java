/**
 * Video33 - Proyecto Mejora de nuestro interfaz de selección
 * */

import java.util.Scanner;

/** v2
 * Programa que emula la interfaz de un cajero automatico. El programa presentará las siguientes opciones al usuario:
 *
 * Eliga una de las siguientes opciones:
 * Escriba 1 para consultar saldo
 * Escriba 2 para ingresar dinero
 * Escriba 3 para sacar dinero
 * Escriba 4 para consultar los ultimos movimientos
 * Una vez escrita la opción, pulse la tecla Enter
 *
 * Una vez el usuario ha elegido la opción, el programa le mostrará por pantalla una frase explicando
 * */
public class Interfazv2 {
    public static void main(String[] args) {
        int opcionSeleccionada = 0;
        do{
            System.out.println("Eliga una de las siguientes opciones:\n\tEscriba 1 para consultar saldo: \n\tEscriba 2 para ingresar dinero\n\tEscriba 3 para sacar dinero\n\tEscriba 4 para consultar los ultimos movimientos\n\tPara salir escriba cualquier otro número");
            Scanner scanner = new Scanner(System.in);
            opcionSeleccionada = scanner.nextInt();
            String resultado = "";
            switch (opcionSeleccionada){
                case 1:
                    System.out.println("La opción que usted ha elegido es consultar saldo");break;
                case 2:
                    System.out.println("La opción que usted ha elegido es ingresar dinero");break;
                case 3:
                    System.out.println("La opción que usted ha elegido es sacar dinero");break;
                case 4:
                    System.out.println("La opción que usted ha elegido es consultar los ultimos movimientos");break;
                default:
                    System.out.println("Gracias por usar nuestros servicios");
            }
        }
        while (opcionSeleccionada == 1 || opcionSeleccionada == 2 || opcionSeleccionada == 3 || opcionSeleccionada ==4 );
    }
}