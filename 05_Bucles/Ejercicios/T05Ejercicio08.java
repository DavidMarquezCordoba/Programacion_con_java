import java.util.Scanner;

/**
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * @author David Márquez Córdoba
 */

public class T05Ejercicio08 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    int num;

    System.out.printf("Introduce un número para ver su tabla de multiplicar: ");
    num = teclado.nextInt();

    for (int i = 0; i <=10; i++) {
      System.out.printf("%3d x %-3d = %3d\n", num, i, num*i);
      // System.out.print(num + " x " + i + " = " + num * i);
      // System.out.println("");
    }

    teclado.close();
  }
}
