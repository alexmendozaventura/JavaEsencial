/**
 * Video31 - La sentencia break
 * */
public class LaSentenciaBreak {
    public static void main(String[] args) {
        //Programa para obtener el primer número multiplo de 2,3,5
        int numeroEncontrado ;
        //Uso de break con ciclo for
        System.out.println("**************Sentencia for********************");
        for (numeroEncontrado = 2567;numeroEncontrado<=3642;numeroEncontrado++){
            System.out.println("¿Será el número? " +numeroEncontrado);
            if (numeroEncontrado%2==0 && numeroEncontrado%3==0 && numeroEncontrado%5==0){
                break;
            }
        }
        if(numeroEncontrado > 3642){
            System.out.println("No hay ningún número 2567 y 3642 que sea multiplo de 3,2 y 5");
        }
        else {
            System.out.println("El primer multiplo de 3,2 y 5 " +numeroEncontrado);
        }

        //Uso de break con ciclo while
        System.out.println("**************Sentencia while********************");
        numeroEncontrado = 2567;
        while(numeroEncontrado<=3642){
            System.out.println("¿Será el número? " +numeroEncontrado);
            if (numeroEncontrado%2==0 && numeroEncontrado%3==0 && numeroEncontrado%5==0){
                break;
            }
            numeroEncontrado++;
        }
        if(numeroEncontrado > 3642){
            System.out.println("No hay ningún número 2567 y 3642 que sea multiplo de 3,2 y 5");
        }
        else {
            System.out.println("El primer multiplo de 3,2 y 5 " +numeroEncontrado);
        }
    }
}
