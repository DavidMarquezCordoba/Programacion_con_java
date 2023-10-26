/*
 * Escribe un programa que calcule el área de un triángulo. (base x altura)/2
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T03Ejercicio06 {
  public static void main(String[] args) {
    int base;
    int altura;
    double area;

    Scanner teclado = new Scanner(System.in);

    System.out.println("+-----------------------------------+");
    System.out.println("|      CALCULAR ÁREA TRIÁNGULO      |");
    System.out.println("+-----------------------------------+");
    System.out.println("");
    System.out.printf("Introduzca la base: ");
    base =teclado.nextInt();
    
    System.out.printf("Introduzca la base: ");
    altura = teclado.nextInt();

    System.out.println("-------------------------------------");
    System.out.println("");
    teclado.close();

    //Lógica
    area = (base*altura)/2;

    //Salida por pantalla
    System.out.printf("El área del triángulo es: %.2f \n", area);
    System.out.println("");



  }
}
