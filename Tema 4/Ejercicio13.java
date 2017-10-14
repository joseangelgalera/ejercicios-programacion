/*
 * Tema 4
 * 
 * Ejercicio 13
 
 * Escribe un programa que ordene tres números enteros introducidos por
 * teclado.
 * 
 */

import java.util.Scanner;

public class Ejercicio13 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    int aux;
    
    System.out.println("Casificador de números por orden.");
    
    System.out.print("Introduzca primer número : ");
    int primerNumero = s.nextInt();
    
    System.out.print("Introduzca segundo número : ");
    int segundoNumero = s.nextInt();
    
    System.out.print("Introduzca tercer número : ");
    int tercerNumero = s.nextInt();
    
    if (primerNumero > segundoNumero) {
      aux = primerNumero;
      primerNumero = segundoNumero;
      segundoNumero = aux;
    }
    
    if (segundoNumero > tercerNumero) {
      aux = segundoNumero;
      segundoNumero = tercerNumero;
      tercerNumero = aux;
      
    }
    
    if (primerNumero > segundoNumero) {
      aux = primerNumero;
      primerNumero = segundoNumero;
      segundoNumero = aux;
    }
    
    System.out.print("Los números ordenados quedarían de la siguiente manera " +
     primerNumero + "," + segundoNumero + "," + tercerNumero);
  }
}

