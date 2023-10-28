/*
 * Creación de menu
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class MenuConSwitch {
  public static void main(String[] args) {

    int opcion;
    double base;
    double altura;
    double lado;

    Scanner teclado = new Scanner(System.in);
    
    System.out.println("+-----------------------+");
    System.out.println("|    Cálculo de áreas   |");
    System.out.println("+-----------------------+");

    System.out.println("");
    System.out.println("1.Área de un cuadrado");
    System.out.println("2.Área de un rectángulo");
    System.out.println("3.Área de un triángulo");
    System.out.println("");
    System.out.print("Seleccione una opción: ");
    opcion = teclado.nextInt();

    switch (opcion) {
      case 1:
        System.out.println("");
        System.out.println("      Área cuadrado   ");
        System.out.println("+-----------------------+");
        System.out.println("");
        System.out.print("Introduzca el lado: ");
        lado = teclado.nextDouble();
        System.out.println("");

        double areaCuadrado = lado * lado;
        System.out.printf("El área del cuadrado es: %.2f cm2", areaCuadrado);
        System.out.println("");
        System.out.println("");
        break;

      case 2:
        System.out.println("");
        System.out.println("     Área rectángulo   ");
        System.out.println("+-----------------------+");
        System.out.println("");
        System.out.print("Introduzca la base: ");
        base = teclado.nextDouble();
        System.out.print("Introduzca la altura: ");
        altura = teclado.nextDouble();
        System.out.println("");

        double areaRectangulo = base * altura;
        System.out.printf("El área del rectángulo es: %.2f cm2", areaRectangulo);
        System.out.println("");
        System.out.println("");
        break;

      case 3:
        System.out.println("");
        System.out.println("     Área triángulo   ");
        System.out.println("+-----------------------+");
        System.out.println("");
        System.out.print("Introduzca la base: ");
        base = teclado.nextDouble();  
        System.out.print("Introduzca la altura: ");
        altura = teclado.nextDouble();
        System.out.println("");

        double areaTriangulo = (base * altura)/ 2;

        System.out.printf("El área del triángulo es: %.2f cm2", areaTriangulo);
        System.out.println("");
        System.out.println("");
        break;
    
      default:
      System.out.println("Esta opción no es correcta.");
        break;
    }

    teclado.close();
  }
}
