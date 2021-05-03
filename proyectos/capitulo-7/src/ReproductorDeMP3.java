/**
 * Video69 - Las interfaces
 * */
public class ReproductorDeMP3 implements Reproductor{
    @Override
    public void reproducir() {
        System.out.println("Reproduciendo audio");
    }

    @Override
    public void pausar() {
        System.out.println("Audio pausado");
    }

    @Override
    public void parar() {
        System.out.println("Audio parado");
    }

    @Override
    public void rebobinar(int segundos) {
        System.out.println("Rebobinando audio " +segundos+ " segundos");
    }

    @Override
    public void adelantar(int segundos) {
        System.out.println("Adelantando audio" + segundos + " segundos");
    }
}
