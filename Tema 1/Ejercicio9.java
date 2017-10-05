/*
 * Tema 1
 * 
 * Ejercicio 9
 * 
 * Escribe un programa que pinte por pantalla alguna escena - el campo, la
 * habitación de una casa, un aula, etc. - o algún objeto animado o inanimado
 * - un coche, un gato, una taza de café, etc. Ten en cuenta que puedes utilizar
 * caracteres como *, +, <, #, @, etc. ¡Échale imaginación!
 * 
 */


public class Ejercicio9 {
  public static void main (String args[]) {
    
    String verde = "\033[32m";
    String blanco = "\033[39m";
    String celeste = "\033[36m";
    String marron = "\033[33m";
    
    System.out.println(celeste + 
    "██████████████████████████████████████████████");
    System.out.println(celeste + "██████████" + blanco +"████████" + celeste + 
    "████████████████████████████");
    System.out.println(celeste + "████████" + blanco + "█████████████" 
    + celeste + "████████████"+ verde +"█████" + celeste + "████████");
    System.out.println(celeste + "███████" + blanco + "███████████████" 
    + celeste + "██████████" + verde + "███████" + celeste + "███████");
    System.out.println(celeste + "██████" + blanco + "██████████████████"
    + celeste + "███████" + verde + "█████████" + celeste + "██████");
    System.out.println(celeste + "██████"+ blanco +"███████████████████"
    + celeste + "█████" + verde + "███████████" + celeste + "█████");
    System.out.println(celeste + "███████" + blanco + "████████████████" 
    + celeste + "██████" + verde + "█████████████" + celeste + "████");
    System.out.println(celeste + "████████" + blanco + "██████████████" 
    + celeste + "██████" + verde + "███████████████" + celeste + "███");
    System.out.println(celeste + "██████████" + blanco + "██████████" 
    + celeste + "███████" + verde + "█████████████████" + celeste + "██");
    System.out.println(celeste + "███████████████████████████" + verde + 
    "█████████████████" + celeste + "██");
    System.out.println(celeste + "████████████████████████████" + verde + 
    "███████████████" + celeste + "███");
    System.out.println(celeste + "█████████████████████████████" + verde + 
    "█████████████" + celeste + "████");
    System.out.println(celeste + "██████████████████████████████" + verde + 
    "███████████"+ celeste + "█████");
    System.out.println(celeste + "███████████████████████████████" + verde + 
    "█████████" + celeste + "██████");
    System.out.println(celeste + "█████████████████████████████████" + marron + 
    "█████" + celeste + "████████");
    System.out.println(celeste + "█████████████████████████████████" + marron + 
    "█████" + celeste + "████████");
    System.out.println(celeste + "█████████████████████████████████" + marron + 
    "█████" + celeste + "████████");
    System.out.println(celeste + "█████████████████████████████████" + marron + 
    "█████" + celeste + "████████");
    System.out.println(celeste + "█████████████████████████████████" + marron + 
    "█████" + celeste + "████████");
    System.out.println(celeste + "█████████████████████████████████" + marron + 
    "█████" + celeste + "████████");
    System.out.println(celeste + "█████████████████████████████████"+ marron + 
    "█████" + celeste + "████████");
    System.out.println(verde + 
    "██████████████████████████████████████████████");
    System.out.println(verde + 
    "██████████████████████████████████████████████");
    
	}
}

