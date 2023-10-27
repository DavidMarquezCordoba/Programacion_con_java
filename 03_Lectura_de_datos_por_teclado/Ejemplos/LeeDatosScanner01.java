/**
 * Explica tu código aquí
 * 
 * @author Sergio Sánchez
 */

import java.util.*;

public class LeeDatosScanner01 {
  public static void main(String[] args) {
    
    int edad;
    String nombre;

    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    System.out.println("Introduce tu nombre: ");
    nombre = teclado.nextLine();

    System.out.println("Introduce tu edad: ");
    edad = teclado.nextInt();

    teclado.close();

    System.out.println("Te llamas "+ nombre+" y tienes "+ edad+ " años.");
  }
}
