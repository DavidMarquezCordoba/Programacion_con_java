/**
 * Crea 20 números aleatorios entre [-15,40]
 * 
 * @author David Márquez Córdoba
 */

public class Aleatorio05 {
  public static void main(String[] args) {
    
    for (int i = 0; i < 20; i++) {
      
      System.out.println((int)(Math.random()*56 -16));
    }
  }
}
