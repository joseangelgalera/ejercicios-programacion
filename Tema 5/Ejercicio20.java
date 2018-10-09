/*
 * Tema 5
 * 
 * Ejercicio 20
 *
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide 
 * hueca.
 */
package tema.pkg5;

import java.util.Scanner;

public class Ejercicio20 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca la altura: ");
    int alturaInt = s.nextInt();

    System.out.print("Introduzca el carácter de relleno: ");
    String relleno = s.next();

    int altura = 1;
    int i = 0;
    int espaciosContorno = alturaInt - 1;
    int espaciosInterior = 0;

    while (altura < alturaInt) {
      i = 1;
      while (i <= espaciosContorno) {
        System.out.print(" ");
        i++;
      }

      System.out.print(relleno);
      i = 1;
      while (i < espaciosInterior) {
        System.out.print(" ");
        i++;
      }

      if (altura > 1) {
        System.out.print(relleno);
      }

      System.out.println();
      altura++;
      espaciosContorno--;
      espaciosInterior += 2;
    }
    i = 1;
    while (i < altura * 2) {
      System.out.print(relleno);
      i++;
    }
  }
}
