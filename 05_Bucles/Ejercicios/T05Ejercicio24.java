/*
 * Escribe un programa que lea un número n e imprima una pirámide de números
 *con n filas como en la siguiente figura:
 *              1
 *             121
 *            12321
 *           1234321
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T05Ejercicio24 {
  public static void main(String[] args) {
    
    // int pintaNumeros = 0;

    int altura = 1;

    // String espaciosPorDelante = " ";

    Scanner teclado = new Scanner(System.in);

    System.out.printf("Introduce una altura: ");
    altura = teclado.nextInt();

    System.out.println("");
    //1er FOR -> Vamos recorriendo cada nivel de la pirámire
    for (int i = 1; i <= altura; i++) {
      
      // 2º FOR -> pintamos los espacios por delante =EX= es un mismo patrón altura - i (aumenta a cada nivel 1 más)
      for (int j = 1; j <= altura-i; j++) {
        System.out.print(" ");
      }

      // 3er FOR -> Pintamos la primera secuencia de números (aumentando) 
      // =EX= Ponemos de límite i porque sabemos que aumentará en cada iteración
      //  Sabemos que estará pintando hasta que llegue a la altura indicada y empezará pintando el "1"
      for (int k = 1; k <= i ; k++) {
        System.out.print(k);
      }

      // 4º FOR -> Pintamos la segunda secuencia de números (disminuyendo)
      // =EX= Ponemos de límite i-1 porque sabemos que emepzará con un número menos, ya que en el centro de la pirámide está el máx(la altura del nivel) 
      //  Sabemos que estará pintando hasta que llegue a la altura indicada y empezará pintando el "i-1"      
      for (int m = i-1; m >= 1; m--) {
        System.out.print(m);
      }

      System.out.println("");
      System.out.println("");
    }
    teclado.close();
  }
}
