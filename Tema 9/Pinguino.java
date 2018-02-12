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

public class Pinguino {

    public void pescar() {
        int pescado = ((int) (Math.random() * 10 + 1));

        if ((pescado > 4) && (pescado < 8)) {
            System.out.println("Has pescado un pez");
        } else {
            if (pescado >= 8) {
                System.out.println("Que suerte has pescado un pez enorme");
            } else {
                System.out.println("Lo siento no has pescado nada");
            }
        }
        
        
        }
    }


