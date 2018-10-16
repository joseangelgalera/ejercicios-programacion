/*
 * Tema 6
 * 
 * Ejercicio 1
 *
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
 */
package tema.pkg6;

public class Ejercicio01 {

  public static void main(String[] args) {
    System.out.println("Tira los dados");
    
    int total = 0;
    for (int i = 1; i <= 3; i++) {
      int dados = ((int) (Math.random() * 6 + 1));
      System.out.print(dados + " ");
      total += dados;
    }
    System.out.println();
    System.out.print("La suma total de la tirada es " + total + ".");
  }

}
