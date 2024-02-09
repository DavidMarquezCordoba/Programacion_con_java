/**
 * Se quiere informatizar una biblioteca. Crea las clases Publicacion, Libro y
Revista. Las clases deben estar implementadas con la jerarquía correcta. Las
características comunes de las revistas y de los libros son el código ISBN, el
título, y el año de publicación. Los libros tienen además un atributo prestado.
Cuando se crean los libros, no están prestados. Las revistas tienen un número.
La clase Libro debe implementar la interfaz Prestable que tiene los métodos
presta, devuelve y estaPrestado.
 * 
 * @author David Márquez Córdoba
 */

package T09Ejercicio12;

public class AppMain {
  public static void main(String[] args) {

    //Lógica
    
    //Creamos Objetos libros tipo Libro
    Libro libro1 = new Libro("123456", "La Ruta Prohibida", 2007);
    Libro libro2 = new Libro("112233", "Los Otros", 2016);
    Libro libro3 = new Libro("456789", "La rosa del mundo", 1995);

    //Creamos Objetos revista tipo Revista
    Revista revista1 = new Revista("444555", "Año Cero", 2019, 344);
    Revista revista2 = new Revista("002244", "National Geographic", 2003, 255);

    //Mostramos por pantalla los resultados llamando directamente a la clase
    System.out.println("\nLibros\n");
    System.out.println(libro1);
    System.out.println(libro2);
    System.out.println(libro3);

    System.out.println("\nRevistas\n");
    System.out.println(revista1);
    System.out.println(revista2);

    libro2.presta();

    if (libro2.esPrestado()) {
      System.out.println("\nEl libro está prestado\n");
    }

    //Estado del libro dos en este momento
    System.out.println("Estado Libro 2");
    System.out.println(libro2);
    // libro2.presta();

    libro2.devuelve();

    if (!libro2.esPrestado()) {
      System.out.println("\nEl libro está devuelto\n");
    }

    // libro3.presta();

    System.out.println("RESULTADO\n");
    System.out.println(libro1);
    System.out.println(libro2);
    System.out.println(libro3);
  }
}
