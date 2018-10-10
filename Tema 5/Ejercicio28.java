/*
 * Tema 5
 * 
 * Ejercicio 28
 *
 * Escribe un programa que calcule el factorial de un número entero leído por
 * teclado.
 * Ejemplo:
 * Por favor, introduzca un número entero: 6
 * 6! = 720
 */
package tema.pkg5;

import java.util.Scanner;

public class Ejercicio28 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    long numeroInt;

    do {
      System.out.print("Introduzca un número entero: ");
      numeroInt = s.nextInt();

      if (numeroInt < 0) {
        System.out.println("El número introducido no es correcto.");
      }
    } while (numeroInt < 0);

    long factorial = numeroInt;

    if (numeroInt == 0) {
      System.out.println("El factorial del " + numeroInt + " es 1.");
    } else {
      int i = 1;
      while (i < numeroInt) {
        factorial *= i;
        i++;
      }

      System.out.println(numeroInt + "! = " + factorial);
    }
  }
}
