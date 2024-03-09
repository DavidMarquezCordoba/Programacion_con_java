package EjemplosArrayList;

import java.util.HashMap;

/**
 * Ejemplo de de uso de la clase HashMap
 * 
 * @author David Márquez Córdoba
 */

public class HashMap01 {

  public static void main(String[] args) {
    
    //Se declaran con su wrapper correspondiente a lo que tengan en su clave-valor
    HashMap<Integer, String> m = new HashMap<>();

    //Clave - Key -> nº (Integer)
    //Valor -value -> Nombres (String)
    m.put(924, "Amalia Núñez");
    m.put(921, "Cindy Nero");
    m.put(700, "César Vázquez");
    m.put(219, "Víctor Tilla");
    m.put(537, "Alan Brito");
    m.put(605, "Esteban Quito ");
    
    //Muestra en entre {} los valores almacenados en el diccionario
    System.out.println("Los elementos de m son: \n" + m);

  }
}
