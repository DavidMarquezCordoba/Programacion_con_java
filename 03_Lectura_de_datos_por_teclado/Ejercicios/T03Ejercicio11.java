/*
 * Realiza un conversor de Kb a Mb.
 * 
 * @author David Márquez Córdoba
 */

import java.util.*;

public class T03Ejercicio11 {
  public static void main(String[] args) {

    int kb;
    double mb;
    final int VALOR_KB= 1024;

    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    System.out.printf("Introduce una cantidad de KB: ");
    kb = teclado.nextInt();

    teclado.close();
    System.out.println("");

    //Lógica
    mb = (double)kb / (double)VALOR_KB;

    System.out.printf("%d kb son %.2f Mb", kb, mb);

  }
}
