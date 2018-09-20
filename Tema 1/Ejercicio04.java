/*
 * Ejercicio 4
 * 
 * Escribe un programa que muestre tu horario de clase.
 */

package tema.pkg1;

public class Ejercicio04 {

    public static void main(String[] args) {
        System.out.printf("%-11s %-1s %-22s %-1s %-21s %-1s %-21s %-1s %-22s "
                + "%-1s %-20s\n", "Hora", "|", "Lunes", "|", "Martes", "|", 
                "Miercoles", "|", "Jueves", "|", "Viernes" );
        System.out.println("------------|------------------------|-------------"
                + "----------|-----------------------|------------------------|"
                + "--------------------------------");
        System.out.printf("%-10s %-1s %-21s %-1s %-21s %-1s %-21s %-1s %-22s "
                + "%-1s %-21s\n", "08:15/09:15", "|", "Entornos de Desarrollo", 
                "|", "Sistemas Informáticos", "|", "Progamación", "|", 
                "Progamación", "|", "Sistemas Informáticos");
        System.out.printf("%-10s %-1s %-22s %-1s %-21s %-1s %-21s %-1s %-22s "
                + "%-1s %-21s\n", "09:15/10:15", "|", "Lenguaje de Marcas", "|", 
                "Sistemas Informáticos", "|", "Progamación", "|", 
                "Progamación", "|", "Sistemas Informáticos");
        System.out.printf("%-10s %-1s %-22s %-1s %-21s %-1s %-21s %-1s %-22s "
                + "%-1s %-21s\n", "10:15/11:15", "|", "Lenguaje de Marcas", "|", 
                "Sistemas Informáticos", "|", "Programación", "|", 
                "Entornos de Desarrollo", "|", "Sistemas Informáticos");
        System.out.printf("%-10s %-1s %-22s %-1s %-21s %-1s %-21s %-1s %-22s "
                + "%-1s %-21s\n", "11:15/11:45", "|", "Recreo", "|", 
                "Recreo", "|", "Recreo", "|", 
                "Recreo", "|", "Recreo");
        System.out.printf("%-10s %-1s %-22s %-1s %-21s %-1s %-21s %-1s %-22s "
                + "%-1s %-21s\n", "11:45/12:45", "|", "Bases de Datos", "|", 
                "Progamación", "|", "Bases de Datos", "|", 
                "Entornos de Desarrollo", "|",
                "Formación y Orientación Laboral");
        System.out.printf("%-10s %-1s %-22s %-1s %-21s %-1s %-21s %-1s %-22s "
                + "%-1s %-21s\n", "12:15/13:45", "|", "Bases de Datos", "|", 
                "Progamación", "|", "Bases de Datos", "|", 
                "Lenguaje de Marcas", "|", "Formación y Orientación Laboral");
        System.out.printf("%-10s %-1s %-22s %-1s %-21s %-1s %-21s %-1s %-22s "
                + "%-1s %-21s\n", "13:15/14:45", "|", "Bases de Datos", "|", 
                "Progamación", "|", "Bases de Datos", "|", 
                "Lenguaje de Marcas", "|", "Formación y Orientación Laboral");
    }
}
