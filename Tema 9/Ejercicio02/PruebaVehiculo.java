/*
 * Tema 9
 * 
 * Ejercicio 2
 *
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases 
 * de la primera. Para la clase Vehiculo, crea los atributos de clase 
 * vehiculosCreados y kilometrosTotales, así como el atributo de instancia 
 * kilometrosRecorridos. Crea también algún método específico para cada una 
 * de las subclases. Prueba las clases creadas mediante un programa con un menú 
 * como el que se muestra a continuación:
 */
package ejercicio02;

import java.util.Scanner;

public class PruebaVehiculo {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int aux;
    Coche coche1 = new Coche("Ford", "Mondeo");
    Bicicleta bici1 = new Bicicleta("BH", "Carretera");

    do {
      System.out.println("VEHÍCULOS");
      System.out.println("=========");
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      System.out.print("Elige una opción (1-8): ");

      int opcion = s.nextInt();
      aux = opcion;

      System.out.println();
      System.out.println();

      switch (opcion) {

        case 1:
          System.out.print("¿Cuántos kilómetros?: ");
          double kmBici = s.nextDouble();
          bici1.recorre(kmBici);
          break;
        case 2:
          bici1.caballito();
          break;
        case 3:
          System.out.print("¿Cuántos kilómetros?: ");
          double kmCoche = s.nextDouble();
          coche1.recorre(kmCoche);
          break;
        case 4:
          coche1.quemaRueda();
          break;
        case 5:
          System.out.print("La bicicleta ha recorrido " + 
                  bici1.getKilometrosRecorridos() + " Km");
          break;
        case 6:
          System.out.println("El coche ha recorrido " + 
                  coche1.getKilometrosRecorridos() + " Km");
          break;
        case 7:
          System.out.println("Total de distancia reccorrida: " + 
                  Vehiculo.getKilometrosTotales() + " Km");
          break;
        case 8:
          System.out.println("¡Nos vemos pronto!");
          break;
        default:
          System.out.println("No has elegido una opción del menú");
      }

      System.out.println();
      System.out.println();

    } while (aux != 8);

  }

}
