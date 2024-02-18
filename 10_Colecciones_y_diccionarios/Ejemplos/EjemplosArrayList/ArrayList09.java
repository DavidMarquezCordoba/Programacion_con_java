package EjemplosArrayList;

import java.util.ArrayList;
/**
 * ArrayList 09 -> Uso de removeIf con números
 * 
 * @author David Márquez Córdoba
 */
public class ArrayList09 {

  public static void main(String[] args) {
    
    ArrayList<Integer> n = new ArrayList<Integer>();

    n.add(20);
    n.add(7);
    n.add(14);
    n.add(32);
    n.add(3);
    n.add(2);
    n.add(56);
    n.add(124);
    n.add(326);
    n.add(0);

    System.out.println(n);

    n.removeIf(numero -> numero < 10);

    System.out.println(n);
  }
}
