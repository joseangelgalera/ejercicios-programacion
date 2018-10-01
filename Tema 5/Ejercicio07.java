/*
 * Tema 5
 *
 * Ejercicio 7
 *
 * Realiza el control de acceso a una caja fuerte. La combinación será un
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 */
package tema.pkg5;
import java.util.Scanner;

public class Ejercicio07 {
  public static void main (String[]args) {
    Scanner s = new Scanner(System.in);
    int i = 4;
    int correcto = 4692;
    while (i >= 4) {
      System.out.print("Introduzca el codigo de apertura: ");
      int codigo = s.nextInt();
      while (codigo > 9999) {
        System.out.print("El cofigo esta formado por 4 cifras introduzcalo de "
                + "nuevo: ");
        codigo = s.nextInt();
      }
      if (codigo == correcto) {
        System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
        i -= 4;
      } else {
        if (i > 3) {
          System.out.println("Lo siento, esa no es la combinación.");
          i--;
        }
      }
    }
    
    while (i > 0) {
      System.out.print("Introduzca de nuevo el codigo de apertura: ");
      int codigo = s.nextInt();
      while (codigo > 9999) {
        System.out.print("El cofigo esta formado por 4 cifras introduzcalo de "
                + "nuevo: ");
        codigo = s.nextInt();
      }
      if (codigo == correcto) {
        System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
        i -= 4;
      } else {
        if (i > 1) {
          System.out.println("Lo siento, esa no es la combinación.");
          i--;
        } else {
          i--;
          if (i == 0) {
          System.out.print("Caja fuerte bloqueada.");
          }
        }
      }
    } 
  }
}
