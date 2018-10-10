/*
 * Tema 5
 * 
 * Ejercicio 25
 *
 *
 */
package tema.pkg5;

import java.util.Scanner;

public class Ejercicio25 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca un número entero : ");
    int numeroInt = s.nextInt();

    int numero = numeroInt;
    int volteaNumero = 0;

    while (numero > 0) {
      volteaNumero = (volteaNumero * 10) + (numero % 10);
      numero /= 10;
    }

    System.out.println("El numero " + numeroInt
            + " sera " + volteaNumero + " al reves");
  }
}
