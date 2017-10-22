/*
 * Tema 5
 * 
 * Ejercicio 18
 * 
 * Escribe un programa que obtenga los números enteros comprendidos entre
 * dos números introducidos por teclado y validados como distintos, el programa
 * debe empezar por el menor de los enteros introducidos e ir incrementando de
 * 7 en 7.
 * 
 */
 
import java.util.Scanner;

public class Ejercicio18 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    int primero;
    int segundo;
    
    do {
      System.out.print("Introduzca un número entero: ");
      primero = s.nextInt();
      System.out.print("Introduzca otro número entero distinto : ");
      segundo = s.nextInt();
      
      if(primero == segundo) {
        System.out.println("Los números introducidos deben ser distintos.");
      }
    } while (primero == segundo);
    
    if (primero > segundo) {
      int aux = primero;
      primero = segundo;
      segundo = aux;
    }
    
    for(int i = primero; i <= segundo; i += 7) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}

  


