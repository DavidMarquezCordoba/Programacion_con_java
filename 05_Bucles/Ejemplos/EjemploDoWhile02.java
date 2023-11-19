import java.util.Scanner;

/**
 * Lee números de teclado mientras el número introducido sea par
 * 
 * @author David Márquez Córdoba
 */
public class EjemploDoWhile02 {
  public static void main(String[] args) {
    
    int numeroIntroducido = 0;

    Scanner teclado = new Scanner(System.in);

    do {
      System.out.printf("Introduce un número: ");
      numeroIntroducido = teclado.nextInt();

      if (numeroIntroducido%2==0) {
        System.out.println("Es un número par. Sigamos");
      } else{
        System.out.println("Es impar");
      }
    } while (numeroIntroducido %2 ==0);

    teclado.close();
  }
}
