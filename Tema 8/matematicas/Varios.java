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
    public static long potencia(int base, int exponente) {
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
    public static int voltea(int x) {
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
     * @param x un número entero positivo.
     * @param posicion una posicion en el numero.
     * @return <code></code> el numero que esta en la posicion introducida.
     */
    public static int digitoN(int x, int posicion) {
        x = voltea(x);

        for(int i = 0; i < posicion; i++) {
            x = x / 10;
        }

        return (int) x % 10;
    }

    /**
     * posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
     * dentro de un número entero. Si no se encuentra, devuelve -1.
     *
     * @param x un numero entero.
     * @param n digito que se busca.
     * @return la posición de la primera ocurrencia del dígito,si no se
     * encuentra, devuelve -1.
     */
    public static int posicionDeDigito(int x, int n) {
        int i;

        for (i = 1; (i < digitos(x)) && (digitoN(x, i) != n); i++) {
        }

        if (i == digitos(x)) {
            return -1;
        } else {
            return i;
        }
    }

    /**
     * quitaPorDetras: Le quita a un número n dígitos por detrás (por la
     * derecha).
     *
     * @param x un numero entero.
     * @param dMenosDetras cuantos digitos se quitan por detras.
     * @return el numero sin los digitos que se le han quitado por detras.
     */
    public static int quitaPorDetras(int x, int dMenosDetras) {
        return x / (int) potencia(10, dMenosDetras);
    }

    /**
     * quitaPorDelante: Le quita a un número n dígitos por detrás (por la
     * derecha).
     *
     * @param x un numero entero.
     * @param dMenosDelante cuantos digitos se quitan por delante.
     * @return el numero sin los digitos que se le han quitado por delante.
     */
    public static int quitaPorDelante(int x, int dMenosDelante) {
        x = pegaPorDetras(x, 1);
        x = voltea(pegaPorDetras(voltea(x), dMenosDelante));
        x = quitaPorDetras(x, 1);
        return x;
    }

    /**
     * pegaPorDetras: Añade un dígito a un número por detrás.
     *
     * @param x un numero entero.
     * @param dMasDetras cuantos digitos pega por detras.
     * @return el numero con los digitos pegados.
     */
    public static int pegaPorDetras(int x, int dMasDetras) {
        return juntaNumeros(x, dMasDetras);
    }

    /**
     * pegaPorDelante: Añade un dígito a un número por delante.
     *
     * @param x un numero entero.
     * @param dMasDelante cuantos digitos pega por delante.
     * @return el numero con los digitos pegados.
     */
    public static int pegaPorDelante(int x, int dMasDelante) {
        return juntaNumeros(dMasDelante, x);
    }

    /**
     * trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro
     * de un número y devuelve el trozo correspondiente.
     *
     * @param numero un numero entero.
     * @param inicio prosicion inicial dentro del numero entero.
     * @param fin prosicion final dentro del numero entero.
     * @return el trozo dle numero correspondiente.
     */
    public static int trozoDeNumero(int numero, int inicio, int fin) {
        int longitud = digitos(numero);
        numero = quitaPorDelante(numero, inicio);
        numero = quitaPorDetras(numero, longitud - fin - 1);
        return numero;
    }

    /**
     * juntaNumeros: Pega dos números para formar uno.
     *
     * @param x1 un numero entero.
     * @param x2 el segundo numero entero.
     * @return el numero que surge de combinar los dos numeros.
     */
    public static int juntaNumeros(int x1, int x2) {
        return (int) (x1 * potencia(10, digitos(x1))) + x2;
    }
}
