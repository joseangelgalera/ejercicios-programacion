/*
 * Tema 4
 * 
 * Ejercicio 16
 * 
 * Realiza un programa que nos diga si hay probabilidad de que nuestra pareja
 * nos está siendo infiel. El programa irá haciendo preguntas que el usuario
 * contestará con verdadero o falso. Cada pregunta contestada como verdadero
 * sumará 3 puntos. Las preguntas contestadas con falso no suman puntos. A
 * continuación se listan las preguntas del test.
 * 1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo
 * aparente.
 * 2. Ha aumentado sus gastos de vestuario
 * 3. Ha perdido el interés que mostraba anteriormente por ti
 * 4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se
 * arregla el pelo y se asea con más frecuencia (si es mujer)
 * 5. No te deja que mires la agenda de su teléfono móvil
 * 6. A veces tiene llamadas que dice no querer contestar cuando estás tú
 * delante
 * 7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a
 * 8. Muchos días viene tarde después de trabajar porque dice tener mucho
 * más trabajo
 * 9. Has notado que últimamente se perfuma más
 * 10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo
 * A continuación se muestran los mensajes que deberá dar el programa según
 * la puntuación obtenida.
 * • Puntuación entre 0 y 10: ¡Enhorabuena! tu pareja parece ser totalmente
 * fiel.
 * • Puntuación entre 11 y 22: Quizás exista el peligro de otra persona en su
 * vida o en su mente, aunque seguramente será algo sin importancia. No
 * bajes la guardia.
 * • Puntuación entre 22 y 30: Tu pareja tiene todos los ingredientes para estar
 * viviendo un romance con otra persona. Te aconsejamos que indagues
 * un poco más y averigües que es lo que está pasando por su cabeza.
 */
package tema.pkg4;
import java.util.Scanner;

public class Ejercicio16 {
  public static void main (String[]args){
    Scanner s = new Scanner(System.in);
    
    System.out.println("¿Te es infiel tu pareja?");
    
    
    
    int contador = 0;
    
    System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin "
            + "ningún motivo aparente: ");
    String primera = s.nextLine();
    
    while((!primera.equals("V")) && (!primera.equals("v")) && 
         (!primera.equals("F")) && (!primera.equals("f"))){
     System.out.print("Solo puedes escribir V/v(verdadero) F/f(falso)");
     primera = s.next();
    }
    
    System.out.print("2. Ha aumentado sus gastos de vestuario: ");
    String segunda = s.nextLine();
    
    while((!segunda.equals("V")) && (!segunda.equals("v")) && 
         (!segunda.equals("F")) && (!segunda.equals("f"))){
     System.out.print("Solo puedes escribir V/v(verdadero) F/f(falso)");
     segunda = s.next();
    }
    
    System.out.print("3. Ha perdido el interés que mostraba anteriormente "
            + "por ti: ");
    String tercera = s.nextLine();
    
    while((!tercera.equals("V")) && (!tercera.equals("v")) && 
         (!tercera.equals("F")) && (!tercera.equals("f"))){
     System.out.print("Solo puedes escribir V/v(verdadero) F/f(falso)");
     tercera = s.next();
    }
    
    System.out.print("4. Ahora se afeita y se asea con más frecuencia "
            + "(si es hombre) o ahora se arregla el pelo y se asea con más "
            + "frecuencia (si es mujer): ");
    String cuarta = s.nextLine();
    
    while((!cuarta.equals("V")) && (!cuarta.equals("v")) && 
         (!cuarta.equals("F")) && (!cuarta.equals("f"))){
     System.out.print("Solo puedes escribir V/v(verdadero) F/f(falso)");
     cuarta = s.next();
    }
    
    System.out.print("5. No te deja que mires la agenda de su teléfono "
            + "móvil: ");
    String quinta = s.nextLine();
    
    while((!quinta.equals("V")) && (!quinta.equals("v")) && 
         (!quinta.equals("F")) && (!quinta.equals("f"))){
     System.out.print("Solo puedes escribir V/v(verdadero) F/f(falso)");
     quinta = s.next();
    }
    
    System.out.print("6. A veces tiene llamadas que dice no querer contestar "
            + "cuando estás tú delante: ");
    String sexta = s.nextLine();
    
    while((!sexta.equals("V")) && (!sexta.equals("v")) && 
         (!sexta.equals("F")) && (!sexta.equals("f"))){
     System.out.print("Solo puedes escribir V/v(verdadero) F/f(falso)");
     sexta = s.next();
    }
    
    System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o "
            + "estar bronceado/a: ");
    String septima = s.nextLine();
    
    while((!septima.equals("V")) && (!septima.equals("v")) && 
         (!septima.equals("F")) && (!septima.equals("f"))){
     System.out.print("Solo puedes escribir V/v(verdadero) F/f(falso)");
     septima = s.next();
    }
    
    System.out.print("8. Muchos días viene tarde después de trabajar porque "
            + "dice tener mucho más trabajo: ");
    String octava = s.nextLine();
    
    while((!octava.equals("V")) && (!octava.equals("v")) && 
         (!octava.equals("F")) && (!octava.equals("f"))){
     System.out.print("Solo puedes escribir V/v(verdadero) F/f(falso)");
     octava = s.next();
    }
    
    System.out.print("9. Has notado que últimamente se perfuma más: ");
    String novena = s.nextLine();
    
    while((!novena.equals("V")) && (!novena.equals("v")) && 
         (!novena.equals("F")) && (!novena.equals("f"))){
     System.out.print("Solo puedes escribir V/v(verdadero) F/f(falso)");
     novena = s.next();
    }
    
    System.out.print("10. Se confunde y te dice que ha estado en sitios donde "
            + "no ha ido contigo: ");
    String decima = s.nextLine();
    
    while((!decima.equals("V")) && (!decima.equals("v")) && 
         (!decima.equals("F")) && (!decima.equals("f"))){
     System.out.print("Solo puedes escribir V/v(verdadero) F/f(falso)");
     decima = s.next();
    }
    
    int total = 0;
    
    if (primera.equals("v") || (primera.equals("V"))) {
      total++;
      total++;
      total++;
    }
    
    if (segunda.equals("v") || (segunda.equals("V"))) {
      total++;
      total++;
      total++;
    }
    
    if (tercera.equals("v") || (tercera.equals("V"))) {
      total++;
      total++;
      total++;
    }
    
    if (cuarta.equals("v") || (cuarta.equals("V"))) {
      total++;
      total++;
      total++;
    }
    
    if (quinta.equals("v") || (quinta.equals("V"))) {
      total++;
      total++;
      total++;
    }
    
    if (sexta.equals("v") || (sexta.equals("V"))) {
      total++;
      total++;
      total++;
    }
    
    if (septima.equals("v") || (septima.equals("V"))) {
      total++;
      total++;
      total++;
    }
    
    if (octava.equals("v") || (octava.equals("V"))) {
      total++;
      total++;
      total++;
    }
    
    if (novena.equals("v") || (novena.equals("V"))) {
      total++;
      total++;
      total++;
    }
    
    if (decima.equals("v") || (decima.equals("V"))) {
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
