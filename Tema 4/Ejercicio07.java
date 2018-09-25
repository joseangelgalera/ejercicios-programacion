/*
 * Tema 4 
 * 
 * Ejercicio 7
 *
 * Realiza un programa que calcule la media de tres notas.
 *
 */
package tema.pkg4;
import java.util.Scanner;

public class Ejercicio07 {
  public static void main (String [] args){
    Scanner s = new Scanner(System.in);
    
    System.out.println("Calculadora de medias");
    
    System.out.print("Introduce la primera nota: ");
    int primera = s.nextInt();
    
    while (primera > 10){
      System.out.print("Introduce una nota correcta: ");
      primera = s.nextInt();
    }
    
    System.out.print("Introduce la segunda nota: ");
    int segunda = s.nextInt();
    
    while (segunda > 10){
      System.out.print("Introduce una nota correcta: ");
      segunda = s.nextInt();
    }
     
    System.out.print("Introduce la tercera nota: ");
    int tercera = s.nextInt();
    
    while (tercera > 10){
      System.out.print("Introduce una nota correcta: ");
      tercera = s.nextInt();
    }
    
    int media = (primera + segunda + tercera) / 3;
    
    System.out.print("Tu media este año es " + media + ".");
  }
  
}
