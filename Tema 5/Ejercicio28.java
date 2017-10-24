/*
 * Tema 5
 * 
 * Ejercicios 28
 * 
 * Escribe un programa que calcule el factorial de un número entero
 * leído por teclado.
 * 
 */

import java.util.Scanner;

public class Ejercicio28 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    int numeroInt;
    
    do {
      System.out.print("Introduzca un número entero : ");
      numeroInt = s.nextInt();
      
      if (numeroInt < 0) {
        System.out.println("El número introducido no es correcto.");
      }
    } while (numeroInt < 0);

    int factorial = numeroInt;
    
    if (numeroInt == 0) {
      System.out.println("El factorial del " + numeroInt + " es 1.");
    } else {
      for (int i = 1; i < numeroInt; i++) {
        factorial *= i;
      }

      System.out.println(numeroInt + "! = " + factorial);
    }
  }
}

  


