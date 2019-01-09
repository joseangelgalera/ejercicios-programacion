/*
 * Pinguino.java
 * Definicion de la subclase Pinguino
 */
package ejercicio03;

public class Pinguino extends Ave {

  double altura;

  Pinguino() {
  }

  Pinguino(double h) {
    this.altura = h;

  }

  void vuela() {
    System.out.println("No puedo volar");
  }

}
