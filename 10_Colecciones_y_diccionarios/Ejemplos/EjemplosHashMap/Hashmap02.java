package EjemplosHashMap;

import java.util.HashMap;

/**
 * Ejemplo de uso de la clase HashMap
 * 
 * @author David Márquez Córdoba
 */
public class Hashmap02 {
  public static void main(String[] args) {
    
    HashMap <Integer, String> m = new HashMap<Integer, String>();

    m.put(924, "Amalia Núñez");
    m.put(921, "Cindy Nero");
    m.put(700, "César Vázquez");
    m.put(219, "Víctor Tilla");
    m.put(537, "Alan Brito");
    m.put(605, "Esteban Quito ");

    /**
     * get(clave)
     * 
      *Obtiene el valor correspondiente a una clave. Devuelve null si no existe esa clave
      *en el diccionario.
     */

    //Devolverá el valor correspondiente a la clave 924, es decir Amalia Nuñez
    System.out.println(m.get(924));
  }
}
