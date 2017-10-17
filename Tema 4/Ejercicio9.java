/*
 * Tema 4
 * 
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo
 * ax² + bx + c = 0).
 * 
 */

import java.util.Scanner;

public class Ejercicio9 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
      
    System.out.println("Ecuación de segundo grado.");
    
    System.out.print("Introduzca la a : ");
    double a = s.nextDouble();
    
    System.out.print("Introduzca la b : ");
    double b = s.nextDouble();
    
    System.out.print("Introduzca la c : ");
    double c = s.nextDouble();
    
    double raiz = ((b * b) - 4 * a * c);
    double x1 = (-b + (Math.sqrt(raiz) / 2 * a));
    double x2 = (-b - (Math.sqrt(raiz) / 2 * a));
    
    if ((a != 0) && (b != 0) && (c != 0)) {
      if(raiz < 0){
        System.out.print("Las soluciones son imaginarias.");
      } else {
          System.out.printf("Las soluciones son x = %.2f y x = %.2f.", x1, x2);
        }
    
    }
    
    if ((a == 0) && (b != 0) && (c != 0)) {
      System.out.printf("La solución es x = %.2f.", (-c / b));
    }
    
    if ((a != 0) && (b == 0) && (c != 0)) {
      System.out.printf("La solución es x = %.2f y x = %.2f.", 
      + Math.sqrt(c / a), (-Math.sqrt(c / a)));
    }
    
    if ((a != 0) && (b != 0) && (c == 0)) {
      System.out.printf("La solución es x = 0 y x = %.2f.", (-b / a));
    }
    
    if ((a != 0) && (b == 0) && (c == 0)) {
      System.out.printf("No tiene solución");
    }
    
    if ((a == 0) && (b != 0) && (c == 0)) {
      System.out.print("No tiene solucíon");
    }
    
    if ((a == 0) && (b == 0) && (c != 0)) {
      System.out.print("No tiene solución.");
    }
    
    if ((a == 0) && (b == 0) && (c == 0)) {
      System.out.print("Tiene soluciones infinitas.");
    }
  }
}

