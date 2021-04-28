/**
 * Video18 - Operadores lógicos
 * **/
public class OperadoresLogicos {
    public static void main(String[] args) {
        //Operadores Logicos: &&, ||

        //Uso de Operador And(&)(&&)
        System.out.println("*****************************Operador AND*****************************");
        System.out.println("False & False es "+(false&false));
        System.out.println("True & False es "+(true&false));
        System.out.println("False & True es "+(false&true));
        System.out.println("True & True es "+(true&true));

        System.out.println("*****************************Operador AND - CIRCUITO CORTO*****************************");
        System.out.println("False && False es "+(false&&false));
        System.out.println("True && False es "+(true&&false));
        System.out.println("False && True es "+(false&&true));
        System.out.println("True && True es "+(true&&true));

        //Uso de Operador Or(|)(||)
        System.out.println("*****************************Operador OR*****************************");
        System.out.println("False | False es "+(false|false));
        System.out.println("True | False es "+(true|false));
        System.out.println("False | True es "+(false|true));
        System.out.println("True | True es "+(true|true));

        System.out.println("*****************************Operador OR - CIRCUITO CORTO*****************************");
        System.out.println("False || False es "+(false||false));
        System.out.println("True || False es "+(true||false));
        System.out.println("False || True es "+(false||true));
        System.out.println("True || True es "+(true||true));

        //Uso de Operador XOr(^)
        System.out.println("*****************************Operador XOR*****************************");
        System.out.println("False ^ False es "+(false^false));
        System.out.println("True ^ False es "+(true^false));
        System.out.println("False ^ True es "+(false^true));
        System.out.println("True ^ True es "+(true^true));

        //Uso de Operador Not(!)
        System.out.println("!False es " + !false);
        System.out.println("!True es " + !true);
    }
}
