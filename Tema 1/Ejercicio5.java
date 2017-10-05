/*
 * Tema 1
 * 
 * Ejercicio 5
 * 
 * Modifica el programa anterior añadiendo colores. Puedes mostrar cada asig-
 * natura de un color diferente.
 * 
 */


public class Ejercicio5 {
  public static void main (String args[]) {
    
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    String celeste = "\033[36m";
    
    System.out.println(naranja +
    "Hora   Lunes  Martes  Miercoles  Jueves  Viernes");
    System.out.println("------------------------------------------------");
    System.out.println(blanco + "8:15" + rojo + "   Progr" + azul + "  Siste" + 
    rojo + "   Progr" + celeste + "\t Entor" + azul + "\t Siste  ");
    System.out.println(blanco + "9:15" + rojo + "   Progr" + azul + "  Siste" + 
    rojo + "   Progr" + celeste + "\t Entor" + azul + "\t Siste  ");
    System.out.println(blanco + "10:15" + rojo + "  Progr" + azul + "  Siste" + 
    rojo + "   Progr" + celeste + "\t Entor" + azul + "\t Siste  ");
    System.out.println(blanco + "11:45" + verde + "  Bases" + morado + "  Lengu"
     + verde + "   Bases" + morado + "\t Lengu" + naranja + "\t Forma  ");
    System.out.println(blanco + "12:45" + verde + "  Bases" + rojo + "  Progr" 
    + verde + "   Bases" + morado + "\t Lengu" + naranja + "\t Forma  ");
    System.out.println(blanco + "13:45" + verde + "  Bases" + rojo + "  Progr" 
    + verde + "   Bases" + morado + "\t Lengu" + naranja + "\t Forma  ");
  }
}

