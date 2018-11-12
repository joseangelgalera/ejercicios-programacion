/*
 * Tema 7
 * 
 * Ejercicio 13
 *
 * Escribe un programa que rellene un array de 100 elementos con números enteros
 * aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
 * el programa mostrará el array y preguntará si el usuario quiere destacar el
 * máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
 * el número destacado entre dobles asteriscos.
 */
package tema.pkg7;

import java.util.Scanner;

public class Ejercicio13 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] num = new int[100];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    String rojo = "\033[31m";
    String negro = "\u001B[30m";
    String verde = "\u001B[32m";

    for (int i = 0; i < 100; i++) {
      num[i] = (int) (Math.random() * 501);
      System.out.print(num[i] + " ");
    }
    System.out.println();

    for (int i = 0; i < 100; i++) {
      if (num[i] > max) {
        max = num[i];
      }
      if (num[i] < min) {
        min = num[i];
      }
    }
    System.out.println("¿Quieres destacar el (1)máximo o el (2)mínimo?");
    int elige = s.nextInt();
    System.out.println();

    if (elige == 1) {
      for (int i = 0; i < 100; i++) {
        if (num[i] == max) {
          System.out.print(rojo + "**" + num[i] + "** ");
        } else {
          System.out.print(negro + num[i] + " ");
        }
      }
    }

    if (elige == 2) {
      for (int i = 0; i < 100; i++) {
        if (num[i] == min) {
          System.out.print(verde + "**" + num[i] + "** ");
        } else {
          System.out.print(negro + num[i] + " ");
        }
      }
    }
  }

}
