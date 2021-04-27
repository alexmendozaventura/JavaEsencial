/**
 * Video12 - Las variables en Java
 * */
public class Variables {
    public static void main(String[] args) {
        int variable1; //Declaración de variable
        int variable2, variable3; //Se pueden declarar más de una variable de forma conjunta si son del mismo tipo
        int variable4 = 23;       //Declaración de variable e inicialización

        variable1 = 6; //Inicializar variable
        System.out.println("variable1 contiene el valor de: "+variable1);

        variable2 = 2*variable1;
        System.out.println("variable2 contiene el valor de: "+variable2);

        //variable2 = variable7 - 1; //No se puede usar una variable que no ha sido declarada
        //variable8 = 9; //No se puede inicializar una variable que no ha sido declarada
        //variable2 = "Hola"; //No se puede asignar un tipo de dato distinto al tipo de variable
    }
}
