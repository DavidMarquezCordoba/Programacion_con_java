import java.util.Scanner;

import funciones.utilidades;

/**
 * juntaNumeros: Pega dos números para formar uno.
 * 
 * @author David Márquez Córdoba
 */

public class T08Ejercicio14 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    long num1;
    long num2;
    String opcion;

    System.out.println("Introduce un número:");
    num1 = teclado.nextLong();
    System.out.println("Introduce otro número: ");
    num2 = teclado.nextLong();
    System.out.printf("¿Quieres que %d se junte por la izquierda o por la derecha? (D/I): ", num2);
    opcion = teclado.next();

    switch (opcion) {
      case "D","d":
        System.out.printf("El número resultante es %d", utilidades.juntaNumerosDer(num1, num2));
        break;

      case "I","i":
        System.out.printf("El número resultante es %d", utilidades.juntaNumerosIzq(num1, num2));
        break;

      default:
        System.out.println("Opción no válida");
        break;
    }
    teclado.close();
  }
}
