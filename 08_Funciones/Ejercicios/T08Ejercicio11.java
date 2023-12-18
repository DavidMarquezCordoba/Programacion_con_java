import java.util.Scanner;

import funciones.utilidades;

/**
 * pegaPorDetras: Añade un dígito a un número por detrás.
 * 
 * @author David Márquez Córdoba
 */

public class T08Ejercicio11 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    long numIntroducido;
    long numAnadido;

    System.out.println("Introduce un número entero positivo: ");
    numIntroducido = teclado.nextLong();
    System.out.println("Introduce un número que se añadirá por detrás");
    numAnadido = teclado.nextLong();

    System.out.printf("El resultado de unir %d por la derecha a %d es %d", numAnadido, numIntroducido, utilidades.pegaPorDetras(numIntroducido, numAnadido));
    teclado.close();
  }
}
