/*
 * Tema 5
 *
 * Ejercicio 32
 *
 * Escribe un programa que, dado un número entero positivo, diga cuáles son y
 * cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden,
 * de izquierda a derecha. Usa long en lugar de int donde sea necesario para
 * admitir números largos.
 * Ejemplo 1:
 * Por favor, introduzca un número entero positivo: 94026782
 * Dígitos pares: 4 0 2 6 8 2
 * Suma de los dígitos pares: 22
 * Ejemplo 2:
 * Por favor, introduzca un número entero positivo: 31779
 * Dígitos pares:
 * Suma de los dígitos pares: 0
 */
package tema.pkg5;

import java.util.Scanner;

public class Ejercicio32 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la altura de la L: ");
    int h = s.nextInt();
    int espacios = ((h - 1) / 2) + 1;
    int altura = 1;

    while (altura < h) {

      System.out.print("*");
      for (int i = 1; i < espacios; i++) {
        System.out.print("  ");
      }
      System.out.print(" ");
      System.out.println("*");

      altura++;

    }
    System.out.print(" ");
    for (int i = 0; i < espacios; i++) {
      System.out.print("* ");
    }
  }
}
