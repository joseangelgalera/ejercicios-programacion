/*
 * Tema 5
 *
 * Ejercicio 44
 *
 * Escribe un programa que sea capaz de insertar un dígito dentro de un número
 * indicando la posición. El nuevo dígito se colocará en la posición indicada y 
 * el resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan
 * de izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
 * correctamente los datos. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos.
 * Ejemplo:
 * Por favor, introduzca un número entero positivo: 406783
 * Introduzca la posición donde quiere insertar: 3
 * Introduzca el dígito que quiere insertar: 5
 * El número resultante es 4056783.
 */
package tema.pkg5;

import java.util.Scanner;

public class Ejercicio44 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca un número entero positivo:");
    int numero = s.nextInt();
    System.out.print("Introduzca la posición donde quiere insertar: ");
    int pos = s.nextInt();
    System.out.print("Introduzca el dígito que quiere insertar: ");
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

    while (volteado > 0) {
      num2 = (num2 * 10) + (volteado % 10);
      volteado /= 10;
    }
    System.out.print("El número resultante es " + num1 + digito + num2 + ".");
  }

}
