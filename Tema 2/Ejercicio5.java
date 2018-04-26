/*
 * Tema 2
 * 
 * Ejercicio 5
 * 
 * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
 * convertir deberá estar almacenada en una variable.
 */
package tema.pkg2;

public class Ejercicio5 {

    public static void main(String[] args) {
       double pesetas = 5 ;
        
       System.out.printf("%1.0f %10s %1.3f %8s", pesetas, "euros son", 
               (pesetas / 166), "pesetas.");
       
    }
    
}
