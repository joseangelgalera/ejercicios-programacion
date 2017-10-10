/*
 * Tema 3
 * 
 * Ejercicio 6
 * 
 * Escribe un programa que calcule el área de un triángulo.
 * 
 */


public class Ejercicio6 {
  public static void main (String args[]) {
    
    String linea;
    
    System.out.println("Área de un traingulo");
    System.out.print("Introducir base en cm : ");
    linea = System.console().readLine();
    double x = Double.parseDouble( linea );
    
    System.out.print("Introducir altura en cm : ");
    linea = System.console().readLine();
    double y = Double.parseDouble( linea );
    
    System.out.print("El área del triángulo es " + (x * y / 2) + "cm²");
  }
}

