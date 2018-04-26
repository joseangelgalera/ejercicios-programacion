/*
 * Tema 2
 * 
 * Ejercicio 3
 * 
 * Crea las variables nombre, direccion y telefono y asígnale los valores 
 * correspondientes. Muestra los valores de esas variables por pantalla de tal 
 * forma que el resultado del programa sea el mismo que en el ejercicio 2.
 */
package tema.pkg2;

public class Ejercicio3 {

    public static void main(String[] args) {
        String nombre = "José Ángel";
        String direccion = "C/Moral";
        int telefono = 685359704;
        
        System.out.printf("%-10s %-1s %-10s\n", "Nombre", ":", 
                nombre);
        System.out.printf("%-10s %-1s %-10s\n", "Dirección", ":", 
                direccion);
        System.out.printf("%-10s %-1s %-10d\n", "Telefono", ":", 
                telefono);
    }
    
}
