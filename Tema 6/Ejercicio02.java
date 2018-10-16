/*
 * Tema 6
 * 
 * Ejercicio 2
 *
 * Realiza un programa que muestre al azar el nombre de una carta de la
 * baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
 * diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
 * cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A 
 * (que sería el 1). Para convertir un número en una cadena de caracteres 
 * podemos usar String.valueOf(n).
 */
package tema.pkg6;

public class Ejercicio02 {

  public static void main(String[] args) {
    int naipe = ((int) (Math.random() * 13 + 1));
    if (naipe == 1){
      System.out.print ("A");
    } else if (naipe == 11){
      System.out.print ("J");
    } else if (naipe == 12){
      System.out.print ("Q");
    } else if (naipe == 13){
      System.out.print ("K");
    } else {
      System.out.print (naipe);
    }
    
    int palo = ((int)(Math.random() * 4));
    
    String paloCarta = "";
    
    switch (palo) {
      case 0 :
        paloCarta = "picas";
        break;
      case 1 :
        paloCarta = "corazones";
        break;
      case 2 :
        paloCarta = "diamantes";
        break;
      case 3 :
        paloCarta = "tréboles";
        break;
    }
    
    System.out.print ( " de " + paloCarta + ".");
    System.out.println();
  }
}
