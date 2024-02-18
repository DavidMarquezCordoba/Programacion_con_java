package EjemplosArrayList;

import java.util.ArrayList;

/**
 * ArrayList04 - Uso de foreach para mostrar valores
 * 
 * @author David Márquez Córdoba
 */

public class ArrayList04 {
  public static void main(String[] args) {
    
    ArrayList<String> a = new ArrayList<String>();

    a.add("rojo");
    a.add("verde");
    a.add("azul");
    a.add("blanco");
    a.add("amarillo");

    System.out.println("Contenido de la lista: ");

    //Una forma de mostrarlo usando el foreach
    for (String colores : a) {
      System.out.println(colores);
    }

    //Otra forma de mostrarlo, llamando directamente desde la clase.
    System.out.println(a);

    // for (int i = 0; i < a.size(); i++) {
    //   System.out.println(a);
    // }
  }
}
