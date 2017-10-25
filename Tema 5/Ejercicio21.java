/*
 * Tema 5
 * 
 * Ejercicio 21
 * 
 * Realiza un programa que vaya pidiendo números hasta que se introduzca
 * un numero negativo y nos diga cuantos números se han introducido, la 
 * media de los impares y el mayor de los pares. El número negativo sólo
 * se utiliza para indicar el final de la introducción de datos pero no 
 * se incluye en el cómputo.
 * 
 */

import java.util.Scanner;

public class Ejercicio21 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca números positivos (Para para "); 
    System.out.println("introduzca uno negativo).");
    
    double contador = 0;
    double numero = 0;
    double maximoPar = 0;
    double sumaImpares = 0;
    double numerosImpares = 0;
    
    
    while (numero >= 0) {
      numero = s.nextInt();
      if (numero >= 0) {
        contador++;
      }
      if (((numero % 2) == 0) && (numero > maximoPar)) {
        maximoPar = numero;
      } else { 
        
        if ((numero % 2) == 1 ) {
          sumaImpares += numero;
          numerosImpares++;
        }
      } 
    }
     
     System.out.println("Ha introducido " + contador + " numeros");
     System.out.println("La media de los numeros impares es " 
     + sumaImpares / numerosImpares);
     System.out.print("El maximo par es " + maximoPar);
  }
}

