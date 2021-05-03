/**
 * Video53 - Las clases InputStream y OutputStream
 * */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class OutputStreamUse {
    public static void main(String[] args) {
        //Uso de OutputStreamUse
        Path inputPath = Paths.get("D:\\Alex\\01_Multimedia\\02_Cursos\\01_CursosOnline\\Java\\inLearning\\inLearning - Java esencial\\ejemplo.txt");
        Path outputPath = Paths.get("D:\\Alex\\01_Multimedia\\02_Cursos\\01_CursosOnline\\Java\\inLearning\\inLearning - Java esencial\\ejemplo2.txt");


        try {
            InputStream inputStream = Files.newInputStream(inputPath, StandardOpenOption.READ);
            Files.newOutputStream(outputPath,StandardOpenOption.CREATE);
            OutputStream outputStream = Files.newOutputStream(outputPath,StandardOpenOption.WRITE);

        int i;
        byte[] data = new byte[1024];
        while((i=inputStream.read(data)) != -1){
            outputStream.write(data); //Escribimos los datos leídos del fichero de entrada en el fichero de salida
        }
        //Se cierran los archivos
        inputStream.close();
        outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
