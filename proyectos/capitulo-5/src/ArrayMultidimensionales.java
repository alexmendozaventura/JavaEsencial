/**
 * Video48 - Arrays multidimensionales
 * */
public class ArrayMultidimensionales {
    public static void main(String[] args) {
        int miArrayDeUnaDimension[] = new int[20];
        int miArrayDeDosDimensiones[][] = new int[10][20];
        int miArrayDeTresDimensiones[][][] = new int[5][15][8];

        int tablaMultiplicacion[][] = new int[10][10];
        for (int i = 0; i<10; i++){
            for (int j=0; j<10; j++){
                tablaMultiplicacion[i][j] = i*j;
            }
        }
        System.out.println("El resultado de multiplicar 4 x 5 esta en la posición[4][5] " +tablaMultiplicacion[4][5]);


        int miArrayMultidimensional[][] = {{2,5,-9},{-7,25,0},{8,3,4}};

    }
}
