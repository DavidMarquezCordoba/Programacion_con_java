/*
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
examen de la asignatura Programación para obtener la media deseada. Hay
que tener en cuenta que la nota del primer examen cuenta el 40% y la del
segundo examen un 60%.
 * 
 * @author David Márquez Córdoba
 */

import java.util.*;

public class T03Ejercicios12 {
  public static void main(String[] args) {
    
    double notaPrimerExam;
    // double notaSegundoExam;
    double notaDeseada;
    double notaRequerida;

    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    System.out.println("-------------------------------------");
    System.out.println("");
    System.out.printf("Introduce la nota del primer examen: ");
    notaPrimerExam = teclado.nextDouble();
    System.out.println("");
    System.out.printf("¿Qué nota quieres sacar en el trimestre?: ");
    notaDeseada = teclado.nextDouble();
    System.out.println("");

    teclado.close();

    //Lógica
    notaRequerida = (notaDeseada - (notaPrimerExam*0.4))/0.6;

    //Salida por pantalla
    System.out.printf("Para tener un %.1f en el  trimestre, necesitas sacar un %.1f en el segundo examen.", notaDeseada, notaRequerida);
    System.out.println("");
    System.out.println("");
  }
}
