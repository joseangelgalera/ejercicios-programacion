/*
 * Gato.java
 * Definicion de la calse Gato
 */
package ejercicio01;

public class Gato extends Mamifero {

  private String nombre; // nombre del Gato

  /*
   *  Constructor Gato
   *
   *  @return Gato, devuelve objeto de la clase Gato
   */
  public Gato(Sexo s, String r, String c, int p, int m, String n) {
    super(s, r, c, p, m);
    this.nombre = n;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String n) {
    this.nombre = n;
  }

  @Override
  public String toString() {
    return "Nombre: " + this.nombre + "\n" + super.toString();
  }

  public void comunicarse() {
    System.out.println(this.nombre + ": ¡mmmmiiiiaaaaauuuuu!");
  }

  @Override
  public void comer(String c) {
    if (c.toLowerCase().equals("pescado")) {
      System.out.println("Mmmm comida buena.");
    } else {
      System.out.println("Comida mala.");
    }
  }
}
