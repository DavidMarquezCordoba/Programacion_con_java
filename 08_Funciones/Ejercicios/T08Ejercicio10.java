import java.util.Scanner;

import funciones.utilidades;

/**
 * quitaPorDelante: Le quita a un número n dígitos por delante (por la
izquierda).
 * 
 * @author David Márquez Córdoba
 */

public class T08Ejercicio10 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    long numIntroducido;
    int quitaPorDelante;

    System.out.println("Introduzca un número entero positivo para recortar: ");
    numIntroducido = teclado.nextLong();
    System.out.println("¿Cuántos dígitos quiere recortar por delante?: ");
    quitaPorDelante = teclado.nextInt();

    System.out.printf("El número %d si le quitamos %d dígitos por delante queda así: %d", numIntroducido,quitaPorDelante, utilidades.quitaPorDelante(numIntroducido, quitaPorDelante));

    teclado.close();
  }
}
