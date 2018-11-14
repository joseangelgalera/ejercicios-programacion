/*
 * Tema 7
 *
 * Ejercicio 4
 *
 * Define tres arrays de 20 números enteros cada una, con nombres numero,
 * cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100. 
 * En el array cuadrado se deben almacenar los cuadrados de los valores que hay  
 * en el array numero. En el array cubo se deben almacenar los cubos de los  
 * valores que hay en numero. A continuación, muestra el contenido de los tres  
 * arrays dispuesto en tres columnas.
 */
package tema.pkg7b;

import java.util.Scanner;

public class Ejercicio04 {

  public static void main(String[] args)
          throws InterruptedException {

    Scanner s = new Scanner(System.in);
    int[][] num = new int[4][5];
    int contador = 4;
    int fila = 0;
    int columna = 0;

    for (int j = 0; j < 4; j++) {
      for (int i = 0; i < 5; i++) {
        num[j][i] = (int) (Math.random() * 900 + 100);
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

    System.out.println("\n┌────────┬─────┬─────┬─────┬─"
            + "────┬─────┬──────┐");
    System.out.print("│ Array  ");
    for (int i = 0; i < 5; i++) {
      System.out.print("│ C " + columna + " ");
      columna++;
      Thread.sleep(50);
    }
    System.out.print("│   Σ  ");
    System.out.println("│\n├────────┼─────┼─────┼─────┼──"
            + "───┼─────┼──────┤");

    for (int i = 0; i < 4; i++) {
      System.out.print("│ Fila " + fila + " ");
      for (int j = 0; j < 5; j++) {
        System.out.printf("│%4d ", num[i][j]);
        Thread.sleep(50);
      }
      Thread.sleep(200);
      System.out.printf("│%5d ", sumfilas[i]);

      if (contador > 0) {
        System.out.println("│\n├────────┼─────┼─────┼─────"
                + "┼─────┼─────┼──────┤");
        contador--;
      }
      fila++;
    }
    System.out.print("│   Σ    ");
    for (int i = 0; i < 5; i++) {
      System.out.printf("│%4d ", sumcol[i]);
      Thread.sleep(200);
    }
    Thread.sleep(500);
    System.out.printf("│%5d ", total);
    System.out.println("│\n└────────┴─────┴─────┴─────┴"
            + "─────┴─────┴──────┘");

  }
}
