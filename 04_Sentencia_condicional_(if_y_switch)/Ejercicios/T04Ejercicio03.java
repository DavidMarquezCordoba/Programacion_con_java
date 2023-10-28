/*
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
nombre del día de la semana.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T04Ejercicio03 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    int numeroDeLaSemana;

    System.out.println("");
    System.out.print("Introduce el día de la semana (1-7): ");
    numeroDeLaSemana = teclado.nextInt();
    System.out.println("");
    teclado.close();

    switch (numeroDeLaSemana) {
      case 1:
        System.out.printf("El día %d corresponde a LUNES", numeroDeLaSemana);
        System.out.println("");
        System.out.println("");
        break;

      case 2:
        System.out.printf("El día %d corresponde a MARTES", numeroDeLaSemana);
        System.out.println("");
        System.out.println("");
        break;

      case 3:
        System.out.printf("El día %d corresponde a MIÉRCOLES", numeroDeLaSemana);
        System.out.println("");
        System.out.println("");
        break;

      case 4:
        System.out.printf("El día %d corresponde a JUEVES", numeroDeLaSemana);
        System.out.println("");
        System.out.println("");
        break;

      case 5:
        System.out.printf("El día %d corresponde a VIERNES", numeroDeLaSemana);
        System.out.println("");
        System.out.println("");
        break;

      case 6:
        System.out.printf("El día %d corresponde a SÁBADO", numeroDeLaSemana);
        System.out.println("");
        System.out.println("");
        break;

      case 7:
        System.out.printf("El día %d corresponde a DOMINGO", numeroDeLaSemana);
        System.out.println("");
        System.out.println("");
        break;

      default:
        System.out.println("Introduce un día válido :-(");
        System.out.println("");
        System.out.println("");
        break;
    }
  }
}
