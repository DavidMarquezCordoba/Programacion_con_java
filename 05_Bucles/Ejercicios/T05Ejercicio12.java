/*
 * Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
introducir por teclado.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T05Ejercicio12 {
  public static void main(String[] args) {
    
    int primero = 0;
    int segundo = 1;
    int siguiente;
    int n;

    Scanner teclado = new Scanner(System.in);

    do {
      System.out.printf("Introduce un número: ");
      n = teclado.nextInt();
    } while (!(n>0));

    switch (n) {
      case 1:
        System.out.println("0");
        break;
      case 2:
        System.out.printf("0 1");
        break; 

      default:
        System.out.printf("0 1");
        while (n >2) {
          siguiente = primero + segundo;
          primero = segundo;
          segundo = siguiente;
          System.out.printf(" %d",siguiente);
          n--;
        }
        break;
    }
    teclado.close();
  }
}
