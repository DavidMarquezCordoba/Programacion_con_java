package T10Ejercicio12;

import java.util.ArrayList;
import java.util.HashMap;

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
public class T10Ejercicio12 {
  public static void main(String[] args) {

    //Creamos variable puntos que contendrá todos los puntos acumulados.
    int puntos = 0;
    
    //Creamos el hashmap con las cartas que puntúan y su valor correspondiente y el arraylist que almacenará las cartas que se van extrayendo
    HashMap<String, Integer> mapsCartasPuntuables = new HashMap<String, Integer>();
    ArrayList<String> arrayCartasSacadas = new ArrayList<String>();

    //Añadimos las cartas puntuables
    mapsCartasPuntuables.put("As", 11);
    mapsCartasPuntuables.put("3", 10);
    mapsCartasPuntuables.put("Rey", 4);
    mapsCartasPuntuables.put("Caballo", 3);
    mapsCartasPuntuables.put("Sota", 2);

    System.out.println("\nJuego de la Brisca\n"); //Mensaje de inicio

    for (int i = 0; i < 5; i++) {
      
      Carta carta = new Carta();    //Creamos una nueva carta en cada iteración

      System.out.println(carta);    //Mostramos

      arrayCartasSacadas.add(carta.getValor());   //Añadimos al ArrayList el valor de la carta
      
      /**
       * Comparamos el valor de la carta por si fuera una carta puntuable, en caso afirmativo, el valor se suma
       */
      if (mapsCartasPuntuables.containsKey(arrayCartasSacadas.get(i))) {
        puntos+= mapsCartasPuntuables.get(arrayCartasSacadas.get(i));
      }
    }

    //Muestra resultado final
    System.out.println("\nResultado:");
    System.out.println("Tienes "+ puntos + " puntos en total.\n");
  }
}
