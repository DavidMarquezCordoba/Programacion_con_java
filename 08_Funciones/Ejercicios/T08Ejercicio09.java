import java.util.Scanner;

import funciones.utilidades;

/**
 * quitaPorDetras: Le quita a un número n dígitos por detrás (por la
derecha).
 * 
 * @author David Márquez Córdoba
 */

public class T08Ejercicio09 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    long numIntroducido;
    int quitaPorDetras;

    System.out.println("Escriba un número para recortar posteriormente: ");
    numIntroducido = teclado.nextLong();
    System.out.println("¿Cuántos dígitos vamos a quitar por detrás?: ");
    quitaPorDetras = teclado.nextInt();

    System.out.printf("Si al número %d le quitamos %d dígitos, el número final es: %d", numIntroducido, quitaPorDetras, utilidades.quitaPorDetras(numIntroducido, quitaPorDetras));


    teclado.close();
  }
}
