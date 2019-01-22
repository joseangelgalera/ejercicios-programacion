/*
 * Animal.java
 * Definicion de la clase Animal
 */
package ejercicio01;

public abstract class Animal {

  private Sexo sexo; // Sexo del Animal
  private String raza; // Raza del Animal

  /*
   *  Constructor Animal
   *
   *  @return Tiempo, devuelve objeto de la clase tiempo
   */
  public Animal(Sexo s, String r) {
    this.sexo = s;
    this.raza = r;
  }

  public Sexo getSexo() {
    return this.sexo;
  }

  public String getRaza() {
    return this.raza;
  }

  @Override
  public String toString() {
    return "Sexo: " + this.sexo + "\n" + "Raza: " + this.raza + "\n";
  }

  public void duerme() {
    System.out.println("Zzzzzzz");
  }

  public void comer(String c) {
    System.out.println("Mmmm comida buena.");
  }

}
