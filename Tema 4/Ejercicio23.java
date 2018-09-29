/*
 * Tema 4
 * 
 * Ejercicio 23
 *
 * Escribe un programa que calcule el precio final de un producto según su
 * base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
 * reducido o superreducido) y el código promocional. Los tipos de IVA general,
 * reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
 * promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
 * respectivamente que no se aplica promoción, el precio se reduce a la mitad,
 * se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si 
 * se muestran los valores correctos, aunque los números no estén tabulados.
 * Ejemplo:
 * Introduzca la base imponible: 25
 * Introduzca el tipo de IVA (general, reducido o superreducido): reducido
 * Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad
 * Base imponible 25.00
 * IVA (10%) 2.50
 * Precio con IVA 27.50
 * Cód. promo. (mitad): -13.75
 * TOTAL 13.75
 */
package tema.pkg4;
import java.util.Scanner;

public class Ejercicio23 {
  public static void main (String[]args){
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la base imponible: ");
    double base = s.nextDouble();
    
    System.out.print("Introduzca el tipo de IVA (general, reducido o "
            + "supereducido): ");
    String codIva = s.next();
    
    while ((!codIva.equals("general") && (!codIva.equals("reducido") && 
          (!codIva.equals("supereducido"))))){
      System.out.print("Introduzca un tipo de IVA correcto "
              + "(general, reducido, supereducido): ");
      codIva = s.next();
    }
    
    System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o "
            + "5porc): ");
    String codPromo = s.next();
    
    while ((!codPromo.equals("nopro")) && (!codPromo.equals("mitad")) && 
          (!codPromo.equals("meno5")) && (!codPromo.equals("5porc"))){
      System.out.print("Introduzca un código promocional válido "
              + "(nopro, mitad, meno5, 5porc): ");
      codPromo =s.next();
    }
    
    System.out.printf("%-20s %10.2f€ %n", "Base imponible", base);
    
    switch (codIva){
      case "general":
      double iva = base * 0.21;
      base = base + iva;
      System.out.printf("%-20s %10.2f€ %n", "IVA (21%)", iva);
      System.out.printf("%-20s %10.2f€ %n", "Precio con IVA", base);
      break;
      case "reducido":
      iva = base * 0.10;
      base = base + iva;
      System.out.printf("%-20s %10.2f€ %n", "IVA (10%)", iva);
      System.out.printf("%-20s %10.2f€ %n", "Precio con IVA", base);
      break;
      case "supereducido":
      iva = base * 0.04;
      base = base + iva;
      System.out.printf("%-20s %10.2f€ %n", "IVA (4%)", iva);
      System.out.printf("%-20s %10.2f€ %n", "Precio con IVA", base);
      break;
    }
    
    switch (codPromo){
      case "nopro":
        double no = 0;
        System.out.printf("%-20s %10.2f€ %n", "Cód. promo. (nopro)", no);
        System.out.printf("%-20s %10.2f€ %n", "TOTAL", base);
        break;
      case "mitad":
        double mitadBase = -(base / 2);
        System.out.printf("%-20s %10.2f€ %n", "Cód. promo. (mitad)", mitadBase);
        System.out.printf("%-20s %10.2f€ %n", "TOTAL", base + mitadBase);
        break;
      case "meno5":
        double menos = -5;
        System.out.printf("%-20s %10.2f€ %n", "Cód. promo. (meno5)", menos);
        System.out.printf("%-20s %10.2f€ %n", "TOTAL", base + menos);
        break;
      case "5porc":
        double porc = -(base * 0.05);
        System.out.printf("%-20s %10.2f€ %n", "Cód. promo. (5porc)", porc);
        System.out.printf("%-20s %10.2f€ %n", "TOTAL", base + porc);
        break;
    }
  }
}
