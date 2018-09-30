/*
 * Tema 5
 * 
 * Ejercicio 2
 *
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
 */
package tema.pkg5;


public class Ejercicio02 {
  public static void main (String[]args){
    int i = 0;
    while (i <= 100){
      System.out.print(i + " ");
      i += 5;
    }
  }
}
