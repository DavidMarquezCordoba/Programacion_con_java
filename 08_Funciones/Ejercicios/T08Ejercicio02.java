import java.util.Scanner;

import funciones.utilidades;

/**
 * esPrimo: Devuelve verdadero si el número que se pasa como parámetro
es primo y falso en caso contrario.
 * 
 * @author David Márquez Córdoba
 */

public class T08Ejercicio02 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    
    int numeroIntroducido;

    System.out.println("Introduce un número para ver si es primo o no: ");
    numeroIntroducido = teclado.nextInt();

    if (utilidades.esPrimo(numeroIntroducido)) {
      System.out.println("El número "+ numeroIntroducido+ " es primo");
    } else {
      System.out.println("El número "+ numeroIntroducido+ " NO es primo");
    }


    teclado.close();
  }
}
