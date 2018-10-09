/*
 * Tema 5
 *
 * Ejercicio 22
 *
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 */
package tema.pkg5;

import java.util.Scanner;

public class Ejercicio22 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Entre 2 y 100 estan los siguientes números primos: ");

    boolean Primo = true;

    int i = 2;
    int j = 2;

    while (i <= 100) {
      Primo = true;

      while (j < i) {
        if (i % j == 0) {
          Primo = false;
        }
        j++;
      }
      if (Primo) {
        System.out.print(i + " ");
      }
      i++;
    }
    System.out.println();
  }
}
