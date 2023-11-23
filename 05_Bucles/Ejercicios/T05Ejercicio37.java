/*
 * Realiza un conversor del sistema decimal al sistema de “palotes”.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T05Ejercicio37 {
  public static void main(String[] args) {
    
    int numIntroducido = 0;
    String palote = "|";
    String separacion = "-";
    String cero = "";
    int primerDigito = 0;

    Scanner teclado = new Scanner(System.in);

    do {
      System.out.printf("Introduce un número: ");
      numIntroducido = teclado.nextInt();
    } while (numIntroducido<0);

    //Con esto obtengo el primer digito
    while (numIntroducido>=10) {
      primerDigito = numIntroducido / 10;
      numIntroducido = numIntroducido/10;
    }

    for (int i = 0; i < primerDigito; i++) {
      System.out.printf(palote);
    }

    System.out.printf(separacion);


    teclado.close();
  }
}

