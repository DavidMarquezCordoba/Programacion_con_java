/**
 * Muestra la tabla del 2,4 y 6 mediante bucle for
 * 
 * @author David Márquez Córdoba
 */
public class EjemploFor02 {
  public static void main(String[] args) {
    
    for (int i = 2; i <= 6; i+=2) {
      for (int j = 0; j <= 10; j++) {
        System.out.println(i + " x "+j+ " = "+ i*j);
      }
      System.out.println("");
    }
  }
}
