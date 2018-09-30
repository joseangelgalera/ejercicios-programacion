/*
 * Tema 5
 * 
 * Ejercicio 5
 *
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
 * utilizando un bucle for.
 */
package tema.pkg5;

public class Ejercicio04 {
  public static void main (String[]args) {
    for (int i = 320; ((i >= 160) && (i <= 320)); i -= 20) {
      System.out.print(i + " ");
    } 
  }
}
