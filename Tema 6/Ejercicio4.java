/*
 * Tema 6
 * 
 * Ejercicio 4
 * 
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos)
 * separados por espacios.
 * 
 */


public class Ejercicio4 {
  public static void main (String[] args) {
    int numeros;
    for ( int i = 1 ; i <= 20 ; i++){
      numeros =((int)(Math.random() * 11 ));
      System.out.print(" " + numeros);
  } }
}

