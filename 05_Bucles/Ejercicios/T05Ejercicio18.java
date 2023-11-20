/*
 * Escribe un programa que obtenga los números enteros comprendidos entre dos
números introducidos por teclado y validados como distintos, el programa debe
empezar por el menor de los enteros introducidos e ir incrementando de 7 en
7.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T05Ejercicio18 {
  public static void main(String[] args) {
    
    int num1;
    int num2;

    Scanner teclado = new Scanner(System.in);

    do {
      System.out.printf("Introduce el número 1: ");
      num1 = teclado.nextInt();

      System.out.printf("Introduce el número 2: ");
      num2 = teclado.nextInt();
      
      if (num1 == num2) {
        System.out.println("Los números deben ser distintos.");
      }

    } while (num1 == num2);

    if (num1 < num2) {
      for (int i = num1; i <= num2; i+=7) {
        System.out.printf(" %d", i);
      }
    } else {
        for (int i = num2; i <= num1; i+=7) {
          System.out.printf(" %d", i);
      }
    }
    teclado.close();

  }
}
