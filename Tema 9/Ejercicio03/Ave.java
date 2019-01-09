/*
 * Ave.java
 * Definicion de la subclase Ave
 */
package ejercicio03;

public abstract class Ave extends Animal {

  Ave() {

  }

  void vuela() {
    System.out.println("¡Está volando!");
  }

  void creaNido() {
    System.out.println("Ha creado su propio nido");
  }

  void poneHuevo() {
    System.out.println("¡Ha puesto un huevo!");
  }
}
