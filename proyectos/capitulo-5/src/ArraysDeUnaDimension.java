/**
 * Video47 - Introducción a los arrays
 * */
public class ArraysDeUnaDimension
{
    public static void main(String[] args) {
        //Uso de arrays
        String[] diasDeLaSemana = new String[7]; //Declaración e inicilización de array
        diasDeLaSemana[0] = "lunes";
        diasDeLaSemana[1] = "martes";
        diasDeLaSemana[2] = "miercoles";
        diasDeLaSemana[3] = "jueves";
        diasDeLaSemana[4] = "viernes";
        diasDeLaSemana[5] = "sabado";
        diasDeLaSemana[6] = "domingo";

        System.out.println("El segundo día de la semana es " +diasDeLaSemana[1]);

        int[] numeros = {8,9,75,-6};
        int minimo, maximo;
        minimo = maximo = numeros[0];

        for (int i=0; i < numeros.length; i++){
            if (numeros[i] < minimo){
                minimo = numeros[i];
            }
            if (numeros[i] > maximo){
                maximo = numeros[i];
            }
        }
        System.out.println("El valor mínimo del array es " +minimo+ " y el valor máximo es " + maximo );

        double miArrayDeDoubles[] = {2.3,4.5,2.1};


    }
}
