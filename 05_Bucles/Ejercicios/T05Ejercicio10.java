import java.util.Scanner;

/**
 * Escribe un programa que calcule la media de un 
 * conjunto de números positivos introducidos por teclado. 
 * A priori, el programa no sabe cuántos números 
 * se introducirán. El usuario indicará que ha terminado de 
 * introducir los datos cuando meta un número negativo.
 * 
 * @author David Márquez Córdoba
 */

public class T05Ejercicio10 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    double media = 0;
    double sumatoriaNumeros = 0;
    int contador = 0;
    double numeroIntroducido;

    do {
      System.out.printf("Introduce un número: ");
      numeroIntroducido = teclado.nextDouble();

      sumatoriaNumeros += numeroIntroducido;

      if (numeroIntroducido>0) {
        contador++;
      }

    } while (numeroIntroducido >= 0);

    media = sumatoriaNumeros / contador;

    System.out.println("...Saliendo...");
    System.out.println("*****Calculando la media*****");
    System.out.printf("La media de los números introducidos es: %.2f\n", media);

    teclado.close();
  }
}
