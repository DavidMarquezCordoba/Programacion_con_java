/*
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
mitad (división entera entre 2) de la altura más uno.
Ejemplo:

Introduzca la altura de la L: 5
          *
          *
          *
          *
          * * *
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T05Ejercicio31 {
  public static void main(String[] args) {
    
    String asterisco = "*";
    int altura;
    int nivel = 0;
    int horizontal;

    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    System.out.printf("Introduce la altura para la L: ");
    altura = teclado.nextInt();

    while (nivel<altura-1) {

      System.out.println(asterisco);

      nivel++;
      // System.out.println(nivel);
    }

    horizontal = (altura/2)+1;

    for (int i = 0; i < horizontal; i++) {
      System.out.print(asterisco);
    }
  
    teclado.close();
    System.out.println("");
  }
}
