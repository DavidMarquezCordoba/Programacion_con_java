import java.util.Scanner;

/**
 * Realiza un programa que pinte por pantalla un rombo hueco hecho con
asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
mensaje de error.
 * 
 * @author David Márquez Córdoba
 */

public class T05Ejercicio40 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    int alturaRombo = 0;
    int mitad = 0;
    int espaciosPorDentro = 1;
    int espaciosPorDelante = 1;

    System.out.print("Por favor, introduzca la altura del rombo: ");
    alturaRombo = teclado.nextInt();

    mitad = (alturaRombo )/2;

    //Cúspide
    for (int j = 0; j < mitad; j++) {
      System.out.print(" ");
    }

    System.out.println("*");

    // Mitad superior

    for (int i = 1; i < mitad; i++) {

      for (int j = 0; j < mitad - i; j++) {
        System.out.print(" ");
      }
      System.out.print("*");

      for (int j = 0; j < espaciosPorDentro; j++) {
        System.out.print(" ");
      }

      espaciosPorDentro+=2;
      System.out.println("*");
    }

    //////////////CENTRO////////////////////
    System.out.print("*");

    for (int i = 0; i < alturaRombo-2; i++) {
      System.out.print(" ");
    }

    System.out.println("*");
    //////////////CENTRO////////////////////

    //Quito los dos espacios que he añadido antes porque a partir de la mitad va descendiendo 2 y tiene un desfase al salir del bucle anterior
    espaciosPorDentro-=2;

    // Mitad inferior
    for (int i = 1; i < mitad; i++) {
      
      for (int j = 0; j < espaciosPorDelante; j++) {
        System.out.print(" ");
      }

      espaciosPorDelante++;

      System.out.print("*");

      for (int j = 0; j < espaciosPorDentro; j++) {
        System.out.print(" ");
      }

      espaciosPorDentro-=2;

      System.out.println("*");
    }

    //Pinto base
    for (int i = 0; i < mitad; i++) {
      System.out.print(" ");
    }

    System.out.println("*");


    teclado.close();
  }
}


