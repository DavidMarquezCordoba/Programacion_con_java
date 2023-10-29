/*
 * Escribe un programa que ordene tres números enteros introducidos por teclado.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T04Ejercicio13 {
  public static void main(String[] args) {
    
    int num1;
    int num2;
    int num3;
    int opcion;
    
    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    System.out.println("PROGRAMA QUE ORDENA NÚMEROS ENTEROS");
    System.out.println("-----------------------------------");
    System.out.println("");
    System.out.print("Escriba el primer número: ");
    num1 = teclado.nextInt();
    System.out.print("Escriba el segundo número: ");
    num2 = teclado.nextInt();
    System.out.print("Escriba el tercer número: ");
    num3 = teclado.nextInt();

    System.out.println("");
    System.out.println("¿Cómo quieres que se ordenen?");
    System.out.println("-----------------------------");
    System.out.println("");
    System.out.println("1. Ascendente");
    System.out.println("2. Descendente");
    System.out.println("");
    System.out.print("Elija 1 o 2: ");
    opcion = teclado.nextInt();
    System.out.println("");

    teclado.close();

    switch (opcion) {
      case 1:

      if (num1 <= num2) {
        if (num1 <= num3) {
          if (num2 <= num3) {
            System.out.println(num1 +" - "+ num2 +" - "+ num3);
          } else {
            System.out.println(num1 +" - "+ num3 +" - "+ num2);
          }
        }
      } 

      if (num2 <= num1) {
        if (num2 <= num3) {
          if (num3 <= num1) {
            System.out.println(num2 +" - "+ num3 +" - "+ num1);
          } else {
            System.out.println(num2 +" - "+ num1 +" - "+ num3);
          }
        }
      } 
        
      if (num3 <= num2) {
        if (num3 <= num1) {
          if (num2 <= num1) {
            System.out.println(num3 +" - "+ num2 +" - "+ num1);
          } else {
            System.out.println(num3 +" - "+ num1 +" - "+ num2);
          }
        }
      } 
      
        break;

      case 2:

      if (num1 >= num2) {
        if (num1 >= num3) {
          if (num2 >= num3) {
            System.out.println(num1 +" - "+ num2 +" - "+ num3);
          } else {
            System.out.println(num1 +" - "+ num3 +" - "+ num2);
          }
        }
      } 

      if (num2 >= num1) {
        if (num2 >= num3) {
          if (num3 >= num1) {
            System.out.println(num2 +" - "+ num3 +" - "+ num1);
          } else {
            System.out.println(num2 +" - "+ num1 +" - "+ num3);
          }
        }
      } 
        
      if (num3 >= num2) {
        if (num3 >= num1) {
          if (num2 >= num1) {
            System.out.println(num3 +" - "+ num2 +" - "+ num1);
          } else {
            System.out.println(num3 +" - "+ num1 +" - "+ num2);
          }
        }
      } 
        break;
    
      default:
      System.out.println("Opción no válida");
        break;
    }








  }
}
