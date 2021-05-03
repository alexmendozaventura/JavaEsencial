/**
 * Video69 - Las interfaces
 * */

public class ReproductorDeVideo implements Reproductor {
    @Override
    public void reproducir() {
        System.out.println("Reproduciendo vídeo");
    }

    @Override
    public void pausar() {
        System.out.println("Video pausado");
    }

    @Override
    public void parar() {
        System.out.println("Video parado");
    }

    @Override
    public void rebobinar(int segundos) {
        System.out.println("Rebobinando vídeo " +segundos+ " segundos");
    }

    @Override
    public void adelantar(int segundos) {
        System.out.println("Adelantando vídeo" + segundos + " segundos");
    }
}
