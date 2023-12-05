import java.util.Scanner;

/**
 * Realiza un programa que pinte una escalera que va descendiendo de izquierda
a derecha. El programa pedirá el número de escalones y la altura de cada
escalón. La anchura de los escalones siempre es la misma: 4 asteriscos.
 * 
 * @author David Márquez Córdoba
 */

public class T05Ejercicio67 {
  public static void main(String[] args) {
    
    int escalones = 0;
    int alturaEscalon = 0;
    int planta = 1;
    int alturaTotal = 0;
    String asterisco = "*";
    final int ANCHURA = 4;
    int contadorAltura = 1;
    int contadorAnchura = 1;

    Scanner teclado = new Scanner(System.in);

    System.out.print("Introduzca el número de escalones: ");
    escalones = teclado.nextInt();

    System.out.print("Introduzca la altura de cada escalón: ");
    alturaEscalon = teclado.nextInt();

    alturaTotal = escalones * alturaEscalon;

    // Vamos recorriendo todas las alturas
    for (int i = 0; i < alturaTotal; i++) {

      for (int j = 0; j < contadorAnchura; j++) {

        for (int j2 = 0; j2 < ANCHURA*contadorAltura; j2++) {
          System.out.print(asterisco);
        }
        
      }
      contadorAltura++;
      contadorAnchura++;
      System.out.println("");
    }
    teclado.close();
  }
}
      // // Vamos iterando para ver cuántas veces se repite la altura del escalon elegido
      // for (int j1 = 0; j1 < contadorAnchura; j1++) {

      //   //Vamos iterando hasta completar la altura del escalón
      //   for (int j2 = 0; j2 < alturaEscalon; j2++) {

      //     for (int k = 0; k < ANCHURA; k++) {
      //       System.out.print(asterisco);
      //     }

      //     System.out.println("");
      //   }

      // }
      // contadorAnchura++;