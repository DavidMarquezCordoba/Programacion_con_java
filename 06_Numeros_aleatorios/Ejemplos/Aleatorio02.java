/**
 * Generación de números aleatorios.
 * 
 * @author David Márquez Córdoba
 */

public class Aleatorio02 {
  public static void main(String[] args) {
    
    //Genera números aleatorios entre 0 y 9
    for (int i = 1; i <= 10; i++) {
      System.out.println(i+". "+ (int)(Math.random()*10));
    }
  }
}
