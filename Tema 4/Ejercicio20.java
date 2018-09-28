/*
 * Tema 4
 * 
 * Ejercicio 20 
 *
 * Realiza un programa que diga si un número entero positivo introducido por
 * teclado es capicúa. Se permiten números de hasta 5 cifras.
 */
package tema.pkg4;
import java.util.Scanner;

public class Ejercicio20 {
  public static void main (String[]args){
    Scanner s = new Scanner(System.in);
    
    System.out.println("¿Es el número capicúa?");
    System.out.print("Introduce un número que tenga 5 cifras como maximo: ");
    int x = s.nextInt();
    
    while (x > 100000){
      System.out.print("Introduce un número que tenga como maximo 5 cifras: ");
      x = s.nextInt();
    }
    
    if (x < 10){
      System.out.print("El número " + x + " es capicúa.");
    }
    
    if ((x >= 10) && (x < 100)){
      int ultimo = x % 10;
      int primer = ((x / 10) - (x % 10) / 10);
      if (ultimo == primer){
        System.out.print("El número " + x + " es capicúa.");
      } else {
        System.out.print("El número " + x + " no es capicúa");
      }
    }
    
    if (( x >= 100) && ( x < 1000)){
      int ultimo = x % 10;
      int primer = ((x / 100) - (x % 10) / 100);
      if (ultimo == primer){
        System.out.print("El número " + x + " es capicúa.");
      } else {
        System.out.print("El número " + x + " no es capicúa.");
      }
    }
    
    if ((x >= 1000) && ( x < 10000)){
      int gira = 0;
      int ultimo = x % 100;
      
      while (ultimo > 0){
        gira = (gira * 10) + (ultimo % 10);
        ultimo /= 10;
      }
      
      int primer = ((x / 100) - (x % 100) / 100);
      
      if(gira == primer){
        System.out.print("El número " + x + " es capicúa.");
      } else {
        System.out.print("El número " + x + " no es capicúa.");
      }
    }
      
    if ((x >= 10000) && ( x < 100000)){
      int gira = 0;
      int ultimo = x % 100;
      
      while (ultimo > 0){
        gira = (gira * 10) + (ultimo % 10);
        ultimo /= 10;
      }
      
      int primer = ((x / 1000) - (x % 100) / 1000);
      
      if(gira == primer){
        System.out.print("El número " + x + " es capicúa.");
      } else {
        System.out.print("El número " + x + " no es capicúa.");
      }
    }
  }
}
