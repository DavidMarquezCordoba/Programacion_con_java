/*
 * Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T05Ejercicio13 {
  public static void main(String[] args) {
    
    int numIntroducido;
    int contadorPositivos=0;
    int contadorNegativo=0;
    int contadorNumeros = 0;
    int contadorCeros = 0;

    Scanner teclado = new Scanner(System.in);

    do {
      System.out.printf("Introduzca un número: ");
      numIntroducido = teclado.nextInt();

      if (numIntroducido>0) {
        contadorPositivos++;
      } else if (numIntroducido<0){
        contadorNegativo++;
      } else if (numIntroducido ==0){
        contadorCeros++;
      }

      contadorNumeros++;
    } while (contadorNumeros <10);

    System.out.printf("Ha introducido un total de %d números, de los cuales, \"%d\" han sido positivos, \"%d\" han sido negativos y \"%d\" ceros \n", contadorNumeros, contadorPositivos, contadorNegativo, contadorCeros);

    teclado.close();
  }
}
