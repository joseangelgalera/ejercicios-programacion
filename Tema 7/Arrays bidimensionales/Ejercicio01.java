/*
 * Tema 7 Arrays bidimensionales
 *
 * Ejercicio 1
 *
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num
 * y asigna los valores según la siguiente tabla. Muestra el contenido de todos
 * los elementos del array dispuestos en forma de tabla como se muestra en la
 * figura.
 */
package tema.pkg7b;

import java.util.Scanner;

public class Ejercicio01 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[][] num = new int[3][6];
    int contador = 2;
    int fila = 0;
    int columna = 0;

    num[0][0] = 0;
    num[0][1] = 30;
    num[0][2] = 2;
    num[0][5] = 5;
    num[1][0] = 75;
    num[1][4] = 0;
    num[2][2] = -2;
    num[2][3] = 9;
    num[2][5] = 11;

    System.out.println("\n┌────────┬─────┬─────┬─────┬───"
            + "──┬─────┬─────┐");
    System.out.print("│ Array  ");
    for (int i = 0; i < 6; i++) {
      System.out.print("│ C " + columna + " ");
      columna++;
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼───"
            + "──┼─────┼─────┤");

    for (int i = 0; i < 3; i++) {
      System.out.print("│ Fila " + fila + " ");
      for (int j = 0; j < 6; j++) {
        System.out.printf("│%4d ", num[i][j]);
      }
      if (contador > 0) {
        System.out.println("│\n├────────┼─────┼─────┼─────┼"
                + "─────┼─────┼─────┤");
        contador--;
      }
      fila++;
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴──"
            + "───┴─────┴─────┘");
  }

}
