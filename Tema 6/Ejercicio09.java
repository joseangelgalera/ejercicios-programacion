/*
 *
 * Tema 6
 *
 * Ejercicio 9
 * 
 * Realiza un programa que vaya generando números aleatorios pares entre 0
 * y 100 y que no termine de generar números hasta que no saque el 24. El
 * programa deberá decir al final cuántos números se han generado.
 */
package tema.pkg6;

public class Ejercicio09 {

  public static void main(String[] args) {
    int numero = 0;
    int contador = 0;

    while (numero != 24) {
      numero++;
      numero = (int) (Math.random() * 100);
      if ((numero % 2) == 0) {
        System.out.println("" + numero);
        contador += 1;
      }
    }
    System.out.print("Se han introducido " + contador + " números.");
  }

}
