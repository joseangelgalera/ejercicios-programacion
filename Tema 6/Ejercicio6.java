/*
 * Tema 6
 * 
 * Ejercicio 6
 * 
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario
 * debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
 * fallido, el programa dirá cuántas oportunidades quedan y si el número
 * introducido es menor o mayor que el número secreto.
 * 
 */

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        System.out.println("¿Puedes adviniar el numero?");

        int numero = 0;
        int numeroInt = 0;
        int contador = 5;

        for (int i = 1; i <= 5; i++) {
            numero = ((int) (Math.random() * 100 + 1));
            System.out.print("Introduce el numero :");
            numeroInt = s.nextInt();
            if (numeroInt == numero) {
                System.out.println("Has acertado el numero es " + numeroInt);
            } else {
                contador --;
                System.out.print("Ese no es el numero intentalo de nuevo ");
                System.out.println("te quedan " + contador + " oportunidades.");
            }
        }
        
        if (numeroInt != numero) {
            System.out.println("Lo siento el numero era " + numero);
            
        }
        
    }
    
}
