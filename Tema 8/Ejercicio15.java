/*
 * Tema 8
 *
 * Ejercicio 15
 *
 * Muestra los números primos que hay entre 1 y 1000.
 */
package tema.pkg8;

import tema.pkg8.matematicas.Numeros;

public class Ejercicio15 {

  public static void main(String[] args) {
    for (int i = 1; i <= 1000; i++) {

      if ((tema.pkg8.matematicas.Numeros.esPrimo(i)) && (i != 1)) {

        System.out.print(i + " ");
      }
    }
  }

}
