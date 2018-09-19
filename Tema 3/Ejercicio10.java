/*
 * Tema 3
 * 
 * Ejercicio 10
 * 
 * Realiza un conversor de Mb a Kb.
 */
package tema.pkg3;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    
        System.out.println("Conversor de Mb a Kb");
        
        System.out.print("Introduzca los Mb: ");
        double mb = s.nextDouble();
        
        System.out.printf("%.2f %s %.2f %2s", mb, "Mb son", (mb * 1000), "Kb.");
    }
    
}
