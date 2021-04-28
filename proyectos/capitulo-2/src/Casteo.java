/**
 * Video 21 - Casteo de tipos incompatibles
 * **/
public class Casteo {
    public static void main(String[] args) {

        //Uso de conversión de promoción
        int variableDeTipoInt = 10;
        float variableDeTipoFloat = variableDeTipoInt; //Conversión de  automatica

        double variableDeTipoDouble = variableDeTipoFloat; //Conversión de  automatica
        System.out.println("El resultado de la conversion automatica de la variable variableDeTipoDouble es " +variableDeTipoDouble);

        //Uso de conversión de contracción
        double otraVariableDeTipoDouble = 2.76;
        int otraVariableDeTipoInt = (int)otraVariableDeTipoDouble; //conversion por contracción
        System.out.println("El resultado del casteo de la variable otraVariableDeTipoInt es " +otraVariableDeTipoInt);

        byte variable1 = 121;
        byte variable2 = 10;
        byte suma = (byte)(variable1 + variable2); //conversion por contracción debido a que por conversión automatica el resultado de la suma es del tipo int
        System.out.println("El resultado del casteo a byte es " +suma);


    }
}
