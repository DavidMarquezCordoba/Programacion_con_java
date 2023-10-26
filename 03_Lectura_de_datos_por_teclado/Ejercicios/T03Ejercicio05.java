/*
 * Escribe un programa que calcule el área de un rectángulo.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T03Ejercicio05 {
  public static void main(String[] args) {
    
    int base;
    int altura;
    int area;

    Scanner teclado = new Scanner(System.in);

    System.out.println("+------------------------------------+");
    System.out.println("|   CALCULA EL ÁREA DEL RECTÁNGULO   |");
    System.out.println("+------------------------------------+");
    System.out.println();
    System.out.printf("Introduce la base del rectángulo: ");
    base = teclado.nextInt();
    System.out.printf("Introduce la altura del rectángulo: ");
    altura = teclado.nextInt();

    System.out.println("+------------------------------------+");
    System.out.println();
    teclado.close();

    //Lógica
    area = base * altura;

    //Salida por pantalla
    System.out.println("El área de un rectángulo es "+area);

  }
}

//DUDA

//Por qué si pedimos un entero en base, y en altura pedimos un String, el programa no pide el estring por pantalla??