/*
 * Tema 5
 *
 * Ejercicio 34
 *
 * Escribe un programa que pida dos números por teclado y que luego mezcle en
 * dos números diferentes los dígitos pares y los impares. Se van comprobando
 * los dígitos de la siguiente manera: primer dígito del primer número, primer
 * dígito del segundo número, segundo dígito del primer número, segundo
 * dígito del segundo número, tercer dígito del primer número… Para facilitar
 * el ejercicio, podemos suponer que el usuario introducirá dos números de la
 * misma longitud y que siempre habrá al menos un dígito par y uno impar. Usa
 * long en lugar de int donde sea necesario para admitir números largos.
 * Ejemplo 1:
 * Por favor, introduzca un número: 9402
 * Introduzca otro número: 6782
 * El número formado por los dígitos pares es 640822
 * El número formado por los dígitos impares es 97
 */
package tema.pkg5;

import java.util.Scanner;

public class Ejercicio34 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Introduce dos números de la misma longitud, con mínimo "
            + "un número par y otro impar.");
    System.out.print("Introduce el primer número: ");
    int num1 = s.nextInt();
    System.out.print("Introduce el segundo número: ");
    int num2 = s.nextInt();
    int vol1 = 0;
    int vol2 = 0;
    int digitos1 = 0;
    int digitos2 = 0;
    int pares = 0;
    int impares = 0;

    while (num1 > 0) {
      vol1 = (vol1 * 10) + (num1 % 10);
      num1 /= 10;
    }

    while (num2 > 0) {
      vol2 = (vol2 * 10) + (num2 % 10);
      num2 /= 10;
    }

    while ((vol1 > 0) && (vol2 > 0)) {

      digitos1 = (vol1 % 10);
      digitos2 = (vol2 % 10);

      if ((digitos1 % 2 == 0)) {
        pares = (pares * 10) + digitos1;
      } else {
        impares = (impares * 10) + digitos1;
      }

      if ((digitos2 % 2 == 0)) {
        pares = (pares * 10) + digitos2;
      } else {
        impares = (impares * 10) + digitos2;
      }

      vol1 /= 10;
      vol2 /= 10;

    }
    System.out.println("Dígitos pares: " + pares);
    System.out.println("Dígitos impares: " + impares);
  }

}
