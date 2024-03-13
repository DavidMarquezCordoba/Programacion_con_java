package T10Ejercicio10;

import java.util.HashMap;

/**
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
(con su correspondiente traducción). Utiliza un objeto de la clase HashMap para
almacenar las parejas de palabras. El programa pedirá una palabra en español
y dará la correspondiente traducción en inglés.
 * 
 * @author David Márquez Córdoba
 */
public class T10Ejercicio10 {
  public static void main(String[] args) {
    
    HashMap<String, String> diccionario = new HashMap<String, String>();

    boolean esta = false;
    /**
     * Creamos el diccionario ingles-español
     */
    diccionario.put("cat", "gato");
    diccionario.put("dog", "perro");
    diccionario.put("house", "casa");
    diccionario.put("tree", "árbol");
    diccionario.put("car", "coche");
    diccionario.put("book", "libro");
    diccionario.put("chair", "silla");
    diccionario.put("table", "mesa");
    diccionario.put("sun", "sol");
    diccionario.put("moon", "luna");
    diccionario.put("water", "agua");
    diccionario.put("fire", "fuego");
    diccionario.put("food", "comida");
    diccionario.put("friend", "amigo");
    diccionario.put("family", "familia");
    diccionario.put("love", "amor");
    diccionario.put("time", "tiempo");
    diccionario.put("money", "dinero");
    diccionario.put("school", "escuela");
    diccionario.put("computer", "ordenador");
    /**
     * 
     */

    System.out.println("Tenemos actualmente estas palabras: ");
    System.out.println(diccionario.keySet());
    do {
      System.out.print("\n¿Que palabra desea buscar?: ");
      String palabra = System.console().readLine();

      if (diccionario.containsKey(palabra)) {
        System.out.println("La traducción de " +palabra+ " es "+ diccionario.get(palabra));
        esta = true;
      } else {
        System.out.println("La palabra que has escrito no se encuentra en nuestro diccionario");
      }
    } while (!esta);

    // String computer = diccionario.getKey("ordenador");
    // getKey()
    // getValue()

  }
}
