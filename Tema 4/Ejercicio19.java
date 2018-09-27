/*
 * Tema 4
 * 
 * Ejercicio 19
 *
 * Realiza un programa que nos diga cuántos dígitos tiene un número entero que
 * puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 */
package tema.pkg4;
import java.util.Scanner;

public class Ejercicio19 {
  public static void main (String[]args){
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un número que tenga 5 cifra como maximo: ");
    int x = s.nextInt();
    
    while ((x > 100000) || (x < -100000)){
      System.out.print("Introduce un número que tenga 5 cifras como maximo: ");
      x = s.nextInt();
    }
    
    if ((x < 10) && (x > -10)){
      System.out.print("El número tiene 1 dígito.");
    }
    
    if ((x >= 10) && (x < 100) || (x <= -10) && (x > -100)){
      System.out.print("El numero tiene 2 dígitos.");
    }
    
    if ((x >= 100) && (x < 1000) || (x <= -100) && (x > -1000)){
      System.out.print("El numero tiene 3 dígitos.");
    }
    
    if ((x >= 1000) && (x < 10000) || (x <= -1000) && (x > -10000)){
      System.out.print("El numero tiene 4 dígitos.");
    }
    
    if ((x >= 10000) && (x < 100000) || (x <= -10000) && (x > -100000)){
      System.out.print("El numero tiene 5 dígitos.");
    }
  }  
}
