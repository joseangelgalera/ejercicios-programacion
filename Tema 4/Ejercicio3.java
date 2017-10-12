/*
 * Tema 4
 * 
 * Ejercicio 3
 * 
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspon-
 * diente nombre del día de la semana.
 * 
 */

import java.util.Scanner;

public class Ejercicio3 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Días de la semana");
    
    System.out.print("Escriba el número del día : ");
    int numero = s.nextInt();
    
    switch (numero) {
      case 1:
        System.out.print("Lunes");
        break;
    
      case 2:
        System.out.print("Martes");
        break;
      
      case 3:
        System.out.print("Miércoles");
        break;
      
      case 4:
        System.out.print("Jueves");
        break;
      
      case 5:
        System.out.print("Viernes");
        break;
      
      case 6:
        System.out.print("Sabado");
        break;
      
      case 7:
        System.out.print("Domingo");
        break;
      }
  }
}

