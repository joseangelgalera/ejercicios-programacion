/*
 * Tema 4
 * 
 * Ejercicio 19
 * 
 * Realiza un programa que nos diga cuántos dígitos tiene un número entero que
 * puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 * 
 */

import java.util.Scanner;

public class Ejercicio19 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número entero de hasta 5 cifras : ");
    int numeroEntero = s.nextInt();
    
    int digitos = 0;
    
    if ( numeroEntero < 10 ) {
      digitos = 1;
    }
    
    if (( numeroEntero >= 10 ) && ( numeroEntero < 100 )) {
      digitos = 2;
    }
    
    if (( numeroEntero >= 100 ) && ( numeroEntero < 1000 )) {
      digitos = 3;
    }
    
    if (( numeroEntero >= 1000 ) && ( numeroEntero < 10000 )) {
      digitos = 4;
    }
    
    if ( numeroEntero >= 10000 ) {
      digitos = 5;
    }
    
    System.out.print("El número tiene " + digitos + " dígitos.");
  }
}

