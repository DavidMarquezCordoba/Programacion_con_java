import java.util.Scanner;

/**
 * Realiza un programa que sume los 100 números 
 * siguientes a un número entero y positivo introducido por teclado. 
 * Se debe comprobar que el dato introducido 
 * es correcto (que es un número positivo).
 * 
 * @author David Márquez Córdoba
 */

public class T05Ejercicio17 {
  public static void main(String[] args) {
    
    int numeroIntroducido;
    int bote = 0;

    Scanner teclado = new Scanner(System.in);

    do {
      System.out.printf("Introduce un número entero positivo: ");
      numeroIntroducido = teclado.nextInt();
    } while (numeroIntroducido<1);

    for (int i = numeroIntroducido+1; i <= numeroIntroducido+100; i++) {
      bote += i;
    }

    System.out.printf("El resultado de sumar los 100 números siguientes a %d es: %d\n", numeroIntroducido, bote);
    teclado.close();
  }
}
