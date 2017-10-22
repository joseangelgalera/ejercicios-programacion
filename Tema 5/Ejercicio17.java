/*
 * Tema 5
 * 
 * Ejercicio 17
 * 
 * Realiza un programa que sume los 100 números siguientes a un número entero
 * y positivo introducido por teclado. Se debe comprobar que el dato introducido
 * es correcto (que es un número positivo).
 * 
 */

import java.util.Scanner;

public class Ejercicio17 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    int numero = 0;
    
    do {
      System.out.print("Introduzca un número entero y positivo : ");
      numero = s.nextInt();
      
      if(numero < 0) {
        System.out.print("El número introducido no es un número");
        System.out.println(" positivo intentelo de nuevo.");
      }
    } while (numero < 0);
    
    int suma = 0;
    
    for(int i = numero; i < numero + 100; i++) {
      suma += i;
    }

    System.out.println("La suma de los 100 números siguientes a " 
    + numero + " es " + suma);
  }
}



