/*
 * Tema 7 Arrays bidimensionales
 *
 * Ejercicio 9
 *
 * Realiza un programa que sea capaz de rotar todos los elementos de una
 * matriz cuadrada una posición en el sentido de las agujas del reloj. La matriz
 * debe tener 12 filas por 12 columnas y debe contener números generados al
 * azar entre 0 y 100. Se debe mostrar tanto la matriz original como la matriz
 * resultado, ambas con los números convenientemente alineados.
 */
package tema.pkg7b;

import java.util.Scanner;

public class Ejercicio09 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[][] original = new int[12][12];
    int[][] rotado = new int[12][12];

    for (int j = 0; j < original.length; j++) {

      for (int i = 0; i < original[j].length; i++) {

        original[j][i] = (int) (Math.random() * 101);

      }

    }

    System.out.println();
    System.out.println();
    System.out.println("Matriz original:");
    System.out.println();

    for (int j = 0; j < original.length; j++) {

      for (int i = 0; i < original[j].length; i++) {

        System.out.printf("%4d", original[j][i]);

      }
      System.out.println();
    }

    for (int j = 0; j < original.length; j++) {

      for (int i = 0; i < original[j].length; i++) {

        rotado[j][i] = original[j][i];

      }

    }

    rotado[0][0] = original[original.length - 1][original.length - 1];

    for (int j = 0; j < original.length; j++) {

      for (int m = 1; m < original.length; m++) {
        rotado[m][0] = original[m - 1][original.length - 1];
      }

      for (int i = 1; i < original[j].length; i++) {

        rotado[j][i] = original[j][i - 1];

      }

    }

    System.out.println();
    System.out.println();
    System.out.println("Matriz rotada:");
    System.out.println();

    for (int j = 0; j < original.length; j++) {

      for (int i = 0; i < original[j].length; i++) {

        System.out.printf("%4d", rotado[j][i]);

      }
      System.out.println();
    }
  }
}
