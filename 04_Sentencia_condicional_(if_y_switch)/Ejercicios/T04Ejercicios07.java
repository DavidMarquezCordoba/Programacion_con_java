/*
 * Realiza un programa que calcule la media de tres notas.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T04Ejercicios07 {
  public static void main(String[] args) {
    double nota1;
    double nota2;
    double nota3;

    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    
    System.out.print("Indica la nota del primer examen: ");
    nota1 = teclado.nextDouble();

    if (nota1 >= 0 && nota1 <=10) {
      System.out.print("Indica la nota del segundo examen: ");
      nota2 = teclado.nextDouble();

      if (nota2 >= 0 && nota2 <=10) {
        System.out.print("Indica la nota del tercer examen:  ");
        nota3 = teclado.nextDouble();

        if (nota3 >= 0 && nota3 <=10) {
          double media = (nota1 + nota2 + nota3)/3;
          System.out.println("");
          System.out.printf("La media de %.2f, %.2f y %.2f es %.2f \n", nota1, nota2, nota3, media);
          System.out.println("");

          if (media>=5) {
            System.out.println("Estás aprobado!!!");
          } else {
            System.out.println("Estás suspenso. Inténtalo de nuevo.");
          }
        } else {
          System.out.println("Esa nota no existe. No inventes");
        }
      } else {
        System.out.println("Esa nota no existe. No inventes");
      }
    } else {
      System.out.println("Esa nota no existe. No inventes");
    }

    teclado.close();

    System.out.println("");
    System.out.println("");

    
  }
}
