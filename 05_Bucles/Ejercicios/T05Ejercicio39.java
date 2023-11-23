/*
 * Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los números desde el 1 al número introducido junto
con su factorial.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T05Ejercicio39 {
  public static void main(String[] args) {
    
    int numIntroducido = 0;
    long factorial = 1;

    Scanner teclado = new Scanner(System.in);

    do {
      System.out.printf("Por favor, introduzca un número entero positivo: ");
      numIntroducido = teclado.nextInt();
    } while (numIntroducido<1);

    for (int i = 1; i <= numIntroducido; i++) {

      factorial = 1; //Se reinicia el valor factorial para resultados correctos

      for (int j = 1; j <= i ; j++) {
        factorial *=j;
      }
      System.out.printf("%d! = %d\n",i, factorial);

    }

    teclado.close();
  }
}
