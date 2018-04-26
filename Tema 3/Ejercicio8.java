/*
 * Tema 3
 * 
 * Ejercicio 8
 * 
 * Escribe un programa que calcule el salario semanal de un empleado en base
 * a las horas trabajadas, a razón de 12 euros la hora.
 */
package tema.pkg3;

    import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Calculadora de salario semanal");
        
        System.out.print("Introduzca las horas que has trabajado:");
        int horas = s.nextInt();
        
        System.out.println("Ha trabajado: " + horas + "h.");
        System.out.println("Su salario de esta semana es de: " + (horas * 12) + 
                "€");
    }
    
}
