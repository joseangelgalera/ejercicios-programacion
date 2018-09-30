/*
 * TEma 4
 * 
 * Ejercicio 24
 * 
 * Escribe un programa que genere la nómina (bien desglosada) de un empleado
 * según las siguientes condiciones:
 * • Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3
 * - Jefe de proyecto), los días que ha estado de viaje visitando clientes
 * durante el mes y su estado civil (1 - Soltero, 2 - Casado).
 * • El sueldo base según el cargo es de 950, 1200 y 1600 euros según
 * si se trata de un prog. junior, un prog. senior o un jefe de proyecto
 * respectivamente.
 * • Por cada día de viaje visitando clientes se pagan 30 euros extra en
 * concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será
 * de un 25% en caso de estar soltero y un 20% en caso de estar casado.
 * Ejemplo:
 * 1 - Programador junior
 * 2 - Prog. senior
 * 3 - Jefe de proyecto
 * Introduzca el cargo del empleado (1 - 3): 2
 * ¿Cuántos días ha estado de viaje visitando clientes? 5
 * Introduzca su estado civil (1 - Soltero, 2 - Casado): 2
 *
 * ￿Sueldo base 1200,00 ￿
￿ * Dietas ( 5 viajes) 150,00 ￿
 *
￿ * Sueldo bruto 1350,00 ￿
￿ * Retención IRPF (20%) 270,00 ￿
 *
￿ * Sueldo neto 1080,00 ￿
 */
package tema.pkg4;
import java.util.Scanner;

public class Ejercicio24 {
  public static void main (String[]args){
    Scanner s = new Scanner(System.in);
    
    System.out.println("1 - Programador junior");
    System.out.println("2 - Prog. senior");
    System.out.println("3 - Jefe de proyecto");
    
    System.out.print("Introduzca el cargo del empleado (1 - 3): ");
    int cargo = s.nextInt();
    
    while (cargo > 3){
      System.out.print("Solo puede introducir un numero del 1 al 3 para "
              + "seleccionar el cargo (1 - Programador junior, 2 - Prog. senior"
              + ", 3 - Jefe de proyecto): ");
      cargo = s.nextInt();
    }
    
    System.out.print("¿Cuántos días ha estado visitando clientes?: ");
    int dias = s.nextInt();
    
    while (dias > 31){
      System.out.print("Solo puede introducir un maximo de 31 días: ");
      dias = s.nextInt();
    }
    
    System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
    int estado = s.nextInt();
    
    while (estado > 2){
      System.out.print("Solo puede introducir un numero del 1 al 2 para "
              + "seleccionar su estado civil (1 - Soltero, 2 - Casado): ");
      estado = s.nextInt();
    }
    
    switch (cargo){
      case 1:
        double sueldoBase = 950;
        double dietas = dias * 30;
        double sueldoBruto = sueldoBase + dietas;
        System.out.printf("%-21s %10.2f€ %n", "Sueldo base", sueldoBase);
        System.out.printf("%-8s %2d %-2s %12.2f€ %n", "Dietas ("
                , dias, "viajes)", dietas);
        System.out.printf("%-21s %10.2f€ %n", "Sueldo bruto", sueldoBruto);
        if (estado == 1){
          double irpf = sueldoBruto * 0.25;
          double sueldoNeto = sueldoBruto - irpf;
          System.out.printf("%-21s %10.2f€ %n", "IRPF (21%)", irpf);
          System.out.printf("%-21s %10.2f€ %n", "Sueldo Neto", sueldoNeto);
        } else {
          double irpf = sueldoBruto * 0.2;
          double sueldoNeto = sueldoBruto - irpf;
          System.out.printf("%-21s %10.2f€ %n", "IRPF (20%)", irpf);
          System.out.printf("%-21s %10.2f€ %n", "Sueldo Neto", sueldoNeto);
        }
        break;
      case 2:
        sueldoBase = 1200;
        dietas = dias * 30;
        sueldoBruto = sueldoBase + dietas;
        System.out.printf("%-21s %10.2f€ %n", "Sueldo base", sueldoBase);
        System.out.printf("%-8s %2d %-2s %12.2f€ %n", "Dietas ("
                , dias, "viajes)", dietas);
        System.out.printf("%-21s %10.2f€ %n", "Sueldo bruto", sueldoBruto);
        if (estado == 1){
          double irpf = sueldoBruto * 0.25;
          double sueldoNeto = sueldoBruto - irpf;
          System.out.printf("%-21s %10.2f€ %n", "IRPF (21%)", irpf);
          System.out.printf("%-21s %10.2f€ %n", "Sueldo Neto", sueldoNeto);
        } else {
          double irpf = sueldoBruto * 0.2;
          double sueldoNeto = sueldoBruto - irpf;
          System.out.printf("%-21s %10.2f€ %n", "IRPF (20%)", irpf);
          System.out.printf("%-21s %10.2f€ %n", "Sueldo Neto", sueldoNeto);
        }
        break;
      case 3:
        sueldoBase = 1600;
        dietas = dias * 30;
        sueldoBruto = sueldoBase + dietas;
        System.out.printf("%-21s %10.2f€ %n", "Sueldo base", sueldoBase);
        System.out.printf("%-8s %2d %-2s %12.2f€ %n", "Dietas ("
                , dias, "viajes)", dietas);
        System.out.printf("%-21s %10.2f€ %n", "Sueldo bruto", sueldoBruto);
        if (estado == 1){
          double irpf = sueldoBruto * 0.25;
          double sueldoNeto = sueldoBruto - irpf;
          System.out.printf("%-21s %10.2f€ %n", "IRPF (21%)", irpf);
          System.out.printf("%-21s %10.2f€ %n", "Sueldo Neto", sueldoNeto);
        } else {
          double irpf = sueldoBruto * 0.2;
          double sueldoNeto = sueldoBruto - irpf;
          System.out.printf("%-21s %10.2f€ %n", "IRPF (20%)", irpf);
          System.out.printf("%-21s %10.2f€ %n", "Sueldo Neto", sueldoNeto);
        }
        break;
    }
  }
}
