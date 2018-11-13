/*
 * Tema 7 Arrays bidimensionales
 *
 * Ejercicio 2
 *
 * Escribe un programa que pida 20 números enteros. Estos números se deben
 * introducir en un array de 4 filas por 5 columnas. El programa mostrará las
 * sumas parciales de filas y columnas igual que si de una hoja de cálculo se
 * tratara. La suma total debe aparecer en la esquina inferior derecha.
 */
package tema.pkg7b;

import java.util.Scanner;

public class Ejercicio02 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[][] num = new int[4][5];
    int contador = 4;
    int fila = 0;
    int columna = 0;

    for (int j = 0; j < 4; j++) {
      System.out.println("Introduce 5 valores para fila " + j + ":");
      for (int i = 0; i < 5; i++) {
        num[j][i] = s.nextInt();
      }
    }

    int[] sumfilas = new int[4];
    int totalfilas = 0;

    for (int j = 0; j < 4; j++) {
      for (int i = 0; i < 5; i++) {
        sumfilas[j] += num[j][i];
      }
      totalfilas += sumfilas[j];
    }

    int[] sumcol = new int[5];
    int totalcol = 0;

    for (int j = 0; j < 5; j++) {
      for (int i = 0; i < 4; i++) {
        sumcol[j] += num[i][j];
      }
      totalcol += sumcol[j];
    }

    int total = totalfilas + totalcol;


    System.out.print("Array  ");
    for (int i = 0; i < 5; i++) {
      System.out.print("C " + columna + " ");
      columna++;
    }
    System.out.print("Σ  ");


    for (int i = 0; i < 4; i++) {
      System.out.print(" Fila " + fila + " ");
      for (int j = 0; j < 5; j++) {
        System.out.printf(" %4d ", num[i][j]);
      }
      System.out.printf("│%5d ", sumfilas[i]);
      if (contador > 0) {
        contador--;
      }
      fila++;
    }
    System.out.print("Σ    ");
    for (int i = 0; i < 5; i++) {
      System.out.printf("│%4d ", sumcol[i]);
    }
    System.out.printf(" %5d ", total);

  }

}
