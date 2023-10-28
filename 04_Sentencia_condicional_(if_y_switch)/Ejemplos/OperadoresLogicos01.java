/*
 * Vamos a ver cómo funcionan los operadores lógicos con un ejemplo. Mediante if ((n <
1) || (n > 100)) se pueden detectar los números que no están en el rango de 1 a 100;
literalmente sería “si n es menor que 1 o n es mayor que 100”.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class OperadoresLogicos01 {
  public static void main(String[] args) {
    
    int numero;

    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    
    System.out.print("Introduzca un número: ");
    numero = teclado.nextInt();

    if (numero < 1 || numero > 100) {
      System.out.println("El número debe estar comprendido entre 1 - 100");
      System.out.print("Tienes otra oportunidad: ");
      System.out.println("");
      numero = teclado.nextInt();
    }
    
    if (numero == 24) {
      System.out.println("Acertaste!!");
      System.out.println("");
    } else {
      System.out.println("Lo siento :-( en otra ocasión será");
      System.out.println("");
    }

    teclado.close();
  }
}
