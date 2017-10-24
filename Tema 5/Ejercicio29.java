/*
 * Tema 5
 * 
 * Ejercicio 29
 * 
 * Escribe un programa que muestre por pantalla todos los números
 * entero positivos menores a uno leído por teclado que no sean
 * divisibles entre otro también leído de igual forma.
 * 
 */

import java.util.Scanner;

public class Ejercicio29 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número entero positivo : ");
    int numeroGrande = s.nextInt();

    System.out.print("Introduzca otro número : ");
    int numeroPequeno = s.nextInt();

    System.out.print("Los números enteros positivos menores que " 
    + numeroGrande );
    System.out.println(" que no son divisibles entre " 
    + numeroPequeno + " son los siguientes:");

    int cuenta = 0;
    int suma = 0;

    for (int i = 1; i < numeroGrande; i++) {
      if ((i % numeroPequeno) != 0) {
        System.out.print(i + " ");
      }
    }
  }
}
  


