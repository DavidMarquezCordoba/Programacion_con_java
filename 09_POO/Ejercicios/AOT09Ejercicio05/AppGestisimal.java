package AOT09Ejercicio05;

/**
 * Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén) para llevar el
control de los artículos de un almacén. De cada artículo se debe saber el código,
la descripción, el precio de compra, el precio de venta y el stock (número de
unidades). El menú del programa debe tener, al menos, las siguientes opciones:

1. Listado
2. Alta
3. Baja
4. Modificación
5. Entrada de mercancía
6. Salida de mercancía
7. Salir
La entrada y salida de mercancía supone respectivamente el incremento y
decremento de stock de un determinado artículo. Hay que controlar que no
se pueda sacar más mercancía de la que hay en el almacén.
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
    
    System.out.println("\nBienvenidos a la tienda Alan Turing");
    System.out.println("====================================");

    System.out.println("Vamos a crear un almacen, y lo vamos a gestionar en esta aplicación.");

    System.out.println("\nCreando almacen.....");
    System.out.println("....");
    System.out.println("...");
    System.out.println("..");
    System.out.println(".");

    Productos [] almacen = new Productos[100];

    for (int i = 0; i < almacen.length; i++) {
      almacen[i] = new Productos();
    }

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

        ////////////////////////////////////////////////////////////
        //LISTADO///////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////
        case 1:
          
          System.out.println("");
          for (int i = 0; i < almacen.length; i++) {
            
            if (!(almacen[i].getCodigo().equals("vacio"))) {
              System.out.println("Producto #"+(i+1));
              System.out.println("-----------");
              System.out.println(almacen[i]);
            }
          }

          break;

        ////////////////////////////////////////////////////////////
        //ALTA//////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////
        case 2:

          //Buscamos el primer hueco vacío
          do {
            if ((almacen[indiceListado].getCodigo().equals("vacio"))) {
              System.out.println("\nNuevo producto");
              System.out.println("--------------------------\n");

              System.out.print("Código de producto: ");
              codigo = System.console().readLine();

              System.out.print("Descripción del producto: ");
              descripcion = System.console().readLine();

              System.out.print("Precio/u: ");
              precio = Double.parseDouble(System.console().readLine());

              almacen[indiceListado] = new Productos(codigo, descripcion, precio);

              break;

            } else{
              indiceListado++;
            }
          } while ((indiceListado < almacen.length));
          indiceListado = 0;
          break;


        ////////////////////////////////////////////////////////////
        //BAJA//////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////
        case 3:

          System.out.println("Eliminar producto");
          System.out.println("---------------------------\n");
          System.out.println("¿Qué producto desea dar de baja?");
          System.out.print("Introduzca código de producto: ");
          codigoAEliminar = System.console().readLine();

          for (int i = 0; i < almacen.length; i++) {
            if (almacen[i].getCodigo().equals(codigoAEliminar)) {
              almacen[i].eliminarProducto();
            }
          }

          break;

        ////////////////////////////////////////////////////////////
        //MODIFICACION////////////////////////////////////////////
        ////////////////////////////////////////////////////////////
        case 4:

          System.out.println("Modificar producto");
          System.out.println("-----------------------------\n");

          System.out.println("¿Qué producto desea modificar?\n");
          System.out.print("Introduzca el código del producto: ");
          codigoAModificar = System.console().readLine();

          for (int i = 0; i < almacen.length; i++) {
            if (almacen[i].getCodigo().equals(codigoAModificar)) {
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
                    almacen[i].setCodigo(codigo);                
                    break;
                
                  case 2:
                    System.out.print("\nDescripción del producto: ");
                    descripcion = System.console().readLine();
                    almacen[i].setDescripcion(descripcion);                  
                    break;
  
                  case 3:
                    System.out.print("\nPrecio/u: ");
                    precio = Double.parseDouble(System.console().readLine()); 
                    almacen[i].setPrecio(precio);
                    break;
  
                  default:
                    break;
                }
              } while (opcionModificar!=4);
            }
          }


          break;


        ////////////////////////////////////////////////////////////
        //ENTRADA MERCANCIA///////////////////////////////////////////
        ////////////////////////////////////////////////////////////
        case 5:

        System.out.println("\nEntrada mercancia");
        System.out.println("--------------------------\n");

        System.out.print("Código de producto: ");
        codigo = System.console().readLine();

        for (int j = 0; j < almacen.length; j++) {
          if ((almacen[j].getCodigo().equals(codigo))) {
            almacen[j].sumarStock();
          }
        }
          
          break;


        ////////////////////////////////////////////////////////////
        //SALIDA DE MERCANCIA////////////////////////////////////////
        ////////////////////////////////////////////////////////////
        case 6:

        System.out.println("\nSalida mercancia");
        System.out.println("--------------------------\n");

        System.out.print("Código de producto: ");
        codigo = System.console().readLine();

        for (int j = 0; j < almacen.length; j++) {
          if ((almacen[j].getCodigo().equals(codigo))) {
            almacen[j].restarStock();
          }
        }
          
          break;


        default:
          break;

      }
    } while (opcionMenuPpal!=7);
  }
}
