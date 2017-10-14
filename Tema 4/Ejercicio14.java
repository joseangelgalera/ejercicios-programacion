/*
 * Tema 4
 * 
 * Ejercicio 14
 * 
 * Realiza un programa que diga si un número introducido por teclado es par y/o
 * divisible entre 5.
 * 
 */

import java.util.Scanner;

public class Ejercicio14 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("¿Es el número introducido par o divisible entre 5?");
    
    System.out.print("Introduzca el número : ");
    int x = s.nextInt();
    
    if ((x % 2) == 0) {
      System.out.print("El número introducido es par");
    } else {
      System.out.print("El número introducido es impar");
    }

    if ((x % 5) == 0) {
      System.out.println(" y divisible entre 5.");
    } else {
      System.out.println(" y no es divisible entre 5.");
    }
    
  }
}

