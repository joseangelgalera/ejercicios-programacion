/*
 * Tema 5
 * 
 * Ejercicio 16
 * 
 * Escribe un programa que diga si un número introducido por teclado es o no
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
 * unidad.
 * 
 */

import java.util.Scanner;

public class Ejercicio16 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("¿Es primo el numero introducido?");
    System.out.print("Introduzca un número entero : ");
    int numero = s.nextInt();

    boolean Primo = true;
    
    for (int i = 2; i < numero; i++) {
      if ((numero % i) == 0) {
        Primo = false;
      }
    }
        
    if (Primo) {
      System.out.println("El número es primo.");
    } else {
      System.out.println("El número no es primo.");
    }
  }
}

