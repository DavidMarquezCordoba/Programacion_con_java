package T10Ejercicio14;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Un supermercado de productos ecológicos nos ha pedido hacer un programa
para vender su mercancía. En esta primera versión del programa se tendrán
en cuenta los productos que se indican en la tabla junto con su precio. 

Los productos se venden en bote, brick, etc. Cuando se realiza la compra, hay que
indicar el producto y el número de unidades que se compran, por ejemplo
“guisantes” si se quiere comprar un bote de guisantes y la cantidad, por
ejemplo “3” si se quieren comprar 3 botes. La compra se termina con la palabra
“fin. 

Suponemos que el usuario no va a intentar comprar un producto que
no existe. Utiliza un diccionario para almacenar los nombres y precios de los
productos y una o varias listas para almacenar la compra que realiza el usuario.
A continuación se muestra una tabla con los productos disponibles y sus
respectivos precios:

avena   garbanzos   tomate  jengibre  quinoa  guisantes
2,21    2,39        1,59      3,13      4,50      1,60
 * 
 * @author David Márquez Córdoba
 */

public class T10Ejercicio14 {
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

    String producto;
    int cantidad;
    boolean hayProductos = false;
    int index = 0;
    double sumaTotal = 0;

    do {
      
      System.out.print("Producto: ");
      producto = System.console().readLine();

      if (!producto.equals("fin")) {
        System.out.print("Cantidad: ");
        cantidad = Integer.parseInt(System.console().readLine());     
        
        listaProductos.add(producto);
        cantidades.add(cantidad);

        hayProductos = true;
      }

    } while (!producto.equals("fin"));

    if (hayProductos) {
      System.out.println("");
      System.out.printf("%-10s %10s   %-10s %-10s\n", "Producto", "Precio", "Cantidad", "Subtotal");
      System.out.println("--------------------------------------------");

      for (String productos : listaProductos) {
        System.out.printf("%-15s %-6.2f %6d %12.2f", productos, mapDespensa.get(productos), cantidades.get(index), mapDespensa.get(productos) * cantidades.get(index));
        sumaTotal += mapDespensa.get(productos) * cantidades.get(index);
        System.out.println("");
        index++;
      }
      System.out.println("--------------------------------------------");
      System.out.printf("TOTAL: %.2f", sumaTotal);
    } else {
      System.out.println("\nNo se han introducido productos");
    }
  }
}
