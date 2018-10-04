/*
 * Tema 5
 * 
 * Ejercicio 16
 * 
 * Escribe un programa que diga si un número introducido por teclado es o no
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
 * unidad.
 */
package tema.pkg5;
import java.util.Scanner;

public class Ejercicio16 {
  public static void main (String[]args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número entero: ");
    int x = s.nextInt();
    
    boolean esPrimo = true;
    
    int i = 2;
      
    while (i < x) {
      if ((x % i) == 0) {
        esPrimo = false;
      } 
      i++;
    }
    
    if (esPrimo) {
      System.out.println("El número " + x + " es primo.");
    } else {
      System.out.println("El número " + x + " no es primo.");
    }
  }
}
