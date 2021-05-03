/**
 * Video53 - Las clases InputStream y OutputStream
 * */
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class InputStreamUse {
    public static void main(String[] args) {
        //Uso de InputStreamUse
        Path inputPath = Paths.get("D:\\Alex\\01_Multimedia\\02_Cursos\\01_CursosOnline\\Java\\inLearning\\inLearning - Java esencial\\ejemplo.txt");
        InputStream input;

        try {
            //Se lee la información del archivo origen
            input = Files.newInputStream(inputPath, StandardOpenOption.READ);

            int i;
            while((i = input.read()) != -1){
                System.out.print((char)i);
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
