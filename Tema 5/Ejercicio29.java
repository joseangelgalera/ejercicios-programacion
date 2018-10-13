/*
 * Tema 5
 * 
 * Ejercicio 29
 *
 * Escribe un programa que muestre por pantalla todos los números enteros
 * positivos menores a uno leído por teclado que no sean divisibles entre otro
 * también leído de igual forma.
 */
package tema.pkg5;

import java.util.Scanner;

public class Ejercicio29 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca un número entero positivo : ");
    int numeroMayor = s.nextInt();

    System.out.print("Introduzca otro número menor : ");
    int numeroMenor = s.nextInt();

    System.out.print("Los números menores que "
            + numeroMayor);
    System.out.println(" que no son divisibles entre "
            + numeroMenor + " son los siguientes:");

    int cuenta = 0;
    int suma = 0;
    int i = 1;

    while (i < numeroMayor) {
      if ((i % numeroMenor) != 0) {
        System.out.print(i + " ");
      }
      i++;
    }
  }
}
