package EjemplosHashMap;


import java.util.HashMap;

/**
 * Ejemplo de uso de la clase HashMap
 * 
 * @author David Márquez Córdoba
 */
public class Hashmap03 {

  public static void main(String[] args) {

    HashMap<Integer, String> m = new HashMap<>();

    //Añadimos datos al diccionario
    m.put(924, "Amalia Núñez");
    m.put(921, "Cindy Nero");
    m.put(700, "César Vázquez");
    m.put(219, "Víctor Tilla");
    m.put(537, "Alan Brito");
    m.put(605, "Esteban Quito ");
    
    //Así
    System.out.println("Los elementos de m utilizando entrySet son: : \n" + m);
    System.out.println("");
    //O así
    System.out.println("O de esta otra forma");
    System.out.println(m.entrySet());

    System.out.println("");
    //Otra forma de mostrar los valores
    //Recorres el diccionario m buscando cada clave y luego imprimes la clave y obtienes el valor de la clave
    for (int key : m.keySet()) {
      System.out.println(key + " = " + m.get(key));
    }

  }
}
