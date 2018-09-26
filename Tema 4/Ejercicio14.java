/*
 * Tema 4.
 * 
 * Ejercicio 14
 *
 * Realiza un programa que diga si un número introducido por teclado es par y/o
 * divisible entre 5.
 *
 */
package tema.pkg4;
import java.util.Scanner;

public class Ejercicio14 {
  public static void main (String[]args){
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un número: ");
    int x = s.nextInt();
    
    if ((x % 5) == 0){
      System.out.print("El numero " + x + " es divisible entre 5.");
    }
    
    if ((x % 2) == 0){
      System.out.print("El numero " + x + " es par.");
    }
  }
}
