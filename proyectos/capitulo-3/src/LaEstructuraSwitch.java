/**
 * Video27 - La estructura switch
 * */
import java.util.Scanner;

public class LaEstructuraSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduzca el día de la semana en que quiere su cita");
        String dia = scanner.nextLine();

        //Uso de switch
        switch (dia){ //La sentencia switch recibe String,int,enumeradores
            case "lunes":
            case "miercoles":
                System.out.println("El "+ dia +" puede venir de 11:00 a 12:30"); break;
            case "martes":
            case "jueves":
                System.out.println("El " + dia +" puede venir de 15:30 a 17:30"); break;
            case "viernes":
                System.out.println("El " + dia +" puede venir de 9:00 a 11:00"); break;
            case "sabado":
            case "domingo":
                System.out.println("El " + dia +" nuestra clínica permanecerá cerrada"); break;
            default:
                System.out.println("No ha introducido un día válido");
        }

    }
}
