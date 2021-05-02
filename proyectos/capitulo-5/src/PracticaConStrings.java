/**
 * Video50 - La clase String
 * */
/**
 * Video51 - Operaciones con strings
 * */
public class PracticaConStrings {
    public static void main(String[] args) {
        
        //Uso de String
        String unString = new String("Soy un String");

        String otroString = new String(unString);

        String miTercerString = "Este String se crea directamente con una cadena de caracteres entrecomillada";

        //Uso de metodo charAt
        String miString = "abcde";
        char caracter;
        caracter = miString.charAt(2);
        System.out.println("El carácter en la posición 2 es " +caracter);

        //Uso de método concat
        String resultadoConcat = miString.concat("fghij");
        System.out.println("El resultado de la concatenación es " +resultadoConcat);

        //Uso de operador sumar para concatenar
        String concatenacionSencilla = "abcde" + "fghij";
        System.out.println("El resultado de concatenar con el operador suma es " +concatenacionSencilla);

        //Uso de método equals
        System.out.println("¿Son los Strings resultadoConcat y concatenacionSencilla iguales? " +concatenacionSencilla.equals(resultadoConcat));

        //Uso de método de lenght
        System.out.println("La cantidad de caracteres es " +concatenacionSencilla.length());

    }
}
