/*
 * Tema 6
 *
 * Ejercicio 18
 *
 * Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
 * sustituir el color blanco por colores más alegres. Realiza un programa que
 * genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
 * cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los
 * que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo,
 * violeta y naranja.
 */
package tema.pkg6;

public class Ejercicio18 {

  public static void main(String[] args) {
    String hab1 = "";
    String hab2 = "";
    String hab3 = "";
    int color1 = 0;
    int color2 = 0;
    int color3 = 0;

    do {
      color1 = (int) (Math.random() * 6);
      color2 = (int) (Math.random() * 6);
      color3 = (int) (Math.random() * 6);
    } while ((color1 == color2) || (color1 == color3) || (color2 == color3));

    switch (color1) {
      case 0:
        hab1 = ("rojo");
        break;
      case 1:
        hab1 = ("azul");
        break;
      case 2:
        hab1 = ("verde");
        break;
      case 3:
        hab1 = ("amarillo");
        break;
      case 4:
        hab1 = ("violeta");
        break;
      case 5:
        hab1 = ("naranja");
        break;
      default:
    }

    switch (color2) {
      case 0:
        hab2 = ("rojo");
        break;
      case 1:
        hab2 = ("azul");
        break;
      case 2:
        hab2 = ("verde");
        break;
      case 3:
        hab2 = ("amarillo");
        break;
      case 4:
        hab2 = ("violeta");
        break;
      case 5:
        hab2 = ("naranja");
        break;
      default:
    }

    switch (color3) {
      case 0:
        hab3 = ("rojo");
        break;
      case 1:
        hab3 = ("azul");
        break;
      case 2:
        hab3 = ("verde");
        break;
      case 3:
        hab3 = ("amarillo");
        break;
      case 4:
        hab3 = ("violeta");
        break;
      case 5:
        hab3 = ("naranja");
        break;
      default:
    }

    System.out.print(hab1 + " - " + hab2 + " - " + hab3);
  }

}
