/*
 * Tema 4
 * 
 * Ejercicio 4
 * 
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 * las horas extras. Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
 * euros la hora.
 * 
 */

import java.util.Scanner;

public class Ejercicio4 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce las horas : ");
    int horasTrabajadas = s.nextInt();
    
    if (horasTrabajadas <= 40) {
      System.out.printf("Esta semana su sueldo es de %d€.", +
      (horasTrabajadas * 12));
    }
      
    if (horasTrabajadas >= 41) {
      System.out.printf("Esta semana su sueldo es de %d€.", +
      (horasTrabajadas * 16));
    }
  }
}

