/**
 * Video28 - El bucle for
 * */
import java.util.Scanner;
public class ElBucleFor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Primer ejemplo 01
        System.out.println("**********************Ejemplo 01**********************");
        System.out.println("Por favor, introduzca el primer numero");
        int primerOperando = scanner.nextInt();
        System.out.println("Por favor, introduzca el segundo número");
        int segundoOperando = scanner.nextInt();

        int resultado = 0;

        //Uso de for
         for (int i=0;i<segundoOperando;i++){
             System.out.println("Iteración número: " +i);
             resultado = resultado + primerOperando;
         }

         System.out.println("El resultado de multiplicar " + primerOperando + " * " + segundoOperando + " es " +resultado);

         System.out.println("**********************Ejemplo 02**********************");
         int suma = 0;
         for (int i = 0, j=100; i<j; i++,j--){
             System.out.println("Iteración número " + i + " sumando " +i +" y "+ j );
             suma = suma + i +j;
         }
         System.out.println("El resultado de sumar los números del 1 al 100 es " +suma);

    }
}
