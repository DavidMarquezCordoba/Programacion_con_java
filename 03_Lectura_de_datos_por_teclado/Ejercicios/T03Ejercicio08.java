/*
 * Escribe un programa que calcule el salario semanal de un empleado en base a
las horas trabajadas, a razón de 12 euros la hora.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T03Ejercicio08 {
  public static void main(String[] args) {
    
    final int PRECIO_HORA = 12;
    int horasTrabajadas;
    int sueldoSemanal;

    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    System.out.println("12 €/h");
    System.out.printf("Introduzca cuantas horas ha trabajado: ");
    horasTrabajadas = teclado.nextInt();

    teclado.close();

    sueldoSemanal = horasTrabajadas * PRECIO_HORA;

    System.out.println("");
    System.out.println("Usted ha ganado en esta semana: "+ sueldoSemanal+ " euros");
    System.out.println("");

  }
}
