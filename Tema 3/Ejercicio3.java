/*
 * Tema 3
 * 
 * Ejercicio 3
 * 
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 */
package tema.pkg3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Conversor de pesetas a euros.");
        
        System.out.print("introduce las pesetas: ");
        double pesetas = s.nextInt();
        
        System.out.printf("%1.0f %10s %1.3f %8s", pesetas, "euros son", 
               (pesetas / 166), "pesetas.");
        
        
    }
    
}
