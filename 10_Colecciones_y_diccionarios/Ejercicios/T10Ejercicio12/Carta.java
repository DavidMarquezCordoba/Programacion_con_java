package T10Ejercicio12;
/**
 * Ejercicio 12
 * 
Escribe un programa que genere una secuencia de 5 cartas de la baraja
española y que sume los puntos según el juego de la brisca. El valor de las
cartas se debe guardar en una estructura HashMap que debe contener parejas
(figura, valor), por ejemplo (“caballo”, 3). La secuencia de cartas debe ser una
estructura de la clase ArrayList que contiene objetos de la clase Carta. El valor
de las cartas es el siguiente: as → 11, tres → 10, sota → 2, caballo → 3, rey → 4;
el resto de cartas no vale nada.
 * 
 * @author David Márquez Córdoba
 */
public class Carta {

  //Atributos

  private static String [] palos = {"Oros", "Copas", "Espadas", "Bastos"};
  private static String [] numero = {"As", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};


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

}
