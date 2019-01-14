/*
 * Pizza.java
 * Definicion de la clase Pizza
 */
package ejercicio05;

public class Pizza {

  // atributos
  private static int totalPedidas = 0;
  private static int totalServidas = 0;
  private String tamano = "";
  private String tipo = "";
  private String estado = "";

  Pizza(String ta, String ti) {
    this.tamano = ta;
    this.tipo = ti;
    this.estado = "pedida";
    Pizza.totalPedidas += 1;

  }

  // getter
  public static int getTotalPedidas() {
    return Pizza.totalPedidas;
  }

  public static int getTotalServidas() {
    return Pizza.totalServidas;
  }

  void sirve() {

    if (this.estado.equals("servida")) {
      System.out.println("esa pizza ya se ha servido");
    } else {
      this.estado = "servida";
      Pizza.totalServidas += 1;
    }
  }

  public String toString() {

    String mensaje = "";
    mensaje = "pizza " + this.tamano + " " + this.tipo + ", " + this.estado;
    return mensaje;
  }
}
