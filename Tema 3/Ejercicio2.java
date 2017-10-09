/*
 * Tema 3
 * 
 * Ejercicio 2
 * 
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 * 
 */


public class Ejercicio2 {
  public static void main (String args[]) {
    
    String linea;
    
    System.out.print("Introducir euros : ");
    linea = System.console().readLine();
    double euros = Double.parseDouble( linea );
    
    double pesetas = (euros * 166.386);
    
    System.out.print(euros + " euros son " +  pesetas + " pesetas.");
  }
}

