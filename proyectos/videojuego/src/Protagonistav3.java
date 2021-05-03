/**
 * Video65 - Sobreescritura de métodos
 **/
public class Protagonistav3 extends Personajev3{
    private static final int UNIDADES_DE_SALTO = 10;
    private String nombre;

    public Protagonistav3(int posicionX, int posicionY, String nombre){
        super(posicionX, posicionY); //pasando parametros al constructor a la superclase
        this.nombre = nombre;
    }

    public void recibirCura(int puntos){
        puntosDeVida += puntos;
    }

    public void saltar(){
        posicionY += UNIDADES_DE_SALTO;
    }

    //Uso de sobreescritura de métodos
    @Override
    public void emitirSonidoDeDolor() {
        System.out.println("¡Au!");
    }
}
