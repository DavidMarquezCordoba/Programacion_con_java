/*
 * Realiza un programa que nos diga cuántos dígitos tiene un número entero que
puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T04Ejercicio19 {
  public static void main(String[] args) {
    
    int iNumero;
    String sNumero;
    int valorIndex;

    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    System.out.print("Introduce un número, averiguaremos cuántos dígitos tiene: ");
    iNumero = teclado.nextInt();
    System.out.println("");

    if (iNumero <= 99999) {
      sNumero = Integer.toString(iNumero);
      valorIndex = sNumero.length();

      System.out.println("El número " +iNumero+ " tiene " +valorIndex+ " dígitos.");     
      System.out.println(""); 
    } else {
      System.out.println("El número debe tener 5 dígitos.");
      System.out.println("");
    }

    teclado.close();
  }
}
