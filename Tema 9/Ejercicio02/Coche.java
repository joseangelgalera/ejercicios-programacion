/*
 * Coche.java
 * Definicion de la subclase Coche
 */
package ejercicio02;

public class Coche extends Vehiculo {

  // atributos
  private String marca = "";
  private String modelo = "";
  private String color = "";
  private int ruedasQuemadas = 0;

  Coche(String ma, String mo) {

    this.marca = ma;
    this.modelo = mo;

  }

  // getter
  String getMarca() {
    return this.marca;
  }

  String getModelo() {
    return this.modelo;
  }

  // setter
  void setColor(String c) {
    this.color = c;
  }

  void quemaRueda() {

    ruedasQuemadas++;

    if (ruedasQuemadas < 3) {
      System.out.print("¡Está quemando rueda!");
    } else if ((ruedasQuemadas >= 3) && (ruedasQuemadas < 5)) {
      System.out.print("¡Te vas a quedar sin ruedas!");
    } else {
      System.out.print("¡No puedes quemar más rueda!");
    }
  }
}
