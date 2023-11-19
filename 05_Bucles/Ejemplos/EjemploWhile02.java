import java.util.Scanner;

/**
 * Contador de números positivos introducidos por teclado
 * 
 * @author David Márquez Córdoba
 */
public class EjemploWhile02 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int cuentaNumerosPositivos = 0;
    int suma = 0; //Variable acumuladora de los números positivos
    int num=0;

    while (num>=0) {
      System.out.printf("Introduce un número: ");
      num = teclado.nextInt();
      if (num > 0) {
        cuentaNumerosPositivos++;
        suma+=num;
      }
    }

    System.out.println("Números positivos introducidos por teclado: "+cuentaNumerosPositivos);
    System.out.println("Los números positivos suman "+ suma);

    teclado.close();
  }
}
