/*
 * Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T05Ejercicio07 {
  public static void main(String[] args) {
    
    int numSecreto = 1650;
    int numIntentos = 0;
    int numIntroducido;

    Scanner teclado = new Scanner(System.in);

    do {
      System.out.print("¿Cuál es la combinación?: ");
      numIntroducido = teclado.nextInt();

      if (numIntroducido == numSecreto) {
        System.out.println("La caja fuerte se ha abierto satisfactoriamente");
      } else {
        System.out.println("Lo siento, esa no es la combinación");
        numIntentos++;
      }
    } while (numIntentos <4);

    if (numIntentos>4) {
      System.out.println("Te has pasado de intentos.");
    }

    teclado.close();
  }
}
