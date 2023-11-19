/*
 * Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle
do-while.
 * 
 * @author David Márquez Córdoba
 */

public class T05Ejercicio06 {
  public static void main(String[] args) {
    
    int num=320;

    do {
      System.out.println(num);
      num -=20;
    } while (num >= 160);
  }
}
