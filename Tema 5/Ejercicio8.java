/*
 * Tema 5
 * 
 * Ejercicio 8
 * 
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 */

import java.util.Scanner;

public class Ejercicio8 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca el número del que desea mostrar la tabla : ");
    int x = s.nextInt();
    
    System.out.println("Tabla del " + x);
    
    for(int numero = 0; numero <= 10; numero++) {
      System.out.println(x + " x " + numero + " = " + x * numero);
    }
  }
}

