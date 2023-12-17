import java.util.Scanner;

import funciones.utilidades;

/**
 * digitos: Cuenta el número de dígitos de un número entero.
 * 
 * @author David Márquez Córdoba
 */

public class T08Ejercicio05 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduce un número para ver cuántos digitos tiene: ");
    long numeroIntroducido = teclado.nextLong();

    System.out.printf("El número %d tiene %d dígitos", numeroIntroducido, utilidades.cuentaDigitos(numeroIntroducido));
    teclado.close();
  }
}
