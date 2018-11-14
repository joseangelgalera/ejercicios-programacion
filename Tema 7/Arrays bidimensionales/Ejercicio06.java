/*
 * Tema 7
 *
 * Ejercicio 6
 *
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
 * array. Rota los elementos de ese array, es decir, el elemento de la posición 
 * 0 debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se 
 * encuentra en la última posición debe pasar a la posición 0. Finalmente, 
 * muestra el contenido del array.
 */
package tema.pkg7b;

public class Ejercicio06 {

  public static void main(String[] args) {

    final int filas = 6;
    final int columnas = 10;

    int[][] num = new int[filas][columnas];
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;

    int[] posMaximo = new int[2];
    int[] posMinimo = new int[2];

    System.out.println("Voy a generar 60 números enteros aleatorios entre 0 y "
            + "1000 y guardarlos en un array 6x10.");

    for (int i = 0; i <= (filas - 1); i++) { // Filas
      for (int j = 0; j <= (columnas - 1); j++) {  // Columnas
        num[i][j] = (int) (Math.random() * 1001);
      }
    }

    System.out.println("┌──────────┬──────────┬─────────"
            + "─┬──────────┬──────────┬──────────┬"
            + "──────────┬──────────┬──────────┬────"
            + "──────┐");

    for (int i = 0; i <= (filas - 1); i++) { 
      System.out.print("│");
      for (int j = 0; j <= (columnas - 1); j++) {  
        if (num[i][j] > maximo) {
          maximo = num[i][j];
          posMaximo[0] = i;
          posMaximo[1] = j;
        }
        if (num[i][j] < minimo) {
          minimo = num[i][j];
          posMinimo[0] = i;
          posMinimo[1] = j;
        }
        int esp = 10 - Integer.toString(num[i][j]).length();
        int mitad = (esp / 2) + (esp % 2);
        for (int k = 1; k <= mitad; k++) {
          System.out.print(" ");
        }
        System.out.print(num[i][j]);
        for (int k = 1; k <= (esp - mitad); k++) {
          System.out.print(" ");
        }
        System.out.print("│");
      }
      if (i < (filas - 1)) {
        System.out.println("\n├──────────┼──────────┼─────"
                + "─────┼──────────┼──────────┼───────"
                + "───┼"
                + "──────────┼──────────┼──────────┼──"
                + "────────┤");
      }

    }

    System.out.println("\n└──────────┴──────────┴────────"
            + "──┴──────────┴──────────┴──────────┴"
            + "──────────┴──────────┴──────────┴─────"
            + "─────┘\n\n");
    System.out.println("El máximo está en la posicion (" + posMaximo[0] + "," 
            + posMaximo[1] + ")"
            + " y tiene un valor de " + maximo + ".");
    System.out.println("El mínimo está en la posicion (" + posMinimo[0] + "," 
            + posMinimo[1] + ")"
            + " y tiene un valor de " + minimo + ".");
  }

}
