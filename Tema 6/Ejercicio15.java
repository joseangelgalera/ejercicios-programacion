/*
 * Tema 6
 * 
 * Ejercicio 15
 *
 * Realiza un generador de melodía con las siguientes condiciones:
 * a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa,
 * sol, la y si.
 * b) Una melodía está formada por un número aleatorio de notas mayor o igual
 * a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
 * c) Cada grupo de 4 notas será un compás y estará separado del siguiente
 * compás mediante la barra vertical “|” (Alt + 1). El final de la melodía 
 * se marca con dos barras.
 * d) La última nota de la melodía debe coincidir con la primera.
 *
 */

public class Ejercicio15 {

    public static void main(String[] args) {
        int hueco = 4 * (int)(Math.random() * 7 + 1);
            String notas = "";
            String primeraNota = "";
        
        for (int i = 1; i <= hueco; i++) {
            int nota = (int) (Math.random() * 7);
            switch (nota) {
                case 0:
                    notas = "do";
                    break;
                case 1:
                    notas = "re";
                    break;
                case 2:
                    notas = "mi";
                    break;
                case 3:
                    notas = "fa";
                    break;
                case 4:
                    notas = "sol";
                    break;
                case 5:
                    notas = "la";
                    break;
                case 6:
                    notas = "si";
                    break;
                default:
            }
            
            if (i == 1) {
                primeraNota = notas;
            }
            
            if (i == hueco){
                notas = primeraNota;
            }
            
            System.out.print(notas+ " ");
            
            if ( i == hueco ) {
                System.out.print("||");
                } else if ( i % 4 == 0 ) {
                System.out.print("| ");
            }
        }

    }
}
