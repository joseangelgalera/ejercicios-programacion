/*
 * Tema 5
 *
 * Ejercicio 41
 *
 * Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
 * hay dentro de un número. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos.
 * Ejemplo 1:
 * Por favor, introduzca un número entero positivo: 406783
 * El 406783 contiene 4 dígitos pares y 2 dígitos impares.
 * Ejemplo 2:
 * Por favor, introduzca un número entero positivo: 3177840
 * El 3177840 contiene 3 dígitos pares y 4 dígitos impares.
 */
package tema.pkg5;

import java.util.Scanner;

public class Ejercicio41 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce un número para saber cuántos digitos pares e impares tiene: ");
    int numero = s.nextInt();
    int digito = 0;
    int pares = 0;
    int impares = 0;

    while (numero > 0) {

      digito = (digito * 10) + (numero % 10);

      if (digito % 2 == 0) {
        pares++;
      } else {
        impares++;
      }
      numero /= 10;
    }
    System.out.println("Número pares: " + pares);
    System.out.println("Número impares: " + impares);
  }

}
