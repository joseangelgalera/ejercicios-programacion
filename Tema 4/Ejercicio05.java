/*
 * Tema 4
 *
 * Ejercicio 5
 *
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+
 * b = 0).
 */
package tema.pkg4;
import java.util.Scanner;

public class Ejercicio05 {
  public static void main(String [] args){
    Scanner s = new Scanner(System.in);
    
    System.out.println("Calculadora de ecucaciones de primer grado ax + b = 0");
    System.out.print("Introduce a: ");
    int a = s.nextInt();
            
    System.out.print("Introduce b: ");
    int b = s.nextInt();
    
    double x = ((double)-b/a);
    
    System.out.print("x = " + x);
  
}
  
}
