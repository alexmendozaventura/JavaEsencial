/**
 * Video24 - La sentencia if
 * */
import java.util.Scanner;

public class LaSentenciaIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivina el numero que estoy pensando del 1 al 10");
        int numeroIntroducido = scanner.nextInt();
        int numeroPensado = 5;

        String color = "";

        //Uso de condicional If
        if (numeroIntroducido == numeroPensado ){
            color = "\033[0;32m";
            System.out.println(color+"¡Enhorabuena!");
        }
        else{
            color = "\033[0;31m";
            System.out.println(color+"Lo sentimos el número que estaba pensando es " +numeroPensado);
        }
    }
}
