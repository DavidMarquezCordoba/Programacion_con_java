import java.util.Scanner;

import funciones.utilidades;

/**
 * voltea: Le da la vuelta a un número.
 * 
 * @author David Márquez Córdoba
 */

public class T08Ejercicio06 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    long numIntroducido;

    System.out.println("Introduce un número por teclado para voltearlo: ");
    numIntroducido = teclado.nextLong();

    System.out.printf("El número volteado %d es %d", numIntroducido, utilidades.voltea(numIntroducido));

    teclado.close();
  }
}
