package T10Ejercicio05;

import java.util.ArrayList;

/**
 * Realiza de nuevo el ejercicio de la colección de discos pero utilizando esta vez
una lista para almacenar la información sobre los discos en lugar de un array
convencional. Comprobarás que el código se simplifica notablemente ¿Cuánto
ocupa el programa original hecho con un array? ¿Cuánto ocupa este nuevo
programa hecho con una lista?
 * 
 * @author David Márquez Córdoba
 */
public class T10Ejercicio05 {
  public static void main(String[] args) {
    
    int opcion;
    int opcionMod;

    //Disco Auxiliar para obtener la información a modificar
    Disco discoAux;
    boolean salir = false;

    int index = 1;
    int discoAModificar;
    int discoAEliminar;

    /**
     * Atributos de disco
     */
    String codigo;
    String autor;
    String titulo;
    String genero;
    int duracion;
    /**
     * Atributos a modificar
     */
    String codigoNuevo;
    String autorNuevo;
    String tituloNuevo;
    String generoNuevo;
    int duracionNuevo;


    ArrayList<Disco> coleccion = new ArrayList<Disco>();

    do {
      System.out.println("\nCOLECCIÓN DE DISCOS");
      System.out.println("====================");

      System.out.println("1. Listado");
      System.out.println("2. Nuevo Disco");
      System.out.println("3. Modificar");
      System.out.println("4. Borrar");
      System.out.println("5. Salir");
      System.out.print("Introduzca una opcion: ");
      
      opcion = Integer.parseInt(System.console().readLine());

      switch (opcion) {
        case 1:

          /**
           * Recorremos la colección en busca de un disco SI HAY discos creados
           */
          if (!coleccion.isEmpty()) {
            for (Disco disco : coleccion) {
              System.out.print("\nDisco " + index);
              System.out.println(disco);
              System.out.println("");
              index++;
            }
            index = 1;
            break;            
          } else {
            System.out.println("\nNo hay discos creados aún");
            break;
          }


        case 2:

          System.out.print("Introduce un código ID para el disco: ");
          codigo = System.console().readLine();
          System.out.print("Introduce el autor: ");
          autor = System.console().readLine();
          System.out.print("Introduce el título del disco: ");
          titulo = System.console().readLine();
          System.out.print("Introduzca el género: ");
          genero = System.console().readLine();
          System.out.print("Indique la duración (en minutos): ");
          duracion = Integer.parseInt(System.console().readLine());

          Disco disco = new Disco(codigo, autor, titulo, genero, duracion);

          /**
           * Añadimos el disco con su método correspondiente
           */
          coleccion.add(disco);

          break;
        case 3:
          if (!coleccion.isEmpty()) {
            /**
             * Pedimos que dato se modificará
             */
            System.out.print("\n¿Qué disco desea modificar?: ");
            discoAModificar = Integer.parseInt(System.console().readLine());
  
            System.out.println("\n¿Qué desea modificar?");
            System.out.println("1. Código");
            System.out.println("2. Autor");
            System.out.println("3. Título del disco");
            System.out.println("4. Género");
            System.out.println("5. Duración");
            System.out.print("Elija una opción (1-5): ");
            opcionMod = Integer.parseInt(System.console().readLine());
  
            switch (opcionMod) {
              case 1:
                System.out.print("Introduce el nuevo código ID: ");
                codigoNuevo = System.console().readLine();
  
                //Creamos un disco auxiliar que contendrá la info del disco a modificar
                
                /**
                 * coleccion.get --> Obtiene el elemento de la ubicación que se pasa por parámetro
                 */
                discoAux = coleccion.get(discoAModificar-1);
  
                //Modificamos el código mediante el método set de Disco
                discoAux.setCodigo(codigoNuevo);
  
                //Con el método set de Arraylist, sustituimos el disco en la posición indicada por el nuevo disco aux modificado
                /**
                 * coleccion.set --> Sustituye el elemento ubicado en la posición indicado por parámetro
                 */
                coleccion.set(discoAModificar-1, discoAux);
  
                break;
  
              case 2:
                System.out.print("Introduce el nuevo autor: ");
                autorNuevo = System.console().readLine();
  
                discoAux = coleccion.get(discoAModificar-1);
  
                discoAux.setAutor(autorNuevo);
  
                coleccion.set(discoAModificar-1, discoAux);
  
                break;
  
              case 3:
                System.out.print("Introduce el nuevo título del disco: ");
                tituloNuevo = System.console().readLine();
  
                discoAux = coleccion.get(discoAModificar+1);
  
                discoAux.setTitulo(tituloNuevo);
  
                coleccion.set(discoAModificar-1, discoAux);
                break;
  
              case 4:
                System.out.print("Introduzca el nuevo género; ");
                generoNuevo = System.console().readLine();
  
                discoAux = coleccion.get(discoAModificar-1);
  
                discoAux.setGenero(generoNuevo);
  
                coleccion.set(discoAModificar-1, discoAux);
                break;
  
              case 5:
                System.out.print("Indique la nueva duración (en minutos): ");
                duracionNuevo = Integer.parseInt(System.console().readLine());
  
                discoAux = coleccion.get(discoAModificar-1);
  
                discoAux.setDuracion(duracionNuevo);
  
                coleccion.set(discoAModificar-1, discoAux);
                break;
  
              default:
              System.out.println("Opción no válida. Regresando al menú principal");
                break;
            }
            break;
          } else {
            System.out.println("\nNo existen discos");
          }

        case 4:
          if (!coleccion.isEmpty()) {
            System.out.print("\n¿Qué disco desea eliminar?: ");
            discoAEliminar = Integer.parseInt(System.console().readLine());

            coleccion.remove(discoAEliminar-1);

          } else {
            System.out.println("\nNo hay discos en la colección");
          }
          break;
          
        case 5:
          salir = true;
          break;

        default:
        System.out.println("Opción no válida");
          break;
      }
    } while (!salir);

  }
}
