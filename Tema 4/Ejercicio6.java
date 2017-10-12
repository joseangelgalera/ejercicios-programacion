/*
 * Tema 4
 * 
 * Ejercicio 6
 * 
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
 * una altura h. 
 * 
 */

import java.util.Scanner;

public class Ejercicio6 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Tiempo de caida de un objeto segun su altura.");
    System.out.print("Introduzca la altura : ");
    double h = s.nextDouble();
    
    double g = 9.81;
    double sg = (Math.sqrt(2 * h / g));
    
    System.out.printf("Tardara %.2f s en caer de una altura de %.2f m.", sg, h);
  }
}

