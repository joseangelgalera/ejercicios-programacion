/*
 * Tema 6
 *
 * Ejercicio 10
 *
 * Realiza un programa que pinte por pantalla diez líneas formadas por 
 * caracteres. El carácter con el que se pinta cada línea se elige de forma 
 * aleatoria entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben 
 * tener una longitud aleatoria entre 1 y 40 caracteres.
 */
package tema.pkg6;

public class Ejercicio10 {

  public static void main(String[] args) {
    int caracter;
    int linea;
    int i = 1;
    String simbolo = "";

    while (i <= 10) {
      i++;
      caracter = (int) (Math.random() * 6 + 1);
      linea = (int) (Math.random() * 40 + 1);

      switch (caracter) {
        case 1:
          simbolo = "*";
          break;
        case 2:
          simbolo = "-";
          break;
        case 3:
          simbolo = "=";
          break;
        case 4:
          simbolo = ".";
          break;
        case 5:
          simbolo = "|";
          break;
        case 6:
          simbolo = "@";
          break;
        default:
      }
      int pintar = 1;
      while (pintar <= linea) {
        pintar++;
        System.out.print(simbolo);
      }
      System.out.println();
    }
  }

}
