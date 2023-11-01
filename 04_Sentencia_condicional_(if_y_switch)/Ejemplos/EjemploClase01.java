/*
 * Escribe un programa que solicite la edad del usuario y muestre por pantalla si eres menor, mayor de edad, o si está jubilado
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class EjemploClase01 {
  public static void main(String[] args) {
    
    int edad;

    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca su edad: ");
    edad = teclado.nextInt();
    System.out.println("");

    if (edad >= 0) {

      if (edad >=18 && edad < 64){
        System.out.println("Eres mayor de edad.");
      } else if (edad >= 65){
        System.out.println("Estás jubilado");
      } else {
        System.out.println("Eres menor.");  
      }

    } else {
      System.out.println("Introduce una edad válida");
    }

    teclado.close();
  }
}
