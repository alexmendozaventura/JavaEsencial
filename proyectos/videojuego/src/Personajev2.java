/**
 * Video64 - Los constructores y la herencia
 **/
public class Personajev2 {
    protected int puntosDeVida = 100;
    protected int posicionX = 0;
    protected int posicionY = 0;

    public Personajev2(int posicionX, int posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public void recibirDano(int puntos){
        puntosDeVida-=puntos;
    }
    public void moverALaDerecha(int unidades){
        posicionX += unidades;
    }
    public void moverALaIzquierda(int unidades){
        posicionX -= unidades;
    }
    public void emitirSonidoDeDolor(){
        System.out.println("¡Ay!");
    }



}
