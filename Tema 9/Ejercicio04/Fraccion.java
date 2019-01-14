/*
 * Fraccion.java
 * Definicion de la clase Fraccion
 */
package ejercicio04;

public class Fraccion {

  int numerador;
  int denominador;

  Fraccion(int n, int d) {
    this.numerador = n;
    this.denominador = d;

  }

  public String toString() {
    String cadena = "";
    cadena = String.valueOf(this.numerador) + "/"
            + String.valueOf(this.denominador);

    return cadena;
  }

  // getter
  int getNumerador() {
    return this.numerador;
  }

  int getDenominador() {
    return this.denominador;
  }

  Fraccion invierte() {

    int n;
    int d;

    n = this.denominador;
    d = this.numerador;

    Fraccion resultado = new Fraccion(n, d);

    return resultado;

  }

  Fraccion multiplica(Fraccion f) {

    int n;
    int d;

    n = this.numerador * f.numerador;
    d = this.denominador * f.denominador;

    Fraccion resultado = new Fraccion(n, d);

    return resultado;

  }

  Fraccion divide(Fraccion f) {

    int n;
    int d;

    n = this.numerador * f.denominador;
    d = this.denominador * f.numerador;

    Fraccion resultado = new Fraccion(n, d);

    return resultado;

  }

  Fraccion multiplica(int num) {

    int n;
    int d;

    n = this.numerador * num;
    d = this.denominador;

    Fraccion resultado = new Fraccion(n, d);

    return resultado;

  }

  Fraccion divide(int num) {

    int n;
    int d;

    n = this.numerador;
    d = this.denominador * num;;

    Fraccion resultado = new Fraccion(n, d);

    return resultado;

  }

  Fraccion simplifica() {

    int aux;
    if (this.numerador <= this.denominador) {
      aux = this.numerador;
    } else {
      aux = this.numerador;
    }

    int n = this.numerador;
    int d = this.denominador;

    for (int i = 2; i < aux; i++) {

      if ((this.numerador % i == 0) && (this.numerador % i == 0)) {

        n = this.numerador / i;
        d = this.denominador / i;
      }

    }

    Fraccion resultado = new Fraccion(n, d);

    return resultado;

  }
}
