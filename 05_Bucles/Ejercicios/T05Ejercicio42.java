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
    

    Scanner teclado = new Scanner(System.in);

    do {
      System.out.printf("Introduce un número entero positivo: ");
      numeroIntroducido = teclado.nextInt();
    } while (numeroIntroducido<0);
    
    for (int i = numeroIntroducido; i < numeroIntroducido+25; i++) {
      System.out.printf("%d ", i);

      boolean esPrimo = true;

      for (int j = 2; j < i; j++) {

        if (i%j==0) {
          esPrimo = false;
        }
        
      }

      if (esPrimo) {
        System.out.printf(" es primo\n");
      } else {
        System.out.printf(" no es primo\n");
      }

      // System.out.printf("%s \n", esPrimo);
    }

    teclado.close();
  }
}
