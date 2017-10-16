/*
 * Tema 4
 * 
 * Ejercicio 20
 * 
 * Realiza un programa que diga si un número entero positivo introducido por
 * teclado es capicúa. Se permiten números de hasta 5 cifras.
 * 
 */

import java.util.Scanner;

public class Ejercicio20 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número entero de hasta 5 cifras : ");
    int numeroEntero = s.nextInt();
    
    int n;
    boolean esCapicua = false;
    
    if ( numeroEntero < 10 ) {
      esCapicua = true;
    }
    
    if ((numeroEntero >= 10) && (numeroEntero < 100)) {
      if ((numeroEntero / 10) == (numeroEntero % 10)) {
        esCapicua = true;
      }
    }
    
    if ((numeroEntero >= 100) && (numeroEntero < 1000)) {
      if ((numeroEntero / 100) == (numeroEntero % 10)) {
        esCapicua = true;
      }
    }
    
    if ((numeroEntero >= 1000) && (numeroEntero < 10000)) {
      if (((numeroEntero / 1000) == (numeroEntero % 10)) &&
         ((( numeroEntero / 100 ) % 10)== (( numeroEntero / 10) % 10))) {
        esCapicua = true;
      }
    }
    
    if ( numeroEntero >= 10000 ) {
      if (((numeroEntero / 10000) == (numeroEntero % 10) ) && 
         ((((numeroEntero / 1000) % 10)) == ((numeroEntero / 10) % 10))) {
        esCapicua = true;
      }
    }
    
    if (esCapicua) {
      System.out.print("El número  " + numeroEntero + " es capicúa.");
    } else {
      System.out.print("El número " + numeroEntero + " no es capicúa.");
    }
  }
}



