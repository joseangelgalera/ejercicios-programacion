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
        System.out.print("Introduzca la posicion del numero que busca: ");
        int posicion = s.nextInt();
        System.out.print("Introduzca el digito del que desea obtener la "
                + "posicion: ");
        int n = s.nextInt();
        System.out.print("Introduzca cuantos digitos desea quitar al numero por"
                + " detras: ");
        int dMenosDetras = s.nextInt();
        System.out.print("Introduzca cuantos digitos desea quitar al numero por"
                + " delante");
        int dMenosDelante = s.nextInt();
        
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

        System.out.println("En la posicion " + posicion + " esta el numero "
                + Varios.digitoN(x, posicion) + ".");

        System.out.println("El digito " + n + " esta en la posicion "
                + Varios.posicionDeDigito(x, n) + ".");
        
        System.out.println("Al quitarle " + dMenosDetras + " por detras el numero "
                + "resultante es " + Varios.quitaPorDetras(x, dMenosDetras) + ".");

        System.out.println("Calculadora de potencias");
        System.out.print("Introduzca un numero entero como base: ");
        int base = s.nextInt();
        System.out.print("Introduzca un numero entero como exponente: ");
        int exponente = s.nextInt();

        System.out.println("El resultado de la potencia es "
                + Varios.potencia(base, exponente) + ".");
        
        System.out.println("Junta numeros");
        System.out.print("Introduzca el primer numero: ");
        int x1 = s.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        int x2 = s.nextInt();
        
        System.out.println("El numero que surge de combinar el numero " + x1 + 
                " y el numero " + x2 + " es el numero " 
                + Varios.juntaNumeros(x1, x2) + ".");
    }

}
