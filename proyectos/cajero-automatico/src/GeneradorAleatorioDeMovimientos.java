/**
 * Video55 - Proyecto Generador automático de movimientos bancarios
 * */
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Clase que genera una lista de movimientos bancarios típicos de forma aleatoria
 * Esta clase tendrá un único método obtenerMovimientos() público con dos parametros, uno de tipo int con el número de movimientos deseado
 * y otro de tipo String en el que se indicará el tipo de moneda para los movimientos.
 *
 * Los tipos de movimientos disponibles serán:
 * Transferencia -> "Transferencia de x moneda"
 * Ingreso -> "Ingreso de x moneda"
 * Retirada -> "Retirada de x moneda"
 * Pago con tarjeta -> "Pago con tarjeta de x moneda"
 * Nomina -> "Ingreso nómina de x moneda"
 * Pago Recibo -> "Pago de recibo de x moneda"
 *
 * Se generará una lista con el número de movimientos indicados por parametro en el que cada movimiento será uno de los
 * anteriores tipos seleccionado de modo aleatorio y en el que la cantidad de dinero será un número de tipo double aleatorio
 * entre 1.0 y 3000.0
 * */
public class GeneradorAleatorioDeMovimientos {
    private static final String TRANSFERENCIA = "Transferencia de";
    private static final String INGRESO = "Ingreso de";
    private static final String RETIRADA = "Retirada de";
    private static final String PAGO_CON_TARJETA = "Pago con tarjeta de";
    private static final String NOMINA = "Ingreso nómina de";
    private static final String PAGO_RECIBO = "Pago de recibo de";


    public ArrayList<String> obtenerMovimientos(int numeroMovimientos, String moneda){
        ArrayList<String> movimientos = new ArrayList<String>();

        for (int i=0;i<numeroMovimientos;i++){
            int numeroMovimiento = obtenerAleatorio(1,6);
            String tipoDeMovimiento;

            switch (numeroMovimiento){
                case 1: tipoDeMovimiento = TRANSFERENCIA;break;
                case 2: tipoDeMovimiento = INGRESO;break;
                case 3: tipoDeMovimiento = RETIRADA;break;
                case 4: tipoDeMovimiento = PAGO_CON_TARJETA;break;
                case 5: tipoDeMovimiento = NOMINA;break;
                default: tipoDeMovimiento = PAGO_RECIBO;break;

            }
            double cantidadAleatoria = obtenerDoubleAleatorio(1,3000);

            String movimiento = tipoDeMovimiento +" "+ String.format("%.2f",cantidadAleatoria) + " " + moneda;

            movimientos.add(movimiento);

        }

        return movimientos;
    }

    public int obtenerAleatorio(int minimo, int maximo){
        return ThreadLocalRandom.current().nextInt(minimo,maximo+1);
    }
    public double obtenerDoubleAleatorio(int minimo, int maximo){
        return ThreadLocalRandom.current().nextDouble(minimo,maximo+1);
    }




}
