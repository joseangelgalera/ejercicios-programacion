/*
 * Tema 5
 * 
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado.
 * 
 */

import java.util.Scanner;

public class Ejercicio9 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    int digito = 1, i;
    
    System.out.print("Introduzca un dígito : ");
    int numero = s.nextInt();
    
    i = numero;
    
    while(i > 10) {
      i /= 10;
      digito ++;
    }
    
    System.out.print("El numero " + numero + " tiene " + digito + " digitos.");
      
  }
}

