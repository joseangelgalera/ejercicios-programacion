/*
 * Tema 5
 *
 * Ejercicio 37
 *
 * Realiza un conversor del sistema decimal al sistema de “palotes”.
 * Ejemplo:
 * Por favor, introduzca un número entero positivo: 47021
 * El 47021 en decimal es el | | | | - | | | | | | | - - | | - | en el sistema 
 * de palotes.
 */
package tema.pkg5;

import java.util.Scanner;

public class Ejercicio37 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número para convertir al sistema de palotes: ");
    int numero = s.nextInt();
    int volteado = 0;
    int digito = 0;

    while (numero > 0) {

      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    }

    while (volteado > 0) {
      digito = volteado % 10;

      for (int i = 1; i <= digito; i++) {
        System.out.print("|");
      }
      volteado /= 10;

      if (volteado > 0) {
        System.out.print("-");
      }

    }

  }
}
