package T10Ejercicio08;
import java.util.ArrayList;

/**
 * Realiza un programa que escoja al azar 10 cartas de la baraja española
(10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
almacenarlas y asegúrate de que no se repite ninguna.
 * 
 * @author David Márquez Córdoba
 */

public class CartaMain {
  public static void main(String[] args) {
    
    ArrayList<Carta> baraja = new ArrayList<Carta>();

    
    // Carta c;
    //Creamos una primera carta
    Carta carta = new Carta();

    //Añadimos a la primera posición la primera carta creada
    baraja.add(carta);

    // System.out.println(carta);

    //Hasta 8 porque la primera ya la hemos creado antes
    for (int i = 0; i < 9; i++) {
      do {
        carta = new Carta();
      } while (baraja.contains(carta));

      baraja.add(carta);
      // System.out.println(carta);
    }

    for (Carta elemento : baraja) {
      System.out.println(elemento);
    }

  }
}
