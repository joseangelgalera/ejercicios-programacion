/*
 * Tema 3
 * 
 * Ejercicio 7
 * 
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible.
 * 
 */


public class Ejercicio7 {
  public static void main (String args[]) {
    
    String linea;
    
    System.out.print("Introduzca base imponible : ");
    linea = System.console().readLine();
    double baseImponible = Double.parseDouble( linea );
    
    System.out.printf("Base imponible %8.2f\n", baseImponible);
    System.out.printf("IVA            %8.2f\n", (baseImponible * 0.21));
    System.out.printf("-----------------------\n");
    System.out.printf("Total          %8.2f\n", (baseImponible * 1.21));
  }
}

