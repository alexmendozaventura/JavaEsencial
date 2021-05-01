/**
 * Video39 - Los parámetros
 * */
public class MainCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double radio = 4.0;
        //Uso de métodos con parametros
        double area = calculadora.calcularAreaCirculo(radio);
        System.out.println("El área de un círculo de radio " + radio + " es " + area);

        System.out.println("El volumen de un prisma de 5 x 4 x 8 es " + calculadora.calcularPrismaRectangular(5, 4, 8));

        double media = calculadora.calcularMedia(2,2,2,2,2);
        System.out.println("La media es " +media);
    }
}