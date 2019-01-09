/*
 * Vehiculo.java
 * Definicion de clase Vehiculo
 */
package ejercicio02;

public class Vehiculo {
  //atributos

  private static int vehiculosCreados = 0;
  private static double kilometrosTotales = 0;
  private double kilometrosRecorridos = 0;

  Vehiculo() {
  }

  // getter
  public static double getKilometrosTotales() {
    return Vehiculo.kilometrosTotales;
  }

  public static int getVehiculosCreados() {
    return Vehiculo.vehiculosCreados;
  }

  double getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }

  void recorre(double km) {

    this.kilometrosRecorridos += km;
    Vehiculo.kilometrosTotales += km;

  }
}
