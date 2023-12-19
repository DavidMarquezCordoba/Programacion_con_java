import java.util.Scanner;

import funciones.utilidades;

/**
 * Escribe un programa que pase de decimal a binario.
 * 
 * @author David Márquez Córdoba
 */

public class T08Ejercicio18 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    long num;

    System.out.println("Introduce un número para pasarlo a binario: ");
    num = teclado.nextLong();

    System.out.println("El número "+num+" en sistema binario es: "+utilidades.decimalABinario(num));

    teclado.close();
  }
}
