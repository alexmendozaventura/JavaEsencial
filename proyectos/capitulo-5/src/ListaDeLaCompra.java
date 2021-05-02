/**
 * Vide52 - Introducción a los ArrayList
 * */
import java.util.ArrayList;
public class ListaDeLaCompra {
    public static void main(String[] args) {
        //Uso de arraylist
        ArrayList<String> miListaDeLaCompra = new ArrayList<String>();

        //Agregar elementos
        miListaDeLaCompra.add("Patatas");
        miListaDeLaCompra.add("Leche");
        miListaDeLaCompra.add("Manzanas");
        System.out.println("Mi arrayList contiene " + miListaDeLaCompra);

        ArrayList<String> miListaEnero = new ArrayList<>(miListaDeLaCompra);
        miListaEnero.add("Harina");

        System.out.println("miListaDeLaCompra: " +miListaDeLaCompra +" miListaEnero " +miListaEnero);

        ArrayList<String> miListaFebrero = miListaDeLaCompra;
        System.out.println("El primer elemento de la lista de la compra es " + miListaEnero.get(0));

        //Actualizar elementos
        miListaEnero.set(1,"Leche Entera");
        System.out.println("Mi lista de enero " + miListaEnero);

        //Eliminar elementos
        miListaEnero.remove(0);
        System.out.println("Mi lista de enero " + miListaEnero);

        miListaEnero.remove("Manzanas");

        //Obtener tamaño de un arraylist
        miListaEnero.size();
    }
}
