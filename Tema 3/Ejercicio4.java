/*
 * Tema 3
 * 
 * Ejercicio 4
 * 
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 * 
 */


public class Ejercicio4 {
  public static void main (String args[]) {
    
    String linea;
    
    System.out.print("Introducir primer numero : ");
    linea = System.console().readLine();
    double x = Double.parseDouble( linea );
    
    System.out.print("Introducir segundo numero : ");
    linea = System.console().readLine();
    double y = Double.parseDouble( linea );
    
    System.out.println(x + " + " + y + " = " + (x + y));
    System.out.println(x + " - " + y + " = " + (x - y));
    System.out.println(x + " * " + y + " = " + (x * y));
    System.out.println(x + " / " + y + " = " + (x / y));
    
  }
}

