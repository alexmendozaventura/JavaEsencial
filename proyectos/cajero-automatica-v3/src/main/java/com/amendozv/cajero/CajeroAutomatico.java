/**
 *Video70 - Proyecto Creación de las clases CuentaAhorro y CuentaNomina
 +*/

package com.amendozv.cajero;

import com.amendozv.banco.CuentaAhorro;
import com.amendozv.banco.CuentaBancaria;
import com.amendozv.mock.GeneradorAleatorioDeMovimientos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CajeroAutomatico {
    private CuentaBancaria cuentaBancariaActual;

    protected CajeroAutomatico(String identificador, String contrasena){
        double cantidadAleatoria = ThreadLocalRandom.current().nextDouble(0,50000);
        cuentaBancariaActual = new CuentaAhorro("Nombre cualquiera",cantidadAleatoria);
    }
    protected void mostrarSaldo(){
        System.out.println("Su saldo es " +cuentaBancariaActual.obtenerSaldo());
    }
    protected void ingresarDinero(){
        System.out.println("Cuanto dinero quiere ingresar");
        Scanner scanner = new Scanner(System.in);
        double cantidad = scanner.nextInt();
        cuentaBancariaActual.ingresarDinero(cantidad);
    }
    protected void sacarDinero(){
        System.out.println("Cuanto dinero quiere sacar");
        Scanner scanner = new Scanner(System.in);
        double cantidad = scanner.nextInt();
        cuentaBancariaActual.sacarDinero(cantidad);
    }

    protected void consultarUltimosMovimientos(){
        GeneradorAleatorioDeMovimientos generadorAleatorioDeMovimientos = new GeneradorAleatorioDeMovimientos();
        System.out.println("¿Cuantos movimientos quiere consultar?");
        Scanner scanner = new Scanner(System.in);
        int numDeMovimientos = scanner.nextInt();
        ArrayList<String> movimientos = generadorAleatorioDeMovimientos.obtenerMovimientos(numDeMovimientos,"euros");

        mostrarMovimientos(movimientos);

    }
    private void mostrarMovimientos(ArrayList<String> movimientos){
        for (String movimiento: movimientos){
            System.out.println(movimiento);
        }
    }
    protected void mostrarCondicionesLegales(){
        cuentaBancariaActual.informarSobreCondicionesLegales();
    }

    protected void salir(){
        System.out.println("Muchas gracias por utilizar nuestros servicios");
    }

}
