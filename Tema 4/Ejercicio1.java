/*
 * Tema 4
 * 
 * Ejercicio 1
 * 
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 * 
 */

import java.util.Scanner;

public class Ejercicio1 {
  public static void main (String[]args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca dia de la semana : ");
    String dia = s.nextLine().toLowerCase();
    
    switch (dia) {
      case "lunes":
        System.out.print("Programación");
        break;
      
      case "martes":
        System.out.print("Sistemas Informáticos");
        break;
        
      case "miércoles":
        System.out.print("Programación");
        break;
        
      case "jueves":
        System.out.print("Lenguaje de Marcas");
        break;
      
      case "viernes":
        System.out.print("Sistemas Informáticos");
        break;
    }
  }

}
