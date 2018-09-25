/*
 * Tema 4
 * 
 * Ejercicio 10
 * 
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de
 * nacimiento.
 */
package tema.pkg4;
import java.util.Scanner;

public class Ejercicio10 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("¿Cuál es tu signo del zodiaco?");
    
    System.out.print("Introduce el día de tu nacimiento : ");
    int dia = s.nextInt();
    
    System.out.print("Introduce el mes de tu nacimiento : ");
    int mes = s.nextInt();
    
    switch (mes) {
      case 1:
        if (dia <= 19) {
          System.out.print("Tu signo del zodiaco es Capricornio ♑ .");
        } else {
            System.out.print("Tu signo del zodiaco es Acuario ♒ .");
          }
          break;
      
      case 2:
        if (dia <= 18) {
          System.out.print("Tu signo del zodiaco es Acuario ♒ .");
        } else {
            System.out.print("Tu signo del zodiaco esPiscis ♓ .");
          }
          break;
      
      case 3:
        if (dia <= 20) {
          System.out.print("Tu signo del zodiaco es Piscis ♓ .");
        } else {
            System.out.print("Tu signo del zodiaco es Aries ♈ .");
          }
          break;
            
      case 4:
        if (dia <=20) {
          System.out.print("Tu signo del zodiaco es Aries ♈ .");
        } else {
            System.out.print("Tu signo del zodiaco es Tauro ♉ .");
          }
          break;
          
      case 5:
        if (dia <= 20 ) {
          System.out.print("Tu signo del zodiaco es Tauro ♉ .");
        } else {
            System.out.print("Tu signo del zodiaco es Géminis ♊ .");
          }
          break;
          
      case 6:
        if (dia <= 20) {
          System.out.print("Tu signo del zodiaco es Géminis ♊ .");
        } else {
            System.out.print("Tu signo del zodiaco es Cáncer ♋ .");
          }
          break;
      
      case 7:
        if (dia <= 20) {
          System.out.print("Tu signo del zodiaco es Cáncer ♋ .");
        } else {
            System.out.print("Tu signo del zodiaco es Leo ♌ .");
          }
          break;
            
      case 8:
        if (dia <= 21) {
          System.out.print("Tu signo del zodiaco es Leo ♌ .");
        } else {
            System.out.print("Tu signo del zodiaco es Virgo ♍ .");
          }
          break;
      
      case 9:
        if (dia <= 22) {
          System.out.print("Tu signo del zodiaco es Virgo ♍ .");
        } else {
            System.out.print("Tu signo del zodiaco es Libra ♎ .");
          }
          break;
      
      case 10:
        if (dia <= 22) {
          System.out.print("Tu signo del zodiaco es Libra ♎ .");
        } else {
            System.out.print("Tu signo del zodiaco es Escorpio ♏ .");
          }
          break;
      
      case 11:
        if (dia <= 22) {
          System.out.print("Tu signo del zodiaco es Escorpio ♏ .");
        } else {
            System.out.print("Tu signo del zodiaco es Sagitario ♐ .");
          }
          break;
          
      case 12:
        if (dia <= 20) {
          System.out.print("Tu signo del zodiaco es Sagitario ♐ .");
        } else {
            System.out.print("Tu signo del zodiaco es Capricornio ♑ .");
          }
          break;
    }
    
  }


}

