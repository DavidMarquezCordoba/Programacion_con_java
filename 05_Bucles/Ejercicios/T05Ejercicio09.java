import java.util.Scanner;

/**
 * Realiza un programa que nos diga cuántos dígitos 
 * tiene un número introducido por teclado. 
 * Este ejercicio es equivalente a otro realizado anteriormente, 
 * con la salvedad de que el anterior estaba limitado a 
 * números de 5 dígitos como máximo. En esta ocasión, 
 * hay que realizar el ejercicio utilizando bucles; de esta manera, 
 * la única limitación en el número de dígitos la establece 
 * el tipo de dato que se utilice (int o long).
 * 
 * @author David Márquez Córdoba
 */

public class T05Ejercicio09 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    long numeroIntroducido;
    long numCifras = 0;
    long aux;
    long contadorNumeros=1;

    System.out.printf("Introduce un número: ");
    numeroIntroducido = teclado.nextLong();

    aux = numeroIntroducido;
    
    do {
      numCifras = aux / 10;
      aux=numCifras;

      contadorNumeros++;

    } while ((numCifras >= 10));

    System.out.printf("El número %d tiene %d dígitos", numeroIntroducido,contadorNumeros);
    teclado.close();
  }
}
