/*
 * Tema 5
 *
 * Ejercicio 24
 *
 * Escribe un programa que lea un número n e imprima una pirámide de números
 * con n filas como en la siguiente figura:
 *
 *           1
 *          121
 *         12321
 *        1234321
 */
package tema.pkg5;

import java.util.Scanner;

public class Ejercicio24 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca la altura: ");
    int altura = s.nextInt();
    int alturaMin = 1;
    int i = 0;
    int espacios = altura - 1;

    while (alturaMin <= altura) {

      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      for (i = 1; i < alturaMin; i++) {
        System.out.print(i);
      }

      for (i = alturaMin; i > 0; i--) {
        System.out.print(i);
      }

      System.out.println();
      espacios--;
      alturaMin++;
    }
  }
}
