/*
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando
un bucle while.
 * 
 * @author David Márquez Córdoba
 */
public class T05Ejercicio05 {
  public static void main(String[] args) {
    
    int num = 320;
    while (num>=160) {
      System.out.println(num);
      num -=20;
    }
  }
}
