/*
 * Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T05Ejercicio25 {
  public static void main(String[] args) {
    
    int numeroIntroducido;
    int ultimoDigito=0;
    int numeroIntroducidoOriginal;

    Scanner teclado = new Scanner(System.in);

    System.out.printf("Diga un número: ");
    numeroIntroducido = teclado.nextInt();

    //Lo meto dentro de una variable para almacenarla y comparar que se introduce mínimo 2 dígitos.
    numeroIntroducidoOriginal = numeroIntroducido;

    while (numeroIntroducido>=10) {
      ultimoDigito = numeroIntroducido % 10;        // "Recorto" el numero para saber cuál es su último dígito y lo meto en su variable.
      numeroIntroducido = numeroIntroducido / 10;   // Actualizo el valor del número introducido para seguir recortando.
      System.out.print(ultimoDigito);               // Imprimimos el valor del último dígito.
    }

    System.out.println(numeroIntroducido);          // Como sabemos que el valor que queda en el número introducido es el último, lo imprimimos ahora, ya que dentro del bucle no nos dejaba

    //Controlamos las siguientes casuísticas (si tiene una cifra o es un número negativo)
    if (numeroIntroducidoOriginal>=0 && numeroIntroducidoOriginal<10) {
      System.out.println("Introduzca mínimo 2 cifras");
    } else if (numeroIntroducidoOriginal <0){
      System.out.println("No se pueden introducir números negativos.");
    }

    teclado.close();
  }
}
