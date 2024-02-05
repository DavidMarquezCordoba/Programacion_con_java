package EjemploDiscos;
import java.util.Scanner;


/**
 * Gestión típica - alta,
baja, listado y modificación - de una colección de discos. Este tipo de programas se
suele denominar CRUD
 * 
 * @author David Márquez Córdoba
 */
public class DiscoApp {
  public static void main(String[] args) {
    
    //Variables que usaremos 
    int opcion = 0;
    int discosAnadir = 0;
    int discoModificar = 0;
    int indice = 0;
    int numero = 1;
    int discoBorrar = 0;
    String codigo;
    String autor;
    String titulo;
    String genero;
    int duracion;

    //Inicializamos la clase Scannner para meter por teclado
    Scanner teclado = new Scanner(System.in);

    //Creamos un array de discos de tamaño 10
    Disco [] discos = new Disco[10];

    //Inicializamos todos los arrays con el constructor por defecto, (tomará todos los valores nulos)
    for (int i = 0; i < discos.length; i++) {
      discos[i] = new Disco();
    }

    //Rellenamos con datos las 3 primeras posiciones con el constructor personalizado
    discos[0] = new Disco("GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50);
    discos[1] = new Disco("FGHQ64", "Metallica", "Black album", "hard rock", 46);
    discos[2] = new Disco("TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42);

    //Vamos a crear un menú ///////////////
    do {
      System.out.println("\nCOLECCIÓN DE DISCOS");
      System.out.println("====================");

      System.out.println("1. Listado");
      System.out.println("2. Nuevo Disco");
      System.out.println("3. Modificar");
      System.out.println("4. Borrar");
      System.out.println("5. Salir");
      System.out.print("Introduzca una opcion: ");
      
      opcion = teclado.nextInt();

      switch (opcion) {

        //LISTAR
        case 1:
          System.out.println("\nLISTADO");
          System.out.println("=========");

          //Recorreremos cada posición del array discos[10]
          for (Disco d : discos) {
            //Llamaremos al método toString através de su método .toString o directamente desde la clase
              System.out.println(d);
          }

          break;
      
        //AÑADIR
        case 2:
          System.out.println("\nAÑADIR DISCO");
          System.out.println("=============");
          System.out.print("¿Cuántos discos quiere añadir?: ");
          discosAnadir = teclado.nextInt();

          //El primer filtro que pasaremos será que no podamos añadir más discos que espacios
          if (discosAnadir < discos.length) {
            
            //Iremos aumentando el índice hasta dar con un espacio de memoria que esté vacío
            while (!(discos[indice].getCodigo().equals("LIBRE"))) {
              indice++;
            }
            //Cuando salgamos del bucle, sabremos la posición exacta (por ejemplo indice = 3) por la que empezaremos a añadir nuevos discos

            //Iremos rellenando cada posición con sus respectivos datos para completar la información
            //Empezaremos desde el primer hueco libre hasta los discos que queramos añadir + desde donde empieza
            for (int j = indice; j < indice + discosAnadir; j++) {

              System.out.println("\nDisco " + numero);
              System.out.print("Introduzca código del disco: ");
              codigo = System.console().readLine();
              System.out.print("Introduzca autor: ");
              autor = System.console().readLine();
              System.out.print("Introduzca título: ");
              titulo = System.console().readLine();
              System.out.print("Introduzca género: ");
              genero = System.console().readLine();
              System.out.print("Introduzca duración (en minutos): ");
              duracion = Integer.parseInt(System.console().readLine());

              //Añadimos la información con el constructor personalizado
              discos[j]= new Disco(codigo, autor, titulo, genero, duracion);
              //Aumentaremos la variable que indicará qué disco es el que estamos rellenando (información pura y dura)
              numero++;
            }

            //Reseteamos el número por si en el futuro añadimos más discos
            numero = 1;

          } else{
            //En el caso que queramos añadir más discos que espacios..
            System.out.println("El límite son 10 discos");
          }

          //Reseteamos el valor de índice, para que cuando vayamos a crear uno nuevo, recorra desde el principio hasta encontrar el primer hueco libre
          indice = 0;

          break;

        //MODIFICAR
        case 3:
          System.out.print("\n¿Qué disco quiere modificar?: ");
          discoModificar = Integer.parseInt(System.console().readLine());

          //Recorreremos el array entero
          for (int i = 1; i < discos.length+1; i++) {
            //Si coincide el disco a modificar con la posición del array, empezaremos a recoger datos por teclado
            if (i == discoModificar) {
              System.out.print("Introduzca código del nuevo disco: ");
              codigo = System.console().readLine();
              System.out.print("Introduzca nuevo autor: ");
              autor = System.console().readLine();
              System.out.print("Introduzca nuevo título: ");
              titulo = System.console().readLine();
              System.out.print("Introduzca nuevo género: ");
              genero = System.console().readLine();
              System.out.print("Introduzca la nueva duración (en minutos): ");
              duracion = Integer.parseInt(System.console().readLine());

              //Guardaremos a través de su método set cada una de las variables alamcenadas previamente
              discos[i-1].setCodigo(codigo);
              discos[i-1].setAutor(autor);
              discos[i-1].setTitulo(titulo);
              discos[i-1].setGenero(genero);
              discos[i-1].setDuracion(duracion);

              //Mensaje informativo
              System.out.println("Disco "+discoModificar+" modificado con éxito");
            }
          }          

          break;

        //BORRAR
        case 4:

          System.out.print("\n¿Qué disco quiere borrar?: ");
          discoBorrar = Integer.parseInt(System.console().readLine());

          //Recorreremos el array
          for (int i = 1; i < discos.length+1; i++) {
            //Si coincide el índice con el disco a eliminar, simplemente llamaremos al método .reset
            if (i == discoBorrar) {
              //Dicho método reset reestablecerá los valores por defecto
              discos[discoBorrar-1].reset();
              System.out.println("Disco "+discoBorrar+" borrado con éxito");
            }
          }
          break;
      }
    } while (opcion !=5);

    //Cerramos la clase Scanner
    teclado.close();
  }
}
