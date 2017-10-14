/*
 * Tema 4
 * 
 * Ejercicio 11
 * 
 * Escribe un programa que dada una hora determinada (horas y minutos),
 * calcule los segundos que faltan para llegar a la medianoche.
 * 
 */

import java.util.Scanner;

public class Ejercicio11 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("¿Cuanto falta para la media noche?");
    
    System.out.print("Introduzca la hora : ");
    int horas = s.nextInt();
    
    System.out.print("Introduzca los minutos : ");
    int minutos = s.nextInt();
    
    int segundosTotales = (horas * 3600) + (minutos * 60);
    int segundosRestantes = (24 * 3600) - segundosTotales;
    
    System.out.printf("Son las %02d:%02d faltan %d segundos para la medianoche.", 
    + horas, minutos, segundosRestantes);
    
  }
}

