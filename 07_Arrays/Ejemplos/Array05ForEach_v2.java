import java.util.Scanner;

/**
 * Explicación del bucle for each
 * 
 * @author David Márquez Córdoba
 */

public class Array05ForEach_v2 {
  public static void main(String[] args) {

    double[] nota = new double[4];

    System.out.println("Para calcular la nota media necesito saber la nota de cada uno de tus exámenes.");
    System.out.println("");

    Scanner teclado = new Scanner(System.in);

    for (int i = 0; i < nota.length; i++) {
      System.out.print("Introduce la nota "+(i+1)+": ");
      nota[i] = teclado.nextDouble();
    }

    double suma = 0;

    //Lectura del array con For Each
    System.out.println("Tus notas son: ");
    for (double n : nota) {
      System.out.print(n + " \t");
    }

    System.out.println("");

    for (int i = 0; i < nota.length; i++) {
      suma+=nota[i];
    }

    double media = suma/nota.length; 

    System.out.println("La media de todas las notas es: " + media);

    teclado.close();
  }
}
