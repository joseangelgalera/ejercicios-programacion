/*
 * Ejercicio 3
 *
 * Escribe un programa que muestre por pantalla 10 palabras en inglés junto
 * a su correspondiente traducción al castellano. Las palabras deben estar
 * distribuidas en dos columnas y alineadas a la izquierda.
 */
package tema.pkg1;

public class Ejercicio03 {

    public static void main(String[] args) {
        System.out.printf("%-10s  %-10s\n", "Palabra", "Traduccción");
        System.out.println("-----------------------");
        System.out.printf("%-10s  %-10s\n", "Window", "Ventana");
        System.out.printf("%-10s  %-10s\n", "Tree", "Arbol");
        System.out.printf("%-10s  %-10s\n", "Mountain", "Montaña");
        System.out.printf("%-10s  %-10s\n", "Palace", "Palacio");
        System.out.printf("%-10s  %-10s\n", "Cloud", "Nube");
        System.out.printf("%-10s  %-10s\n", "River", "Rio");
        System.out.printf("%-10s  %-10s\n", "Forest", "Bosque");
        System.out.printf("%-10s  %-10s\n", "Sky", "Cielo");
        System.out.printf("%-10s  %-10s\n", "Building", "Edificio");
        System.out.printf("%-10s  %-10s\n", "Train", "Tren");
    }
    
}
