/*
 * Tema 9
 *
 * Ejercicio 1
 * 
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 * instancias y aplicándole algunos métodos.
 *
 */
package tema.pkg9;

public class PruebaCaballo {

    public static void main(String[] args) {

        Caballo rocinante = new Caballo("macho", "andaluz", "marron", 8, 1234);

        System.out.println("Rocinate es un " + rocinante.getSexo());
        System.out.println("De raza " + rocinante.getRaza());
        System.out.println("El color de su pelaje es"
                + " " + rocinante.getColorDePelaje());
        System.out.println("Tiene " + rocinante.getEdad() + " años.");
        System.out.println("Cullo numero de identificacion es"
                + " " + rocinante.getNumeroDeIdentificacion());
        System.out.println("Come heno");
        rocinante.comer();
        System.out.println("¡No te escucho!");
        rocinante.relinchar();
        System.out.println("Es hora de dormir");
        rocinante.dormir();
    }

}
