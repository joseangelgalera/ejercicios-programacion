/*
 * Tema 5
 *
 * Ejercicio 39
 * 
 * Escribe un programa que pida un número entero positivo por teclado y que
 * muestre a continuación los números desde el 1 al número introducido junto
 * con su factorial.
 * Ejemplo:
 * Por favor, introduzca un número entero positivo: 7
 * 1! = 1
 * 2! = 2
 * 3! = 6
 * 4! = 24
 * 5! = 120
 * 6! = 720
 * 7! = 5040
 */
package tema.pkg5;

import java.util.Scanner;

public class Ejercicio39 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el número: ");
    int numero = s.nextInt();
    int factorial = 1;
    int aux1 = numero - 1;
    int comienzo = numero - aux1;

    while (comienzo <= numero) {

      for (int i = 1; i <= comienzo; i++) {
        factorial = factorial * i;
      }

      System.out.println(comienzo + "! = " + factorial);
      factorial /= factorial;
      comienzo++;
    }
  }

}
