/*
 * Escribe un programa que pida una base y un exponente (entero positivo) y que
calcule la potencia.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T05Ejercicio14 {
  public static void main(String[] args) {
    
    double base;
    int exponente;
    double potencia;

    Scanner teclado = new Scanner(System.in);

    System.out.printf("Introduzca una base: ");
    base = teclado.nextInt();      

    do {
      System.out.printf("Introduzca un exponente: ");
      exponente = teclado.nextInt();      
    } while (exponente <1);

    potencia = Math.pow(base, exponente);

    System.out.printf("El resultado de %d elevado a %d, es %.2f", base, exponente, potencia);
    teclado.close();
  }
}
