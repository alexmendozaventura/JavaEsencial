/**
 *Video70 - Proyecto Creación de las clases CuentaAhorro y CuentaNomina
 +*/
package com.amendozv.cajero;

import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args) {

        System.out.println("Por favor, introduzca su número de identificación");
        Scanner scanner = new Scanner(System.in);
        String identificador = scanner.nextLine();
        System.out.println("Por favor, introduzca su contraseña");
        String contrasena = scanner.nextLine();

        CajeroAutomatico cajeroAutomatico = new CajeroAutomatico(identificador,contrasena);

        int opcionSeleccionada = 0;
        do{
            System.out.println("Eliga una de las siguientes opciones:\n\tEscriba 1 para consultar saldo: \n\tEscriba 2 para ingresar dinero\n\tEscriba 3 para sacar dinero\n\tEscriba 4 para consultar los ultimos movimientos\n\tEscriba 5 para consultar las condiciones legales\n\tPara salir escriba cualquier otro número");
            opcionSeleccionada = scanner.nextInt();
            String resultado = "";
            switch (opcionSeleccionada){
                case 1:
                    cajeroAutomatico.mostrarSaldo();break;
                case 2:
                    cajeroAutomatico.ingresarDinero();break;
                case 3:
                    cajeroAutomatico.sacarDinero();break;
                case 4:
                    cajeroAutomatico.consultarUltimosMovimientos();break;
                case 5:
                    cajeroAutomatico.mostrarCondicionesLegales();break;

                default:
                    cajeroAutomatico.salir();
            }
        }
        while (opcionSeleccionada == 1 || opcionSeleccionada == 2 || opcionSeleccionada == 3 || opcionSeleccionada ==4 || opcionSeleccionada ==5);
    }
}
