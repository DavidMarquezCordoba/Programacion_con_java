/*
 * Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
hay dentro de un número. Se recomienda usar long en lugar de int ya que el
primero admite números más largos.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T05Ejercicio41 {
  public static void main(String[] args) {
    
    long numeroIntroducido = 0;
    long numeroIntroducidoOriginal = 0;

    long contadorPares = 0;
    long contadorImpares = 0;

    long ultimoNumero = 0;

    Scanner teclado = new Scanner(System.in);

    //Controlamos para que siempre pida un número entero positivo.
    do {
      System.out.printf("Por favor, introduzca un número entero positivo: ");
      numeroIntroducido = teclado.nextLong();
      numeroIntroducidoOriginal = numeroIntroducido;

      if (numeroIntroducido<=0) {
        System.out.println("");
        System.out.println("----------------------------------------------");
        System.out.println("Introduce un número entero positivo, por favor");
        System.out.println("----------------------------------------------");
        System.out.println("");
      }
    } while (numeroIntroducido<0);

    ////////////////////////////////////// L O G I C A /////////////////////////////////////////////////////////

    //Evaluamos si tiene más de un dígito
    if (numeroIntroducido>=10) {

      //Controlamos para evaluar los contadores positivos y negativos      
      while (numeroIntroducido>=10) {

        //Vamos dividiendo el número para ir clasificando poco a poco cada uno de los dígitos.

        ultimoNumero = numeroIntroducido%10;        //Averiguamos un dígito -el último-

        numeroIntroducido = numeroIntroducido/10;   //Actualizamos el valor del número a evaluar.

        if (ultimoNumero %2 ==0) {
          contadorPares++;
        } else {
          contadorImpares++;
        }
      }

      if (numeroIntroducido %2 ==0) {
        contadorPares++;
      } else {
        contadorImpares++;
      }

      System.out.printf("El número %d contiene %d dígitos pares y %d dígitos impares.\n", numeroIntroducidoOriginal, contadorPares, contadorImpares);

    } else {   //Evaluamos la posibilidad que solo se introduzca un dígito
      
      if (numeroIntroducido%2==0) {
        contadorPares++;
      } else{
        contadorImpares++;
      }

      System.out.printf("El número %d contiene %d dígitos pares y %d dígitos impares.\n", numeroIntroducidoOriginal, contadorPares, contadorImpares);
    }


    teclado.close();
  }
}

