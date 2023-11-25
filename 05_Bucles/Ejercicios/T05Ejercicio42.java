import java.util.Scanner;

/**
 * Escribe un programa que pida un número entero positivo 
 * por teclado y que muestre a continuación los 5 números 
 * consecutivos a partir del número introducido. 
 * Al lado de cada número se debe indicar si se trata de un primo o no.
 * 
 * @author David Márquez Córdoba
 */
public class T05Ejercicio42 {
  public static void main(String[] args) {
    
    int numeroIntroducido;
    String esPrimo = "";

    Scanner teclado = new Scanner(System.in);

    do {
      System.out.printf("Introduce un número entero positivo: ");
      numeroIntroducido = teclado.nextInt();
    } while (numeroIntroducido<0);
    
    for (int i = numeroIntroducido+1; i <= numeroIntroducido+5; i++) {
      System.out.printf("%d ", i);

      esPrimo = " es primo.";

      for (int j = 2; j <= i/2; j++) {

        if (i%j==0) {
          esPrimo = " no es primo";
        }
        
      }
      System.out.printf("%s \n", esPrimo);
    }

    teclado.close();
  }
}
