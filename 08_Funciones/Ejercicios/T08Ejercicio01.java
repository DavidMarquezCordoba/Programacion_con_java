import java.util.Scanner;

import funciones.utilidades;

/**
 * esCapicua: Devuelve verdadero si el número que se pasa como parámetro
es capicúa y falso en caso contrario.
 * 
 * @author David Márquez Córdoba
 */

public class T08Ejercicio01 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    long numIntroducido=0;

    System.out.print("Introduce un número para saber si es capicúa: ");
    numIntroducido = teclado.nextLong();

    if (utilidades.esCapicua(numIntroducido)) {
      System.out.println("El número "+ numIntroducido+ " es capicúa");
    } else {
      System.out.println("El número "+ numIntroducido+ " NO es capicúa");
    }



    teclado.close();
  }
}
