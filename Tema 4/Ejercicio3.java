/*
 * Escribe un programa en que dado un número del 1 a 7 escriba el 
 * correspondiente nombre del día de la semana.
 */
package tema.pkg4;
import java.util.Scanner;

public class Ejercicio3 {
  public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    
    System.out.println("¿En que día de la semana estás?");
    System.out.print("Introduce el número día (numerado del 1 al 7): ");
    int dia = s.nextInt();
    
    while(dia > 7){
      System.out.print("Introduce un número válido: ");
      dia = s.nextInt();
    }
    
    String nombreDia = "";
    
    switch (dia){
      case 1:
        nombreDia = "lunes";
        break;
      case 2:
        nombreDia = "martes";
        break;
      case 3:
        nombreDia = "miércoles";
        break;
      case 4:
        nombreDia = "jueves";
        break;
      case 5:
        nombreDia = "viernes";
        break;
      case 6:
        nombreDia = "sábado";
        break;
      case 7:
        nombreDia = "domingo";
        break;
    }
    
    System.out.print("Hoy es " + nombreDia + ".");
  }
}
