import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Sergio Sánchez
 */

public class LeeDatosScanner02 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    System.out.print("Dime tu edad, nombre y apellidos (Separados por un espacio)");
    int edad = teclado.nextInt();
    String nombre = teclado.next();
    String apellido1 = teclado.next();
    String apellido2 = teclado.next();

    teclado.close();

    System.out.println("");

    System.out.println("Tu nombre es "+ nombre+""+ apellido1+""+apellido2+ " y tienes "+edad+" años.");



  }
}


