/*
 * Tema 5
 *
 * Ejercicio 12
 *
 * Escribe un programa que muestre los n primeros términos de la serie de
 * Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
 * y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
 * los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n 
 * se debe introducir por teclado.
 */
package tema.pkg5;
import java.util.Scanner;

public class Ejercicio12 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce un numero entero positivo: ");
    int x = s.nextInt();

    switch (x) {
      case 1:
        System.out.print("0");
        break;
      case 2:
        System.out.print("0 1");
        break;
      default:
        System.out.print("0 1");
        int i = 0;
        int y = 1;
        int z;
        while (x > 2) {
          z = i;
          i = y;
          y = z + y;
          System.out.print(" " + y);
          x--;
        }
    }
  }
}
