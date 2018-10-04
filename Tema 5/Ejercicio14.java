/*
 * Tema 5
 *
 * Ejercicio 14
 *
 * Escribe un programa que pida una base y un exponente (entero positivo) y
 * que calcule la potencia.
 */
package tema.pkg5;

import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca la base: ");
    int base = s.nextInt();

    System.out.print("Introduzca el exponente: ");
    int exponente = s.nextInt();

    int potencia = 1;

    if (exponente == 0) {
      potencia = 1;
    }

    if (exponente < 0) {
      int i = 0;
      while (i < -exponente) {
        potencia *= base;
        i++;
      }
      potencia = 1 / potencia;
    }

    if (exponente > 0) {
      int i = 0;
      while (i < exponente) {
        potencia *= base;
        i++;
      }
    }
    
    System.out.print(base + " ^ " + exponente + " = " + potencia);
  }
}
