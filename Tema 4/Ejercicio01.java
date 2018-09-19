/*
 * Tema 4
 *
 * Ejercicio 1
 * 
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 * 
 */
package tema.pkg4;

import java.util.Scanner;

public class Ejercicio01 {
  
  public static void main (String[] args){
      Scanner s = new Scanner(System.in);
      System.out.println("Horario Virtual");

      System.out.print("Introduce el día de la semana(Numerados del 1 al 5: ");
      int dia = s.nextInt();
      
      System.out.print("Introduce la hora( En fomrato hh:mm ejemplo : "
              + "08:15): ");
      String hora = s.next();
      
      while (dia >= 5){
        System.out.print("Introduzca un opción válida: ");
        dia = s.nextInt();
      }
      
      String nombreDia = "";
      String asignatura = "";
      
      switch (dia) {
        case 1:
          nombreDia = "lunes";
          if (hora.equals("08:15") || hora.equals("8:15")){
            asignatura = "Entornos de Desarollo";
          }
          if (hora.equals("09:15")){
            asignatura = "Lenguaje de Marcas";
          }
          if (hora.equals("10:15")){
            asignatura = "Lenguaje de Marcas";
          }
          if (hora.equals("11:15")){
            asignatura = "Recreo";
          }
          if (hora.equals("11:45")){
            asignatura = "Bases de Datos";
          }
          if (hora.equals("12:45")){
            asignatura = "Bases de Datos";
          }
          if (hora.equals("13:45")){
            asignatura = "Bases de Datos";
          }
          break;
        case 2:
          nombreDia = "martes";
          if (hora.equals("08:15")){
            asignatura = "Sistemas Informáticos";
          }
          if (hora.equals("09:15")){
            asignatura = "Sistemas Informáticos";
          }
          if (hora.equals("10:15")){
            asignatura = "Sistemas Informáticos";
          }
          if (hora.equals("11:15")){
            asignatura = "Recreo";
          }
          if (hora.equals("11:45")){
            asignatura = "Programación";
          }
          if (hora.equals("12:45")){
            asignatura = "Programación";
          }
          if (hora.equals("13:45")){
            asignatura = "Programación";
          }
          break;
        case 3:
          nombreDia = "miercoles";
          if (hora.equals("08:15")){
            asignatura = "Programación";
          }
          if (hora.equals("09:15")){
            asignatura = "Programación";
          }
          if (hora.equals("10:15")){
            asignatura = "Programación";
          }
          if (hora.equals("11:15")){
            asignatura = "Recreo";
          }
          if (hora.equals("11:45")){
            asignatura = "Bases de Datos";
          }
          if (hora.equals("12:45")){
            asignatura = "Bases de Datos";
          }
          if (hora.equals("13:45")){
            asignatura = "Bases de Datos";
          }
          break;
        case 4:
          nombreDia = "jueves";
          if (hora.equals("08:15")){
            asignatura = "Programación";
          }
          if (hora.equals("09:15")){
            asignatura = "Programación";
          }
          if (hora.equals("10:15")){
            asignatura = "Programación";
          }
          if (hora.equals("11:15")){
            asignatura = "Recreo";
          }
          if (hora.equals("11:45")){
            asignatura = "Entornos de Desarollo";
          }
          if (hora.equals("12:45")){
            asignatura = "Lenguaje de Marcas";
          }
          if (hora.equals("13:45")){
            asignatura = "Lenguaje de Marcas";
          }
          break;
        case 5:
          nombreDia = "viernes";
          if (hora.equals("08:15")){
            asignatura = "Sistemas Informáticos";
          }
          if (hora.equals("09:15")){
            asignatura = "Sistemas Informáticos";
          }
          if (hora.equals("10:15")){
            asignatura = "Sistemas Informáticos";
          }
          if (hora.equals("11:15")){
            asignatura = "Recreo";
          }
          if (hora.equals("11:45")){
            asignatura = "Formación y Orientación Laboral";
          }
          if (hora.equals("12:45")){
            asignatura = "Formación y Orientación Laboral";
          }
          if (hora.equals("13:45")){
            asignatura = "Formación y Orientación Laboral";
          }
          
      }
      
      System.out.print("El " + nombreDia + " a las " + hora + 
              " tienes la asignatura de " + asignatura + ".");

  }
      
}
    

  
  
  
  

