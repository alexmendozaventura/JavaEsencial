/**
 * Video67 - La clase Object
 * */
public class Main {
    public static void main(String[] args) {
        Animal perro = new Animal("Canis lupus",4);
        Animal gato = new Animal("Felis silvestris",4);
        Animal otroPerro = new Animal("Canis lupus",4);

        //Uso de metodos de object
        System.out.println("¿Es igual el objeto de gato que el de perro? " +perro.equals(gato));
        System.out.println("¿Es igual el objeto de otroPerro que el de perro? " +perro.equals(otroPerro));

        System.out.println("Hashcode para perro " + perro.hashCode());
        System.out.println("Hashcode para gato " + gato.hashCode());
        System.out.println("Hashcode para otroPerro " + otroPerro.hashCode());

        System.out.println("Nuestro objeto perro en forma de String: " +perro.toString());

        System.out.println("Clase para perro " + perro.getClass().getName());
        System.out.println("Clase para perro " + perro.getClass());
    }
}
