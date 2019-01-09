/*
 * Tema 9 
 * 
 * Ejercicio 1
 *
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 * instancias y aplicándole algunos métodos.
 */
package tema.pkg9;

public class PruebaCaballo {

  public static void main(String[] args) {
    Caballo babieca = new Caballo("Babieca", 10, 130.5, "Macho");

    babieca.galopa();
    babieca.duerme();
    System.out.println(babieca.getNombre());
    System.out.println(babieca.getEdad());
    System.out.println(babieca.getPeso());
    System.out.println(babieca.getSexo());

    Caballo pegaso = new Caballo();

    pegaso.trota();
    System.out.println(pegaso.getSexo());

    System.out.println(babieca);
    babieca.come("pan");
    babieca.come("ZanaHoria");

    Caballo chico = new Caballo("Chico", 1, 90.5, "Macho");
    Caballo grande = new Caballo("Grande", 8, 120.5, "Hembra");

    babieca.correContra(chico);
    babieca.correContra(grande);
    System.out.println(pegaso);
    System.out.println(pegaso.getNombre());

    pegaso.setNombre("Pegaso");

    System.out.println(pegaso.getNombre());

    babieca.apareaCon(chico);
    babieca.apareaCon(grande);
  }

}
