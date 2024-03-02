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

  public Carta(){
    this.palo = palos[(int)(Math.random()*2)];
    this.valor = numero[(int)(Math.random()*numero.length)];
  }

  public String getPalo() {
    return palo;
  }

  public String getValor() {
    return valor;
  }

  @Override
  public String toString() {
    return valor + " de " + palo;
  }


  public boolean equals(Carta x){
    if (this.getPalo().equals(x.getPalo()) && this.getValor().equals(x.getValor())) {
      return true;
    } else {
      return false;
    }
  }
}
