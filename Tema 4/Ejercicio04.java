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
 */
package tema.pkg4;
import java.util.Scanner;

public class Ejercicio04 {
  public static void main(String [] args){
    Scanner s = new Scanner(System.in);
    
    System.out.println("Calculadora de salario semanal");
    System.out.print("Por favor, introduzca el número de horas trabajadas "
            + "durante la semana: ");
    int horas = s.nextInt();
    
    if (horas <= 40){
      System.out.print("El sueldo semanal que le corresponde es de " 
              + (horas * 12) + " euros.");
    }
    
    if (horas > 40){
      System.out.print("El sueldo semanal que le corresponde es de " 
              + ((40 * 12) + (horas - 40) * 16) + " euros.");
    } 
  }
}
