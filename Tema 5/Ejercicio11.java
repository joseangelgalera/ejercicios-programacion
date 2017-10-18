/*
 * Tema 5
 * 
 * Ejercicio 11
 * 
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
 * 
 */

import java.util.Scanner;

public class Ejercicio11 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número entero : ");
    int x = s.nextInt();
    
    System.out.println("Número    Cuadrado    Cubo");
    System.out.println("------------------------------");
    
    for ( int i = x; i < x + 5; i++) {
      System.out.printf(" %2d      %5d        %2d\n", i, i * i, i * i * i);
    }
  }
}

