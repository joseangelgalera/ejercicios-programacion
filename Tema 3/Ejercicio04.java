/*
 * Tema 3
 * 
 * Ejercicio 4
 *
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 */
package tema.pkg3;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Calculadora");
        
        System.out.print("Introduce la x: ");
        double x = s.nextDouble();
        
        System.out.print("Introduce la y: ");
        double y = s.nextDouble();
        
        System.out.printf("%-15s %-1s %-15s %-1s %-15s %-1s %-15s %-1s %-15s\n",
                "Valor", "|", "Suma", "|", "Resta", "|", "Multiplicación", "|", 
                "División");
        System.out.println("----------------|-----------------|----------------"
                + "-|-----------------|---------");
        System.out.printf("%-3s %-10.0f  %-1s %-15.0f %-1s %-15.0f %-1s %-15.0f"
                + " %-1s %-15.3f\n", "x =", x, "|", (x + y), "|" , (x - y), "|"
                , (x * y), "|", (x / y) );
        System.out.printf("%-3s %-11.0f %-17s %-17s %-17s %-17s", "y =", y, "|"
                , "|", "|", "|");
    }
    
}
