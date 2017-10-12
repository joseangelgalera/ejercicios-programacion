/*
 * Tema 4
 * 
 * Ejercicio 5
 * 
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax +
 * b = 0).
 * 
 */

import java.util.Scanner;

public class Ejercicio5 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Ecucación del tipo ax+b=0.");
    
    System.out.print("Introduzca la a : ");
    int a = s.nextInt();
    
    System.out.print("Introduzca la b : ");
    int b = s.nextInt();
    
    System.out.print("La solución de la incógnita es x = " + (-b / a));
  }
}

