/*
 * Tema 5
 *
 * Ejercicio 27
 *
 * Realiza un programa que pida primero un número y a continuación un dígito.
 * El programa nos debe dar la posición (o posiciones) contando de izquierda a
 * derecha que ocupa ese dígito en el número introducido.
 */
package tema.pkg5;

import java.util.Scanner;

public class Ejercicio26 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);


    System.out.print("Introduzca un número: ");

    long numero = s.nextLong();
    long temp = 0;
    int longitud = 0;
    int posicion = 1;
    int veces = 0;
    boolean unicaVez = false;

    System.out.print("Introduzca el dígito a buscar: ");
    int digito = s.nextInt();

    System.out.print("En el ńumero " + numero + " el dígito " 
            + digito);

    while (numero > 0) {
      if (digito == (numero % 10)) {
        veces++;
      }
      temp = (temp * 10) + (numero % 10);
      numero = numero / 10;
      longitud++;
    }

    if (veces == 0) {
      System.out.print(" no aparece ninguna vez.");
    } else {
      if (veces == 1) {
        System.out.print(" aparece en la posición ");
      } else {
        System.out.print(" aparece en las posiciones ");
        unicaVez = false;
      }
      while (temp > 0) {
        if ((digito == (temp % 10)) && (veces >= 1)) {
          System.out.print(posicion);
          if ((veces == 1) && (!unicaVez)) {
            System.out.print("");
          } else if (veces > 1) {
            System.out.print("");
          }
          veces--;
        } else {
          temp = temp / 10;
        }
        posicion++;
      }
    }

    System.out.println(".");
  }
}
