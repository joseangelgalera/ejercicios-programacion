/*
 * Tema 8
 *
 * Ejercicio 16
 *
 * Muestra los números capicúa que hay entre 1 y 99999.
 */
package tema.pkg8;

import tema.pkg8.matematicas.Numeros;

public class Ejercicio16 {

  public static void main(String[] args) {
    for (int i = 1; i <= 99999; i++) {

      if (tema.pkg8.matematicas.Numeros.esCapicua(i)) {

        System.out.print(i + " ");
      }
    }
  }

}
