/*
 * Tema 9
 *
 * Ejercicio 1
 * 
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 * instancias y aplicándole algunos métodos.
 *
 */
package tema.pkg9;

public class Caballo {
    
    private String sexo;
    private String raza;
    private String colorDePelaje;
    private int edad;
    private int numeroDeIdentificacion;

    
   Caballo () { }
   
   Caballo (String s, String r, String c, int e, int n){
       this.sexo = s;
       this.raza = r;
       this.colorDePelaje = c;
       this.edad = e;
       this.numeroDeIdentificacion = n;
   } 
   
   String getSexo(){
       return this.sexo;
   }
   
   String getRaza(){
       return this.raza;
   }

    public String getColorDePelaje() {
        return colorDePelaje;
    }

    public int getEdad() {
        return edad;
    }

    public int getNumeroDeIdentificacion() {
        return numeroDeIdentificacion;
    }

    public void comer(){
        System.out.println("Hmmmm"); 
    }
    
    public void relinchar(){
        System.out.println("iiiihhhh");
    }
    
    public void dormir(){
        System.out.println("zzzzzzz");
    }
    
    
    
    
    
    
}
