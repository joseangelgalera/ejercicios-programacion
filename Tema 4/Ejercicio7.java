/*
 * Tema 4
 * 
 * Ejercicio7
 * 
 * Realiza un programa que calcule la media de tres notas.
 * 
 */

import java.util.Scanner;

public class Ejercicio7 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Cálculo de media.");
    System.out.print("Introduzca primera nota : ");
    double primera = s.nextDouble();
    
    System.out.print("Introduzca segunda nota : ");
    double segunda = s.nextDouble();
    
    System.out.print("Introduzca tercera nota : ");
    double tercera = s.nextDouble();
    
    double nota = ((primera + segunda + tercera) / 3);
    
    System.out.printf("Su media es de %.2f", nota);
  }
}

