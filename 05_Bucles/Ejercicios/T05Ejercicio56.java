import java.util.Scanner;

/**
 * Realiza un programa que pinte un triángulo relleno tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura.
 * 
 * Introduzca la altura de la figura: 8
* *******
*  ******
*   *****
*    ****
*     ***
*      **
*       *
*

 * @author David Márquez Córdoba
 */

public class T05Ejercicio56 {
  public static void main(String[] args) {
    
    int altura = 0;

    Scanner teclado = new Scanner(System.in);

    System.out.printf("Introduzca la altura de la figura: ");
    altura = teclado.nextInt();

    System.out.println("");

    //Control de niveles
    for (int i = 0; i < altura; i++) {

      //Pintamos espacios
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }

      //Pintamos asteriscos
      for (int j = 0; j < altura-i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }

    System.out.println("");
    teclado.close();
  }
}
