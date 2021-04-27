/**
 * Video14 - Literales
 */
public class Literales {
    public static void main(String[] args) {

        //Los literales enteros por defecto son tratados como tipo int
        int enteroDecimal = 100;
        int enteroOctal = 0100;
        int enteroHexadecimal = 0x100;

        System.out.println("Entero hexadecimal es " + enteroHexadecimal);

        long numeroLong = 100L;
        //Los literales decimal por defecto son del tipo double
        double numeroDouble = 2.5;
        float numeroFloat = 2.5f;

        int numeroConGuiones = 25_258_236;
        System.out.println("El número numeroConGuiones es "+numeroConGuiones);

        char miChar = 'b';
        char miOtroChar = '\u0062';
        System.out.println("El caracter miOtroChar es " +miOtroChar);

        char comillaSimple = '\'';
        System.out.println("El caracter comillaSimple es " +comillaSimple);

        String stringLiteral = "Esto es un literal";

        boolean booleanoVerdadero = true;

        String stringNulo = null;

    }
}
