/*
 * Tema 3
 * 
 * Ejercicio 7
 *
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible.
 */
package tema.pkg3;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Calculo de la base imponible");
        
        System.out.print("Introduzca la base imponible: ");
        double baseImponible = s.nextDouble();
        
        System.out.printf("\n%-15s %-1s %-15s %-1s %-15s\n"
                ,"Base Imponible", "|", "IVA", "|", "Total");
        System.out.println("----------------|-----------------|--------------");
        System.out.printf("%-3.2f %-9s %-1s %-3.2f %-10s %-1s %-3.2f %-2s\n",
        +  baseImponible, "€", "|", (baseImponible * 0.21), "€", "|" , 
        (baseImponible * 1.21), "€");
        
    }
    
}
