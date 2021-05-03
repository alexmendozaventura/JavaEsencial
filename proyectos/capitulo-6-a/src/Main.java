/**
 * Video59 - Variables y métodos estáticos
 * */
public class Main {
    public static void main(String[] args) {

        System.out.println("La variable estatica apellido de la clase hermano es " +Hermano.apellido);

        Hermano hermanoPequeno = new Hermano();
        hermanoPequeno.nombre = "Juan";

        Hermano hermanoMayor = new Hermano();
        hermanoMayor.nombre = "Pedro";

        System.out.println("El hermano pequeño se llama " +hermanoPequeno.nombre + " " +hermanoPequeno.apellido);
        System.out.println("El hermano mayor se llama " +hermanoMayor.nombre + " " +hermanoMayor.apellido);

        hermanoPequeno.nombre = "Luis";
        System.out.println("El hermano pequeño se llama " +hermanoPequeno.nombre + " " +hermanoPequeno.apellido);
        System.out.println("El hermano mayor se llama " +hermanoMayor.nombre + " " +hermanoMayor.apellido);

        hermanoPequeno.apellido = "Mendoza";
        System.out.println("El hermano pequeño se llama " +hermanoPequeno.nombre + " " +hermanoPequeno.apellido);
        System.out.println("El hermano mayor se llama " +hermanoMayor.nombre + " " +hermanoMayor.apellido);

        Hermano.modificarApellido("Antunez");
        System.out.println(Hermano.obtenerApellido());
    }
}
