/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema08ejercicios1a14.matematicas;

/**
 *
 * @author josea
 */
public class Varios {

    /**
     * esCapicua: Devuelve verdadero si el número que se pasa como parámetro es
     * capicúa y falso en caso contrario.
     *
     * @param x un número entero positivo.
     * @return <code>true or false</code> si el número es capicua.
     */
    public static boolean esCapicua(int x) {
        int numero = x;
        int voltea = 0;

        while (numero > 0) {
            voltea = (voltea * 10) + (numero % 10);
            numero /= 10;
            if (voltea == x) {
                return true;
            }
        }
        return false;
    }

    /**
     * esPrimo: Comprueba si un número entero positivo es primo o no. Un número
     * es primo cuando únicamente es divisible entre él mismo y la unidad.
     *
     * @param x un número entero positivo.
     * @return <code>true or false</code> si el número es primo o no.
     */
    public static boolean esPrimo(int x) {
        for (int i = 2; i < x; i++) {
            if ((x % i) == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * siguientePrimo: Devuelve el menor primo que es mayor al número que se
     * pasa como parámetro.
     *
     * @param x un número entero positivo.
     * @return <code>x</code> con el siguiente numero que es mayor.
     */
    public static int siguientePrimo(int x) {
        while (!esPrimo(++x)) {
        }
        return x;
    }

    /**
     * potencia: Dada una base y un exponente devuelve la potencia.
     *
     * @param base un número entero positivo como base.
     * @param exponente un número entero positivo como exponente.
     * @return con el resultado de la potencia.
     */
    public static double potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        if (exponente < 0) {
            return 1 / potencia(base, -exponente);
        }

        int n = 1;

        for (int i = 0; i < Math.abs(exponente); i++) {
            n = n * base;
        }

        return n;
    }

    /**
     * digitos: Cuenta el número de dígitos de un número entero.
     *
     * @param x un número entero positivo.
     * @return con el total de digitos que forman el numero.
     */
    public static int digitos(int x) {
        if (x < 0) {
            x = -x;
        }

        if (x == 0) {
            return 1;
        } else {
            int n = 0;
            while (x > 0) {
                x = x / 10;
                n++;
            }
            return n;
        }
    }

    /**
     * voltea: Le da la vuelta a un número.
     *
     * @param x un número entero positivo.
     * @return <code>voltea</code> el numero volteado.
     */
    public static long voltea(int x) {
        if (x < 0) {
            return -voltea(-x);
        }

        int voltea = 0;

        while (x > 0) {
            voltea = (voltea * 10) + (x % 10);
            x = x / 10;
        }

        return voltea;
    }

    /**
     * digitoN: Devuelve el dígito que está en la posición n de un número
     * entero. Se empieza contando por el 0 y de izquierda a derecha.
     *
     * @param num un número entero positivo.
     * @param posicion una posicion en el numero.
     * @return <code>voltea</code> el numero volteado.
     */
}
