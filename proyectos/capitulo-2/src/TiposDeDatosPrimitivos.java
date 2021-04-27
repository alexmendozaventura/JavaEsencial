/**
 * Video13 - Tipos de datos primitivos
 * */
public class TiposDeDatosPrimitivos {
    public static void main(String[] args) {
        byte elMenorByte = Byte.MIN_VALUE;
        byte elMayorByte = Byte.MAX_VALUE;

        //Enteros
        System.out.println("El tipo de dato byte es un número entero de 8 bits con signo. Está comprendido entre " +elMenorByte + " y " +elMayorByte);
        System.out.println("El tipo de dato short es un número entero de 16 bits con signo. Está comprendido entre " +Short.MIN_VALUE + " y " +Short.MAX_VALUE);
        System.out.println("El tipo de dato int es un número entero de 32 bits con signo. Está comprendido entre " +Integer.MIN_VALUE + " y " +Integer.MAX_VALUE);
        System.out.println("El tipo de dato long es un número entero de 64 bits con signo. Está comprendido entre " +Long.MIN_VALUE + " y " +Long.MAX_VALUE);
        //Decimales
        float variableFloat = 5.6f;
        double variableDouble = 5.6;

        char a = 'a';

        boolean trueBoolean = true;
        boolean falseBoolean = false;

    }
}
