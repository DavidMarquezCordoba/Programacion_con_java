/*
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos
días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
horas, los minutos no se deben introducir por teclado.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T04Ejercicio02 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    System.out.print("Introduzca una hora: ");
    int hora = teclado.nextInt();
    System.out.println("");

    teclado.close();

    if (hora >=0 && hora <=24) {
      
      if (hora >=6 && hora <=12) {
        System.out.println("Buenos días!");
        System.out.println("");
      }

      if (hora >= 13 && hora <=20) {
        System.out.println("Buenas tardes!");
        System.out.println("");
      }

      if ((hora >=0 && hora <=5) || (hora >=21 && hora <=24)) {
        System.out.println("Buenas noches!");
        System.out.println("");
      }
      
    } else{
      System.out.println("Hora no válida");
    }
  }
}
