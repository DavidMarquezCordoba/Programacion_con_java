/*
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo
ax2 + bx + c = 0).
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T04Ejercicio09 {
  public static void main(String[] args) {
    int a;
    int b;
    int c;

    double xSub1;
    double xSub2;

    Scanner teclado = new Scanner(System.in);

    System.out.printf("Escriba un valor para a: ");
    a = teclado.nextInt();
    System.out.printf("Escriba un valor para b: ");
    b = teclado.nextInt();
    System.out.printf("Escriba un valor para c: ");
    c = teclado.nextInt();

    teclado.close();

    //Añadir discriminantes
    xSub1 = ((b*(-1)) + Math.sqrt((Math.pow(b, 2) - (4*a*c))))/2*a;
    xSub2 = ((b*(-1)) - Math.sqrt((Math.pow(b, 2) - (4*a*c))))/2*a;

    System.out.println("");
    System.out.printf("X1 tendría un valor de: %d%n", (int)xSub1);
    System.out.printf("X2 tendría un valor de: %d%n", (int)xSub2);
  }
}
