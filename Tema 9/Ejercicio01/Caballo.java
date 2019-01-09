/**
 * Caballo.java
 * Definición de la clase Caballo
 */
package tema.pkg9;

public class Caballo {

  // atributos
  private String nombre;
  private int edad;
  private double peso;
  private String sexo;

  // constructores
  Caballo() {
  }

  Caballo(String n, int e, double p, String s) {
    this.nombre = n;
    this.edad = e;
    this.peso = p;
    this.sexo = s;
  }

  // getter
  String getNombre() {
    return this.nombre;
  }

  int getEdad() {
    return this.edad;
  }

  double getPeso() {
    return this.peso;
  }

  String getSexo() {
    return this.sexo;
  }

  // setter
  void setNombre(String n) {
    this.nombre = n;
  }

  void setEdad(int e) {
    this.edad = e;
  }

  void setPeso(double p) {
    this.peso = p;
  }

  void setSexo(String s) {
    this.sexo = s;
  }

  void trota() {
    System.out.println("toc ... toc ...toc ");
  }

  void galopa() {
    System.out.println("toc toc toc toc toc ");
  }

  void come(String comida) {

    comida = comida.toUpperCase();

    if (comida.equals("ZANAHORIA")) {
      System.out.println("¡Está comiendo!");
    } else {
      System.out.println("No quiere comer eso");
    }
  }

  void duerme() {
    System.out.println("ZzzZzz");
  }

  void correContra(Caballo rival) {

    if (rival.edad >= 2) {
      System.out.println("¡Vamos a correr!");
    } else {
      System.out.println("Eres muy pequeño para correr");
    }
  }

  void apareaCon(Caballo pareja) {

    if (!this.sexo.equals(pareja.sexo)) {
      System.out.println("Se han apareado");
    } else {
      System.out.println("No pueden aparearse, son del mismo sexo");
    }
  }

}
