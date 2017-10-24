/*
 * Tema 5
 * 
 * Ejercicio 27
 * 
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3
 * que hay entre 1 y un número leído por teclado.
 * 
 */

import java.util.Scanner;

public class Ejercicio27 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número entero mayor que 1: ");
    int numeroInt = s.nextInt();

    int cuenta = 0;
    int suma = 0;
    
    for (int i = 1; i < numeroInt; i++) {
      if ((i % 3) == 0) {
        System.out.print(i + " ");
        cuenta++;
        suma += i;
      }
    }
        
    System.out.print("\nDesde 1 hasta " + numeroInt + " hay " + cuenta);
    System.out.println(" múltiplos de 3 y suman " + suma);
  }
}



