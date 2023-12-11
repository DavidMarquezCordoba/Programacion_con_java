import java.util.Scanner;

/**
 * //	Realiza un programa  que permita introducir un año 
//	y determine si es bisiesto o no. 
//	Un año se considera bisiesto si se cumple alguna de las siguientes condiciones:
//			
//	El año es divisible por 4 y no por 100.
//	El año es divisible por 100 y 400.

//	Ejemplo de salida del programa:
//	Introduzca un año: 2024
//	El año 2024 es bisiesto.
 * 
 * @author David Márquez Córdoba
 */

public class examen_esBisiesto {
  public static void main(String[] args) {
    
    int year;

    Scanner teclado = new Scanner(System.in);

    System.out.print("Introduce un año para saber si es bisiesto o no: ");
    year = teclado.nextInt();

    if (((year%4==0) && (year%100!=0)) || ((year%100==0) && (year%400==0))) {
      System.out.println("El año "+year+" es bisiesto");
    } else {
      System.out.println("El año "+ year+ " no es bisiesto");
    }

    teclado.close();
  }
}
