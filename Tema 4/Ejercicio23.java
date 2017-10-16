/*
 * Tema 4
 * 
 * Ejercicio 23
 * 
 * Escribe un programa que calcule el precio final de un producto según su
 * base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
 * reducido o superreducido) y el código promocional. Los tipos de IVA general,
 * reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códi-
 * gos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
 * respectivamente que no se aplica promoción, el precio se reduce a la mitad,
 * se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si 
 * se muestran los valores correctos, aunque los números no estén tabulados.
 * 
 */

import java.util.Scanner;

public class Ejercicio23 {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la base imponible : ");
    double base = s.nextDouble();
    
    System.out.print("Introduzca el tipo de IVA (general, reducido o");
    System.out.print(" superreducido) : ");
    String iva = s.next();
    
    System.out.print("Introduzca el código promocional");
    System.out.print(" (nopro, mitad, meno5 o 5porc) : ");
    String codigo = s.next();
    
    int tipoIva = 0;
    
    switch (iva) {
      case ("general"):
        tipoIva = 21;
        break;
        
      case ("reducido"):
        tipoIva = 10;
        break;
        
      case ("superreducido"):
        tipoIva = 4;
        break;
      default:
        System.out.println("Introduce un tipo de iva correcto");
        
    }
    
    double ivaTotal = base * tipoIva / 100;
    double precioNormal = base + ivaTotal;
    
    double descuento = 0;
    
    switch (codigo) {
      case ("nopro"):
        break;
        
      case ("mitad"):
        descuento = precioNormal / 2;
        break;
        
      case ("meno5"):
        descuento = 5;
        break;
        
      case ("5porc"):
        descuento =  precioNormal * 0.5;
        break;
        default:
        System.out.println("Introduzca un codigo correcto");
    }
    
    double total = precioNormal - descuento;
    
    System.out.printf("Base imponible       %6.2f\n", base);
    System.out.printf("IVA (%2d%%)            %6.2f\n", tipoIva, ivaTotal);
    System.out.printf("Precio con IVA       %6.2f\n", precioNormal);
    System.out.printf("Cód. promo. (%5s) -%6.2f\n", codigo, descuento);
    System.out.printf("TOTAL                %6.2f", total);
        
    
    
    
  }
}

