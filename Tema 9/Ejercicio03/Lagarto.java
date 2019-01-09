/*
 * Lagarto.java
 * Definicion de la subclase Lagarto
 */
package ejercicio03;

public class Lagarto extends Animal {

  String color;

  Lagarto(String c) {
    this.color = c;

  }

  void come() {
    System.out.println("Se ha comido un insecto");
  }

  void tomaSol() {
    System.out.println("Se ha puesto al Sol");
  }

}
