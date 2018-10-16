/*
 * Tema 6
 * 
 * Ejercicio 3
 *
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará 
 * la baraja de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 */
package tema.pkg6;

public class Ejercicio03 {

  public static void main(String[] args) {
    int naipe = ((int) (Math.random() * 10 + 1));
    if (naipe == 1) {
      System.out.print("As");
    } else if (naipe == 8) {
      System.out.print("Sota");
    } else if (naipe == 9) {
      System.out.print("Caballo");
    } else if (naipe == 10) {
      System.out.print("Rey");
    } else {
      System.out.print(naipe);
    }

    int palo = ((int) (Math.random() * 4));

    String paloCarta = "";

    switch (palo) {
      case 0:
        paloCarta = "oros";
        break;
      case 1:
        paloCarta = "copas";
        break;
      case 2:
        paloCarta = "bastos";
        break;
      case 3:
        paloCarta = "espadas";
        break;
    }

    System.out.print(" de " + paloCarta + ".");
    System.out.println();
  }

}
