/*
 * Perro.java
 * Definicion de la subclase Perro
 */
package ejercicio03;

public class Perro extends Mamifero {

  String raza;

  Perro() {
  }

  Perro(String r, String s) {
    this.raza = r;
    this.sexo = s;
  }

  void ladra() {
    System.out.println("guau guau");
  }

  void come() {
    System.out.println("Come pienso");
  }

  void corre() {
    System.out.println("¡Está corriendo!");
  }

}
