/*
 * Tema 5
 *
 * Ejercicio 19
 *
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se 
 * debe pedir por teclado.
 */
package tema.pkg5;

import java.util.Scanner;

public class Ejercicio19 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca la altura de la pirámide: ");
    int alturaInt = s.nextInt();

    System.out.print("Introduzca el carácter de relleno: ");
    String relleno = s.next();

    int altura = 1;
    int i = 0;
    int espacios = alturaInt - 1;

    while (altura <= alturaInt) {

      i = 1;
      while (i <= espacios) {
        System.out.print(" ");
        i++;
      }

      while (i < altura * 2) {
        System.out.print(relleno);
        i++;
      }

      System.out.println();

      altura++;
      espacios--;
    }
  }
}
