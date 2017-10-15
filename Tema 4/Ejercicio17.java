/*
 * Tema 4
 * 
 * Ejercicio 17
 * 
 * Escribe un programa que diga cuál es la última cifra de un número entero
 * introducido por teclado.
 * 
 */

import java.util.Scanner;

public class Ejercicio17 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número entero : ");
    int numeroEntero = s.nextInt();
    System.out.print("El último número es " + (numeroEntero % 10));
  }
}

