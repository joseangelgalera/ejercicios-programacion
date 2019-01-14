/*
 * Tema 9
 *
 * Ejercicio 4
 *
 * Crea la clase Fracción. Los atributos serán numerador y denominador. Y 
 * algunos de los métodos pueden ser invierte, simplifica, multiplica, divide,
 * etc.
 */
package ejercicio04;

public class PruebaFraccion {

  public static void main(String[] args) {
    Fraccion uno = new Fraccion(2, 3);

    Fraccion dos = new Fraccion(3, 5);

    System.out.println(uno);
    System.out.println(dos);

    System.out.println(uno.multiplica(dos));

    Fraccion multiplicada = uno.multiplica(dos);
    System.out.println(multiplicada);

    Fraccion dividida = uno.divide(dos);
    System.out.println(dividida);

    System.out.println(uno.invierte());

    Fraccion invertida = uno.invierte();
    System.out.println(invertida);

    System.out.println(uno.multiplica(10));
    System.out.println(uno.divide(10));

    System.out.println(multiplicada.simplifica());

    System.out.println(dos.getNumerador());
    System.out.println(dos.getDenominador());
  }

}
