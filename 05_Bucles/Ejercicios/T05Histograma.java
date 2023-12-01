import java.util.Scanner;

/**
 * Hacer un ejercicio que pida por teclado un carácter y, a continuación, una serie de números enteros (de 0 en adelante) 
 * hasta que se introduzca un número negativo. A continuación se mostrará una tabla donde en la primera columna aparecerán
 * los números introducidos y en cada fila aparecerá repetido el carácter introducido tantas veces como indique la primera columna.

  Ejemplo:

  1 | #
  5 | # # # # # #
  3 | # # #
 * 
 * @author David Márquez Córdoba
 */

public class T05Histograma {
  public static void main(String[] args) {
    
    int numIntroducido = 0;
    String caracter = "";



    Scanner teclado = new Scanner(System.in);

    do {

      System.out.print("Introduce un número entero (de 0 en adelante): ");
      numIntroducido = teclado.nextInt();
      
      if (numIntroducido<0) {
        System.out.print("Cerrando programa...");
      } else {
        System.out.print("Introduzca un caracter: ");
        caracter = teclado.next();

        System.out.print(numIntroducido + " | ");

        for (int i = 0; i < numIntroducido; i++) {
          System.out.print(caracter);
        }

        System.out.println("");
      }

    } while (numIntroducido>0);

    teclado.close();
  }
}
