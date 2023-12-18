import java.util.Scanner;

import funciones.utilidades;

/**
 * pegaPorDelante: Añade un dígito a un número por delante.
 * 
 * @author David Márquez Córdoba
 */

public class T08Ejercicio12 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    long numIntroducido;
    long numAnadido;

    System.out.println("Introduce un número entero positivo: ");
    numIntroducido = teclado.nextLong();
    System.out.println("Introduce un número que se añadirá por delante: ");
    numAnadido = teclado.nextLong();

    System.out.printf("El resultado de unir %d por la izquierda al número %d es: %d", numAnadido, numIntroducido, utilidades.pegaPorDelante(numIntroducido, numAnadido));
    teclado.close();
  }
}
