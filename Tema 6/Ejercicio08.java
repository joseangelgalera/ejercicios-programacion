/*
 * Tema 6
 *
 * Ejercicio 8
 *
 * Modifica el programa anterior para que la probabilidad de que salga un 1 sea
 * de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que 
 * salga 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
 */
package tema.pkg6;

public class Ejercicio08 {

  public static void main(String[] args) {
    int columnas = 3;
    int resultado;
    int filas = 1;

    while ( filas <= 15) {
      System.out.printf("%4d. |", filas);

      if (filas == 15) {
        columnas = 1;
      }
      
      int apuesta = 1;

      while (apuesta <= columnas) {
        resultado = (int) (Math.random() * 6) + 1;
        switch (resultado) {
          case 1:
          case 2:
          case 3:
            System.out.print("1  |");
            break;
          case 4:
          case 5:
            System.out.print("  2|");
            break;
          case 6:
            System.out.print(" X |");
          default:
        }
        apuesta++;
      }
      System.out.println();
      filas++;
    }
  }

}
