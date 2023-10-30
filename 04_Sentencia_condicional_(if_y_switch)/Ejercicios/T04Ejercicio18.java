/*
 * Escribe un programa que diga cuál es la primera cifra de un número entero
introducido por teclado. Se permiten números de hasta 5 cifras.
 * 
 * @author David Márquez Córdoba
 */



import java.util.Scanner;

public class T04Ejercicio18 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    int iNumero;
    String sNumero;
    char valorPrimerDigito;

    System.out.println("");
    System.out.print("Introduce un número entero: ");
    iNumero = teclado.nextInt();
    System.out.println("");

    if (iNumero < 99999) {
      sNumero = Integer.toString(iNumero);
      valorPrimerDigito = sNumero.charAt(0);
      System.out.println("El primer dígito de "+iNumero+" es: "+valorPrimerDigito);
      System.out.println("");    
    } else {
      System.out.println("Solo se permiten números de 5 cifras.");
      System.out.println("");  
    }

    teclado.close();
  }
}
