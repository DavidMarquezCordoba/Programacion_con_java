import java.util.Scanner;

/*
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
convertir debe ser introducida por teclado.
 * 
 * @author David Márquez Córdoba
 */

public class T03Ejercicio03 {
  public static void main(String[] args) {
    
    int pesetasAConvertir;
    
    final double VALOR_PTAS=166.386;

    Scanner teclado = new Scanner(System.in);

    System.out.println("CONVERSOR PTAS (ptas) A EUROS (€)");
    System.out.println("---------------------------------");

    System.out.println("Introduce cuantas pesetas quieres convertir a euros: ");
    pesetasAConvertir = teclado.nextInt();

    teclado.close();
    
    double resultadoConversion = (double)(pesetasAConvertir/VALOR_PTAS);

    System.out.printf("%d ptas equivalen a %.2f €", pesetasAConvertir, resultadoConversion);
  }
}
