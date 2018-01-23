/*
 * Tema 8
 * 
 * Ejercicio 17
 *
 * Escribe un programa que pase de binario a decimal.
 * 
 */
package tema08ejercicios1a14;

import java.util.Scanner;
import tema08ejercicios1a14.matematicas.Varios;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int decimal = 0;
        
        System.out.println("Conversor de binario a decimal");
        System.out.print("Introduzca un numero binario: ");
        int bin = s.nextInt();
        
        int bits = Varios.digitos(bin);
        
        for(int i = 0; i < bits; i++){
           decimal += Varios.digitoN(bin, bits - i - 1) * Varios.potencia(2, i);
        }
        
        System.out.print("El numero " + bin + " en decimal es " + decimal + ".");
    }
    
}
