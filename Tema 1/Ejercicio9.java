/*
 * Ejercicio 9
 *
 * Escribe un programa que pinte por pantalla alguna escena - el campo, la
 * habitación de una casa, un aula, etc. - o algún objeto animado o inanimado
 * - un coche, un gato, una taza de café, etc. Ten en cuenta que puedes utilizar
 * caracteres como *, +, <, #, @, etc. ¡Échale imaginación!
 */
package tema.pkg1;

public class Ejercicio9 {

    public static void main(String[] args) {
        String rojo = "\033[31m";
        String verde = "\033[32m";
        String naranja = "\033[33m";
        String azul = "\033[34m";
        String morado = "\033[35m";
        String cyan = "\033[36m";
        String blanco = "\033[37m";
        
        System.out.println(blanco + "**********" + rojo +"@@@@" + blanco 
                +"**********");
        System.out.println(blanco + "**********" + rojo +"@@@@" + blanco 
                +"**********");
        System.out.println(blanco + "**********" + verde + "&&&&" + blanco 
                + "**********");
        System.out.println(blanco + "**********" + verde + "&&&&" + blanco 
                + "**********");
        System.out.println(blanco + "**********" + verde + "&&&&" + blanco 
                + "**********");
        System.out.println(blanco + "**********" + verde + "&&&&" + blanco 
                + "**********");
        System.out.println(blanco + "********" + verde + "&&&&&&&&" + blanco 
                + "********");
        System.out.println(blanco + "********" + verde + "&&&&&&&&" + blanco 
                + "********");
        System.out.println(blanco + "********" + morado + "########" + blanco 
                + "********");
        System.out.println(blanco + "********" + morado + "########" + blanco 
                + "********");
        System.out.println(blanco + "********" + morado + "########" + blanco 
                + "********");
        System.out.println(blanco +"********" + verde + "&&&&&&&&" + blanco 
                + "********");
        System.out.println(blanco +"********" + verde + "&&&&&&&&" + blanco 
                + "********");
        System.out.println(blanco +"********" + verde + "&&&&&&&&" + blanco 
                + "********");
        System.out.println(blanco +"********" + verde + "&&&&&&&&" + blanco 
                + "********");
        System.out.println(naranja +"++++++++++++++++++++++++");
        System.out.println(naranja +"++++++++++++++++++++++++");
    }
    
}
