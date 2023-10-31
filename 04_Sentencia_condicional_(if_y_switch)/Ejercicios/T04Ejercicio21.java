/*
 * Calcula la nota de un trimestre de la asignatura Programación. El programa
pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
Si la media de los dos controles da un número mayor o igual a 5, el alumno
está aprobado y se mostrará la media. En caso de que la media sea un número
menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
ha sido el resultado de la recuperación? (apto/no apto). Si el resultado
de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene
la nota media anterior.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T04Ejercicio21 {
  public static void main(String[] args) {
    
    double nota1;
    double nota2;
    double media;
    String aptoNoApto;

    Scanner teclado = new Scanner(System.in);

    System.out.print("Introduce la nota del primer examen: ");
    nota1 = teclado.nextDouble();
    System.out.println("");

    boolean rangoNotas1 = nota1 >= 0 && nota1 <=10;

    if (rangoNotas1) {
      System.out.print("Introduce la nota del segundo examen: ");
      nota2 = teclado.nextDouble();
      System.out.println("");

      boolean rangoNotas2 = nota2 >=0 && nota2 <=10;

      if (rangoNotas2) {
        
        media = (nota1 + nota2)/2;

        if (media >=5) {
          System.out.println("Estás aprobado");
          System.out.printf("Su media es de %.2f \n", media);
          System.out.println("");
        } else {
          System.out.println("");
          System.out.printf("¿Cuál ha sido el resultado de la recuperación?: ");
          ///////////////////////
          teclado.nextLine(); //¿?¿?¿?
          /////////////////////
          aptoNoApto = teclado.nextLine();
          System.out.println("");

          //Controlamos que sea apto / no apto

          boolean apto = aptoNoApto.equals("apto");
          boolean noApto = aptoNoApto.equals("no apto");

          if ( apto || noApto) {
            if (apto) {
              System.out.println("Tu nota de programación es un 5");
              System.out.println("");
            } else {
              System.out.printf("Tu nota de programación es un %.2f \n",media);
              System.out.println("");
            }
          } else {
            System.out.println("Introduzca solo \"apto\"/\"no apto\" ");
            System.out.println("Inténtelo de nuevo más tarde");
            System.out.println("");
          }
        }

        } else {
          System.out.println("Nota no válida. Introduzca un valor entre 0 y 10");
        }

    } else {
      System.out.println("Nota no válida. Introduzca un valor entre 0 y 10");
    }

    teclado.close();
  }
}

