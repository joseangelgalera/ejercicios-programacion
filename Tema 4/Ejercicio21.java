/*
 * Tema 4
 * 
 * Ejercicio 21
 * 
 * Calcula la nota de un trimestre de la asignatura Programación. El programa
 * pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
 * Si la media de los dos controles da un número mayor o igual a 5, el alumno
 * está aprobado y se mostrará la media. En caso de que la media sea un número
 * menor que 5, el alumno habrá tenido que hacer el examen de recuperación
 * que se califica como apto o no apto, por tanto se debe preguntar al usuario
 * ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el
 * resultado de la recuperación es apto, la nota será un 5; en caso contrario,
 * se mantiene la nota media anterior.
 * 
 */

import java.util.Scanner;

public class Ejercicio21 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Calcula tu nota trimestral de Programación");
    
    System.out.print("Introduce la nota del primer examen : ");
    double notaP = s.nextDouble();
    
    System.out.print("Introduce la nota del segundo examen : ");
    double notaS = s.nextDouble();
    
    double notaFinal = ((notaP + notaS) / 2);
    
    if (notaFinal < 5) {
      System.out.print("¿Cuál ha sido el resultado de la recuperación?");
      System.out.print(" (apto/no apto) : ");
      String recu = s.next();
      if (recu.equals("apto")) {
        notaFinal = 5;
      }
    }
      
    System.out.print("Tu nota trimestral de Programación es " + notaFinal);
  }
}

