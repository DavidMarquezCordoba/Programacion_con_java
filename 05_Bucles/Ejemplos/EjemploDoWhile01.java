/**
 * Imprimir por pantalla los números del 1 al 10
 * 
 * @author David Márquez Córdoba
 */

public class EjemploDoWhile01 {
  public static void main(String[] args) {
    
    int num=1;

    do {
      System.out.println(num);
      num++;
    } while (num < 11);
  }
}
