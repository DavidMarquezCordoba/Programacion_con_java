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
    
    
    //Creamos la colección
    ArrayList<Carta> baraja = new ArrayList<Carta>();

    //Creamos una primera carta, esta se inicializará con un palo y valor aleatorio
    Carta carta = new Carta();

    
    //Añadimos a la primera posición la primera carta creada
    baraja.add(carta);


    //Hasta 9 porque la primera ya la hemos creado antes
    for (int i = 0; i < 9; i++) {
      //Repite el proceso de crear carta nueva hasta que su valor y palo sean distintos
      do {
        carta = new Carta();
      } while (baraja.contains(carta));

      baraja.add(carta);
      
    }

    for (Carta elemento : baraja) {
      System.out.println(elemento);
    }

  }
}


//DUDA
/**
 * Se repite valor y palo de esta forma
 */

