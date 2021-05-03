/**
 * Video64 - Los constructores y la herencia
 **/
public class Protagonistav2 extends Personajev2{
    private static final int UNIDADES_DE_SALTO = 10;
    private String nombre;

    public Protagonistav2(int posicionX, int posicionY, String nombre){
        super(posicionX, posicionY); //pasando parametros al constructor a la superclase
        this.nombre = nombre;
    }

    public void recibirCura(int puntos){
        puntosDeVida += puntos;
    }

    public void saltar(){
        posicionY += UNIDADES_DE_SALTO;
    }
}
