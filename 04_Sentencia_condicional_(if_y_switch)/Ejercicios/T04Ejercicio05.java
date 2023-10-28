/*
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =0).
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T04Ejercicio05 {
  public static void main(String[] args) {
    double a;
    double b;
    double x;

    Scanner teclado = new Scanner(System.in);
    System.out.println("");
    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
    System.out.print("Por favor, introduzca el valor de a: ");
    a = teclado.nextDouble();
    System.out.println("");
    System.out.print("Ahora introduzca el valor de b: ");
    b = teclado.nextDouble();
    System.out.println("");

    teclado.close();

    if (a >= 1){
      x = (b*(-1)/a);

      System.out.printf("x = %.2f", x);
      System.out.println("");
    } else{
      System.out.println("Esa ecuación no tiene solución real");
    }

  }
}
