/*
 * Tema 5
 * 
 * Ejercicio 15
 * 
 * Escribe un programa que dados dos números, uno real (base) y un entero
 * positivo (exponente), saque por pantalla todas las potencias con base el
 * numero dado y exponentes entre uno y el exponente introducido. No se deben
 * utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 
 * 5, se deberán mostrar 2¹, 2², 2³, 2^4 y 2^5.
 */
package tema.pkg5;

import java.util.Scanner;

public class Ejercicio15 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca la base: ");
    int base = s.nextInt();

    System.out.print("Introduzca el exponente: ");
    int exp = s.nextInt();

    int potencia;
    int x;
    int i = 1;

    while (i <= exp) {
      potencia = 1;
      x = i;
      int j = 0;

      while (j < x) {
        potencia *= base;
        j++;
      }

      System.out.println(base + "^" + i + " = "
              + potencia);

      i++;
    }

  }
}
