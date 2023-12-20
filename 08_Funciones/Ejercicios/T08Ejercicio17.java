import java.util.Scanner;

import funciones.utilidades;

/**
 * Escribe un programa que pase de binario a decimal.
 * 
 * @author David Márquez Córdoba
 */

public class T08Ejercicio17 {
  public static void main(String[] args) {
    
    long numBinario;

    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduce un número binario: ");
    numBinario = teclado.nextLong();

    System.out.println("El número binario "+numBinario+ " corresponde al número decimal: "+ utilidades.binarioADecimal(numBinario));

    teclado.close();
  }
}
