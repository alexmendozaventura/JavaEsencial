/**
 * Video43 - Sobrecarga de métodos
 * */
public class MainInformador {
    public static void main(String[] args) {
        Informador informador = new Informador();
        informador.mostrarPorPantalla(3);
        byte unByte = 2;
        //Uso de sobrecarga de métodos
        informador.mostrarPorPantalla(unByte);
        informador.mostrarPorPantalla(5.3);
        informador.mostrarPorPantalla("Alex");
        informador.mostrarPorPantalla("Te amo Clarie",Informador.COLOR_ROJO);
    }
}
