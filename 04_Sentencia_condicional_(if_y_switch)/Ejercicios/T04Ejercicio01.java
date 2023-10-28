/*
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
asignatura toca a primera hora ese día.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T04Ejercicio01 {
  public static void main(String[] args) {
    
    int diaDeLaSemana;

    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    System.out.print("Introduzca un día de la semana para ver que tenemos a primera hora: ");
    diaDeLaSemana = teclado.nextInt();
    System.out.println("");

    teclado.close();

    if (diaDeLaSemana>=1 && diaDeLaSemana<=7) {
      switch (diaDeLaSemana) {
        case 1:
          System.out.println("A primera hora tienes FOL");
          System.out.println("");
          break;

        case 2:
          System.out.println("A primera hora tienes programación");
          System.out.println("");
          break;

        case 3:
          System.out.println("A primera hora tienes Entornos de Desarrollo");
          System.out.println("");
          break;

        case 4:
          System.out.println("A primera hora tienes Base de Datos");
          System.out.println("");
          break;

        case 5:
          System.out.println("A primera hora tienes Programación");
          System.out.println("");
          break;

        case 6, 7:
          System.out.println("Es fin de semana");
          System.out.println("");
          break;
      }
    } else {
      System.out.println("No existe ese día de la semana");
      System.out.println("");
    }

  }
}
