/*
 * El usuario mete por teclado un número, y dirá si es positivo o negativo
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class SentenciaIf02 {
  public static void main(String[] args) {
    
    //Método 1
    System.out.printf("MÉTODO 1\n");
    System.out.printf("--------\n");

    int num;

    Scanner teclado = new Scanner(System.in);

    System.out.print("Escriba un número para averiguar si es positivo o negativo: ");
    num = teclado.nextInt();
    System.out.println("");
    teclado.close();

    if (num>=0) {
      System.out.println("El número positivo");
    } else {
      System.out.println("El número negativo.");
    }

    System.out.println(""); 

    //Método 2

    // System.out.printf("MÉTODO 2\n");
    // System.out.printf("--------\n");

    // System.out.print("Escriba un número para averiguar si es positivo o negativo: ");
    // String numero = System.console().readLine();

    // //Lo parseamos
    // int x = Integer.parseInt(numero);

    // System.out.println("");
    // if (x>0) {
    //   System.out.println("El número positivo");
    // } else {
    //   System.out.println("El número negativo.");
    // }

    // System.out.println(""); 

  }
}
