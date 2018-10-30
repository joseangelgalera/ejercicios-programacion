/*
 * Tema 6
 *
 * Ejercicio 7
 *
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
 * para los 14 partidos y el pleno al quince (15 filas).
 */
package tema.pkg6;

public class Ejercicio07 {

  public static void main(String[] args) {
    int columnas = 3;
    int resultado;
    int filas = 1;

    while (filas <= 15) {
      System.out.printf("%4d. |", filas);

      if (filas == 15) {
        columnas = 1;
      }
      int apuesta = 1;
      while (apuesta <= columnas) {
        resultado = (int) (Math.random() * 3) + 1;
        switch (resultado) {
          case 1:
            System.out.print("1  |");
            break;
          case 2:
            System.out.print("  2|");
            break;
          case 3:
            System.out.print(" X |");
            break;
          default:
        }
        apuesta++;
      }
      System.out.println();
      filas++;
    }
  }

}
