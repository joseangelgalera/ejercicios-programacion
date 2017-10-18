/*
 * Tema 5
 * 
 * Ejercicio 13
 * 
 * Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos.
 * 
 */

import java.util.Scanner;

public class Ejercicio13 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println ("Introduzca diez números enteros : ");
    int n = 0;
    int p = 0;
    
    for (int i = 0; i < 10; i++) {
      if (s.nextInt() < 0) {
        n++;
      } else {
        p++;
      }
    }
    
    System.out.print("Ha introducido " + n + " numeros negativos y " + 
      p + " numeros positivos.");
  }
}
