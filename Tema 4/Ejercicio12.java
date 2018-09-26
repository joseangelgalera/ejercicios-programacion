/*
 * Tema 4
 * 
 * Ejercicio 12
 *
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
 * que se imparten en el curso. Cada pregunta acertada sumará un punto. El
 * programa mostrará al final la calificación obtenida. Pásale el 
 * minicuestionario a tus compañeros y pídeles que lo hagan para ver qué tal 
 * andan de conocimientos en las diferentes asignaturas del curso.
 */
package tema.pkg4;
import java.util.Scanner;

public class Ejercicio12 {
  public static void main (String[]args){
    Scanner s = new Scanner(System.in);
    
    System.out.print("Cuestionario sobre asignaturas de 1º de DAM.\n\n");
    
    System.out.println("1.¿Con que comando se clonan los repositorios? : ");
    System.out.println("a).git push");
    System.out.println("b).git add");
    System.out.println("c).git commit");
    System.out.print("d).git clone\n\n");
    String primera = s.nextLine();
    
    System.out.println("2.¿Qué significa que una base de datos es integra? : ");
    System.out.println("a)Que esta completa");
    System.out.println("b)Que no contiene información errónea");
    System.out.println("c)Que esta fragmentada");
    System.out.print("d)Todas las anteriores\n\n");
    String segunda = s.nextLine();
    
    System.out.println("3.¿para que sirve el comando println? : ");
    System.out.println("a)Para hacer un salto de línea");
    System.out.println("b)Para generar un espacio");
    System.out.println("c)Para generar una sangría");
    System.out.print("d)para formatear\n\n");
    String tercera = s.nextLine();
    
    System.out.println("4.¿Con que etiqueta de html se aplica la negrita? : ");
    System.out.println("a)<body>");
    System.out.println("b)<p>");
    System.out.println("c)<strong>");
    System.out.print("d)<em>\n\n");
    String cuarta = s.nextLine();
    
    System.out.println("5.¿Con que etiqueta de html se aplica la cursiva? : ");
    System.out.println("a)<strong>");
    System.out.println("b)<p>");
    System.out.println("c)<em>");
    System.out.print("d)<head>\n\n");
    String quinta = s.nextLine();
    
    System.out.println("6.¿Para qué sirve el comando rm de Linux? : ");
    System.out.println("a)Para mover");
    System.out.println("b)Para renombrar");
    System.out.println("c)Para borrar");
    System.out.print("d)Para copiar\n\n");
    String sexta = s.nextLine();
    
    System.out.println("7.¿Cúal de las siguientes respuestas es un SGBD? : ");
    System.out.println("a)Power point");
    System.out.println("b)Excel");
    System.out.println("c)Geany");
    System.out.print("d)Access\n\n");
    String septima = s.nextLine();
    
    System.out.println("8.¿Cuál fue el primer ordenador de la historia? : ");
    System.out.println("a)Mark 1");
    System.out.println("b)Z1");
    System.out.println("c)Eniac");
    System.out.print("d)Univac-1\n\n");
    String octava = s.nextLine();
    
    System.out.println("9.¿Para que sirve la etiqueta </p> de html? : ");
    System.out.println("a)Para iniciar el encabezamiento");
    System.out.println("b)Para inciar un parrafo");
    System.out.println("c)Para tachar palabras");
    System.out.print("d)Para finalizar un parrafo\n\n");
    String novena = s.nextLine();
    
    System.out.println("10.¿Para que sirve el comando mv de Linux? : ");
    System.out.println("a)Para renombrar");
    System.out.println("b)Para copiar");
    System.out.println("c)Para mover");
    System.out.print("d)La a y la c son correctas\n\n");
    String decima = s.nextLine();
    
    int total = 0;
    
    if (primera.equals("d")) {
      total++;
    }
      
    if (segunda.equals("b")) {
      total++;
    }
    
    if (tercera.equals("a")) {
      total++;
    }
    
    if (cuarta.equals("c")) {
      total++;
    }
    
    if (quinta.equals("c")) {
      total++;
    }
    
    if (sexta.equals("c")) {
      total++;
    }
    
    if (septima.equals("d")) {
      total++;
    }
    
    if (octava.equals("b")) {
      total++;
    }
    
    if (novena.equals("d")) {
      total++;
    }
    
    if (decima.equals("d")) {
      total++;
      }
    
    System.out.print("El resultado son " + total + " puntos.");
  }
}
