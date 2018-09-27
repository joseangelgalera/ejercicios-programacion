/*
 * Tema 4
 * 
 * Ejercicio 17
 * 
 * Escribe un programa que diga cuál es la última cifra de un número entero
 * introducido por teclado.
 */
package tema.pkg4;
import java.util.Scanner;

public class Ejercicio17 {
  public static void main (String[]args){
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un número: ");
    int x = s.nextInt();
    int ultimo = x % 10;
    
    System.out.print("El ultimo número es " + ultimo + ".");
  }
}
