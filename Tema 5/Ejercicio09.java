/*
 * Tema 5
 *
 * Ejercicio 9
 *
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado. Este ejercicio es equivalente a otro realizado anteriormente, 
 * con la salvedad de que el anterior estaba limitado a números de 5 dígitos
 * como máximo. En esta ocasión, hay que realizar el ejercicio utilizando 
 * bucles; de esta manera, la única limitación en el número de dígitos la
 * establece el tipo de dato que se utilice (int o long).
 */
package tema.pkg5;
import java.util.Scanner;

public class Ejercicio09 {
  public static void main (String[]args) {
    Scanner s = new Scanner(System.in);
    int cuenta = 1;
    int i;
    
    System.out.print("Introduzca un número: ");
    int x = s.nextInt();
    
    i = x;
    
    while (i > 10) {
      i /= 10;
      cuenta ++;
    }
    
    if (cuenta == 1) {
      System.out.print("El numero " + x + " tiene " + cuenta + " digito.");
    } else {
      System.out.print("El numero " + x + " tiene " + cuenta + " digitos.");
    }
    
  }
}
