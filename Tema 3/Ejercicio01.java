/*
 * Tema 3
 * 
 * Ejercicio 1
 *
 * Realiza un programa que pida dos números y que luego muestre el resultado
 * de su multiplicación.
 */
package tema.pkg3;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Introduce la x: ");
        int x = s.nextInt();
        System.out.print("Introduce la y: ");
        int y = s.nextInt();
        
        System.out.print(x + (" * ") + y + (" = ") + (x * y));
    }
    
}
