/*
 * Ejercicio 5
 *
 * Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura
 * de un color diferente.
 */
package tema.pkg1;


public class Ejercicio05 {

    public static void main(String[] args) {
        
        String rojo = "\033[31m";
        String verde = "\033[32m";
        String naranja = "\033[33m";
        String azul = "\033[34m";
        String morado = "\033[35m";
        String cyan = "\033[36m";
        String blanco = "\033[37m";
        
        System.out.printf("%-11s %-1s %-22s %-1s %-21s %-1s %-21s %-1s %-22s "
                + "%-1s %-20s\n", "Hora", "|", "Lunes", "|", "Martes", "|", 
                "Miercoles", "|", "Jueves", "|", "Viernes" );
        System.out.println("------------|------------------------|-------------"
                + "----------|-----------------------|------------------------|"
                + "---------------------------------");
        System.out.printf("%-10s %-1s %-26s %-1s %-21s %-1s %-26s %-1s %-27s "
                + "%-1s %-21s\n", "08:15/09:15", "|" 
                + rojo, "Entornos de Desarrollo" 
                + blanco, "|" + naranja, "Sistemas Informáticos" 
                + blanco, "|" + rojo, "Progamación" + blanco, "|" 
                + morado, "Progamación" + blanco, "|"
                + naranja, "Sistemas Informáticos" + blanco);
        System.out.printf("%-10s %-1s %-27s %-1s %-21s %-1s %-26s %-1s %-27s "
                + "%-1s %-21s\n", "09:15/10:15", "|" 
                + rojo, "Lenguaje de Marcas" 
                + blanco, "|" + naranja, "Sistemas Informáticos" 
                + blanco, "|" + rojo, "Progamación" + blanco, "|" 
                + morado, "Progamación" + blanco, "|" 
                + naranja, "Sistemas Informáticos" + blanco);
        System.out.printf("%-10s %-1s %-27s %-1s %-21s %-1s %-26s %-1s %-27s "
                + "%-1s %-21s\n", "10:15/11:15", "|" 
                + rojo,"Lenguaje de Marcas" + blanco, "|" 
                + naranja, "Sistemas Informáticos" + blanco, "|" 
                + rojo, "Progamación" + blanco, "|" 
                + morado, "Entornos de Desarrollo" 
                + blanco, "|" + naranja, "Sistemas Informáticos" + blanco);
        System.out.printf("%-10s %-1s %-27s %-1s %-26s %-1s %-26s %-1s %-27s "
                + "%-1s %-21s\n", "11:15/11:45", "|" + verde, "Recreo" + blanco,
                "|" + verde, "Recreo" + blanco, "|" + verde, "Recreo" + blanco, 
                "|" + verde, "Recreo" + blanco, "|" + verde, "Recreo" + blanco);
        System.out.printf("%-10s %-1s %-27s %-1s %-26s %-1s %-26s %-1s %-26s "
                + "%-1s %-21s\n", "11:45/12:45", "|" + azul, "Bases de Datos" 
                + blanco, "|" + cyan, "Progamación" + blanco, "|" + azul,
                "Bases de Datos" + blanco, "|" + cyan, "Entornos de Desarrollo" 
                + blanco, "|" + rojo, "Formación y Orientación Laboral" 
                + blanco);
        System.out.printf("%-10s %-1s %-27s %-1s %-26s %-1s %-26s %-1s %-27s "
                + "%-1s %-21s\n", "12:45/13:45", "|" + azul, "Bases de Datos" 
                + blanco, "|" + cyan, "Progamación" + blanco, "|" + azul,
                "Bases de Datos" + blanco, "|" + cyan, "Lenguaje de Marcas" 
                + blanco, "|" + rojo, "Formación y Orientación Laboral" 
                + blanco);
        System.out.printf("%-10s %-1s %-27s %-1s %-26s %-1s %-26s %-1s %-27s "
                + "%-1s %-21s\n", "13:45/14:45", "|" + azul, "Bases de Datos" 
                + blanco, "|" + cyan, 
                "Progamación" + blanco, "|" + azul, "Bases de Datos" 
                + blanco, "|" + cyan, "Lenguaje de Marcas" + blanco, "|" 
                + rojo, "Formación y Orientación Laboral" + blanco);
    }
    
}
