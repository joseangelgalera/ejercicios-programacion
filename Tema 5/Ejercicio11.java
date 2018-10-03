/*
 * Tema 5
 * 
 * Ejercicio 11
 * 
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
 */
package tema.pkg5;

import java.util.Scanner;

public class Ejercicio11 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca un número entero : ");
    int x = s.nextInt();
    int i = x;
    
    System.out.println("Número    Cuadrado      Cubo");
    System.out.println("------------------------------");
    
    while (i < x + 5) {
      System.out.printf(" %2d      %5d        %5d\n", i, i * i, i * i * i);
      i++;
    }
  }
}
