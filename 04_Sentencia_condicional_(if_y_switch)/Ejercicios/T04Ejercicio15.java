/*
 * Escribe un programa que pinte una pirámide rellena con un carácter introducido
por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &,
etc. El programa debe permitir al usuario mediante un menú elegir si el vértice
de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o
hacia la derecha.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T04Ejercicio15 {
  public static void main(String[] args) {
    
    char caracter;
    int decision;

    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    System.out.println("Introduce una letra, un número o un símbolo: ");

    //Controlo que solo se imprima el primer caracter
    caracter = teclado.next().charAt(0);

    System.out.println("¿Hacia dónde apuntará el vértice?");
    System.out.println("---------------------------------");
    System.out.println("");
    System.out.println("1. Arriba");
    System.out.println("2. Abajo");
    System.out.println("3. Izquierda");
    System.out.println("4. Derecha");
    System.out.println("");
    System.out.print("Elija una: ");
    decision = teclado.nextInt();

    teclado.close();

    switch (decision) {
      case 1:
      System.out.println("");
      System.out.println("  " + caracter + "  ");
      System.out.println(" " + caracter + caracter + caracter + " ");
      System.out.println(""+caracter + caracter + caracter + caracter + caracter);
      System.out.println("");
        break;
    
      case 2:
      System.out.println("");
      System.out.println(""+caracter + caracter + caracter + caracter + caracter);
      System.out.println(" " + caracter + caracter + caracter + " ");
      System.out.println("  " + caracter + "  ");
      System.out.println("");
        break;

      case 3:
      System.out.println("");
      System.out.println(" " + " " + caracter);
      System.out.println(" " + caracter + caracter);
      System.out.println("" +caracter + caracter + caracter);
      System.out.println(" " + caracter + caracter);
      System.out.println(" " + " " + caracter);
      System.out.println("");  
        break;

      case 4:
      System.out.println("");
      System.out.println(caracter+" " + " ");
      System.out.println(""+caracter + caracter + " ");  
      System.out.println(""+caracter + caracter + caracter + "");
      System.out.println(""+caracter + caracter + " ");
      System.out.println(caracter+" " + " "); 
      System.out.println("");
        break;

      default:
      System.out.println("Opción no válida");
        break;
    }
  }
}
