/*
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T05Ejercicio11 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    int numIntroducido;

    System.out.printf("Introduce un número: ");
    numIntroducido = teclado.nextInt();

    teclado.close();

    System.out.printf("+-----------------------+\n");
    System.out.printf("| NUM | Cuadrado | Cubo |\n");
    System.out.printf("+-----------------------+\n");


    for (int i = numIntroducido+1; i <= numIntroducido+5; i++) {
      System.out.printf("| %3d |  %4d    | %4d |\n", i, i*i, i*i*i);
    }

    System.out.printf("+-----------------------+\n");


  }
}
