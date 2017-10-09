/*
 * Tema 3
 * 
 * Ejercicio 9
 * 
 * Escribe un programa que calcule el volumen de un cono.
 * 
 */


public class Ejercicio9 {
  public static void main (String args[]) {
    
    String linea;
    
    System.out.print("Introducir rádio : ");
    linea = System.console().readLine();
    double x = Double.parseDouble( linea );
    
    System.out.print("Introducir altura : ");
    linea = System.console().readLine();
    double y = Double.parseDouble( linea );
    
    System.out.printf("El volumen del cono es %1.2f", + 
    ((3.14 * (x * x) * y) / 3));
  }
}

