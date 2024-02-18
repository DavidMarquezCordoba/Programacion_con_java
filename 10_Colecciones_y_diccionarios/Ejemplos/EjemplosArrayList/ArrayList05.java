package EjemplosArrayList;

import java.util.ArrayList;

/**
 * ArrayList05 - Uso de método .content y .remove
 * 
 * .content -> contiene
 * .remove -> Elimina
 * 
 * @author David Márquez Córdoba
 */

public class ArrayList05 {
  public static void main(String[] args) {
    
    ArrayList<String> a = new ArrayList<String>();

    a.add("rojo");
    a.add("verde");
    a.add("azul");
    a.add("blanco");
    a.add("amarillo");
    a.add("blanco");

    System.out.println("Contenido de la lista: ");
    System.out.println(a+"\n");

    // .containt lo busca de forma literal. no serviría Blanco, blanc etc... solo "blanco"
    if (a.contains("blanco")) {
      System.out.println("El blanco está en la lista de colores\n");
    }

    //De esta forma eliminaremos todos los valores "blanco" del ArrayList
    while (a.contains("blanco")) {
      a.remove("blanco");
    }

    if (a.contains("blanco")) {
      System.out.println("El blanco está en la lista de colores\n");
    } else{
      System.out.println("El blanco no se encuentra en el Arraylist");
      System.out.print("La lista ahora es: "+a);
      System.out.println("");
    }

    //También podemos borrar posiciones específicas
    a.remove(0);

    System.out.print("La lista ahora es: "+a);
    System.out.println("");
  }
}
