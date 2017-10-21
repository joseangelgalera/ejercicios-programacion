/*
 * Tema 5
 * 
 * Ejercicio 7
 * 
 * Realiza el control de acceso a una caja fuerte. La combinación será un
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 * 
 */

import java.util.Scanner;

public class Ejercicio7 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("¿Puedes adivinar la combinación?");
    System.out.println("Introduzca los 4 numeros de la combinación : ");
    int combinacion = s.nextInt();
      
    if (combinacion == 8357) {
      System.out.print("La caja fuerte se ha abierto satisfactoriamente");
    }
    
    int i = 0;
    int contador = 4;
    
    while (combinacion != 8357) {
      contador --;
      if (contador == 0) {
        System.out.print("Lo siento, esa no es la combinación");
      }
    }
      System.out.println("Intentelo de nuevo");
      
    
      
    
    
  }
}
