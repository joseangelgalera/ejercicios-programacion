/*
 * Tema 4
 * 
 * Ejercicio 13
 *
 * Escribe un programa que ordene tres números enteros introducidos por
 * teclado.
 */
package tema.pkg4;
import java.util.Scanner;

public class Ejercicio13 {
  public static void main (String[]args){
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce el primer número: ");
    int x = s.nextInt();
    
    System.out.print("Introduce el segundo número: ");
    int y = s.nextInt();
    
    System.out.print("Introduce el tercer número: ");
    int z = s.nextInt();
    
    int primero = 0;
    
    int segundo = 0;
    
    int tercero = 0;
       
    if ((x < y) && (x < z)){
      primero = x;
    }
    
    if (((x < y) && (x > z)) || ((x < z) && (x > y))){
      segundo = x;
    }
    
    if ((x > y) && (x > z)){
      tercero = x;
    }
    
    if ((y < x) && (y < z)){
      primero = y;
    }
    
    if (((y < x) && (y > z)) || ((y < z) && (y > x))){
      segundo = y;
    }
    
    if ((y > x) && (y > z)){
      tercero = y;
    }
    
    if ((z < x) && (z < y)){
      primero = z;
    }
    
    if (((z < x) && (z > y)) || ((z < y) && (z > x))){
      segundo = z;
    }
    
    if ((z > x) && (z > y)){
      tercero = z;
    }
    
    String ordenados = (primero + "," + segundo + "," + tercero );
    
    System.out.print("Los numero ordenados quedan asi " + ordenados + ".");
  }
}
