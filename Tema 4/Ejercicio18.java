/*
 * Tema 4
 * 
 * Ejercicio 18
 *
 * Escribe un programa que diga cuál es la primera cifra de un número entero
 * introducido por teclado. Se permiten números de hasta 5 cifras.
 */
package tema.pkg4;
import java.util.Scanner;

public class Ejercicio18 {
  public static void main (String[]args){
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un número que tenga como maximo 5 cifras: ");
    int x = s.nextInt();
    
    int primer;
    
    while (x > 100000){
      System.out.print("Introduce un número que tenga como maximo 5 cifras: ");
      x = s.nextInt();
    }
    
    if (x < 10){
      System.out.print("El primer numero es " + x + ".");
    }
    
    if ((x >= 10) && ( x < 100)){
      primer = ((x / 10) - (x % 10) / 10);
      
      System.out.print("El primer numero es: " + primer + ".");
    }
    
    if (( x >= 100) && ( x < 1000)){
      primer = ((x / 100) - (x % 10) / 100);
      
      System.out.print("El primer numero es: " + primer + ".");
    }
    
    if ((x >= 1000) && ( x < 10000)){
      primer = ((x / 1000) - (x % 10) / 1000);
      
      System.out.print("El primer numero es: " + primer + ".");
    }
    
    if ((x >= 10000) && ( x < 100000)){
      primer = ((x / 10000) - (x % 10) / 10000);
      
      System.out.print("El primer numero es: " + primer + ".");
    }
  }
}
