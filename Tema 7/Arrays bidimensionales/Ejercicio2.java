/*
 * Tema 7 - Arrays bidimensionales
 *
 * Ejercicio 2
 *
 * Escribe un programa que pida 20 números enteros. Estos números se deben
 * introducir en un array de 4 filas por 5 columnas. El programa mostrará las
 * sumas parciales de filas y columnas igual que si de una hoja de cálculo se
 * tratara. La suma total debe aparecer en la esquina inferior derecha.
 * 
 */

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] num = new int[4][5];

        int columna;
        int fila;

        System.out.println("Introduce 20 numeros enteros");
        for (columna = 0; columna < 5; columna++) {
            for (fila = 0; fila < 4; fila++) {
                System.out.print("Fila " + fila + " columna " + columna + ": ");
                num[fila][columna] = s.nextInt();
            }
        }

        int sumaFila;
        for (fila = 0; fila < 4; fila++) {
            sumaFila = 0;
            for (columna = 0; columna < 5; columna++) {
                System.out.printf("%7d   ", num[fila][columna]);
                sumaFila += num[fila][columna];
            }
            System.out.printf("|%7d\n", sumaFila);
        }

        for (columna = 0; columna < 5; columna++) {
            System.out.print("----------");
        }
        System.out.println("-----------");

        int sumaColumna;
        int sumaTotal = 0;
        for (columna = 0; columna < 5; columna++) {
            sumaColumna = 0;
            for (fila = 0; fila < 4; fila++) {
                sumaColumna += num[fila][columna];
            }

            sumaTotal += sumaColumna;
            System.out.printf("%7d   ", sumaColumna);
        }
        System.out.printf("|%7d   ", sumaTotal);
    }
}



