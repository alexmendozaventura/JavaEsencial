/**
 * Video59 - Variables y métodos estáticos
 * */
public class Hermano {
    String nombre;
    static String apellido = "García";

    static void modificarApellido(String nuevoApellido){
        apellido = nuevoApellido;
    }
    static String obtenerApellido(){
        return apellido;
    }
}
