/*
 * Tema 6
 * 
 * Ejercicio 5
 *
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media
 * de esos números.
 */
package tema.pkg6;

public class Ejercicio05 {

  public static void main(String[] args) {
    int numero = 0;
    int numeroMax = 100;
    int numeroMin = 199;
    int suma = 0;

    for (int i = 1; i <= 50; i++) {
      numero = ((int) (Math.random() * 100 + 100));
      System.out.print(numero + " ");
      suma += numero;

      if (numero < numeroMin) {
        numeroMin = numero;
      }

      if (numero > numeroMax) {
        numeroMax = numero;
      }
    }

    System.out.println();
    System.out.println("Máximo: " + numeroMax);
    System.out.println("Mínimo: " + numeroMin);
    System.out.println("Media: " + (suma / 100));
  }
}
