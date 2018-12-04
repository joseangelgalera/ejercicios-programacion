/*
 * Tema 8
 * 
 * Ejercicio 18
 * 
 * Escribe un programa que pase de decimal a binario.
 */
package tema.pkg8;

import java.util.Scanner;
import tema.pkg8.matematicas.Numeros;

public class Ejercicio18 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el número decimal: ");
    int decimal = s.nextInt();
    int digito = 0;
    int[] binario = new int[100000000]; 
    int i = 0;
    int l = 0;

    while (decimal >= 1) {

      digito = decimal % 2;
      binario[i] = digito;
      decimal /= 2;
      i++;
      l++;

    }

    System.out.print("El número en binario es: ");

    for (int j = l - 1; j >= 0; j--) {
      System.out.print(binario[j]);
    }
  }

}
