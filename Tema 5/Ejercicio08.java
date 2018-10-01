/*
 * Tema 5
 * 
 * Ejercicio 8
 *
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 */
package tema.pkg5;
import java.util.Scanner;

public class Ejercicio08 {
  public static void main (String[]args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca el número de la tabla que quiere "
            + "visualizar: ");
    int x = s.nextInt();
    int i = 0;
    
    while (i <= 10) {
      System.out.printf("%d %s %2d %s %3d %n", x, "x", i, "=", (i * x));
      i++;
    }
  }
}
