/*
 * Escribe un programa que diga cuál es la última cifra de un número entero
introducido por teclado.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T04Ejercicio17 {
  public static void main(String[] args) {
    
    double numero;

    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    System.out.print("Diga un número entero: ");
    numero = teclado.nextDouble();
    System.out.println("");
    
    teclado.close();

    numero = numero %10;
    System.out.println("El último número es: "+ numero);
    System.out.println("");
  }
}
