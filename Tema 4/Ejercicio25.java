/*
 * Tema 4
 * 
 * Ejercicio 25
 *
 * La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
 * máxima calidad y nos ha pedido hacer un configurador que calcule el precio
 * según el alto y el ancho. El precio base de una bandera es de un céntimo de
 * euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
 * se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
 * son 3.25 €. El IVA ya está incluido en todas las tarifas.
 * Ejemplo 1:
 * Introduzca la altura de la bandera en cm: 20
 * Ahora introduzca la anchura: 35
 * ¿Quiere escudo bordado? (s/n): n
 * Gracias. Aquí tiene el desglose de su compra.
 * Bandera de 700 cm²: 7,00 €
 * Sin escudo: 0,00 €
 * Gastos de envío: 3,25 €
 * Total: 10,25 €
 */
package tema.pkg4;
import java.util.Scanner;

public class Ejercicio25 {
  public static void main (String[]args){
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la altura de la bandera en cm: ");
    int altura = s.nextInt();
    
    System.out.print("Ahora introduzca la anchura: ");
    int anchura = s.nextInt();
    
    System.out.print("¿Quiere escudo bordado? (s/n): ");
    String bordado = s.next();
    
    while ((!bordado.equals("s")) && (!bordado.equals("n"))){
      System.out.print("Introduzca si (s) o no (n): ");
      bordado = s.next();
    }
    
    double bordadoSi = 2.50;
    
    double gastosEnv = 3.25;
    
    System.out.println("Gracias. Aquí tiene el desglose de su compra.");
    
    int bandera = altura * anchura;
    double precioBase = (double)bandera / 100;
    System.out.printf("%-8s %4dcm²: %12.2f€ %n", "Bandera de"
                , bandera, precioBase);
    if (bordado.equals("s")){
      double total = precioBase + bordadoSi + gastosEnv;
      System.out.printf("%-21s %10.2f€ %n", "Con escudo: ", bordadoSi);
      System.out.printf("%-21s %10.2f€ %n", "Gastos de envio: ", gastosEnv);
      System.out.printf("%-21s %10.2f€ %n", "Total :", total);
    } else {
      double bordadoNo = 0;
      double total = precioBase + gastosEnv;
      System.out.printf("%-21s %10.2f€ %n", "Sin escudo: ", bordadoNo);
      System.out.printf("%-21s %10.2f€ %n", "Gastos de envio: ", gastosEnv);
      System.out.printf("%-21s %10.2f€ %n", "Total :", total);
    }
  }
}
