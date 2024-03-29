import java.util.Scanner;

/**
 * Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en mostrarse
y viceversa.
 * 
 * @author David Márquez Córdoba
 */

public class T07Ejercicio03 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    int [] num = new int [10];

    for (int i = 0; i < num.length; i++) {
      System.out.print("Introduce un número: ");
      num [i] = teclado.nextInt();
    }

    for (int i = num.length -1 ; i >= 0; i--) {
      System.out.println("La posición " + i + " tiene el valor " + num[i]);
    }

    teclado.close();

    //Solución de Luis -Funciona-
    
    // int[] n = new int[10];
    // int i;
    
    // System.out.println("Por favor, introduzca 10 números enteros.");
    // System.out.println("Pulse la tecla INTRO después de introducir cada número.");

    // for (i = 0; i < 10; i++) {
    //   n[i] = Integer.parseInt(System.console().readLine());
    // }
    
    // System.out.println("\nLos números introducidos, al revés, son los siguientes:");
    // for (i = 9; i >= 0; i--) {
    //   System.out.println(n[i]);
    // }
  }
}
