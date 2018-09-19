/*
 * Tema 3
 * 
 * Ejercicio 12
 * 
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay
 * que tener en cuenta que la nota del primer examen cuenta el 40% y la del
 * segundo examen un 60%.
 *
 * Ejemplo 1:
 * Introduce la nota del primer examen: 7
 * ¿Qué nota quieres sacar en el trimestre? 8.5
 * Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo 
 * examen.
 * 
 * Ejemplo 2:
 * Introduce la nota del primer examen: 8
 * ¿Qué nota quieres sacar en el trimestre? 7
 * Para tener un 7 en el trimestre necesitas sacar un 6.33 en el segundo examen.
 */
package tema.pkg3;

import java.util.Scanner;

public class Ejercicio12 {
  
  public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la nota del examen: ");
    double examen = s.nextDouble();
    
    System.out.print("¿Qué nota quieres sacar en el trimestre?: ");
    double trimestre = s.nextDouble();
    
    double porcentaje = (examen * 40 / 100);
    
    double calculoNota = (trimestre - porcentaje);
    
    double resultado = (calculoNota *100 / 60);
    
    System.out.printf("%s %2.1f %s %2.2f %s ", "Para tener un", trimestre, 
            "necesitas sacar un" , resultado, " en el segundo examen." );
    
   
    
   
  }
  
}
