/*
 * Tema 9
 *
 * Ejercicio 3
 *
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y 
 * Lagarto. Crea, al menos, tres métodos específicos de cada clase y redefne 
 * el/los método/s cuando sea necesario. Prueba las clases creadas en un 
 * programa en el que se instancien objetos y se les apliquen métodos.
 *
 */
package tema.pkg9;

public class Perro extends Mamifero {

    public void ladrar() {
        System.out.print("Guauu, Guauu");
    }

    /**
     * 
     * Hace que el perro busque una pelota en caso de que no la encunetre el 
     * dueño va a por ella.
     * 
     */
    public void buscarPelota() {
        int pelota = ((int) (Math.random() * 10 + 1));

        if (pelota > 7) {
            System.out.println("Buen chico");

        } else {
            System.out.println("Ya voy a buscarla yo");

        }
    }

}
