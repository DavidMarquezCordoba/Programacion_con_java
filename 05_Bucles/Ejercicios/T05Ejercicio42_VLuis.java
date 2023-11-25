/*
 * Mismo que Ej 42 pero la versión corregida de Luis
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T05Ejercicio42_VLuis {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Por favor, introduzca un número entero positivo: ");
    int numeroIntroducido = teclado.nextInt();
    
    boolean esPrimo;

    for (int n = numeroIntroducido; n < numeroIntroducido + 5; n++) {

      // comprueba si n es primo
      esPrimo = true;
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          esPrimo = false;
        }
      }

      // muestra por pantalla si n es primo o no
      if (esPrimo) {
        System.out.println(n + " es primo");
      } else {
        System.out.println(n + " no es primo");
      }
    }
    System.out.println();
    teclado.close();
  }
}
