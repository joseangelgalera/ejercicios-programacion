/*
 * Tema 2
 * 
 * Ejercicio 6
 *
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible (precio sin IVA). La base imponible estará almacenada en una
 * variable.
 */
package tema.pkg2;

public class Ejercici06 {

    public static void main(String[] args) {
        
        double baseImponible = 23.44;

        System.out.printf("\n%-15s %-1s %-15s %-1s %-15s\n"
                ,"Base Imponible", "|", "IVA", "|", "Total");
        System.out.println("----------------|-----------------|--------------");
        System.out.printf("%-3.2f %-9s %-1s %-3.2f %-10s %-1s %-3.2f %-2s\n",
        +  baseImponible, "€", "|", (baseImponible * 0.21), "€", "|" , 
        (baseImponible * 1.21), "€");
    }
    
}
