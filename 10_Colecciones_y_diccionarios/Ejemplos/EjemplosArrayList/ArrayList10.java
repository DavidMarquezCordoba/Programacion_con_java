package EjemplosArrayList;
/**
 * ArrayList 10 -> Uso de objetos en un ArrayList
 * 
 * @author David Márquez Córdoba
 */

import java.util.ArrayList;

/**
 * Explica tu código aquí
 * 
 * @author David Márquez Córdoba
 */

public class ArrayList10 {

  public static void main(String[] args) {

    //Definimos ArrayList de Objetos, con la clase Gato por ejemplo.
    ArrayList<Gato> g = new ArrayList<Gato>();

    //Inicializamos cada objeto de tipo Gato a través del métdo .add
    g.add(new Gato("Garfield", "naranja", "mestizo", 1));
    g.add(new Gato("Pepe", "gris", "angora", 2));
    g.add(new Gato("Mauri", "blanco", "manx", 3));
    g.add(new Gato("Ulises", "marrón", "persa", 4));    

    for (Gato gatos : g) {
      System.out.println(gatos);
    }
  }
}
