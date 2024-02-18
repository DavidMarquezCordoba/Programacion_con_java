package EjemplosArrayList;

import java.util.ArrayList;

/**
 * ArrayList03 - Uso de bucles for para recorrer el array y mostrarlo mediante un 
 * método .get
 * 
 * @author David Márquez Córdoba
 */

public class ArrayList03 {

  public static void main(String[] args) {

    //Declaración de ArrayList
    ArrayList<String> a= new ArrayList<String>();

    //Rellenamos con datos
    a.add("rojo");
    a.add("verde");
    a.add("azul");
    a.add("blanco");
    a.add("amarillo");

    System.out.println("Contenido de la lista: ");

    //También podemos recorrerlo mediante un bucle for
    //Y para averiguar el valor de cada una de las posiciones, usarmos el método .get
    for(int i=0; i < a.size(); i++) {
      System.out.println(a.get(i));
    }
  }
}
