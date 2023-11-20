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
    
    int base;
    int exponente;
    int exponenteFinal;
    int potencia;

    Scanner teclado = new Scanner(System.in);

    System.out.printf("Introduce una base: ");
    base = teclado.nextInt();

    do {
      System.out.printf("Introduce un exponente: ");
      exponenteFinal = teclado.nextInt();
    } while (exponenteFinal <=0);
    
    for (int i = 1; i <= exponenteFinal; i++) {

      potencia = 1;
      exponente = i;

      for (int j = 0; j < exponente; j++) {
        potencia = potencia * base; // lo mismo que potencia *= base
      }
      System.out.printf(" %d ^ %d = %d\n", base, i, potencia);
    }
    teclado.close();
  }
}

//No lo tengo muy claro aún...repasar.
