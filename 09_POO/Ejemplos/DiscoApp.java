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
    
    //Variables
    int opcion = 0;
    String codigo;
    String autor;
    String titulo;
    String genero;
    int duracion;

    //Inicializamos la clase Scannner para meter por teclado
    Scanner teclado = new Scanner(System.in);

    //Creamos un array de discos
    Disco [] discos = new Disco[10];

    //Inicializamos todos los arrays
    for (int i = 0; i < discos.length; i++) {
      discos[i] = new Disco();
    }

    //Rellenamos con todos los datos
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

        case 1:
          System.out.println("\nLISTADO");
          System.out.println("=========");

          for (Disco d : discos) {
            // if (!d.getCodigo().equals("LIBRE")) {
              System.out.println(d);
            // }
            // System.out.println(discos[i].toString());
          }
          break;
      
        case 2:
          
          break;

        case 3:
          
          break;

        case 4:
          
          break;
          
        default:
          break;
      }
    } while (opcion !=5);


    teclado.close();
  }
}
