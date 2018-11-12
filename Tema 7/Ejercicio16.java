/*
 * Tema 7
 *
 * Ejercicio 16
 *
 * Escribe un programa que rellene un array de 20 elementos con números enteros
 * aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación
 * el programa mostrará el array y preguntará si el usuario quiere resaltar los
 * múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el
 * array escribiendo los números que se quieren resaltar entre corchetes.
 */
package tema.pkg7;

import java.util.Scanner;

public class Ejercicio16 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] num = new int[20];
    String azul = "\033[34m";
    String negro = "\u001B[30m";

    for (int i = 0; i < 20; i++) {
      num[i] = (int) (Math.random() * 401);
      System.out.print(num[i] + " ");
    }
    System.out.println();

    System.out.println("¿Quieres resaltar los múltiplos de (5) o de (7)?");
    int elige = s.nextInt();
    System.out.println();

    if (elige == 5) {
      for (int i = 0; i < 20; i++) {
        if (num[i] % 5 == 0) {
          System.out.print(azul + "[" + num[i] + "] ");
        } else {
          System.out.print(negro + num[i] + " ");
        }
      }
    }

    if (elige == 7) {
      for (int i = 0; i < 20; i++) {
        if (num[i] % 7 == 0) {
          System.out.print(azul + "[" + num[i] + "] ");
        } else {
          System.out.print(negro + num[i] + " ");
        }
      }
    }
    System.out.println(negro);
  }

}
