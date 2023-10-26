import java.util.Scanner;

/*
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
convertir debe ser introducida por teclado.
 * 
 * @author David Márquez Córdoba
 */

public class T03Ejercicio02 {
  public static void main(String[] args) {
    
    
    double euros;
    final double VALOR_PTAS = 166.386;

    Scanner teclado = new Scanner(System.in);

    System.out.println("CONVERSOR EUROS (€) A PESETAS (ptas)");
    System.out.println("------------------------------------");

    System.out.println("Escriba cuántos € quiere convertir a ptas: ");
    euros = teclado.nextDouble();

    teclado.close();

    int resultado = (int)(euros*VALOR_PTAS);

    System.out.printf("%.2f € equivalen a %d ptas", euros, resultado);

  }
}
