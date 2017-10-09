/*
 * Tema 3
 * 
 * Ejercicio 5
 * 
 * Escribe un programa que calcule el área de un rectángulo.
 * 
 */


public class Ejercicio5 {
  public static void main (String args[]) {
    
    String linea;
    
    System.out.print("Introduccir base : ");
    linea = System.console().readLine();
    double x = Double.parseDouble( linea );
    
    System.out.print("Introducir altura : ");
    linea = System.console().readLine();
    double y = Double.parseDouble( linea );
    
    System.out.print("El área del rectángulo es " + (x * y));
  }
}

