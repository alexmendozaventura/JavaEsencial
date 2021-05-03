/**
 * Video54 - Los genéricos
 * */
public class MainCaja {
    public static void main(String[] args) {
        //Uso de genericos
        Caja<String> caja1 = new Caja<String>("Hola");
        Integer numero = 5;
        Caja<Integer> caja2 = new Caja<>(numero);

        String miObjeto = "Perro";

        System.out.println("La variable caja1 contiene un objeto cuyo elemento es de la misma clase que mi Objeto " +caja1.perteneceElContenidoALaMismaClase(miObjeto));
        System.out.println("La variable caja2 contiene un objeto cuyo elemento es de la misma clase que mi Objeto " +caja2.perteneceElContenidoALaMismaClase(miObjeto));


    }
}
