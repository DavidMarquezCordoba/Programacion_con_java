/*
 * Realiza un programa que diga si un número introducido por teclado es par y/o
divisible entre 5.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T04Ejercicio14 {
  public static void main(String[] args) {
    
    int n1;
    int par;
    int divisiblePor5;

    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    System.out.print("Diga un número: ");
    n1 = teclado.nextInt();
    System.out.println("");

    teclado.close();

    par = n1 % 2;
    divisiblePor5 = n1 % 5;

    if (par == 0) {
      System.out.println(n1+ " es par.");
    } else{
      System.out.println("No es par");
    }

    if (divisiblePor5 == 0) {
      System.out.println(n1+ " es divisible por 5.");
    } else{
      System.out.println("No es divisible entre 5.");
    }
  }
}
