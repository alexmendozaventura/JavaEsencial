/**
 *Video70 - Proyecto Creación de las clases CuentaAhorro y CuentaNomina
 +*/
package com.amendozv.mock;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class GeneradorAleatorioDeMovimientos {
    private static final String TRANSFERENCIA = "Transferencia de";
    private static final String INGRESO = "Ingreso de";
    private static final String RETIRADA = "Retirada de";
    private static final String PAGO_CON_TARJETA = "Pago con tarjeta de";
    private static final String NOMINA = "Ingreso nómina de";
    private static final String PAGO_RECIBO = "Pago de recibo de";

    public GeneradorAleatorioDeMovimientos(){

    }
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

    private int obtenerAleatorio(int minimo, int maximo){
        return ThreadLocalRandom.current().nextInt(minimo,maximo+1);
    }
    private double obtenerDoubleAleatorio(int minimo, int maximo){
        return ThreadLocalRandom.current().nextDouble(minimo,maximo+1);
    }

}
