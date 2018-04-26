/*
 * Tema 2 
 *
 * Ejercicio 1
 *
 * Escribe un programa en el que se declaren las variables enteras x e y.
 * Asignales los valores 144 y 999 respectivamente. A continuación, muestra por
 * pantalla el valor de cada variable, la suma, la resta, la división y la 
 * multiplicación.
 */
package tema.pkg2;

public class Ejercicio1 {

    public static void main(String[] args) {
        double x = 144;
        double y = 999;
        
        System.out.printf("%-15s %-1s %-15s %-1s %-15s %-1s %-15s %-1s %-15s\n",
                "Valor", "|", "Suma", "|", "Resta", "|", "Multiplicación", "|", 
                "División");
        System.out.println("----------------|-----------------|----------------"
                + "-|-----------------|---------");
        System.out.printf("%-3s %-10.0f  %-1s %-15.0f %-1s %-15.0f %-1s %-15.0f"
                + " %-1s %-15.3f\n", "x =", x, "|", (x + y), "|" , (x - y), "|"
                , (x * y), "|", (x / y) );
        System.out.printf("%-3s %-11.0f %-17s %-17s %-17s %-17s", "y =", y, "|"
                , "|", "|", "|");
    }   
    
}
