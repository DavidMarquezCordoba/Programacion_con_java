import java.util.Scanner;

/**
 * VisteT
 * 
 * @author David Márquez Córdoba
 */
public class Ejercicio5 {
  public static void main(String[] args) {
    
    String nombreArticulo;
    double precioBase;
    int cantidad;

    Scanner teclado = new Scanner(System.in);

    System.out.printf("Nombre del artículo: ");
    nombreArticulo = teclado.nextLine();

    System.out.printf("Precio en €: ");
    precioBase = teclado.nextDouble();

    System.out.printf("¿Cuántos quiere?: ");
    cantidad = teclado.nextInt();

    double subTotal = precioBase * cantidad;
    double descuento =  subTotal * 0.15;
    double subTotalConDescuento = subTotal - descuento;
    double iva = subTotalConDescuento * 0.21;
    double total = subTotalConDescuento + iva;



    System.out.println("");
    System.out.println("Factura");
    System.out.println("===============================");
    System.out.printf("Artículo                   %4s\n", nombreArticulo);
    System.out.printf("Precio            %2.2f /Unidad\n", precioBase);
    System.out.printf("Cantidad                    %2d\n", cantidad);
    System.out.printf("Subtotal               %2.2f €\n", subTotal);
    System.out.printf("Descuento (15%%)        -%2.2f €\n", descuento);
    System.out.printf("Subtotal con descuento    %2.2f\n", subTotalConDescuento);
    System.out.printf("IVA (21%%)              +%2.2f €\n", iva);
    System.out.println("==============================");
    System.out.print("\033[0;30m");
    System.out.printf("\033[0;100m TOTAL                %2.2f €\n", total);
    
    teclado.close();
  }
}
