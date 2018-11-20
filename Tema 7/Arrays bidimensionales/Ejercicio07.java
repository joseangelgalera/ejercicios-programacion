/*
 * Tema 7 Arrays bidimensionales 
 *
 * Ejercicio 7
 *
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
 * muestre por pantalla separados por espacios. El programa pedirá entonces
 * por teclado dos valores y a continuación cambiará todas las ocurrencias del
 * primer valor por el segundo en la lista generada anteriormente. Los números
 * que se han cambiado deben aparecer entrecomillados.
 */
package tema.pkg7b;

import java.util.Scanner;

public class Ejercicio07 {
  static final int VACIO = 0;
  static final int MINA = 1;
  static final int TESORO = 2;
  static final int INTENTO = 3;

  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    int x;
    int y;
    int[][] cuadrante = new int[5][4];
    for(x = 0; x < 4; x++) {
      for(y = 0; y < 3; y++) {
        cuadrante[x][y] = VACIO;
      }
    }

    int minaX = (int)(Math.random()*4);
    int minaY = (int)(Math.random()*3);
    cuadrante[minaX][minaY] = MINA;

    int tesoroX;
    int tesoroY;
    do {
      tesoroX = (int)(Math.random()*4);
      tesoroY = (int)(Math.random()*3);
    } while ((minaX == tesoroX) && (minaY == tesoroY));
    cuadrante[tesoroX][tesoroY] = TESORO;

    System.out.println("¡BUSCA EL TESORO!");
    boolean salir = false;
    String c = "";

    do {
      for(y = 3; y >= 0; y--) {
        System.out.print(y + "|");
        for(x = 0; x < 5; x++) {
          if (cuadrante[x][y] == INTENTO)
            System.out.print("X ");
          else
            System.out.print("  ");
        }
        System.out.println();
      }
      System.out.println(" ----------\n  0 1 2 3 4\n");

      System.out.print("Coordenada x: ");
      x = s.nextInt();
      System.out.print("Coordenada y: ");
      y = s.nextInt();

      // mira lo que hay en las coordenadas indicadas por el usuario
      switch(cuadrante[x][y]) {
        case VACIO:
          cuadrante[x][y] = INTENTO;
          if ((Math.abs(minaX - x) <= 1) && (Math.abs(minaY - y) <= 1))
            System.out.println("¡Cuidado! ¡Hay una mina cerca!");
          break;
        case MINA:
          System.out.println("Lo siento, has perdido.");
          salir = true;
          break;
        case TESORO:System.out.println("Enhorabuena, has encontrado el "
                + "tesoro.");
          salir = true;
          break;
        default:
      }
    } while (!salir);

    for(y = 3; y >= 0; y--) {
      System.out.print(y + " ");
      for(x = 0; x < 5; x++) {
        switch(cuadrante[x][y]) {
          case VACIO:
            c = "  ";
            break;
          case MINA:
            c = "* ";
            break;
          case TESORO:
            c = "€ ";
            break;
          case INTENTO:
            c = "x ";
            break;
          default:
        }
        System.out.print(c);
      }
      System.out.println();
    }
    System.out.println(" ----------\n  0 1 2 3 4\n");
  }
}