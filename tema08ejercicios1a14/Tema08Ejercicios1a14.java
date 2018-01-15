/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema08ejercicios1a14;

import tema08ejercicios1a14.matematicas.Varios;
import java.util.Scanner;

public class Tema08Ejercicios1a14 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int x = s.nextInt();

        if (Varios.esCapicua(x)) {
            System.out.println("El " + x + " es capicua.");
        } else {
            System.out.println("El " + x + " no es capicua.");
        }

        if (Varios.esPrimo(x)) {
            System.out.println("El " + x + " es primo.");
        } else {
            System.out.println("El " + x + " no es primo.");
        }

        System.out.println("El siguiente numero primo a " + x + " es el numero "
                + Varios.siguientePrimo(x) + ".");

        if (Varios.digitos(x) > 1) {
            System.out.println("El numero " + x + " esta formado por "
                    + Varios.digitos(x) + " digitos.");
        } else {
            System.out.println("El numero " + x + " esta formado por "
                    + Varios.digitos(x) + " digito.");
        }

        System.out.println("El numero " + x + " al reves es el numero "
                + Varios.voltea(x) + ".");

        System.out.println("Calculadora de potencias");
        System.out.print("Introduzca un numero entero como base: ");
        int base = s.nextInt();
        System.out.print("Introduzca un numero entero como exponente: ");
        int exponente = s.nextInt();

        System.out.println("El resultado de la potencia es "
                + Varios.potencia(base, exponente) + ".");

        System.out.println("Posicion de digitos");
        System.out.print("Introduzca un numero: ");
        int num = s.nextInt();
        System.out.print("Introduzca la posicion del numero que busca: ");
        int posicion = s.nextInt();

        

    }

}
