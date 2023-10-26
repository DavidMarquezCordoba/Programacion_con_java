/*
 * Escribe un programa que calcule el total de una factura a partir de la base
imponible.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T03Ejercicio07 {
  public static void main(String[] args) {
    
    double baseImponible;
    double ivaDeBaseImponible;
    double precioTotalConIva;

    // final double IVA = 0.21;

    Scanner teclado = new Scanner(System.in);

    System.out.printf("Introduce base imponible: ");
    baseImponible = teclado.nextDouble();

    teclado.close();

    ivaDeBaseImponible = baseImponible * 0.21;
    precioTotalConIva = baseImponible * 1.21;

    System.out.println("-------------------------");
    System.out.println("         FACTURA        ");
    System.out.println("-------------------------");
    System.out.printf("Base Imponible %8.2f€ \n", baseImponible);
    System.out.printf("IVA 21%%       %8.2f€ \n", ivaDeBaseImponible);
    System.out.printf("Total          %8.2f€ \n", precioTotalConIva);
    System.out.println("-------------------------");
  }
}
