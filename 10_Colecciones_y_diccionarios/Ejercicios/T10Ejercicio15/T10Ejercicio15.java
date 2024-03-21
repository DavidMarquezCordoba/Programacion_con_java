package T10Ejercicio15;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Realiza una nueva versión del ejercicio anterior con las siguientes mejoras:
 *  Si algún producto se repite en diferentes líneas, se deben agrupar en una sola.
 * 
Por ejemplo, si se pide primero 1 bote de tomate y luego 3 botes de tomate, en
el extracto se debe mostrar que se han pedido 4 botes de tomate. 

Después de teclear “fin”, el programa pide un código de descuento. Si el usuario introduce
el código “ECODTO”, se aplica un 10% de descuento en la compra.
 * 
 * @author David Márquez Córdoba
 */

public class T10Ejercicio15 {
  public static void main(String[] args) {

    HashMap<String, Double> mapDespensa = new HashMap <String, Double> ();

    mapDespensa.put("avena", 2.21);
    mapDespensa.put("garbanzos", 2.39);
    mapDespensa.put("tomate", 1.59);
    mapDespensa.put("jengibre", 3.13);
    mapDespensa.put("quinoa", 4.50);
    mapDespensa.put("guisantes", 1.60);

    ArrayList<Integer> cantidades = new ArrayList<Integer>();
    ArrayList<String> listaProductos = new ArrayList<String>();

    final String COD_DESCUENTO = "ECODTO";
    final double DESCUENTO = 0.10;

    String producto;
    int cantidad;
    boolean hayProductos = false;
    boolean tieneDescuento = false;
    int index = 0;
    double sumaTotal = 0;
    double sumaTotalConDescuento = 0;
    int posicion;

    do {
      
      System.out.print("Producto: ");
      producto = System.console().readLine();

      if (!producto.equals("fin")) {
        System.out.print("Cantidad: ");
        cantidad = Integer.parseInt(System.console().readLine());     
        
        if (listaProductos.contains(producto)) {
          posicion = listaProductos.indexOf(producto);
          cantidades.set(posicion, (cantidades.get(posicion) + cantidad));
        } else {
            listaProductos.add(producto);
            cantidades.add(cantidad);
            hayProductos = true;          
        }
      }

    } while (!producto.equals("fin"));


    if (hayProductos) {
      System.out.print("Introduzca código de descuento (INTRO si no tiene ninguno): ");
      String descuento = System.console().readLine();

      if (COD_DESCUENTO.equalsIgnoreCase(descuento)) {
        tieneDescuento = true;
      }

      System.out.println("");
      System.out.printf("%-10s %10s   %-10s %-10s\n", "Producto", "Precio", "Cantidad", "Subtotal");
      System.out.println("--------------------------------------------");

      for (String productos : listaProductos) {
        System.out.printf("%-15s %-6.2f %6d %12.2f", productos, mapDespensa.get(productos), cantidades.get(index), mapDespensa.get(productos) * cantidades.get(index));
        sumaTotal += mapDespensa.get(productos) * cantidades.get(index);
        System.out.println("");
        index++;
      }
      
      if (tieneDescuento) {
        System.out.println("--------------------------------------------");
        
        System.out.printf("Descuento: %.2f\n", sumaTotal*DESCUENTO);

        sumaTotalConDescuento = sumaTotal - (sumaTotal*DESCUENTO);
      }
      System.out.println("--------------------------------------------");
      System.out.printf("TOTAL: %.2f", sumaTotalConDescuento);
      System.out.println("");
      System.out.println("Gracias por su visita");
    } else {
      System.out.println("\nNo se han introducido productos");
    }
  
  }
}
