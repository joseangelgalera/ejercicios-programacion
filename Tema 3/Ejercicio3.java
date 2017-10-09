/*
 * Tema 3
 * 
 * Ejercicio 3
 * 
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 * 
 */


public class Ejercicio3 {
  public static void main (String args[]) {
    
    String linea;
    
    System.out.print("Introducir pesetas : ");
    linea = System.console().readLine();
    double pesetas = Double.parseDouble( linea );
    
    double euros = (pesetas / 166.386);
    
    System.out.print(pesetas + " pesetas son " +  euros + " euros.");
  }
}

