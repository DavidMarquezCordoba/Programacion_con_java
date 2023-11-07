import java.util.Scanner;

/**
 * 
 * @author David Márquez Córdoba
 */

public class Ejercicio1 {
  public static void main(String[] args) {
    
    double factorTbw;
    long diasEn6Anhos;
    double total;
    double gb;
    final int DIAS_ANHOS = 365;

    Scanner teclado = new Scanner(System.in);

    System.out.println("VIDA ÚTIL SSD");
    System.out.println("=============");
    System.out.print("Introduzca el factor TBW de tu disco duro SSD: ");
    factorTbw = teclado.nextInt();

    diasEn6Anhos = DIAS_ANHOS * 10;

    total = factorTbw/diasEn6Anhos;

    gb = total * 1000;

    System.out.printf("La cantidad máxima de terabytes que puedes escribir por día es: %.4f TB (%.1f)", total, gb);

    teclado.close();
  }
}
