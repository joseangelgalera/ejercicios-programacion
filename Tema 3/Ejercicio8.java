/*
 * Tema 3
 * 
 * Ejercicio 8
 * 
 * Escribe un programa que calcule el salario semanal de un empleado en base
 * a las horas trabajadas, a razón de 12 euros la hora.
 * 
 */


public class Ejercicio8 {
  public static void main (String args[]) {
    
    String linea;
    
    System.out.print("Introduce las horas : ");
    linea = System.console().readLine();
    double horasTrabajadas = Double.parseDouble( linea );
    
    System.out.printf("Esta semana su sueldo es de %1.2f", (horasTrabajadas * 12));
  }
}

