/*
 * Tema 8
 * 
 * Ejercicio 16
 * 
 * Muestra los números capicúa que hay entre 1 y 99999.
 * 
 */

import tema08ejercicios1a14.matematicas.Varios;

public class Ejercicio16 {

    public static void main(String[] args) {
        for(int i = 0; i < 100000; i++){
            if(Varios.esCapicua(i)){
                System.out.print(i + " ");
            }
        }
    }
    
}
