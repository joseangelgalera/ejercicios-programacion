/*
 * Tema 6
 *
 * Ejercicio 17
 *
 * Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
 * Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
 * serán de 4 unidades. No hay que comprobar que los datos se introducen
 * correctamente; podemos suponer que el usuario los introduce bien. Dentro
 * de la pecera hay que colocar de forma aleatoria un pececito, que puede estar
 * situado en cualquiera de las posiciones que quedan en el hueco que forma el
 * rectángulo.
 */
package tema.pkg6;

import java.util.Scanner;

public class Ejercicio17 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la anchura de la pecera (mínimo 4): ");
    int w = s.nextInt();
    System.out.print("Introduce la altura de la pecera (mínimo 4): ");
    int h = s.nextInt();
    int pez = (int) (Math.random() * ((w - 2) * (h - 2))) + 1;
    int posicion = 1;
    int anchoEspaciado = 2 * (w - 2) + 1;

    for (int i = 0; i < w; i++) {
      System.out.print("* ");
    }
    System.out.println();

    for (int i = 0; i < h - 2; i++) {
      System.out.print("*");
      for (int j = 0; j < anchoEspaciado; j++) {
        if (posicion == pez) {
          System.out.print("&");
        } else {
          System.out.print(" ");
        }
        posicion++;
      }
      System.out.println("*");
    }

    for (int i = 0; i < w; i++) {
      System.out.print("* ");
    }
  }

}
