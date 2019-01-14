/*
 * Tema 9
 * 
 * Ejercicio 7
 *
 * Queremos gestionar la venta de entradas (no numeradas) de Expocoches
 * Campanillas que tiene 3 zonas, la sala principal con 1000 entradas 
 * disponibles, la zona de compra-venta con 200 entradas disponibles y la zona 
 * vip con 25 entradas disponibles. Hay que controlar que existen entradas antes 
 * de venderlas.
 */
package ejercicio07;

import java.util.Scanner;

public class PruebaEntradas {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int aux;
    int aux2;
    Zona principal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona vip = new Zona(25);

    do {
      System.out.println("VENTA DE ENTRADAS");
      System.out.println("=================");
      System.out.println("1. Mostrar número de entradas libres ");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");
      System.out.print("Elige una opción (1-3): ");

      int opcion = s.nextInt();
      aux = opcion;

      System.out.println();
      System.out.println();

      switch (opcion) {

        case 1:
          System.out.println("Estas son las entradas disponibles:");
          System.out.println("Zona Principal:    "
                  + principal.getEntradasPorVender());
          System.out.println("Zona Compra-Venta: "
                  + compraVenta.getEntradasPorVender());
          System.out.println("Zona VIP:          "
                  + vip.getEntradasPorVender());
          break;
        case 2:
          System.out.println("1. Zona Principal");
          System.out.println("2. Zona Compra-Venta");
          System.out.println("3. Zona VIP");
          System.out.print("¿Para qué zona?: ");

          int zonaElegida = s.nextInt();
          aux2 = zonaElegida;

          System.out.print("¿Cuántas entradas quieres?: ");
          int numEntradas = s.nextInt();

          switch (zonaElegida) {

            case 1:
              principal.vender(numEntradas);
              break;
            case 2:
              compraVenta.vender(numEntradas);
              break;
            case 3:
              vip.vender(numEntradas);
              break;
            default:
              System.out.println("Esa zona no existe");
          }

          break;
        case 3:
          System.out.println("¡Hasta la próxima!");
          break;
        default:
          System.out.println("No has elegido una opción del menú");
      }

      System.out.println();
      System.out.println();

    } while (aux != 3);
  }

}
