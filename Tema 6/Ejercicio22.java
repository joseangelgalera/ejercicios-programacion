/*
 * Tema 6
 *
 * Ejercicio 22
 *
 * Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
 * aleatorio. La cabeza se representará con el carácter @ y se debe colocar
 * exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
 * el cuerpo irá serpenteando de la siguiente manera: se generará de forma
 * aleatoria un valor entre tres posibles que hará que el siguiente carácter se
 * coloque una posición a la izquierda del anterior, alineado con el anterior o 
 * una posición a la derecha del anterior. La longitud de la serpiente se pedirá
 * por teclado y se supone que el usuario introducirá un dato correcto.
 */
package tema.pkg6;

import java.util.Scanner;

public class Ejercicio22 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la longitud de la serpiente: ");
    int l = s.nextInt();
    int espacios = 12;
    String verde = "\u001B[32m";

    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
    System.out.println(verde + "@");
    while (l - 1 > 0) {
      int pos = (int) (Math.random() * 4 - 2);
      espacios = espacios + pos;
      for (int i = 0; i < espacios; i++) {
        System.out.print(" ");
      }
      System.out.println("*");
      l--;
    }
    System.out.print("\u001B[0m");
  }
}
