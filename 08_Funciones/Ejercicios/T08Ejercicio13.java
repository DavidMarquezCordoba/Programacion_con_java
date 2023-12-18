import java.util.Scanner;

import funciones.utilidades;

/**
 * trozoDeNumero: Toma como parámetros las posiciones inicial y final
dentro de un número y devuelve el trozo correspondiente.
 * 
 * @author David Márquez Córdoba
 */

public class T08Ejercicio13 {
  public static void main(String[] args) {
    
    long numIntroducido;
    int inicio;
    int fin;

    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    
    System.out.println("Introduce un número entero positivo: ");
    numIntroducido = teclado.nextLong();
    System.out.println("Introduce la posición inicial: ");
    inicio = teclado.nextInt();
    System.out.println("Introduce la posición final: ");
    fin = teclado.nextInt();

    System.out.printf("Si recortamos el nº %d por delante %d dígitos y por detrás %d dígitos, el trozo resultante es: %d", numIntroducido, inicio, fin, utilidades.trozoDeNumero(numIntroducido, inicio, fin));
    
    
  }
}
