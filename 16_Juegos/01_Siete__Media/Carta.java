/**
 * Clase Carta
 * 
 * @author David Márquez Córdoba
 * @author Enrique Capote Molina
 */

public class Carta {
  //El orden es siempre Aributo- constructores -metodos

  /////////////////////////////////
  ///////////ATRIBUTOS/////////////
  /////////////////////////////////
  private String numero;  
  private String palo;
  private double valor;
  


  /////////////////////////////////
  ////////CONSTRUCTORES////////////
  /////////////////////////////////

  /**
   * Constructor personalizado de la clase Carta
   * 
   * @param numero número de la propia carta. (1, 2, 3 ...Sota, Caballo, Rey)
   * @param palo palo de la carta (Oros, Copas, Espadas, Bastos)
   * @param valor valor de la propia carta. (1,2,3 ...0,5 para las figuras)
   */
  public Carta (String numero, String palo, double valor){
    this.numero = numero;
    this.palo = palo;
    this.valor = valor;
    
  }
  
  /////////////////////////////////
  /////////GETTERS & SETTERS///////
  /////////////////////////////////

  public String getnumero() {
    return numero;
  }

  public String getPalo() {
    return palo;
  }

  public double getValor() {
    return valor;
  }

  /**
   * Obtiene un resumen del número de carta, palo y valor
   */
  @Override
  public String toString() {
    return String.format("%s de %s \tPUNTUACIÓN: %.1f", numero, palo, valor);
  }
  
  
}