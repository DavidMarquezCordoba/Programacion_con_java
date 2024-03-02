package T10Ejercicio09;

/**
 * Realiza un programa que escoja al azar 10 cartas de la baraja española
(10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
almacenarlas y asegúrate de que no se repite ninguna.

Modifica el programa anterior de tal forma que las cartas se muestren ordenadas.
Primero se ordenarán por palo: bastos, copas, espadas, oros. Cuando
coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey.
 * 
 * @author David Márquez Córdoba
 */
public class Carta implements Comparable<Carta>{

  //Atributos

  private static String [] palos = {"Oros", "Copas", "Espadas", "Bastos"};
  private static String [] numero = {"1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};


  private String palo;
  private String valor;

  public Carta(){
    this.palo = palos[(int)(Math.random()*palos.length)];
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

  @Override
  public int compareTo(Carta o) {
    
  }


}
