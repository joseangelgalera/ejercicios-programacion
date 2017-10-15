/*
 * Tema 4
 * 
 * Ejercicio 18
 * 
 * Escribe un programa que diga cuál es la primera cifra de un número entero
 * introducido por teclado. Se permiten números de hasta 5 cifras.
 * 
 */

import java.util.Scanner;

public class Ejercicio18 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número entero de hasta 5 cifras : ");
    int numeroEntero = s.nextInt();
    
    int primera = 0;
    
    if ( numeroEntero < 10 ) {
      primera = numeroEntero;
    }
    
    if (( numeroEntero >= 10 ) && ( numeroEntero < 100 )) {
      primera = numeroEntero / 10;
    }
    
    if (( numeroEntero >= 100 ) && ( numeroEntero < 1000 )) {
      primera = numeroEntero / 100;
    }
    
    if (( numeroEntero >= 1000 ) && ( numeroEntero < 10000 )) {
      primera = numeroEntero / 1000;
    }
    
    if ( numeroEntero >= 10000 ) {
      primera = numeroEntero / 10000;
    }
    
    System.out.print("El primer número es " + primera);
  }
}

