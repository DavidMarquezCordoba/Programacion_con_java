/*
 * Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a
derecha que ocupa ese dígito en el número introducido.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T05Ejercicio26 {
  public static void main(String[] args) {
    
    int numeroIntroducido;
    int digito;

    int contadorDigitos;

    Scanner teclado = new Scanner(System.in);

    System.out.printf("Introduce un número: ");
    numeroIntroducido = teclado.nextInt();

    System.out.printf("Introduce una posición: ");
    digito = teclado.nextInt();




    teclado.close();
  }
}


//SIN TERMINAR