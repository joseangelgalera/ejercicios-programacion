/*
 * Tema 5
 * 
 * Ejercicio 14
 * 
 * Escribe un programa que pida una base y un exponente (entero positivo) y
 * que calcule la potencia.
 * 
 */

import java.util.Scanner;

public class Ejercicio14 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca una base : ");
    int base = s.nextInt();
    
    System.out.print("Introduzca un exponente : ");
    int exp = s.nextInt();
    
    int potencia = 1 ;
    
    if ( exp == 0) {
      potencia = 1;
    }
    
    if (exp < 0) {
      for ( int i = 0; i < -exp; i++) {
        potencia *= base;
      }
        potencia = 1 / potencia;
    }
    
    if (exp > 0) {
      for ( int i = 0; i < exp; i++) {
        potencia *= base;
      }
    }
    System.out.print("El resultado de " + base + "^" + exp + " es " +
    potencia);
  }
}

