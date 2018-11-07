/*
 * Tema 7
 *
 * Ejercicio 8
 *
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes
 * de un determinado año y que muestre a continuación un diagrama de barras
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
 * de asteriscos o cualquier otro carácter.
 */
package tema.pkg7;

import java.util.Scanner;

public class Ejercicio08 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce la temperatura del año. ");
    int[] temperatura = new int[12];
    int min = 10;
    String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    String rojo = "\033[31m";
    String azul = "\033[34m";
    String negro = "\u001B[30m";

    for (int i = 0; i < 12; i++) {
      System.out.print(mes[i] + ": ");
      temperatura[i] = s.nextInt();
    }
    System.out.println();

    for (int i = 0; i < 12; i++) {
      System.out.printf(negro + "%-10s ", mes[i]);
      if (temperatura[i] < 0) {
        for (int l = 0; l < min + temperatura[i]; l++) {
          System.out.print(" ");
        }
        for (int k = 0; k < (-1 * temperatura[i]); k++) {
          System.out.print(azul + "■");
        }
        System.out.print(negro + "┃");
      } else if (temperatura[i] > 0) {
        for (int l = 0; l < min; l++) {
          System.out.print(" ");
        }
        System.out.print(negro + "┃");
        for (int j = 0; j < temperatura[i]; j++) {
          System.out.print(rojo + "■");
        }
      } else {
        for (int l = 0; l < min; l++) {
          System.out.print(" ");
        }
        System.out.print(negro + "┃");
      }
      System.out.println(negro);
    }
  }

}
