/**
 * Generación de números aleatorios.
 * 
 * @author David Márquez Córdoba
 */

public class Aleatorio03 {
  public static void main(String[] args) {
    
    System.out.println("Generar 20 números aleatorios entre 1 y 10");

    for (int i = 1; i <= 20; i++) {
      System.out.println(i+". "+ (int)(Math.random()*10+1));
    }
  }
}
