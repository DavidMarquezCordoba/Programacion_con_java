/**
 * Generación de números aleatorios.
 * 
 * @author David Márquez Córdoba
 */
public class Aleatorio04 {
  public static void main(String[] args) {

    System.out.println("");
    System.out.println("Generar 20 números aleatorios entre 50 y 60 [50,61)\n");

    for (int i = 1; i <= 20; i++) {
      System.out.println(i + ". " + ((int) (Math.random() * 11) + 50)); //Restas 61 - 50 = 11 (es lo que pones en la *)
                                                                        //+ 50 es el número a partir del cual empiezas
    }
  }
}
