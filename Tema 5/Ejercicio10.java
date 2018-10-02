/*
 * Tema 5
 * 
 * Ejercicio 10
 *
 * Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 */
package tema.pkg5;
import java.util.Scanner;

public class Ejercicio10 {
  public static void main (String[]args){
    Scanner s = new Scanner(System.in);
    
   
    int x = 0;
    int suma = 0;
    int contador = 0;
    
    while (x > -1) {
      System.out.print("Introduzca números para proceder ha hacerles la media"
            + "(escriba un numero negativo para terminar): ");
       x = s.nextInt();
       if (x > -1) {
         contador++;
         suma += x;
       }
    }
    
    System.out.print("laa media de los números introducidos es: " 
            + (suma / contador));
  }
}
