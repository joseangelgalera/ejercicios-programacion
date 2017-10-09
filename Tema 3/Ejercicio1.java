/*
 * Tema 3   
 * 
 * Ejercicio 1
 * 
 * Realiza un programa que pida dos números y que luego muestre el resultado
 * de su multiplicación.
 * 
 */


public class Ejercicio1 {
  public static void main (String args[]) {
    
    String linea;
    
    System.out.print("Introducir primer numero : ");
    linea = System.console().readLine();
    int primerNumero = Integer.parseInt( linea );
    
    System.out.print("Introducir segundo numero : ");
    linea = System.console().readLine();
    int segundoNumero = Integer.parseInt( linea );
    
    int total = (primerNumero * segundoNumero);
    
    System.out.print("El primer numero es " + primerNumero);
    System.out.println(" y el segundo numero es " + segundoNumero);
    System.out.print("El total del producto es " + total);
    
  }
}

