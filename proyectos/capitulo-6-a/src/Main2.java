/**
 * Video60 - Clases internas en Java
 * */
public class Main2 {
    public static void main(String[] args) {

        Juego juego = new Juego(4);

        Juego.Contador contadorJuego = juego.new Contador();

        System.out.println("La puntuacion de juego al inicio es " +juego.obtenerPuntuacion());

        contadorJuego.incrementarPuntuacion(100);

        System.out.println("La puntuacion de juego después de incrementar puntuación es " +juego.obtenerPuntuacion());


    }
}
