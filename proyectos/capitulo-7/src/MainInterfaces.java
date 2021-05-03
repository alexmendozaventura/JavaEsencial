/**
 * Video69 - Las interfaces
 * */
public class MainInterfaces {
    public static void main(String[] args) {
        ReproductorDeVideo reproductorDeVideo = new ReproductorDeVideo();
        reproductorDeVideo.reproducir();
        reproductorDeVideo.rebobinar(5);
        reproductorDeVideo.parar();

        ReproductorDeMP3 reproductorDeMP3 = new ReproductorDeMP3();
        reproductorDeMP3.reproducir();
        reproductorDeMP3.rebobinar(5);
        reproductorDeMP3.parar();
    }
}
