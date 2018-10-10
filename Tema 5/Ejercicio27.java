/*
 * Tema 5
 * 
 * Ejercicio 27
 *
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
 * entre 1 y un número leído por teclado.
 */
package tema.pkg5;

import java.util.Scanner;

public class Ejercicio27 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca un número entero mayor que 1 : ");
    int numeroInt = s.nextInt();

    int cuenta = 0;
    int suma = 0;
    int i = 1;

    while (i < numeroInt) {
      if ((i % 3) == 0) {
        System.out.print(i + " ");
        cuenta++;
        suma += i;
      }
      i++;
    }

    System.out.print("\nDesde 1 hasta " + numeroInt + " hay " + cuenta + 
            " múltiplos de 3 y suman " + suma);
  }
}
