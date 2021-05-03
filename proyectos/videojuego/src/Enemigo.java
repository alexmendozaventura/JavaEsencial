/**
 * Video66 - Jerarquía multinivel
 **/
public class Enemigo extends Personajev4{
    private static final int PUNTOS_DANO = 10;
    public Enemigo(){

    }
    public Enemigo(int posicionX, int posicionY) {
        super(posicionX, posicionY);
    }

    public int obtenerPuntosDeDano(){
        return PUNTOS_DANO;
    }
    public void emitirSonidoDeFuria(){
        System.out.println("grrr");
    }
}
