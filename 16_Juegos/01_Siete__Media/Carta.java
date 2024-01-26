public class Carta {
  //El orden es siempre Aributo- constructores -metodos

  ///////////Atributos
  private String numero;
  private String palo;
  private double valor;
  


  ////////Contructores

  public Carta (String numero, String palo, double valor){
    this.numero = numero;
    this.palo = palo;
    this.valor = valor;
    
  }
  

  ////////Métodos - Funciones (que hacen) 
  public String getnumero() {
    return numero;
  }


  public String getPalo() {
    return palo;
  }


  public double getValor() {
    return valor;
  }


  //toString es para mostrar por pantalla los resultado
  @Override
  public String toString() {
    return String.format("%s de %s \tPUNTUACIÓN: %.1f", numero, palo, valor);
  }
  
  
}
