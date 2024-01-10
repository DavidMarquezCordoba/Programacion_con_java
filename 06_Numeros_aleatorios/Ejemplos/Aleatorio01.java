/**
 * Generación de números aleatorios.
 * 
 * @author David Márquez Córdoba
 */

public class Aleatorio01 {
  public static void main(String[] args) {
    
    System.out.println("Vamos a imprimir 10 números aleatorios");

    //Genera números aleatorios internamente de 0 a 1
    for (int i = 1; i <= 10; i++) {
      System.out.println(i+". "+ Math.random());
    }
  }
}
