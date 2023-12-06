import java.util.Scanner;

/**
 * Realiza un programa que pinte una X hecha de asteriscos. El programa debe
pedir la altura. Se debe comprobar que la altura sea un número impar mayor o
igual a 3, en caso contrario se debe mostrar un mensaje de error.
 * 
 * @author David Márquez Córdoba
 */

public class T05Ejercicio35 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    int alturaX;
    String asterisco = "*";
    String espacios = " ";
    int nivel = 2;
    int contadorEspacios = 1;

    System.out.print("Por favor, introduzca la altura de la X: ");
    alturaX = teclado.nextInt();
    int copiaAlturaX = alturaX;

    int mitad = (alturaX-1)/2;
    int copiaMitad = mitad;

    if ((alturaX >=3) && (alturaX %2 != 0)) {
      
      // Pintamos la primera mitad (Parte Superior)
      for (int i = 0; i < mitad; i++) {

        //Espacios por delante
        for (int j = 0; j < i; j++) {
          System.out.print(espacios);
        }

        //Pinta asteriscos izq
        System.out.print(asterisco);
  
        //Pintamos espacios
        for (int j = 0; j < copiaAlturaX-nivel; j++) {
          System.out.print(espacios);
        }

        //Rebajamos un nivel la altura
        nivel++;
        copiaAlturaX--;

        //Pintamos el último asterisco
        System.out.print(asterisco);

        //Salto de línea
        System.out.println("");

      }

      //Pintamos el * del medio

      //Primero controlamos los espacios por delante
      for (int i = 0; i < mitad; i++) {
        System.out.print(espacios);
      }

      //Ahora sí, pintamos asterisco
      System.out.println(asterisco);

      // Pintamos la segunda mitad (Parte Inferior)
      for (int i = 0; i < copiaMitad; i++) {
        
        //Pintamos espacios
        for (int j = 0; j < mitad - 1; j++) {
          System.out.print(espacios);
        }

        //Pintamos primer asterisco
        System.out.print(asterisco);

        //Pintamos espacios interior
        for (int j = 0; j < contadorEspacios; j++) {
          System.out.print(espacios);
        }

        contadorEspacios+=2;
        mitad--;

        //Pintamos asterisco derecha
        System.out.println(asterisco);
      }
    } else {
      System.out.println("Solo número impares mayores o iguales a 3");
    }
    
    teclado.close();
  }
}


// Por favor, introduzca la altura de la X: 5

// *   *
//  * *
//   *
//  * *
// *   *
