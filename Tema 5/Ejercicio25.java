/*
 * Tema 5
 * 
 * Ejercicio 25
 * 
 * Realiza un programa que pida un número por teclado y que luego
 * muestre ese número al revés.
 * 
 */

import java.util.Scanner;

public class Ejercicio25 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número entero: ");
    int numeroInt = s.nextInt();

    int numero = numeroInt;
    int volteado = 0;
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } 
    
    System.out.println("El numero " + numeroInt + 
    " sera " + volteado + " al reves");
  }
}
