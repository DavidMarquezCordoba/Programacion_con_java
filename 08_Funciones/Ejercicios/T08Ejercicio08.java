import java.util.Scanner;

import funciones.utilidades;

/**
 * posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
dentro de un número entero. Si no se encuentra, devuelve -1.
 * 
 * @author David Márquez Córdoba
 */

public class T08Ejercicio08 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int numAComprobar = 0;
    int numEntero = 0;

    System.out.println("Introduce un número entero: ");
    numEntero = teclado.nextInt();

    System.out.println("Introduce un número para comprobar si se encuentra en él: ");
    numAComprobar = teclado.nextInt();

    if (utilidades.posicionDeDigito(numEntero, numAComprobar)==-1) {
      System.out.printf("El numero a comprobar no se encuentra en el número entero\n");
    } else {
      System.out.printf("El número a comprobar (%d) de %d, se encuentra en la posición %d", numAComprobar, numEntero, utilidades.posicionDeDigito(numEntero, numAComprobar));
    }


    teclado.close();
  }
}
