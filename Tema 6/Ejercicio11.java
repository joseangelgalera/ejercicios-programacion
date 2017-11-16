/*
 * Tema 6
 * 
 * Ejercicio 11
 *
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
 * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
 * final aparecerá el número de suspensos, el número de suficientes, el número
 * de bienes, etc.
 *
 */

public class Ejercicio11 {

    public static void main(String[] args) {
        int notas = 0;
        int i = 1;
        int calificacion;
        String resultado = "";
        int suspenso = 0;
        int suficiente = 0;
        int bien = 0;
        int notable = 0;
        int sobresaliente = 0;

        while (i <= 20) {
            i++;
            calificacion = (int) (Math.random() * 5 + 1);
            switch (calificacion) {
                case 1:
                    resultado = "Suspenso";
                    suspenso++;
                    break;
                case 2:
                    resultado = "Suficiente";
                    suficiente += 1;
                    break;
                case 3:
                    resultado = "Bien";
                    bien += 1;
                    break;
                case 4:
                    resultado = "Notable";
                    notable += 1;
                    break;
                case 5:
                    resultado = "Sobresaliente";
                    sobresaliente += 1;
                    break;
                default:
            }
            System.out.println(resultado);
        }
        System.out.println("-----------------");
        System.out.println("Suspensos: " + suspenso);
        System.out.println("Suficientes: " + suficiente);
        System.out.println("Bien: " + bien);
        System.out.println("Notables: " + notable);
        System.out.println("Sobresalientes: " + sobresaliente);
    }

}
