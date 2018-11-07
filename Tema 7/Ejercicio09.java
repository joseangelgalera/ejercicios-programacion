/*
 * Tema 7
 *
 * Ejercicio 9
 *
 * Realiza un programa que pida 8 números enteros y que luego muestre esos
 * números junto con la palabra “par” o “impar” según proceda.
 */
package tema.pkg7;

import java.util.Scanner;

public class Ejercicio09 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce 8 números enteros para saber si son "
            + "pares o impares: ");
    int[] num = new int[8];

    for (int i = 0; i < 8; i++) {
      num[i] = s.nextInt();
    }
    System.out.println();
    System.out.println("Los números elegidos son:");

    for (int i = 0; i < 8; i++) {
      System.out.printf("%5d ", num[i]);
      if (num[i] % 2 == 0) {
        System.out.print(" par");
      } else {
        System.out.print(" impar");
      }
      System.out.println();
    }
  }

}
