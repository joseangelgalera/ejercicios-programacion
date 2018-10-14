/*
 * Tema 5
 *
 * Ejercicio 45
 *
 * Escribe un programa que cambie un dígito dentro de un número dando la
 * posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha
 * empezando por el 1. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos. Suponemos que el usuario introduce
 * correctamente los datos.
 * Ejemplo:
 * Por favor, introduzca un número entero positivo: 406783
 * Introduzca la posición dentro del número: 3
 * Introduzca el nuevo dígito: 1
 * El número resultante es 401783 
 */
package tema.pkg5;

import java.util.Scanner;

public class Ejercicio45 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca un número entero positivo:");
    int numero = s.nextInt();
    System.out.print("Introduzca la posición dentro del número: ");
    int pos = s.nextInt();
    System.out.print("Introduzca el nuevo dígito: ");
    int digito = s.nextInt();
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

    volteado /= 10;

    while (volteado > 0) {
      num2 = (num2 * 10) + (volteado % 10);
      volteado /= 10;
    }
    System.out.print("El número resultante es " + num1 + digito + num2 + ".");
  }

}
