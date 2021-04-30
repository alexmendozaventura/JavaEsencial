/**
 * Video30 - El bucle do-while
 * */
import java.util.Scanner;

public class ElBucleDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;
        //Uso de Do-While
        do{
            System.out.println("Introduzca un número y le mostraremos la raíz cuadrada. Para salir introduzca el 0");
            numero = scanner.nextDouble();
            if (numero == 0){
                System.out.println("Hasta la vista");
            }else{
                System.out.println("La raíz cuadrada de " +numero + " es " + Math.sqrt(numero));
            }
        }
        while (numero != 0);
    }
}
