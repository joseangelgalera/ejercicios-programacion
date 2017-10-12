/*
 * Tema 4
 * 
 * Ejercicio8
 * 
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 * 
 */

import java.util.Scanner;

public class Ejercicio8 {
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
    
    System.out.printf("Su media es de %.2f\n", nota);
    
    if (nota < 5) {
      System.out.print("Insuficiente");
    }
    
    if (nota == 5) {
      System.out.print("Suficiente");
    }
    
    if ((nota > 5) && (nota <= 7)) {
      System.out.print("Bien");
    }
    
    if ((nota > 7) && (nota <= 9)) {
      System.out.print("Notable");
    }
    if (nota == 10) {
      System.out.print("Sobresaliente");
    }
  }
}
