/*
 * Tema 4
 * 
 * Ejercicio 11
 *
 * Escribe un programa que dada una hora determinada (horas y minutos),
 * calcule los segundos que faltan para llegar a la medianoche.
 */
package tema.pkg4;
import java.util.Scanner;

public class Ejercicio11 {
  public static void main (String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("¿Cuanto queda para la media noche?");
    
    System.out.print("Introduce la hora: ");
    int hora = s.nextInt();
    
    System.out.print("Introduce los minutos: ");
    int minutos = s.nextInt();
    
    int horaSeg = (hora * 3600);
    
    int minSeg = (minutos * 60); 
    
    int totalSeg = (horaSeg + minSeg);
    
    int medianoche = (86400 - totalSeg);
    
    System.out.print("Quedan " + medianoche + " segundos para la medianoche.");
  }
  
}
