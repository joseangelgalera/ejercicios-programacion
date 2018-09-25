/*
 * Tema 4
 * 
 * Ejercicio 6 
 *
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
 * una altura h.
 */
package tema.pkg4;
import java.util.Scanner;

public class Ejercicio06 {
  public static void main (String [] args){
    Scanner s = new Scanner(System.in);
    
    System.out.println("Cálculo del tiempo en caida libre");
    System.out.print("Introduzca la altura h: ");
    double h = s.nextInt();
    
    double g = 9.81;
    
    System.out.print("El tiempo que tardara en caer el objeto es : " 
            + Math.sqrt((2 * h) / g) + "s.");
    
  }
}
