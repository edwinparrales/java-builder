/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.epvtecnologia.demo01.util;

/**
 *
 * @author usuario
 */
public final class Main {
    
    public static final String RED = "\033[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        boolean esPrimo = false;
        for (int i = 0; i <= 1000; i++) {

            esPrimo = UtilNumPrimos.validarPrimo(i);
            if (esPrimo) {
               
                System.out.println(RED + "**el numero" + i + "  es primo"+ANSI_RESET);
            } else {
                System.err.println("El numero " + i + " no es primo");

            }
        }
    }

}
