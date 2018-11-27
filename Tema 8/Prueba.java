/*
 * Tema 8
 * 
 * Prueba de las funciones de los ejercicios del 1 al 14
 */
package tema.pkg8;

import tema.pkg8.Numeros;
import java.util.Scanner;

public class Prueba {

  public static void main(String[] args) {
    System.out.println(ejercicios1al14.Numeros.voltea2(4567890) );

    System.out.println(matematicas.Numeros.posicionDeDigito3(45920,0) );
    System.out.println(matematicas.Numeros.quitaPorDetras(54798,2) );
    System.out.println(matematicas.Numeros.quitaPorDelante(54798,2) );
    System.out.println(matematicas.Numeros.pegaPorDetras(54798, 234));
    System.out.println(matematicas.Numeros.pegaPorDelante(54798, 234));
    System.out.println(matematicas.Numeros.trozoDeNumero(5479, 1, 2));

    System.out.println(matematicas.Numeros.juntaNumeros(5479, 2222));

    System.out.println(matematicas.Numeros.binarioADecimal(10011011));
    System.out.println(matematicas.Numeros.decimalABinario(155));
    System.out.println(matematicas.Numeros.octalADecimal(7014));
    System.out.println(matematicas.Numeros.decimalAOctal(34578));
    System.out.println(matematicas.Numeros.decimalAHexadecimal(495));
    System.out.println(matematicas.Numeros.hexadecimalADecimal("4f"));
  }

}
