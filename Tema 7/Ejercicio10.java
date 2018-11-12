/*
 * Tema 7
 * 
 * Ejercicio 10
 *
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
 * y que los almacene en un array. El programa debe ser capaz de pasar todos
 * los números pares a las primeras posiciones del array (del 0 en adelante) y
 * todos los números impares a las celdas restantes. Utiliza arrays auxiliares 
 * si es necesario.
 */
package tema.pkg7;

public class Ejercicio10 {

  public static void main(String[] args) {

    int[] numeros = new int[20];
    int posPar = 0;
    int posImpar = numeros.length - 1;

    for (int i = 0; i <= (numeros.length - 1); i++) {
      int numero = (int) (Math.random() * 101);
      if ((numero % 2) == 0) {
        numeros[posPar] = numero;
        posPar++;
      } else {
        numeros[posImpar] = numero;
        posImpar--;
      }

    }

    System.out.println("Los números generados aleatoriamente, pares primero,"
            + " son: ");

    for (int i = 0; i < (numeros.length - 1); i++) {
      System.out.printf(numeros[i] + ", ");
    }
    System.out.printf(numeros[numeros.length - 1] + ".");
  }

}
