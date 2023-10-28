/*
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
las horas extras. Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
la hora.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T04Ejercicio04 {
  public static void main(String[] args) {
    
    int horasTrabajadas;
    int horasExtra;
    int total;
    final int PRECIO_HORA = 12;
    final int PRECIO_HORA_EXTRA = 16;
    int horasMinimas;

    Scanner teclado = new Scanner(System.in);

    System.out.print("Introduzca cuántas horas trabajó esta semana: ");
    horasTrabajadas = teclado.nextInt();
    teclado.close();

    if (horasTrabajadas <= 40){
      total = horasTrabajadas * PRECIO_HORA;
      System.out.println("El sueldo semanal que le corresponde es de "+ total+ " euros.");
    }

    if (horasTrabajadas > 40){
      
      horasMinimas = 40 * PRECIO_HORA;

      horasExtra = horasTrabajadas - 40;

      horasExtra = horasExtra * PRECIO_HORA_EXTRA;

      total = horasMinimas + horasExtra;

      System.out.println("El sueldo semanal que le corresponde es de "+total+" euros.");
    }
  }
}
