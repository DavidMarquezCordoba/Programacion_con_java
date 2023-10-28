/*
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
una altura h. Aplica la fórmula
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T04Ejercicio06 {
  public static void main(String[] args) {
    
    double altura;
    double tiempo;
    final double gravedad= 9.81;

    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    System.out.println("CÁLCULO DE CUÁNTO TIEMPO TARDARÁ EN CAER UN OBJETO");
    System.out.println("--------------------------------------------------");
    System.out.print("Diga una altura: ");
    altura = teclado.nextDouble();
    teclado.close();

    tiempo = Math.sqrt((2*altura)/gravedad);

    System.out.println("El objeto tardará en caer "+tiempo+ " segundos");
    System.out.println("");
  }
}
