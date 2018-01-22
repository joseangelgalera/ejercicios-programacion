/*
 * Tema 8
 * 
 * Ejercicio 15
 * 
 * Muestra los números primos que hay entre 1 y 1000.
 * 
 */
package tema08ejercicios1a14;

import tema08ejercicios1a14.matematicas.Varios;


public class Ejercicio15 {

    public static void main(String[] args) {
        
        for(int i = 0; i < 1001; i++){
            if(Varios.esPrimo(i)){
                System.out.print(i + " ");
            }
        }

    }

}
