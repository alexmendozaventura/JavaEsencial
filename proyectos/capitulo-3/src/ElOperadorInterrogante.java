/**
 * Video26 - El operador interrogante
 * */

import java.util.Scanner;

public class ElOperadorInterrogante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        int dividendo = scanner.nextInt();
        System.out.println("Introducción otro número entero");
        int divisor = scanner.nextInt();
        int resultado = 0;

        //Uso de if tradicional
        /*
        if (divisor == 0){
            resultado = 0;
        }
        else
        {
            resultado = dividendo/divisor;
        }
        */

        //Uso de operador ternario
        resultado = divisor == 0 ? 0 : dividendo/divisor;

        System.out.println("El resultado de dividir " + dividendo + " entre " + divisor +" es "+resultado);
    }
}
