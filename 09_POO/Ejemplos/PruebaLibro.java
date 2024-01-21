/**
 * Main de la clase libro
 * 
 * @author David Márquez Córdoba
 */

public class PruebaLibro {
  public static void main(String[] args) {
    
    //Creamos 3 objetos del tipo Libro
    Libro lib = new Libro();
    Libro miLibrito = new Libro();
    Libro quijote = new Libro();

    lib.titulo = "Atomka";
    lib.autor = "Frank Thill";
    lib.paginas = 490;

    System.out.println("Título: " + lib.titulo);
    System.out.println("Autor: " + miLibrito.autor);
    System.out.println("Páginas: " + lib.paginas);
    // System.out.println("Edición: " + lib.edicion);

    
  }
}
