import java.util.Scanner;

import funciones.utilidades;

/**
 * siguientePrimo: Devuelve el menor primo que es mayor al número que
se pasa como parámetro.
 * 
 * @author David Márquez Córdoba
 */

public class T08Ejercicio03 {
  public static void main(String[] args) {
    
    int numeroIntroducido = 0;

    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un número para saber cuál es el siguiente número primo: ");
    numeroIntroducido = teclado.nextInt();

    System.out.printf("El siguiente número primo desde %d es %d", numeroIntroducido, utilidades.siguientePrimo(numeroIntroducido));

    teclado.close();
  }
}
