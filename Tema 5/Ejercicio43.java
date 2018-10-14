/*
 * Tema 5
 *
 * Ejercicio 43
 *
 *
 */
package tema.pkg5;

import java.util.Scanner;

public class Ejercicio43 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca un número entero positivo:");
    int numero = s.nextInt();
    System.out.print("Introduzca la posición a partir de la cual quiere partir "
            + "el número: ");
    int pos = s.nextInt();
    int volteado = 0;
    int aux = 1;
    int num1 = 0;
    int num2 = 0;

    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    }

    while (aux < pos) {
      num1 = (num1 * 10) + (volteado % 10);
      volteado /= 10;
      aux++;
    }

    while (volteado > 0) {
      num2 = (num2 * 10) + (volteado % 10);
      volteado /= 10;
    }
    System.out.print("Los números partidos son el " + num1 + " y el "
            + num2 + ".");
  }

}
