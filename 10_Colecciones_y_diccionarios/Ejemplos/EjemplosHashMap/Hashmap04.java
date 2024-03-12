package EjemplosHashMap;

import java.util.HashMap;

/**
 * Ejemplo de uso de la clase HashMap, uso de containsKey
 * 
 * @author David Márquez Córdoba
 */

public class Hashmap04 {
  public static void main(String[] args) {
    
    HashMap<Integer, String> m = new HashMap<Integer, String>();

    int codigo;

    m.put(924, "Amalia Núñez");
    m.put(921, "Cindy Nero");
    m.put(700, "César Vázquez");
    m.put(219, "Víctor Tilla");
    m.put(537, "Alan Brito");
    m.put(605, "Esteban Quito ");

    //Recogemos el código
    System.out.print("Introduce un código: ");
    codigo = Integer.parseInt(System.console().readLine());

    //Comprobamos si el código introducido pertenece o se almacena en el Hashmap y muestra su valor a través del get
    if (m.containsKey(codigo)) {
      System.out.print("El código " + codigo + " corresponde a " + m.get(codigo));
    } else {
      System.out.println("El código introducido no pertenece a ningún valor");
    }
  }
}
