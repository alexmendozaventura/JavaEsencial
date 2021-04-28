/**
* Video15 - El ciclo de vida de las variables
* */
public class AlcanceDeLasVariables {
    public static void main(String[] args) {
        int dias = 0 ;
        while(dias < 30){
            dias+=1;
            int semanas = dias/7;
            System.out.println("Han pasado " +dias + " días de lo que supone " +semanas + " semanas");
            //int dias; //No se puede declarar una variable de bloque igual que una variable global
        }

        //int anios = semanas/52; //No se puede llamar a una variable de bloque interior desde un bloque exterior
        int anios = dias/365;
    }
}
