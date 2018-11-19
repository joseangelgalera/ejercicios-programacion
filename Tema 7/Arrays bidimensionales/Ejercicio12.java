/*
 * Tema 7 Arrays bidimensionales
 *
 * Ejercicio 12
 *
 * Realiza un programa que muestre por pantalla un array de 9 filas por 9
 * columnas relleno con números aleatorios entre 500 y 900. A continuación, el
 * programa debe mostrar los números de la diagonal que va desde la esquina
 * inferior izquierda a la esquina superior derecha, así como el máximo, el 
 * mínimo y la media de los números que hay en esa diagonal.
 */
package tema.pkg7b;

import java.util.Scanner;

public class Ejercicio12 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int [] [] num = new int [9][9];
    int [] diagonal = new int [9];
    int contador = 8;
    int fila = 0;
    int columna = 0;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    double sumatorio = 0;
    
    for (int j = 0; j < 9; j++) {
      for (int i = 0; i < 9; i++) {
        num [j] [i] = (int)((Math.random() * 401 ) + 500);
      }
    }
    
    
    int k=8;
    
    for (int i = 0; i < 9; i++) {
      
      diagonal[i] = num [k][i];
      k--;
    }
    
    for (int i = 0; i < 9; i++) {
      
      if (diagonal[i] > max) {
        max = diagonal [i];
      }
      
      if (diagonal[i] < min) {
        min = diagonal [i];
      }
      sumatorio+=diagonal[i];
      
    }
    
    
    System.out.println("\n┌────────┬─────┬─────┬─────┬───"
            + "──┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Array  ");
    for (int i = 0; i < 9; i++) {
      System.out.print("│ C " + columna + " ");
      columna++;
    }
      
    System.out.println("│\n├────────┼─────┼─────┼─────┼──"
            + "───┼─────┼─────┼─────┼─────┼─────┤");
    
    for (int i = 0; i < 9; i++) {
      System.out.print("│ Fila " + fila + " ");
      for (int j = 0; j < 9; j++) {
        System.out.printf("│%4d ", num[i][j]);
      }
        if (contador > 0) {
          System.out.println("│\n├────────┼─────┼─────┼────"
                  + "─┼─────┼─────┼─────┼─────┼─────┼───"
                  + "──┤"); 
          contador--;
        } 
        fila++;
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴──"
            + "───┴─────┴─────┴─────┴─────┴─────┘");
    System.out.println();
    
     
    System.out.println("\n┌────────┬─────┬─────┬─────┬──"
            + "───┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│Diagonal");
    for (int i = 0; i < diagonal.length; i++) {  
      System.out.printf("│%4d ", diagonal[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─"
            + "────┴─────┴─────┴─────┴─────┴─────┘");
    
    System.out.println("El máximo de la diagonal es " + max + " y el mínimo es " + min);
System.out.printf("%-10s %4.2f", "La media de los números de la diagonal es ", sumatorio/9);
  }
  
}
