/*
 * Escribe un programa que calcule el precio final de un producto según su
base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
reducido o superreducido) y el código promocional. Los tipos de IVA general,
reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
respectivamente que no se aplica promoción, el precio se reduce a la mitad,
se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
muestran los valores correctos, aunque los números no estén tabulados.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T04Ejercicio23 {
  public static void main(String[] args) {
    
    double baseImponible;
    double total = 0.00;
    double valorPromo = 0.00;
    double valorConIva = 0.00;
    String sIva = "";
    double precioConIva = 0.00;

    String tipoIva;
    final double IVA_GENERAL = 0.21;
    final double IVA_REDUCIDO = 0.1;
    final double IVA_SUPERREDUCIDO = 0.04;

    String promo;
    
    // int mitad;
    // int menos5;
    // int porc5;
    
    Scanner teclado = new Scanner(System.in);

    System.out.println("");
    System.out.print("Introduzca la base imponible: ");
    baseImponible = teclado.nextDouble();
    System.out.println("");

    if (baseImponible>0){

      System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
      tipoIva = teclado.next();
      System.out.print("");

      boolean ivaValido = tipoIva.equals("general") || tipoIva.equals("reducido") || tipoIva.equals("superreducido");

      if (ivaValido) {
        System.out.println("");
        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        promo = teclado.next();

        boolean promoValida = promo.equals("nopro") || promo.equals("mitad") || promo.equals("meno5") || promo.equals("5porc");

        if (promoValida) {

          switch (tipoIva) {
            case "general":
              valorConIva = baseImponible * IVA_GENERAL;
              precioConIva = baseImponible + valorConIva;
              sIva = "21%";

              switch (promo) {
                case "nopro":
                  valorPromo = 0.00;
                  total = precioConIva;
                  break;
                case "mitad":
                  valorPromo = precioConIva/2;
                  total = valorPromo;
                  break;
                case "meno5":
                  valorPromo = 5;
                  total = precioConIva - valorPromo;
                  break;
                case "5porc":
                  valorPromo = valorConIva * 1.05;
                  total = precioConIva - valorPromo;
                  break;
              }
              break;
            case "reducido":
              valorConIva = baseImponible * IVA_REDUCIDO;
              precioConIva = baseImponible + valorConIva;
              sIva ="10%";
              switch (promo) {
                case "nopro":
                  valorPromo = 0.00;
                  total = precioConIva;
                  break;
                case "mitad":
                  valorPromo = precioConIva/2;
                  total = valorPromo;
                  break;
                case "meno5":
                  valorPromo = 5;
                  total = precioConIva - valorPromo;
                  break;
                case "5porc":
                  valorPromo = valorConIva * 1.05;
                  total = precioConIva - valorPromo;
                  break;
              }
              break;
            case "superreducido":
              valorConIva = baseImponible * IVA_SUPERREDUCIDO;
              precioConIva = baseImponible + valorConIva;
              sIva = "4%";
              valorPromo = 0.00;
              switch (promo) {
                case "nopro":
                  total = precioConIva;
                  break;
                case "mitad":
                  valorPromo = precioConIva/2;
                  total = valorPromo;
                  break;
                case "meno5":
                  valorPromo = 5.00;
                  total = precioConIva - valorPromo;
                  break;
                case "5porc":
                  valorPromo = valorConIva * 1.05;
                  total = precioConIva - valorPromo;
                  break;
              }
              break;
          }

          System.out.println("+-------------------------------------------+");
          System.out.println("|                   TICKET                  |");
          System.out.println("+-------------------------------------------+");
          System.out.println("                                           ");
          System.out.printf("  Base imponible                   %-8.2f \n", baseImponible);
          System.out.printf("  IVA (%s)                         %-8.2f \n", sIva, valorConIva);
          System.out.printf("  Precio con IVA                   %-8.2f \n", precioConIva);
          System.out.printf("  Cód. promo. (%s)              -%-8.2f \n", promo, valorPromo);
          System.out.printf("  TOTAL                            %-8.2f \n", total);
          System.out.println("                                           ");
          System.out.println("+-------------------------------------------+");

        } else {
          System.out.println("Introduzca una promoción válida. Inténtelo de nuevo más tarde");
        }
      } else {
        System.out.println("El tipo de IVA no es correcto. Inténtelo de nuevo más tarde");
      }
    } else {
      System.out.println("Introduzca una base imponible correcta");
    }
    teclado.close();
    }
}


