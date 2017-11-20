/*
 * Tema 6
 * 
 * Ejercicio 14
 *
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
 * El programa intentará adivinar el número que estás pensando - un número
 * entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido,
 * el programa debe preguntar si el número que estás pensando es mayor o menor
 * que el que te acaba de decir.
 *
 */

import java.util.Scanner;

public class ejercicio14 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("¿Puedo adivinar tu numero?");

        int numero;
        String respuesta;
        int contador = 5;
        String no;
        int minimo = 0;
        int maximo = 100;

        do {
            numero = ((int) (Math.random() * (maximo - minimo) + minimo));
            System.out.println("¿Es este " + numero + " tu numero?");
            System.out.print("Responde si, si acierto; o mayor ");
            System.out.println("o menor en caso negativo.");
            respuesta = s.next();

            if (respuesta.equals("si")) {
                System.out.println("Lo he adivinado");
            }

            if ((respuesta.equals("mayor")) && (contador > 0)) {
                contador--;
                System.out.println("Me quedan " + contador + " intentos.");
                minimo = numero + 1;
                
            } 
            if ((respuesta.equals("menor")) && (contador > 0)) {
                contador--;
                System.out.println("Me quedan " + contador + " intentos.");
                maximo = numero - 1;
            }

        } while ((contador > 0) && (!"si".equals(respuesta)));
        if (contador == 0) {
            System.out.println("Enhorabuena me has ganado");
        }
    }
}
