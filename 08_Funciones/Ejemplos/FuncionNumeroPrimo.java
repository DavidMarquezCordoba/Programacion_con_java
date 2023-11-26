/*
 * Dice si un número es o no es primo usando una función
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class FuncionNumeroPrimo {

  //Programa principal
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    System.out.printf("Introduce un número para comprobar si es primo o no: ");
    int num = teclado.nextInt();

    teclado.close();


    if (esPrimo(num)) {
      System.out.println("El número introducido es primo");
    } else {
      System.out.println("El número introducido NO es primo");
    }    
  }

  //Función

  /*
   * Comprueba si un número entero positivo es primo o no
   * 
   * @param x numero entero positivo
   * @return true si el número es primo
   * @return false, si el número no es primo
   */

  public static boolean esPrimo(int x){

    for (int i = 2; i < x; i++) {
      if (x%i==0) {
        return false;
      }
    }
    return true;
  }
}
