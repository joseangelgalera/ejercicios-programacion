/*
 * Tema 4
 * 
 * Ejercicio 22
 *
 * Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
 * hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
 * Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
 * por hecho que el usuario introducirá un día y hora correctos, anterior al 
 * viernes a las 15:00h.
 */
package tema.pkg4;
import java.util.Scanner;

public class Ejercicio22 {
  public static void main (String[]args){
    Scanner s = new Scanner(System.in);
    
    System.out.println("¿Cuantos minutos faltan para el fin de semana?");
    
    System.out.print("¿Que dia es hoy?: ");
    String dia = s.nextLine();
    
    while (!dia.equals("lunes") && (!dia.equals("martes") &&
          (!dia.equals("miercoles")) && (!dia.equals("jueves")) &&
          (!dia.equals("viernes")))){
      System.out.print("Solo se puede introducir un dia del lunes "
              + "al viernes: ");
      dia = s.next();
    }
    
    System.out.print("Introduce la hora: ");
    int hora = s.nextInt();
    
    System.out.print("Introduce los minutos: ");
    int minutos = s.nextInt();
    
    int minTotales = 6660;
    
    switch (dia){
      case "lunes":
        int minRest = minTotales - (hora * 60 + minutos);
        System.out.print("Quedan " + minRest + " minutos para el fin de "
                + "semana.");
        break;
      case "martes":
         minRest = (minTotales -(24 * 60)) - (hora * 60 + minutos);
         System.out.print("Quedan " + minRest + " minutos para el fin de "
                 + "semana.");
         break;
      case "miercoles":
         minRest = (minTotales -((24 * 2) * 60)) - (hora * 60 + minutos);
         System.out.print("Quedan " + minRest + " minutos para el fin de "
                 + "semana.");
         break;
      case "jueves":
         minRest = (minTotales -((24 * 3) * 60)) - (hora * 60 + minutos);
         System.out.print("Quedan " + minRest + " minutos para el fin de "
                 + "semana.");
         break;
      case "viernes":
        if (hora >= 15){
          System.out.print("Ya es fin de semana.");
        } else {
         minRest = (minTotales -((24 * 4) * 60)) - (hora * 60 + minutos);
         System.out.print("Quedan " + minRest + " minutos para el fin de "
                 + "semana.");
        }
        break;
    }
  }
}
