/*
 * Tema 5
 *
 * Ejercicio 40
 *
 * Realiza un programa que pinte por pantalla un rombo hueco hecho con
 * asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
 * sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
 * mensaje de error.
 * Ejemplo:
 * Por favor, introduzca la altura del rombo: 5
 *    *
 *   * *
 *  *   *
 *   * *
 *    *
 */
package tema.pkg5;

import java.util.Scanner;

public class Ejercicio40 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la altura del rombo: ");
    int h = s.nextInt();
    int altura = 1;
    int espadelante = (h / 2) - 1;
    int espadetras = 1;
    int espadelante2 = 1;
    int espadetras2 = h - 4;
    int altura2 = 2;
    int arriba = h - 1;
    int esparriba = (h / 2);
    int abajo = h - 1;
    int espabajo = (h / 2);

    if ((h >= 3) && (h % 2 != 0)) {

      while (arriba < h) {

        for (int i = 1; i <= esparriba; i++) {
          System.out.print(" ");
        }

        esparriba--;
        arriba++;
      }
      System.out.println("*");

      while (altura <= (h / 2)) {

        for (int i = 1; i <= espadelante; i++) {
          System.out.print(" ");
        }

        System.out.print("*");
        for (int i = 1; i <= espadetras; i++) {
          System.out.print(" ");
        }

        if (altura > 0) {
          System.out.print("*");
        }
        altura++;
        espadelante--;
        espadetras += 2;
        System.out.println();
      }

      while (altura2 <= (h / 2)) {

        for (int i = 0; i < espadelante2; i++) {
          System.out.print(" ");
        }

        System.out.print("*");
        for (int i = 1; i <= espadetras2; i++) {
          System.out.print(" ");
        }

        if (altura > 0) {
          System.out.print("*");
        }
        altura2++;
        espadelante2++;
        espadetras2 -= 2;
        System.out.println();
      }

      while (abajo < h) {

        for (int i = 1; i <= espabajo; i++) {
          System.out.print(" ");
        }

        espabajo--;
        abajo++;
      }
      System.out.println("*");

    } else {
      System.out.print("Error, el número debe ser mayor o igual a 3 e impar");
    }
  }

}
