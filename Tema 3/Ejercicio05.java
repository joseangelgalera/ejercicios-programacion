/*
 * Tema 3
 *
 * Ejercicio 5
 * 
 * Escribe un programa que calcule el área de un rectángulo.
 */
package tema.pkg3;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Cálculo del área del rectángulo (base * altura)");
        
        System.out.print("Introduce la base: ");
        double base = s.nextDouble();
        
        System.out.print("Introduce la altura: ");
        double altura = s.nextDouble();
        
        System.out.printf("\n%-15s %-1s %-15s %-1s %-15s\n"
                ,"Base", "|", "Altura", "|", "Área");
        System.out.println("----------------|-----------------|--------------");
        System.out.printf("%-15.2f %-1s %-15.2f %-1s %-15.2f\n",
        +  base, "|", altura, "|" , (base * altura));
        
        
        
    }
    
}
