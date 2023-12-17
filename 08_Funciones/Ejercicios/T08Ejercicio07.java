import java.util.Scanner;

import funciones.utilidades;

/**
 * digitoN: Devuelve el dígito que está en la posición n de un número entero.
Se empieza contando por el 0 y de izquierda a derecha.
 * 
 * @author David Márquez Córdoba
 */

public class T08Ejercicio07 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    long numeroIntroducido=0;
    int posicionDeDigito = 0;

    System.out.println("Introduce un número:");
    numeroIntroducido = teclado.nextLong();
    System.out.println("Introduce la posición deseada: ");
    posicionDeDigito = teclado.nextInt();

    System.out.printf("El dígito que ocupa la posición %d en el número %d es el %d", posicionDeDigito, numeroIntroducido, utilidades.digitoN(numeroIntroducido, posicionDeDigito));
    teclado.close();
  }
}
