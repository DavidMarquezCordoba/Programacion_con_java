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
    
    Scanner teclado = new Scanner(System.in);
    System.out.print("Introduzca el número de escalones: ");
    int escalones = teclado.nextInt();
    System.out.print("Introduzca la altura de cada escalón: ");
    int alturaEscalon = teclado.nextInt();

    for (int i = 1; i <= escalones; i++) {

      for (int j = 1; j <= alturaEscalon; j++) {

        for (int k = 0; k < i; k++) {
          System.out.print("****");
        }
        System.out.println();
      }
    }
    teclado.close();
  }
}




// Mi primera versión //

// int escalones = 0;
// int alturaEscalon = 0;
// int planta = 1;
// int alturaTotal = 0;
// String asterisco = "*";
// final int ANCHURA = 4;
// int contadorAltura = 1;
// int contadorAnchura = 1;
// int contadorIteraciones = 0;
// int contadorAux = 1;

// Scanner teclado = new Scanner(System.in);

// System.out.print("Introduzca el número de escalones: ");
// escalones = teclado.nextInt();

// System.out.print("Introduzca la altura de cada escalón: ");
// alturaEscalon = teclado.nextInt();

// alturaTotal = escalones * alturaEscalon;

// // Vamos recorriendo todas las alturas
// for (int i = 0; i < alturaTotal; i++) {

//   // Vamos pintando cada nivel
//   for (int j = 0; j < contadorAnchura; j++) {

//     for (int j2 = 0; j2 < ANCHURA*contadorAltura; j2++) {
//       System.out.print(asterisco);
//     }
//     contadorIteraciones++;
    
//   }

//   //Comprobamos si ha llegado a imprimir la altura del escalón introducido por teclado
//   if (contadorIteraciones == (alturaEscalon)) {
//     contadorAnchura++;
//     contadorAux++;
//     contadorAltura++;
//     contadorIteraciones = 0;
//   }
  
//   System.out.println("");
// }


// teclado.close();
