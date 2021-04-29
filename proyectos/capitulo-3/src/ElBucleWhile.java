/**
 * Video29 - El bucle while
 * */

import java.util.Scanner;

public class ElBucleWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduzca el número del que quiero realizar la raíz cuadrada");
        double numero = scanner.nextDouble();
        double candidatoARaizCuadrada = 0.0;

        //Uso de while
        while (candidatoARaizCuadrada * candidatoARaizCuadrada <= numero){
            candidatoARaizCuadrada += 0.01;
            System.out.println("Será el número " +candidatoARaizCuadrada + "Su cuadrado es " + candidatoARaizCuadrada*candidatoARaizCuadrada);
        }
        candidatoARaizCuadrada -= 0.01;
        System.out.println("La raíz cuadrada que hemos calculado es: " + candidatoARaizCuadrada);
        System.out.println("La raíz cuadrada es: " + Math.sqrt(numero));
    }
}
