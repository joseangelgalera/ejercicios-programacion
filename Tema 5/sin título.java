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
    
    System.out.ptint("Introduzca un dígito : ");
    int numero = s.next.Int();
    
    int digito = 1, i, numero,
    i = numero;
    
    while(i > 10) {
      i /= 10;
      digito ++;
    }
    
    System.out.ptint("El numero " + numero + " tiene " + digito + " digitos.");
      
  }
}

