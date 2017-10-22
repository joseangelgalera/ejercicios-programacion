/*
 * Tema 5
 * 
 * Ejercicio 20
 * 
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide 
 * hueca.
 * 
 */

import java.util.Scanner;

public class Ejercicio20 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int alturaInt = s.nextInt();

    System.out.print("Introduzca el carácter de relleno: ");
    String relleno = s.next();
    
    int altura = 1;
    int i = 0;
    int espaciosDeAfuera = alturaInt - 1;
    int espaciosDeDentro = 0;
    
    while (altura < alturaInt) {
      
      for (i = 1; i <= espaciosDeAfuera; i++) {
        System.out.print(" ");
      }
      
      System.out.print(relleno);
      for (i = 1; i < espaciosDeDentro; i++) {
        System.out.print(" ");
      }
      
      if (altura>1) {
        System.out.print(relleno);
      }
      
      System.out.println();
      altura++;
      espaciosDeAfuera--;
      espaciosDeDentro += 2;
    } 
    
    for (i = 1; i < altura*2; i++) {
      System.out.print(relleno);
    }
  }
}

