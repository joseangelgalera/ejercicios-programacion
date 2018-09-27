/*
 * Tema 3
 * 
 * Ejercicio 2
 * 
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 */
package tema.pkg3;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Conversor de euros a pesetas.");
        
        System.out.print("introduce los euros: ");
        int euros = s.nextInt();
        
        System.out.println(euros + " son " + (int)(euros * 166.386) 
          + " pesetas.");
        
        
    }
    
}
