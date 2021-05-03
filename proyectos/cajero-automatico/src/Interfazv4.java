/**
 * Video55 - Proyecto Generador automático de movimientos bancarios
 * */
import java.util.Scanner;

/** v3
 * Programa que emula la interfaz de un cajero automatico.
 *
 * El programa pedira al usuario su número de identificación
 * Una vez introducido pedira su contraseña
 *
 * Tras esto el programa presentará las siguientes opciones al usuario de forma indefinida hasta que introduzca un numero diferente a los indicados
 * Eliga una de las siguientes opciones:
 * Escriba 1 para consultar saldo
 * Escriba 2 para ingresar dinero
 * Escriba 3 para sacar dinero
 * Escriba 4 para consultar los ultimos movimientos
 * Para salir escriba cualquier otro número
 * Una vez escrita la opción, pulse la tecla Enter
 *
 * Se creará un objeto de tipo CajeroAutomatico y una vez el usuario ha elegido la opción, se llamara el metodo correspondiente al objeto
 * */
public class Interfazv4 {
    public static void main(String[] args) {

        System.out.println("Por favor, introduzca su número de identificación");
        Scanner scanner = new Scanner(System.in);
        String identificador = scanner.nextLine();
        System.out.println("Por favor, introduzca su contraseña");
        String contrasena = scanner.nextLine();

        CajeroAutomaticov2 cajeroAutomatico = new CajeroAutomaticov2(identificador,contrasena);

        int opcionSeleccionada = 0;
        do{
            System.out.println("Eliga una de las siguientes opciones:\n\tEscriba 1 para consultar saldo: \n\tEscriba 2 para ingresar dinero\n\tEscriba 3 para sacar dinero\n\tEscriba 4 para consultar los ultimos movimientos\n\tPara salir escriba cualquier otro número");
            opcionSeleccionada = scanner.nextInt();
            String resultado = "";
            switch (opcionSeleccionada){
                case 1:
                    cajeroAutomatico.mostrarSaldo();break;
                case 2:
                    cajeroAutomatico.ingresarDinero();break;
                case 3:
                    cajeroAutomatico.sacarDinero();break;
                case 4:
                    cajeroAutomatico.consultarUltimosMovimientos();break;
                default:
                   cajeroAutomatico.salir();
            }
        }
        while (opcionSeleccionada == 1 || opcionSeleccionada == 2 || opcionSeleccionada == 3 || opcionSeleccionada ==4 );
    }
}