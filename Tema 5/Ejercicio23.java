/*
 * Ejercicio23.java
 * 
 * Ejercicio 23
 * 
 * Escribe un programa que permita ir introduciendo una serie 
 * indeterminada de números mientras su suma no supere el valor 10000.
 * Cuando esto último ocurra, se debe mostrar el total acumulado, el
 * contador de los números introducidos y la media.
 * 
 */

import java.util.Scanner;

public class Ejercicio23 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca los números");
    System.out.print("El programa terminará cuando la suma de los");
    System.out.println(" números sea mayor que 10000.");
    
    int numeroInt;
    int suma = 0;
    int numeroDeElementos = 0;
    
    do {
      numeroInt = s.nextInt();
      suma += numeroInt;
      numeroDeElementos++;
    } while (suma <= 10000);
    
    System.out.print("Ha introducido un total");
    System.out.println(" de " + numeroDeElementos + " número/os.");
    System.out.println("La suma total es " + suma + ".");
    System.out.println("La media es " + suma / numeroDeElementos + ".");
  }
}

