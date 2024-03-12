package T10Ejercicio01;

import java.util.ArrayList;

/**
 * Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
todo el ArrayList sin usar ningún índice.
 * 
 * @author David Márquez Córdoba
 */

public class T10Ejercicio01 {

  public static void main(String[] args) {

    ArrayList<String> compis = new ArrayList<String>();

    compis.add("Bárbara");
    compis.add("Jose");
    compis.add("Ale");
    compis.add("Pablo");
    compis.add("Fernando");
    compis.add("Raquel");
    compis.add("Adrián");
    
    System.out.println("\nLos compañeros que he añadido son: \n");
    for (String nombres : compis) {
      System.out.println(nombres);
    }
    System.out.println("");
  }
}
