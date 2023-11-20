import java.util.Scanner;

/**
 * Escribe un programa que diga si un número introducido 
 * por teclado es o no primo. Un número primo es aquel 
 * que sólo es divisible entre él mismo y la unidad.
 * 
 * @author David Márquez Córdoba
 */

public class T05Ejercicio16 {
  public static void main(String[] args) {
    
    int num;
    boolean esPrimo = true;

    Scanner teclado = new Scanner(System.in);

    System.out.printf("Escriba un número para saber si es primo o no: ");
    num = teclado.nextInt();

    //Empezams desde 2 porque 1 sabemos que es primo y siempre va a dar el resto 0
    for (int i = 2; i < num; i++) {
      if ((num % i == 0)) {
        esPrimo=false;
      }
    }

    if (esPrimo) {
      System.out.printf("El número introducido (%d) es primo", num);
    } else {
      System.out.printf("El número introducido (%d) NO primo", num);
    }
    teclado.close();
  }
}


