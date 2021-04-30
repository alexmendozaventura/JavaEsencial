/**
 * Video32 - La sentencia continue
 * */
public class LaSentenciaContinue {
    public static void main(String[] args) {
        //Pograma para mostrar los números pares entre 0 y 100

        //Uso de la sentencia continue en ciclo for
        for (int i=1; i<=100;i++){
            if (i%2!=0){
                continue;
            }
            System.out.println(i);
        }
    }
}
