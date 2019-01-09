/*
 * Gato.java
 * Definicion de la subclase Gato
 */
package ejercicio03;

public class Gato extends Mamifero {

  String raza;

  Gato(String r, String s) {
    this.raza = r;
    this.sexo = s;
  }

  void maulla() {
    System.out.println("miau miau");
  }

  void come() {
    System.out.println("Come pescado");
  }

  void salta() {
    System.out.println("¡Está saltando!");
  }

}
