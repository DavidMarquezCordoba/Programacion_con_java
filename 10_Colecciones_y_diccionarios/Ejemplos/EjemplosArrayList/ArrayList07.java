package EjemplosArrayList;

import java.util.ArrayList;

/**
 * ArrayList 07 -> Uso de .add pasando por parámetros
 * la posición y el nuevo valor
 * 
 * @author David Márquez Córdoba
 */
public class ArrayList07 {
  public static void main(String[] args) {
    
    ArrayList<String> a= new ArrayList<String>();

    a.add("rojo");
    a.add("verde");
    a.add("azul");
    a.add("blanco");
    a.add("amarillo");

    System.out.println("\nContenido de la lista: ");

    System.out.println(a);

    a.add(1, "turquesa");

    System.out.print("\nNueva lista -> ");
    System.out.println(a);
  }
}
