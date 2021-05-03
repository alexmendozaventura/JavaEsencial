/**
 * Video63 - Introducción a la herencia en Java
 **/
public class Personaje {
    protected int puntosDeVida = 100;
    protected int posicionX = 0;
    protected int posicionY = 0;

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
