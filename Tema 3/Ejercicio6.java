/*
 * Tema 3
 * 
 * Ejercicio 6
 * 
 * Escribe un programa que calcule el área de un triángulo.
 */
package tema.pkg3;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Cálculo del área del triángulo(base * altura / 2)");
        
        System.out.print("Introduce la base(en cm): ");
        double base = s.nextDouble();
        
        System.out.print("Introduce la altura(en cm): ");
        double altura = s.nextDouble();
        
        System.out.printf("\n%-15s %-1s %-15s %-1s %-15s\n"
                ,"Base", "|", "Altura", "|", "Área");
        System.out.println("----------------|-----------------|--------------");
        System.out.printf("%-3.2f %-10s %-1s %-3.2f %-10s %-1s %-3.2f %-2s\n",
        +  base, "cm", "|", altura, "cm", "|" , (base * altura / 2), "cm²");
    }
    
}
