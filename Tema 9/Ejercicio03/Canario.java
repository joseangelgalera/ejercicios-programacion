/*
 * Canario.java
 * Definicion de la subclase Canario
 */
package ejercicio03;

public class Canario extends Ave {

  String color;

  Canario(String c) {
    this.color = c;

  }

  void canta() {
    System.out.println("pio pio");
  }

}
