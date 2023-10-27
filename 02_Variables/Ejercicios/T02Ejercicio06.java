/*
 * Escribe un programa que calcule el total de una factura a partir de la base
imponible (precio sin IVA). La base imponible estará almacenada en una
variable.
 * 
 * @author David Márquez Córdoba
 */
public class T02Ejercicio06 {
  public static void main(String[] args) {
    double baseImponible = 1532.50;
    final double IVA = 1.21;

    System.out.println("");

    System.out.println("Salida sin formatear");
    System.out.println("====================");

    System.out.println("Precio sin IVA: "+baseImponible+" €.");
    System.out.println("Precio con IVA: "+baseImponible*IVA+ " €.");

    System.out.println("");
    System.out.println("Salida Formateada");
    System.out.println("=================");

    //Salida Formateada
    double calculoIva= baseImponible*IVA;
    System.out.printf("Precio sin IVA %.2f €.\n", baseImponible);
    System.out.printf("Precio con IVA %.2f €.\n", calculoIva);
  }
}
