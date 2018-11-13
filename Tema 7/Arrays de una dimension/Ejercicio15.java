/*
 * Tema 7
 *
 * Ejercicio 15
 *
 * Un restaurante nos ha encargado una aplicación para colocar a los clientes en
 * sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
 * (mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
 * el programa no está preparado para colocar a grupos mayores a 4, por tanto,
 * si un cliente dice por ejemplo que son un grupo de 6, el programa dará el
 * mensaje “Lo siento, no admitimos grupos de 6, haga grupos de 4
 * personas como máximo e intente de nuevo”. Para el grupo que llega,
 * se busca siempre la primera mesa libre (con 0 personas). Si no quedan mesas
 * libres, se busca donde haya un hueco para todo el grupo, por ejemplo si el
 * grupo es de dos personas, se podrá colocar donde haya una o dos personas.
 * Inicialmente, las mesas se cargan con valores aleatorios entre 0 y 4. Cada
 * vez que se sientan nuevos clientes se debe mostrar el estado de las mesas.
 * Los grupos no se pueden romper aunque haya huecos sueltos suficientes. El
 * funcionamiento del programa se ilustra a continuación:
 */
package tema.pkg7;

import java.util.Scanner;

public class Ejercicio15 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] ocupacion = new int[10];
    int personas = 0;

    for (int i = 0; i < ocupacion.length; i++) {
      ocupacion[i] = (int) (Math.random() * 5);
    }

    do {

      System.out.println("\n┌──────────┬─────┬─────┬─────┬─"
              + "────┬─────┬─────┬─────┬─────┬─────┬───"
              + "──┐");
      System.out.print("│ Mesa nª  ");
      for (int i = 0; i < ocupacion.length; i++) {
        System.out.printf("│%4d ", i + 1);
      }
      System.out.println("│\n├──────────┼─────┼─────┼─────┼"
              + "─────┼─────┼─────┼─────┼─────┼─────┼──"
              + "───┤");
      System.out.print("│ Ocupación");
      for (int i = 0; i < ocupacion.length; i++) {
        System.out.printf("│%4d ", ocupacion[i]);
      }
      System.out.println("│\n└──────────┴─────┴─────┴─────┴"
              + "─────┴─────┴─────┴─────┴─────┴─────┴──"
              + "───┘");
      System.out.println();

      System.out.print("¿Cuántos son? (Introduzca -1 para salir del "
              + "programa): ");
      personas = s.nextInt();

      if (personas > 4) {
        System.out.println("Lo siento, no admitimos grupos de 6, haga grupos "
                + "de 4 personas como máximo e intente de nuevo");
      } else {
        boolean hayMesa = false;
        int mesaLibre = 0;
        for (int i = 9; i >= 0; i--) {
          if (ocupacion[i] == 0) {
            mesaLibre = i;
            hayMesa = true;
          }
        }

        if (hayMesa) {
          ocupacion[mesaLibre] = personas;
          System.out.println("Por favor, siéntense en la mesa número " + 
                  (mesaLibre + 1) + ".");
        } else {
          boolean hayHueco = false;
          int huecoMesa = 0;
          for (int i = 9; i >= 0; i--) {
            if (personas <= (4 - ocupacion[i])) {
              huecoMesa = i;
              hayHueco = true;
            }
          }

          if (hayHueco) {
            ocupacion[huecoMesa] += personas;
            System.out.print("Tendrán que compartir mesa. Por favor, "
                    + "siéntense en la mesa número " + (huecoMesa + 1) + ".");
          } else {
            System.out.println("Lo siento, en estos momentos no queda sitio.");
          }
        }
      }
    } while (personas != -1);
  }

}
