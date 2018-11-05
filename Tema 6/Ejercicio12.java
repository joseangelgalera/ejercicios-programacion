/*
 * Tema 6
 *
 * Ejercicio 12
 *
 * Realiza un programa que llene la pantalla de caracteres aleatorios 
 * (a lo Matrix) con el código ascii entre el 32 y el 126. Puedes hacer casting 
 * con (char) para convertir un entero en un carácter.
 */
package tema.pkg6;

public class Ejercicio12 {

  public static void main(String[] args) throws InterruptedException {
    int i = 0;
    int linea = 0;

    System.out.print("\033[32m");

    while (i <= 9000) {

      i++;
      System.out.print((char) (Math.random() * (126 - 32 + 1) + 32));

      if (linea++ == 161) {
        linea = 0;
        Thread.sleep(151);
        System.out.println();
      }
    }
  }

}
