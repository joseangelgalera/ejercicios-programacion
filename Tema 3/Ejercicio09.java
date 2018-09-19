/*
 * Tema 4
 * 
 * Ejercicio 9
 *
 * Escribe un programa que calcule el volumen de un cono según la fórmula 
 * V = pi * r² * h / 3  
 */
package tema.pkg3;

import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Cálculo del volumen del cono "
                + "( Volumen = pi * r² * h / 3)");

        System.out.print("Introduzca el radio(en cm): ");
        double radio = s.nextDouble();

        System.out.print("Introduzca la altura(en cm): ");
        double altura = s.nextDouble();

        System.out.printf("\n%-15s %-1s %-15s %-1s %-15s\n",
                 "Radio", "|", "Altura", "|", "Volumen");
        System.out.println("----------------|-----------------|--------------");
        System.out.printf("%-3.2f %-10s %-1s %-3.2f %-10s %-1s %-3.2f %-2s\n",
                +radio, "cm", "|", altura, "cm", "|", (3.14 * radio 
                * radio * altura / 3 ), "cm³");
    }

}
