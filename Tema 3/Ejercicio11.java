/*
 * Tema 3 
 *
 * Ejercicio 11
 * 
 * Realiza un conversor de Kb a Mb.
 * 
 */
package tema.pkg3;

import java.util.Scanner;

public class Ejercicio11 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Conversor de Kb a Mb");
    
    System.out.print("Introduzca los Kb: ");
    double kb = s.nextDouble();
    
    System.out.printf("%.2f %s %.2f %2s", kb, "Kb son", (kb / 1000), "Mb.");
  } 
  
  
    
}
