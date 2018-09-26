/*
 * Tema 4
 * 
 * Ejercicio 15
 * 
 * Escribe un programa que pinte una pirámide rellena con un carácter 
 * introducido por teclado que podrá ser una letra, un número o un símbolo 
 * como *, +, -, $, &, etc. El programa debe permitir al usuario mediante un 
 * menú elegir si el vértice de la pirámide está apuntando hacia arriba, hacia 
 * abajo, hacia la izquierda o hacia la derecha.
 */
package tema.pkg4;
import java.util.Scanner;

public class Ejercicio15 {
  public static void main (String[]args){
    Scanner s = new Scanner(System.in);
    
    System.out.println("Pinta piramides");
    
    
    System.out.print("Introduce la dirección del vertice eligiendo una opción "
            + "(1.Arriba, 2.Abajo, 3.Izquerda, 4.Derecha): ");
    int direccion = s.nextInt();
    
    System.out.print("Introduce un número o un caracter: ");
    String c = s.next();
    
    switch (direccion) {
      case 1:
        System.out.println("    " + c);
        System.out.println("   " + c + c + c);
        System.out.println("  "+ c + c + c + c + c);
        System.out.println(" "+ c + c + c + c + c + c + c);
        System.out.println(c + c + c + c + c + c + c + c + c);
        break;
      case 2:
        System.out.println(c + c + c + c + c + c + c + c + c);
        System.out.println(" " + c + c + c + c + c + c + c);
        System.out.println("  " + c + c + c + c + c);
        System.out.println("   " + c + c + c);
        System.out.println("    " + c);
        break;
      case 3:
        System.out.println("    " + c);
        System.out.println("   " + c + c);
        System.out.println("  " + c + c + c);
        System.out.println(" " + c + c + c + c);
        System.out.println(c + c + c + c + c);
        System.out.println(" " + c + c + c + c);
        System.out.println("  " + c + c + c);
        System.out.println("   " + c + c);
        System.out.println("    " + c);
        break;
      case 4:
        System.out.println(c + "    ");
        System.out.println(c + c + "  ");
        System.out.println(c + c + c + "  ");
        System.out.println(c + c + c + c + " ");
        System.out.println(c + c + c + c + c);
        System.out.println(c + c + c + c + " ");
        System.out.println(c + c + c + "  ");
        System.out.println(c + c + "  ");
        System.out.println(c + "    ");
    }
    
  }
}
