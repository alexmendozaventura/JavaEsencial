/**
 * Video25 La escalera if-else-if
 * */
import java.util.Scanner;
public class LaEscaleraIfElseIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un número entero y te daré información sobre el");

        int numero = scanner.nextInt();

        //Uso de condicional If else if
        if (numero < 3){
            System.out.println("El número introducido es menor que 3");
        }
        else if (numero < 5){
            System.out.println("El número que has introducido está entre 3 y " + numero);
        }
        else if (numero < 8){
            System.out.println("El número que has introducido está entre 5 y " + numero);
        }
        else{
            System.out.println("El número introducido es mayor o igual que 8");
        }
    }
}
