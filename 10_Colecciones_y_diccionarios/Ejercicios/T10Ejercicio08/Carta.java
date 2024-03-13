package T10Ejercicio08;

/**
 * Realiza un programa que escoja al azar 10 cartas de la baraja española
(10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
almacenarlas y asegúrate de que no se repite ninguna.
 * 
 * @author David Márquez Córdoba
 */
public class Carta {

  //Atributos

  private static String [] palos = {"Oros", "Copas", "Espadas", "Bastos"};
  private static String [] numero = {"1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};


  private String palo;
  private String valor;

  /**
   * Constructor por defecto
   */
  public Carta(){
    this.palo = palos[(int)(Math.random()*palos.length)];
    this.valor = numero[(int)(Math.random()*numero.length)];
  }

  /**
   * Getter del Palo, para mostrarlo en el main
   * @return String del valor del palo de la carta creada
   */
  public String getPalo() {
    return palo;
  }

  /**
   * Getter del valor, se mostrará en el main
   * @return String del valor de la carta
   */
  public String getValor() {
    return valor;
  }

  /**
   * Método toString que muestra el valor y el palo conjuntamente
   */
  @Override
  public String toString() {
    return valor + " de " + palo;
  }


  /**
   * Compara el palo y el valor de la carta creada y la que se pasa por parámetro
   * @param x Objeto de tipo Carta a comparar
   * @return true si son iguales (palo,valor) o false si no lo es
   */
  public boolean iguales(Carta x){
    if (this.getPalo().equals(x.getPalo()) && this.getValor().equals(x.getValor())) {
      return true;
    } else {
      return false;
    }
  }
}
