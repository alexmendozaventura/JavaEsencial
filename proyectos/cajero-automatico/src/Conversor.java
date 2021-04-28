/**
 * Video22 - Proyecto Programa conversor de monedas
 **/
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * El programa que pida por pantalla introducir la cantidad en euros y devuelva la conversión en US
 * El mensaje con el resultado será: *** euros equivalen a *** US dolares
 **/
public class Conversor {
    public static void main(String[] args) {
        System.out.println("Bienvenido al conversor de moneda");
        System.out.println("Por favor, introduzca una cantidad en EUROS y el programa le devolvera la conversión en US dólares");
        Scanner scanner = new Scanner(System.in);
        double euros = scanner.nextDouble();

        double dolares = euros * 1.21 ;

        System.out.println(euros + " euros equivalen aa " + dolares + " US dólares");

        String eurosString  = Double.toString(euros);
        BigDecimal eurosBigdecimal = new BigDecimal(eurosString);

        double tasaDeCambio = 1.09;
        BigDecimal tasaDeCambioBigDecimal = new BigDecimal(tasaDeCambio);

        BigDecimal dolaresBigDecimal = eurosBigdecimal.multiply(tasaDeCambioBigDecimal);
        System.out.println(eurosString + " euros equivalen a " + dolaresBigDecimal.toString() + " US dólares");


    }
}
