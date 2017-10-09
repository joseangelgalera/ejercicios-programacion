/*
 * Tema 3
 * 
 * Ejercicio 11
 * 
 * Realiza un conversor de Kb a Mb.
 * 
 */


public class Ejercicio11 {
  public static void main (String args[]) {
    
    String linea;
    
    System.out.print("Introducir Kb : ");
    linea = System.console().readLine();
    int Kb = Integer.parseInt( linea );
    
    double Mb = (Kb / 1000);
    
    System.out.print(Kb + " Kb son " +  Mb + " MB.");
  }
}

