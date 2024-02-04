package EjemploAlumno;
/**
 * Main de la aplicación Alumno
 * 
 * @author David Márquez Córdoba
 */

public class AlumnoApp {
  public static void main(String[] args) {
    
    //Define la estructura, un array de 5 alumnos
    Alumno [] alumnos = new Alumno[5];

    //Pide los datos de los alumnos
    System.out.println("\nVamos a introducir 5 nombres de alumnos");

    //Variables que contendrán los datos de los alumnos

    //¿Por qué no podemos usar las variables de las clase Alumno previamente creadas?
    String nombreIntroducido;
    double notaIntroducida;

    //Recorremos el Array para ir rellenándolo
    for (int i = 0; i < alumnos.length; i++) {

      //Vamos añadiéndole información en cada iteración
      alumnos [i] = new Alumno();

      System.out.println("Alumno "+i);
      System.out.print("Nombre: ");
      //Guardamos
      nombreIntroducido = System.console().readLine();

      //Lo guardamos en nombreIntroducido del Array
      alumnos[i].setNombre(nombreIntroducido);
      
      System.out.print("Nota media: ");
      //Guardamos
      notaIntroducida = Double.parseDouble(System.console().readLine());

      //Lo guardamos en el Array
      alumnos[i].setNotaMedia(notaIntroducida);
      System.out.println("");
    }

    ////////////////////////SALIMOS DEL FORI/////////////////////////
    // Muestra los datos de los alumnos ////////////////////////////
    System.out.println("Los datos de los alumnos son los siguientes");

    double sumaMedias = 0;

    for (int i = 0; i < alumnos.length; i++) {
      System.out.println("Alumno "+i);
      System.out.println("Nombre: " + alumnos[i].getNombre());
      System.out.println("Nota media: " + alumnos[i].getNotaMedia());
      System.out.println("\n");
      //Vamos sumando cada una de las notas medias
      sumaMedias += alumnos[i].getNotaMedia();
    }

    System.out.println("");
    System.out.println("Las notas medias de todos los alumnos ha sido: "+sumaMedias/alumnos.length);
  }
}
