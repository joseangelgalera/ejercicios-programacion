/*
 * Tema 3
 * 
 * Ejercicio 10
 * 
 * Realiza un conversor de Mb a Kb.
 * 
 */


public class Ejercicio10 {
  public static void main (String args[]) {
    
    String linea;
    
    System.out.print("Introducir Mb : ");
    linea = System.console().readLine();
    int Mb = Integer.parseInt( linea );
    
    int Kb = (Mb * 1000);
    
    System.out.print(Mb + " Mb son " +  Kb + " Kb.");
  }
}

