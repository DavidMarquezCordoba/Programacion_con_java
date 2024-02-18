package EjemplosArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ArrayList 11 -> Ordenación de lista con el método sort
 * 
 * 1º Usaremos sort para ordenar números
 * 
 * @author David Márquez Córdoba
 */
public class ArrayList11 {
  public static void main(String[] args) {
    
    ArrayList<Integer> a = new ArrayList<Integer>();

    a.add(67);
    a.add(78);
    a.add(10);
    a.add(4);

    for (Integer num : a) {
      System.out.println(num);
    }

    //Ordenamos todos
    Collections.sort(a);

    System.out.println("\nORDENADOS");
    for (Integer numOrdenados : a) {
      System.out.println(numOrdenados);
    }
  }
}
