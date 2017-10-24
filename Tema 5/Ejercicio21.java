/*
 * Tema 5
 * 
 * Ejercicio 21
 * 
 * Realiza un programa que vaya pidiendo números hasta que se introduzca
 * un numero negativo y nos diga cuantos números se han introducido, la 
 * media de los impares y el mayor de los pares. El número negativo sólo
 * se utiliza para indicar el final de la introducción de datos pero no 
 * se incluye en el cómputo.
 * 
 */

import java.util.Scanner;

public class Ejercicio21 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca números positivos (Para para "); 
    System.out.println("introduzca uno negativo).");
    
    double contador = 0;
    double numero= 0;
    
    while (numero >= 0) {
      numero = s.nextInt();
      if (numero >= 0) {
        contador++;
      }
      if (numero % 0)
    }
    System.out.print(contador +"");
  }
}

