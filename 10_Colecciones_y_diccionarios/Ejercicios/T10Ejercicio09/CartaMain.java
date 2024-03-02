package T10Ejercicio09;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

public class CartaMain {
  public static void main(String[] args) {
    
    ArrayList<Carta> carta = new ArrayList<Carta>();

    
    Carta c;
    //Creamos una primera carta
    c = new Carta();

    //Añadimos a la primera posición la primera carta creada
    carta.add(c);

    // System.out.println(carta);

    //Hasta 8 porque la primera ya la hemos creado antes
    for (int i = 0; i < 9; i++) {
      do {
        c = new Carta();
      } while (carta.contains(c));

      carta.add(c);
      // System.out.println(carta);
    }

    //Lista desordenada
    System.out.println("Lista desordenada: \n");
    for (Carta elemento : carta) {
      System.out.println(elemento);
    }

    Collections.sort(c);
  }
}
