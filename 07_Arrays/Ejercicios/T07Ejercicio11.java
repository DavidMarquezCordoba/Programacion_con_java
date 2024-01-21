import java.util.Scanner;

/**
 * Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
primos a las primeras posiciones, desplazando el resto de números (los que no
son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
array resultante.
 * 
 * @author David Márquez Córdoba
 */

public class T07Ejercicio11 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    

    //Variable que almacena el valor introducido por teclado
    int num;

    int [] arrayOriginal = new int[10];
    //Se añade 10 porque podría ser que los 10 números sean primos
    int [] arrayPrimos = new int [10];
    //Se añade 10 porque podría ser que los 10 números no sean primos
    int [] arrayNoPrimos = new int[10];

    int contPrimo = 0;
    int contNoPrimo = 0;
    boolean esPrimo;

    System.out.println("\nINTRODUZCA 10 NÚMEROS\n");

    for (int i = 0; i < arrayOriginal.length; i++) {
      System.out.print("Introduzca el valor " + (i+1) + ": ");
      num = teclado.nextInt();
      arrayOriginal[i] = num;
  
      // Definimos dentro para que se "Reinicie"  el valor y pueda determinar una cosa u otra
      esPrimo = true;
  
      // Bucle para determinar si es primo o no el número introducido
      for (int j = 2; j < num; j++) {
          if (num % j == 0) {
              esPrimo = false;
              break;
          }
      }
  
      // Según la verificación, añadimos el número al array correspondiente
      if (esPrimo) {
          arrayPrimos[contPrimo++] = num;
      } else {
          arrayNoPrimos[contNoPrimo++] = num;
      }
  }

    System.out.println("Array original");

    //Mostramos por pantalla
    System.out.print("\nÍndice");
    for (int i = 0; i < arrayOriginal.length; i++) {
      System.out.printf("%7d", (i));
    }

    System.out.println("");

    System.out.print("Valor ");
    for (int i = 0; i < arrayOriginal.length; i++) {
      System.out.printf("%7d",arrayOriginal[i]);
    }

    System.out.println("");
    //////////////////////////// 2ª PARTE ///////////////////////
    System.out.println("");

    System.out.println("Array modificado");
    System.out.print("\nÍndice");
    for (int i = 0; i < arrayOriginal.length; i++) {
      System.out.printf("%7d", (i));
    }

    System.out.print("\nValor ");

    //Mostramos los números PRIMOS
    for (int i = 0; i < contPrimo; i++) {
      System.out.printf("%7d", arrayPrimos[i]);
    }

    //Ahora mostramos el array NO PRIMOS
    for (int i = 0; i < contNoPrimo; i++) {
      System.out.printf("%7d", arrayNoPrimos[i]);
    }

    teclado.close();
  }
}
