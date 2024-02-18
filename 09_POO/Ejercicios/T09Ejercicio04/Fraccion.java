package T09Ejercicio04;
/**
 * Crea la clase Fracción. Los atributos serán numerador y denominador. Y algunos de los
métodos pueden ser invierte, simplifica, multiplica, divide, etc.
 * 
 * @author David Márquez Córdoba
 */

public class Fraccion {

  /////ATRIBUTOS
  private int numerador;
  private int denominador;


  //Constructor
  public Fraccion(int numerador, int denominador){
    this.numerador = numerador;
    this.denominador = denominador;
  }

  //Getters & Setters
  public int getNumerador() {
    return numerador;
  }

  public void setNumerador(int numerador) {
    this.numerador = numerador;
  }

  public int getDenominador() {
    return denominador;
  }

  public void setDenominador(int denominador) {
    this.denominador = denominador;
  }

  //toString
  @Override
  public String toString() {
    String cadena = Integer.toString(this.numerador/this.denominador);
    return cadena;
  }

  //////MÉTODOS
  public int invierte(int n){
    return multiplica(n)*(-1);
  }


  public int multiplica(int n){
      return (this.numerador/this.denominador)*n;
    }
    

  public double divide(int n){
    return ((double)this.numerador/(double)this.denominador)/n;
  }
}
