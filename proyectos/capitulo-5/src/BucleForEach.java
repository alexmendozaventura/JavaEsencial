/**
 * Video49 - El bucle for each
 */
public class BucleForEach {
    public static void main(String[] args) {
        int[] numeros = {4, 8, -6, 128, -36, -5, 44};
        int minimo, maximo;
        minimo = maximo = numeros[0];

        //Uso de for tradicional
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        System.out.println("El valor minimo es " + minimo + " y el valor maximo es " + maximo);

        //Uso de foreach
        minimo = maximo = numeros[0];
        for(int numero:numeros){
            if (numero < minimo) {
                minimo = numero;
            }
            if (numero > maximo) {
                maximo = numero;
            }
        }
        System.out.println("El valor minimo es " + minimo + " y el valor maximo es " + maximo);

    }

}

