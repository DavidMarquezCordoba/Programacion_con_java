import java.util.Scanner;

import funciones.utilidades;

/**
 * potencia: Dada una base y un exponente devuelve la potencia.
 * 
 * @author David Márquez Córdoba
 */

public class T08Ejercicio04 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    int base;
    int exponente;

    System.out.println("Introduce una base: ");
    base = teclado.nextInt();
    System.out.println("Introduce un exponente: ");
    exponente = teclado.nextInt();

    System.out.printf("La potencia de %d elevado a %d es %.2f", base, exponente,(double) utilidades.potencia(base, exponente));

    teclado.close();
  }
}
