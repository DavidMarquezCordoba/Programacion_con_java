package EjemplosArrayList;

import java.util.ArrayList;

/**
 * ArrayList 08 -> Uso de removeIf
 * 
 *  .removeIf -> Borrado selectivo si se cumplen ciertos criterios
 * 
 * @author David Márquez Córdoba
 */

public class ArrayList08 {
  public static void main(String[] args) {
    
    ArrayList <String> a = new ArrayList <String> ();

    a.add("rojo");
    a.add("verde");
    a.add("azul");
    a.add("blanco");
    a.add("amarillo");

    System.out.println("\nContenido de la lista: ");
    System.out.println(a);

    //En este caso, .contains se utiliza como filtro, filtra todo lo que contiene lo escrito entre comillas
    a.removeIf(colores -> colores.contains("o"));

    System.out.println("\nLista después de eliminar los colores que incluyan el caracter -o-");
    System.out.println(a);
  }
}
