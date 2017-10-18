/*
 * Tema 4
 * 
 * Ejercicio 15
 * 
 * Escribe un programa que pinte una pirámide rellena con un carácter introdu-
 * cido por teclado que podrá ser una letra, un número o un símbolo como *, +,
 * -, $, &, etc. El programa debe permitir al usuario mediante un menú elegir si
 * el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la
 * izquierda o hacia la derecha.
 * 
 */

import java.util.Scanner;

public class Ejercicio15 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Crea tu pirámide");
    
    System.out.print("Introduce el carácter del que estara formada : ");
    String c = s.nextLine();
    
    System.out.println("Escoge la posición hacia la que apunta el vertice.");
    System.out.println("1.Hacia arriba.");
    System.out.println("2.Hacia abajo.");
    System.out.println("3.Hacia la izquierda.");
    System.out.println("4.Hacia la derecha.");
    int selección = s.nextInt();
    
    switch (selección) {
      case 1:
      System.out.println("    " + c);
      System.out.println("   " + c + c + c);
      System.out.println("  " + c + c + c + c + c);
      System.out.println(" "+ c + c + c + c + c + c + c);
      System.out.print(c + c + c + c + c + c + c + c + c);
      break;
      
      case 2:
      System.out.println(c + c + c + c + c + c + c + c + c);
      System.out.println(" "+ c + c + c + c + c + c + c);
      System.out.println("  " + c + c + c + c + c);
      System.out.println("   " + c + c + c);
      System.out.print("    " + c);
      break;
      
      case 3:
      System.out.println("     " + c);
      System.out.println("    " + c + c);
      System.out.println("   " + c + c + c);
      System.out.println("  " + c + c + c + c);
      System.out.println(" " + c + c + c + c + c);
      System.out.println("  " + c + c + c + c);
      System.out.println("   " + c + c + c);
      System.out.println("    " + c + c);
      System.out.print("     " + c);
      break;
      
      case 4:
      System.out.println(" " + c);
      System.out.println(" " + c + c);
      System.out.println(" " + c + c + c);
      System.out.println(" " + c + c + c + c);
      System.out.println(" " + c + c + c + c + c);
      System.out.println(" " + c + c + c + c);
      System.out.println(" " + c + c + c);
      System.out.println(" " + c + c);
      System.out.print(" " + c);
      break;
      default:
    }
  }
}

