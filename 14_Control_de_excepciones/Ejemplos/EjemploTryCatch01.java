import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Prueba Try Catch
 * 
 * @author David Márquez Córdoba
 */

public class EjemploTryCatch01 {
  public static void main(String[] args) {
    double num1;
    double num2;

    Scanner teclado = new Scanner(System.in);

    try {
      System.out.printf("Introduce un número: ");
      num1 = teclado.nextDouble();
      System.out.printf("Introduce un número: ");
      num2 = teclado.nextDouble();  
      teclado.close();
      System.out.println("La media es : "+ (num1+num2));    
    } catch (InputMismatchException ime ) {
      System.out.println("No se puede calcular la media");
      System.out.println("Los datos introducidos no son correctos");      
    }
    
    // catch (Exception e) {

    // } finally {
    //   System.out.println("Gracias por utilizar el programa");
    // }
  }
}
