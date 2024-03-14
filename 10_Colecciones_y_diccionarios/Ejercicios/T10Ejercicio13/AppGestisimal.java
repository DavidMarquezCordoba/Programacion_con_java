package T10Ejercicio13;

import java.util.ArrayList;

/**
 * Modifica el programa Gestisimal realizado anteriormente añadiendo las siguientes
  mejoras:

    • Utiliza una lista en lugar de un array para el almacenamiento de los datos.

    • Comprueba la existencia del código en el alta, la baja y la modificación de
    artículos para evitar errores.

    • Cambia la opción “Salida de stock” por “Venta”. Esta nueva opción permitirá
    hacer una venta de varios artículos y emitir la factura correspondiente.

  Se debe preguntar por los códigos y las cantidades de cada artículo que
  se quiere comprar. Aplica un 21% de IVA.
 * 
 * @author David Márquez Córdoba
 */

public class AppGestisimal {
  public static void main(String[] args) {
    //Variables
    int opcionMenuPpal;
    int indiceListado = 0;
    String codigo;
    String descripcion;
    double precio;
    String codigoAEliminar;
    String codigoAModificar;
    int opcionModificar;

    int index = 1;
    int posicionProducto;
    Productos producto = null;
    
    ArrayList<Productos> almacen = new ArrayList<Productos>();
    
    System.out.println("\nBienvenidos a la tienda Alan Turing");
    System.out.println("====================================");

    System.out.println("Vamos a crear un almacen, y lo vamos a gestionar en esta aplicación.");

    System.out.println("\nCreando almacen.....");
    System.out.println("....");
    System.out.println("...");
    System.out.println("..");
    System.out.println(".");

    // Productos [] almacen = new Productos[100];

    // for (int i = 0; i < almacen.length; i++) {
    //   almacen[i] = new Productos();
    // }

    System.out.println("¡Listo!\n");

    do {
      System.out.println("\n+---------------------------------------+");
      System.out.println("|\t\tMENÚ PRINCIPAL\t\t|");
      System.out.println("+---------------------------------------+\n");
  
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificación");
      System.out.println("5. Entrada de mercancía");
      System.out.println("6. Salida de mercancía");
      System.out.println("7. Salir\n");
  
      System.out.print("Elija una opción (1-7): ");
      opcionMenuPpal = Integer.parseInt(System.console().readLine());

      switch (opcionMenuPpal) {

        /**
         * Listamos
         */
        case 1:
          
          System.out.println("");
          index = 1;

          if (almacen.isEmpty()) {
            System.out.println("\nAlmacen vacío de momento\n");
          } else {
            for (Productos productos : almacen) {
              System.out.println("Producto #"+index);
              System.out.println("-----------");
              System.out.println(productos);
              index++;
            }
          }

          break;

        /**
         * Alta nuevo producto
         */
        case 2:

          System.out.println("\nNuevo producto");
          System.out.println("--------------------------\n");
          producto = new Productos();

          System.out.print("Código de producto: ");
          codigo = System.console().readLine();
          producto.setCodigo(codigo);
          
          System.out.print("Descripción del producto: ");
          descripcion = System.console().readLine();
          producto.setDescripcion(descripcion);

          System.out.print("Precio/u: ");
          precio = Double.parseDouble(System.console().readLine());
          producto.setPrecio(precio);
          
          almacen.add(producto);

          break;


        /**
         * Baja de un producto
         */
        case 3:

          System.out.println("Eliminar producto");
          System.out.println("---------------------------\n");
          System.out.println("¿Qué producto desea dar de baja?");
          System.out.print("Introduzca código de producto: ");
          codigoAEliminar = System.console().readLine();

          if (almacen.contains(codigoAEliminar)) {
            almacen.remove(almacen.indexOf(producto.getCodigo().equals(codigoAEliminar)));
          } else {
            System.out.println("\nProducto no encontrado\n");
          }

          break;

        /**
         * Modificación de un producto
         */
        case 4:

          System.out.println("Modificar producto");
          System.out.println("-----------------------------\n");

          System.out.println("¿Qué producto desea modificar?\n");
          System.out.print("Introduzca el código del producto: ");
          codigoAModificar = System.console().readLine();

          if (almacen.contains(codigoAModificar)) {
            do {
              //Pedimos datos que desea modificar
              System.out.println("\n¿Qué desea modificar?");
              System.out.println("1. Código");
              System.out.println("2. Descripción");
              System.out.println("3. Precio");
              System.out.println("4. Atrás\n");

              System.out.print("Elija una opción (1-4): ");
              opcionModificar = Integer.parseInt(System.console().readLine());    
              
              switch (opcionModificar) {
                case 1:
                  System.out.print("\nCódigo de producto: ");
                  codigo = System.console().readLine(); 
                  
                  posicionProducto = almacen.indexOf(almacen.contains(codigoAModificar));

                  // almacen.set(posicionProducto, producto.setCodigo(codigo));
                  // almacen.contains(producto.getCodigo().equals(codigoAModificar));


                  break;
              
                case 2:
                  System.out.print("\nDescripción del producto: ");
                  descripcion = System.console().readLine();
                  
                  break;

                case 3:
                  System.out.print("\nPrecio/u: ");
                  precio = Double.parseDouble(System.console().readLine()); 
                  
                  break;

                default:
                  break;
              }
            } while (opcionModificar!=4);

          } else {
            
          }

          break;


        /**
         * Entrada nueva mercancía, suma stock del producto que se encuentra en almacen
         */
        case 5:

        System.out.println("\nEntrada mercancia");
        System.out.println("--------------------------\n");

        System.out.print("Código de producto: ");
        codigo = System.console().readLine();

        // for (int j = 0; j < almacen.length; j++) {
        //   if ((almacen[j].getCodigo().equals(codigo))) {
        //     almacen[j].sumarStock();
        //   }
        // }
          
          break;


        /**
         * Salida de mercancía
         */
        case 6:

        System.out.println("\nSalida mercancia");
        System.out.println("--------------------------\n");

        System.out.print("Código de producto: ");
        codigo = System.console().readLine();

        // for (int j = 0; j < almacen.length; j++) {
        //   if ((almacen[j].getCodigo().equals(codigo))) {
        //     almacen[j].restarStock();
        //   }
        // }
          
          break;


        default:
          break;

      }
    } while (opcionMenuPpal!=7);
  }
}
