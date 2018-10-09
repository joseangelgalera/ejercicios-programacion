/*
 * Tema 5
 *
 * Ejercicio 23
 *
 * Escribe un programa que permita ir introduciendo una serie indeterminada
 * de números mientras su suma no supere el valor 10000. Cuando esto último
 * ocurra, se debe mostrar el total acumulado, el contador de los números
 * introducidos y la media.
 */
package tema.pkg5;

import java.util.Scanner;

public class Ejercicio23 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Introduzca números enteros (Cuando la suma de los "
            + "números sea mayor que 10000 dejara de pedir numeros): ");

    int numeroInt;
    int contador = 0;
    int suma = 0;

    do {
      numeroInt = s.nextInt();
      suma += numeroInt;
      contador++;
    } while (suma <= 10000);

    System.out.println("Ha introducido un total de "
            + contador + " número/os.");
    System.out.println("La suma total es " + suma + ".");
    System.out.println("La media es " + suma / contador + ".");
  }
}
