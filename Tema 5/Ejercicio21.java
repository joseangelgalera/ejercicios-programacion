/*
 * Tema 5
 *
 * Ejercicio 21
 * 
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
 * numero negativo y nos diga cuantos números se han introducido, la media de
 * los impares y el mayor de los pares. El número negativo sólo se utiliza para
 * indicar el final de la introducción de datos pero no se incluye en el 
 * cómputo.
 */
package tema.pkg5;

import java.util.Scanner;

public class Ejercicio21 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca números positivos (Para parar introduzca uno "
            + "negativo): ");

    int contador = 0;
    int numero = 0;
    int maximoPar = 0;
    int sumaImpares = 0;
    int numerosImpares = 0;

    while (numero >= 0) {
      numero = s.nextInt();
      if (numero >= 0) {
        contador++;
      }
      if (((numero % 2) == 0) && (numero > maximoPar)) {
        maximoPar = numero;
      } else {

        if ((numero % 2) == 1) {
          sumaImpares += numero;
          numerosImpares++;
        }
      }
    }

    System.out.println("Ha introducido " + contador + " números.");
    System.out.println("La media de los numeros impares es "
            + sumaImpares / numerosImpares + ".");
    System.out.print("El maximo par es " + maximoPar + ".");
  }
}
