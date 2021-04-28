/**
 * Video17 - Operadores relacionales
 * */
public class OperadoresRelacionales {
    public static void main(String[] args)
    {
        //OperadoresRelacionales: >,<,>=,<=, ==, !=

        //Uso de operador mayor
        boolean esUnoMayorQueDos = 1 > 2;
        System.out.println("¿Es cierto que 1 es mayor que 2? " +esUnoMayorQueDos);

        //Uso de operador menor
        boolean esUnoComaCincoMenorQueSieteComaDos = 1.5<7.2;
        System.out.println("¿Es cierto que 1.5 es menor que 7.2? " +esUnoComaCincoMenorQueSieteComaDos);

        //Uso de operador mayor o igual
        boolean esOchoMayorOIgualQueOcho = 8 == 8;
        System.out.println("¿Es cierto que 8 es mayor igual que 8? " +esOchoMayorOIgualQueOcho);

        //Uso de operador igual que
        boolean esTresComaUnoIgualQueTresComaDos = 3.1 == 3.2;
        System.out.println("¿Es cierto que 3.1 es igual que 3.2? " +esTresComaUnoIgualQueTresComaDos);

        //Uso de operador diferente
        boolean esCuatroDiferenteDeCuatro = 4 != 4;
        System.out.println("¿Es cierto que 4 es diferente que 4? " +esCuatroDiferenteDeCuatro);

        //Nota: operador igual que,diferente se puede usar en Strings
        String perro = "perro";
        String gato = "gato";
        System.out.println("¿Es cierto que el String perro es igual que el String gato ? " +(perro == gato));
        System.out.println("¿Es cierto que el String perro es diferente que el String gato ? " +(perro != gato));

    }
}
