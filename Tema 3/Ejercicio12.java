/*
 * Tema 3
 * 
 * Ejercicio 12
 * 
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay
 * que tener en cuenta que la nota del primer examen cuenta el 40% y la del
 * segundo examen un 60%.
 * 
 */


public class Ejercicio12 {
  public static void main (String args[]) {
    
    String linea;
    
    System.out.print("Nota del primer examen : ");
    linea = System.console().readLine();
    double notaPrimera = Double.parseDouble( linea );
    
    System.out.print("Nota deseada para este trimestre : ");
    linea = System.console().readLine();
    double notaDeseada = Double.parseDouble( linea );
    
    System.out.print("Para obtener un " + notaDeseada + " necesitas obtener un " 
    + (notaDeseada - ( notaPrimera * 0.4)) / 0.6);
  }
}

