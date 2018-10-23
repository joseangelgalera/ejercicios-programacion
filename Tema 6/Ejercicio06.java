/*
 * Tema 6
 *
 * Ejercicio 6
 *
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario
 * debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
 * fallido, el programa dirá cuántas oportunidades quedan y si el número 
 * introducido es menor o mayor que el número secreto.
 */
package tema.pkg6;

import java.util.Scanner;

public class Ejercicio06 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int oportunidades = 4;
    int numero = (int) (Math.random() * 100 + 1);

    System.out.println("Adivina el número secreto entre el 0 y el 100");
    System.out.println("┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉");
    System.out.print("Introduce el número: ");
    int x = s.nextInt();

    while ((x <= 0) || (x >= 100)) {
      System.out.print("Solo puedes introducir un número mayor que 0 o menor "
              + "que 100: ");
      x = s.nextInt();
    }

    while ((oportunidades > 1) && (oportunidades <= 4)) {

      if (x == numero) {
        System.out.print("Lo has adivinado.");
        oportunidades = 0;
      } else {
        System.out.print("Te quedan " + oportunidades + " oportunidades,");

        if (x > numero) {
          System.out.print(" el número introducido es mayor que el número "
                  + "secreto: ");
        }

        if (x < numero) {
          System.out.print(" el número introducido es menor que el número "
                  + "secreto: ");
        }
        oportunidades--;
        x = s.nextInt();

        while ((x <= 0) || (x >= 100)) {
          System.out.print("Solo puedes introducir un número mayor que 0 o "
                  + "menor que 100: ");
          x = s.nextInt();
        }

        while ((oportunidades > 0) && (oportunidades <= 1)) {

          if (x == numero) {
            System.out.print("Lo has adivinado.");
            oportunidades = 0;
          } else {
            System.out.print("Te queda " + oportunidades
                    + " oportunidad,");
            if (x > numero) {
              System.out.print(" el número introducido es mayor que el número "
                      + "secreto: ");
            }

            if (x < numero) {
              System.out.print(" el número introducido es menor que el número "
                      + "secreto: ");
            }
            oportunidades--;
            x = s.nextInt();
            while ((x <= 0) || (x >= 100)) {
              System.out.print("Solo puedes introducir un número mayor que 0 o "
                      + "menor que 100: ");
              x = s.nextInt();
            }
            if (oportunidades == 0) {
              System.out.print("Lo siento no lo has adivinado era el número "
                      + numero + ".");
              System.out.println();
            }
          }
        }
      }
    }
  }
}
