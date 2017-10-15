/*
 * Tema 4
 * 
 * Ejercicio 16
 * 
 * Realiza un programa que nos diga si hay probabilidad de que nuestra pareja
 * nos está siendo infiel. El programa irá haciendo preguntas que el usuario
 * contestará con verdadero o falso. Cada pregunta contestada como verdadero
 * sumará 3 puntos. Las preguntas contestadas con falso no suman puntos. Utili-
 * za el fichero test_infidelidad.txt para obtener las preguntas y las 
 * conclusiones del programa.
 * 
 */

import java.util.Scanner;

public class Ejercicio16 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Test de infidelidad.");
    
    System.out.print("1.Tu pareja parece estar más inquieta de lo normal");
    System.out.println(" sin ningún motivo aparente.");
    String primera = s.nextLine();
    
    System.out.println("2.Ha aumentado sus gastos de vestuario");
    String segunda = s.nextLine();
    
    System.out.print("3.Ha perdido el interés que mostraba anteriormente");
    System.out.println(" por ti.");
    String tercera = s.nextLine();
    
    System.out.print("4.Ahora se afeita y se asea con más frecuencia");
    System.out.print(" (si es hombre) o ahora se arregla el pelo y se asea");
    System.out.println(" con más frecuencia (si es mujer)");
    String cuarta = s.nextLine();
    
    System.out.println("5.No te deja que mires la agenda de su teléfono móvil");
    String quinta = s.nextLine();
    
    System.out.print("6.A veces tiene llamadas que dice no querer contestar");
    System.out.println(" cuando estás tú delante");
    String sexta = s.nextLine();
    
    System.out.print("7.Últimamente se preocupa más en cuidar la línea y/o");
    System.out.println(" estar bronceado/a");
    String septima = s.nextLine();
    
    System.out.print("8.Muchos días viene tarde después de trabajar porque");
    System.out.println(" dice tener mucho más trabajo");
    String octava = s.nextLine();
    
    System.out.println("9.Has notado que últimamente se perfuma más");
    String novena = s.nextLine();
    
    System.out.print("10.Se confunde y te dice que ha estado en sitios donde");
    System.out.println(" no ha ido contigo");
    String decima = s.nextLine();
    
    int total = 0;
    
    if (primera.equals("v")) {
      total++;
      total++;
      total++;
    }
    
    if (segunda.equals("v")) {
      total++;
      total++;
      total++;
    }
    
    if (tercera.equals("v")) {
      total++;
      total++;
      total++;
    }
    
    if (cuarta.equals("v")) {
      total++;
      total++;
      total++;
    }
    
    if (quinta.equals("v")) {
      total++;
      total++;
      total++;
    }
    
    if (sexta.equals("v")) {
      total++;
      total++;
      total++;
    }
    
    if (septima.equals("v")) {
      total++;
      total++;
      total++;
    }
    
    if (octava.equals("v")) {
      total++;
      total++;
      total++;
    }
    
    if (novena.equals("v")) {
      total++;
      total++;
      total++;
    }
    
    if (decima.equals("v")) {
      total++;
      total++;
      total++;
    }
    
    if ((total > 0) && (total <= 10)) {
      System.out.print("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    }
    
    if ((total >= 11) && (total <= 22)) {
      System.out.print("Quizás exista el peligro de otra persona en su vida o");
      System.out.print(" en su mente, aunque seguramente será algo sin");
      System.out.print(" importancia. No bajes la guardia.");
    }
    
    if ((total >= 22) && (total <= 30)) {
      System.out.print("Tu pareja tiene todos los ingredientes para estar");
      System.out.print(" viviendo un romance con otra persona. Te aconsejamos");
      System.out.print(" que indagues un poco más y averigües que es lo que");
      System.out.print(" está pasando por su cabeza.");
    }
  }
}

