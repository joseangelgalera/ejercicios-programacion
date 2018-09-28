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
 * Ejemplo 1:
 * Nota del primer control: 7
 * Nota del segundo control: 10
 * Tu nota de Programación es 8.5
 * Ejemplo 2:
 * Nota del primer control: 6
 * Nota del segundo control: 3
 * ¿Cuál ha sido el resultado de la recuperación? (apto/no apto): apto
 * Tu nota de Programación es 5
 */
package tema.pkg4;
import java.util.Scanner;

public class Ejercicio21 {
  public static void main (String[]args){
    Scanner s = new Scanner(System.in);
    
    System.out.println("¿Cual es tu nota de programación");
    
    System.out.print("Introduce la nota del primer examen: ");
    double primera = s.nextDouble();
    
    System.out.print("Introduce la nota del segundo examen: ");
    double segunda = s.nextDouble();
    
    double notaFinal = (primera + segunda) / 2;
    
    if (notaFinal >= 5 ){
      System.out.printf("%-32s %.1f.", "Tu nota final de programción es:"
              , notaFinal);
    } else {
      System.out.print("¿Cuál ha sido el resultado de la recuperación? "
              + "(apto/no apto): ");
      String recu = s.next();
      
      if (recu.equals("apto") || (recu.equals("Apto"))){
        System.out.print("Tu nota final de programación es: 5.");
      } else {
        System.out.printf("%-32s %.1f.", "Tu nota final de programción es:"
              , notaFinal);
      }
    }
  }
}
