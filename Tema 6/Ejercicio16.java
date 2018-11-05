/*
 * Tema 6
 *
 * Ejercicio 16
 *
 * Realiza un simulador de máquina tragaperras simplificada que cumpla los
 * siguientes requisitos:
 * a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
 * figuras posibles: corazón, diamante, herradura, campana y limón.
 * b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento,
 * ha perdido”.
 * c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje 
 * “Bien, ha recuperado su moneda”.
 * d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
 * 10 monedas”.
 * Ejemplo 1:
 * diamante diamante limón
 * Bien, ha recuperado su moneda
 */
package tema.pkg6;

public class Ejercicio16 {

  public static void main(String[] args) {
    int figura1 = (int) (Math.random() * 5);
    switch (figura1) {
      case 0:
        System.out.print("Corazón ");
        break;
      case 1:
        System.out.print("Diamante ");
        break;
      case 2:
        System.out.print("Herradura ");
        break;
      case 3:
        System.out.print("Campana ");
        break;
      case 4:
        System.out.print("Limón ");
        break;
      default:

    }

    int figura2 = (int) (Math.random() * 5);
    switch (figura2) {
      case 0:
        System.out.print("Corazón ");
        break;
      case 1:
        System.out.print("Diamante ");
        break;
      case 2:
        System.out.print("Herradura ");
        break;
      case 3:
        System.out.print("Campana ");
        break;
      case 4:
        System.out.print("Limón ");
        break;
      default:

    }

    int figura3 = (int) (Math.random() * 5);
    switch (figura3) {
      case 0:
        System.out.print("Corazón ");
        break;
      case 1:
        System.out.print("Diamante ");
        break;
      case 2:
        System.out.print("Herradura ");
        break;
      case 3:
        System.out.print("Campana ");
        break;
      case 4:
        System.out.print("Limón ");
        break;
      default:

    }
    System.out.println();

    if ((figura1 == figura2) && (figura2 == figura3)) {
      System.out.print("Enhorabuena, ha ganado 10 monedas.");
    } else if ((figura1 == figura2) || (figura1 == figura3)
            || (figura2 == figura3)) {
      System.out.print("Bien, ha recuperado su moneda.");
    } else {
      System.out.print("Lo siento, ha perdido.");
    }
  }

}
