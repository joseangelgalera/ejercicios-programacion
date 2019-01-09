/*
 * Tema 9
 *
 * Ejercicio 3
 *
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y 
 * Lagarto. Crea, al menos, tres métodos específicos de cada clase y redefne 
 * el/los método/s cuando sea necesario. Prueba las clases creadas en un 
 * programa en el que se instancien objetos y se les apliquen métodos.
 */
package ejercicio03;

public class PruebaAnimal {

  public static void main(String[] args) {
    Perro lassie = new Perro("Collie", "Hembra");

    lassie.ladra();
    lassie.duerme();
    lassie.amamanta();
    lassie.come();

    Pinguino gunter = new Pinguino(1.25);

    gunter.vuela();

    Canario pico = new Canario("Amarillo");

    pico.vuela();
    pico.come();

    Gato isidoro = new Gato("Siamés", "Macho");

    isidoro.come();
    isidoro.salta();

    Lagarto yooka = new Lagarto("Verde");

    yooka.come();
    yooka.tomaSol();
  }

}
