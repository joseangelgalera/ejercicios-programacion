/*
 * Tema 5
 *
 * Ejercicio 31
 *
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
 * programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
 * mitad (división entera entre 2) de la altura más uno.
 * Ejemplo:
 * Introduzca la altura de la L: 5
 *  *
 *  *
 *  *
 *  *
 *  * * *
 */
package tema.pkg5;

import java.util.Scanner;

public class Ejercicio31 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce la altura de la L: ");
    int h = s.nextInt();
    
    int i = 1;
    
    while (i < h) {
      System.out.println("*");
      i++;
    }
    i = 0;
    while ((i <= h / 2)) {
      System.out.print("* ");
      i++;
    }
  }
}
