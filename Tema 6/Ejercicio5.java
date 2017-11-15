/*
 * Tema 6
 * 
 * Ejercicio 5
 * 
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media
 * de esos números.
 * 
 */


public class Ejercicio5 {
  public static void main (String[] args) {
    int numeros;
    int sumaNumeros = 0;
    int numeroMayor = 100;
    int numeroMenor = 199;
    
    for ( int i = 1 ; i <= 50 ; i++){
      numeros =((int)(Math.random() * 100 + 100 ));
      System.out.print(" " + numeros);
      sumaNumeros += numeros;
      
      if (numeros < numeroMenor) {
        numeroMenor = numeros;
      }
    
      if (numeros > numeroMayor) {
        numeroMayor = numeros;
      }
    } 
    
    
    System.out.println("\nLa media total es " + (sumaNumeros / 100));
    System.out.println("El maximo es " + numeroMayor);
    System.out.println("El minimo es " + numeroMenor);
  }
}

