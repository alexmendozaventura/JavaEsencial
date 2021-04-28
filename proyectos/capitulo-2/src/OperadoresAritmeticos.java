/**
 * Video16 - Operadores aritméticos
 * **/
public class OperadoresAritmeticos {
    public static void main(String[] args) {
        //Uso de operador suma
        int numeroDos = 2;
        int numeroTres = 3;

        int resultadoSuma = numeroDos + numeroTres;
        System.out.println("El resultado de sumar " +numeroDos + " y " +numeroTres + " es " + resultadoSuma);

        //Uso de operador suma para la concatenación
        System.out.println("Esto es un String" + " y lo concateno con este otro");

        //Uso de operador resta
        int resultadoResta = numeroTres - numeroDos;
        System.out.println("El resultado de restar " + numeroTres + " y " +numeroDos +" es " +resultadoResta);

        //Uso de operador resta para cambiar el signo de un literal.
        int numeroDosConCambioDeSigno = -numeroDos;
        System.out.println("Si aplicamos el operador resta al numeroDosConCambioDeSigno obtenemos " +numeroDosConCambioDeSigno);

        //Uso de operador multiplicación
        double resultadoMultiplicacion = numeroTres * 3.5;
        System.out.println("El resultado de multiplicar " + numeroTres + " y " +numeroDos +" es " +resultadoMultiplicacion);

        //Uso de operador division
        double resultadoDivision = (double)numeroTres/numeroDos;
        System.out.println("El resultado de division " + numeroTres + " y " +numeroDos +" es " +resultadoDivision);

        //Uso de operador modulo
        double resultadoModulo = numeroTres%numeroDos;
        System.out.println("El resultado del modulo " + numeroTres + " y " +numeroDos +" es " +resultadoModulo);
    }
}
