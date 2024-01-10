import java.util.Scanner;

/**
 * Ejercicio 5: Escribe un programa que pida 10 números por teclado y que luego
 * muestre los
 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
 * máximo y del mínimo respectivamente.
 * 
 * @author David Márquez Córdoba
 */

public class T07Ejercicio05 {
  public static void main(String[] args) {

    int [] numero= new int [10];
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    
    System.out.println("Introduzca números enteros y pulse INTRO: ");

    Scanner teclado = new Scanner(System.in);

    //Durante toda la longitud del array iremos preguntando
    for (int i = 0; i < numero.length; i++) {

      //Introducimos por teclado
      numero[i] = teclado.nextInt();

      //Y vamos descartando cuál será el mínimo y cuál el máximo y asignándolo
      if (numero[i] > maximo) {
        maximo = numero[i];
      }

      if (numero[i] < minimo) {
        minimo = numero[i];
      }
    }

    System.out.println("\n-----------------------------------\n");

    //Iremos mostrando los números por pantalla

    for (int i = 0; i < numero.length; i++) {
      
      System.out.print(numero[i]);

      if (numero[i] == maximo) {
        System.out.print(" Máximo");
      }

      if (numero[i] == minimo) {
        System.out.print(" Mínimo");
      }

      System.out.println("\n");
    }

    teclado.close();
  }
}

