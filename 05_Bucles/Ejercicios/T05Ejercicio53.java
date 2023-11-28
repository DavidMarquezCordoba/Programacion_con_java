import java.util.Scanner;

/**
 * Realiza un programa que pinte un triángulo relleno tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura.
 * 
 * @author David Márquez Córdoba
 */

public class T05Ejercicio53 {
  public static void main(String[] args) {
    
    int numeroIntroducido = 0;
    int nivel = 0;

    Scanner teclado = new Scanner(System.in);


    System.out.printf("Introduzca la altura de la figura: ");
    numeroIntroducido = teclado.nextInt();

    System.out.println("");

    while (nivel <= numeroIntroducido+3) {

      for (int i = 0; i < numeroIntroducido; i++) {
        System.out.print("*");
      }

      System.out.println("");

      nivel++;
      numeroIntroducido--;
    }


    System.out.println("");


    teclado.close();
  }
}
