/*
 * Tema 5
 * 
 * Ejercicio 10
 * 
 * Escribe un programa que calcule la media de un conjunto de números 
 * positivos introducidos por teclado. A priori, el programa no sabe 
 * cuántos números se introducirán. El usuario indicará que ha terminado
 * de introducir los datos cuando meta un número negativo.
 * 
 */
 
 import java.util.Scanner;
 
public class Ejercicio10 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca números positivos (Para para introduzca uno"); 
    System.out.println(" negativo).");
    
    double contador = 0;
    double numero= 0;
    double suma = 0;
    
    while (numero >= 0) {
       numero = s.nextInt();
      contador++;
      suma += numero;
    }
    
    System.out.print("La media total es " + (suma - numero)/ (contador - 1));
    
  }
}

