/*
 * Tema 5
 * 
 * Ejercicio 15
 * 
 * Escribe un programa que dados dos números, uno real (base) y un entero
 * positivo (exponente), saque por pantalla todas las potencias con base el
 * numero dado y exponentes entre uno y el exponente introducido. No se deben
 * utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 
 * 5, se deberán mostrar 2 1 , 2 2 , 2 3 , 2 4 y 2 5 .
 * 
 */

import java.util.Scanner;

public class Ejercicio15 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la base : ");
    double base = s.nextDouble();
    
    System.out.print("Introduzca el exponente : ");
    double exp = s.nextDouble();
    
    double potencia;
    int exponente;
        
    for (int i = 1; i <= exp; i++) {
        
      potencia = 1;
      exponente = i;
      
      for (int j = 0; j < exponente; j++) {
        potencia *= base;
      }
      
      System.out.println("La portencia " + base + "^" + i + " es igual a " + 
      potencia);
    }

  }
}

