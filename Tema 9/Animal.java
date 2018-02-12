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

public class Animal {
    private String sexo;
    private String raza;
    private String color;
    private String edad;
    private String identificacion;
   
    Animal() {}

    public Animal(String s, String r, String c, String e, String i) {
        this.sexo = s;
        this.raza = r;
        this.color = c;
        this.edad = e;
        this.identificacion = i;
    }

    public String getSexo() {
        return sexo;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public String getEdad() {
        return edad;
    }

    public String getIdentificacion() {
        return identificacion;
    }
    
    public void comer(String comida){
        if ((comida.equals("pescado")) && (class == Gato)){
        
    }
        System.out.print("mmmmm");
    }
    
    public void dormir(){
        System.out.print("zzzzz");
    }
    
    
}
