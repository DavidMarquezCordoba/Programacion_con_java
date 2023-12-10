import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Realiza un programa que calcule la media de los dígitos que contiene un número
entero introducido por teclado.

  Ejemplo 1:
    Introduzca un número: 609831
    La media de sus dígitos es 4.5

  Ejemplo 2:
    Introduzca un número: 78201345
    La media de sus dígitos es 3.75

  Ejemplo 3:
    Introduzca un número: 24
    La media de sus dígitos es 3.0

  Ejemplo 4:
    Introduzca un número: 8
    La media de sus dígitos es 8.0
 * 
 * @author David Márquez Córdoba
 */

public class T05Ejercicio58 {
  public static void main(String[] args) {
    
    long numIntroducido;
    int ultimoDigito;
    long suma = 0;
    double media = 0;
    int contador = 0;

    Scanner teclado = new Scanner(System.in);

    try {
      System.out.print("Introduzca un número: ");
      numIntroducido = teclado.nextLong();
  
      while (numIntroducido>0) {
        ultimoDigito = (int) numIntroducido%10;
        suma += ultimoDigito;
        contador++;
        numIntroducido/=10;
      }
  
      media = (double)suma/contador;
  
      System.out.printf("La media de sus dígitos es %.2f", media);
      
      teclado.close();
    } catch (InputMismatchException e) {
      System.out.println("");
      System.out.println("ERROR - Solo pueden introducirse números.");
      System.out.println("Clase de error - "+ e.getClass());
      System.out.println("Mensaje de error - "+e.getMessage());
    } finally {
      System.out.println("");
      System.out.println("Hasta luego");
      System.out.println("");
    }
  }
}
