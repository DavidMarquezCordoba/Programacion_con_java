/*
 * Escribe un programa que dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla todas las potencias con base el
numero dado y exponentes entre uno y el exponente introducido. No se deben
utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
se deberán mostrar 21, 22, 23, 24 y 25.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T05Ejercicio15 {
  public static void main(String[] args) {
    
    double base;
    int exponente;

    Scanner teclado = new Scanner(System.in);

    System.out.printf("Introduce una base: ");
    base = teclado.nextDouble();

    do {
      System.out.printf("Introduce un exponente: ");
      exponente = teclado.nextInt();
    } while (exponente <=0);
    
    for (int i = exponente-4; i <= exponente; i++) {
      System.out.printf(" %d^%d", base, i);
    }
    teclado.close();
  }
}
