/*
 * Tema 5
 * 
 * Ejercicio 13
 *
 * Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos.
 */
package tema.pkg5;
import java.util.Scanner;

public class Ejercicio13 {
  public static void main (String[]args) {
    Scanner s = new Scanner(System.in);
    
    int contadorMas = 0;
    int contadorMenos = 0;
    int i = 0;
    while (i <= 10) {
      System.out.print("Introduce 10 números positivos o negativos: ");
      int x = s.nextInt();
      if (x > 0){
        contadorMas++;
      }
      
      if (x < 0) {
        contadorMenos++;
      }
      i++;
    }
    System.out.print("Hay " + contadorMas + " números positivos y " 
            + contadorMenos + " números negativos.");
  }
}
