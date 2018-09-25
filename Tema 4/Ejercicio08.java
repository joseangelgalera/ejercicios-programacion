/*
 * Tema 4 
 * 
 * Ejercicio 8
 *
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 */
package tema.pkg4;
import java.util.Scanner;

public class Ejercicio08 {
  public static void main (String [] args){
    Scanner s = new Scanner(System.in);
    
    System.out.println("Calculadora de medias");
    
    System.out.print("Introduce la primera nota: ");
    int primera = s.nextInt();
    
    while (primera > 10){
      System.out.print("Introduce una nota correcta: ");
      primera = s.nextInt();
    }
    
    System.out.print("Introduce la segunda nota: ");
    int segunda = s.nextInt();
    
    while (segunda > 10){
      System.out.print("Introduce una nota correcta: ");
      segunda = s.nextInt();
    }
     
    System.out.print("Introduce la tercera nota: ");
    int tercera = s.nextInt();
    
    while (tercera > 10){
      System.out.print("Introduce una nota correcta: ");
      tercera = s.nextInt();
    }
    
    int media = (primera + segunda + tercera) / 3;
    
    String nota = "";
    
    if (media < 5){
      nota = "insuficiente";
    }
    
    if (media == 5){
      nota = "suficiente";
    }
    
    if ((media > 5) && (media < 8)){
      nota = "bien";
    }
    
    if ((media > 7) && (media < 10)){
      nota = "notable";
    }
    
    if (media == 10){
      nota = "sobresaliente";
    }
    
    System.out.print("Tu media este año es " + media + " " + nota + ".");
  }
  
}
