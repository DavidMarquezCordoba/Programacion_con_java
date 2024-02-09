/**
 * Definición de la superclase Publicación
 * 
 * @author David Márquez Córdoba
 */
package T09Ejercicio12;

public class Publicacion {

  //Atributos ////
  private String isbn;
  private String titulo;
  private int anoPublicacion;

  //Constructor
  public Publicacion(String isbn, String titulo, int anoPublicacion2) {
    this.isbn = isbn;
    this.titulo = titulo;
    this.anoPublicacion = anoPublicacion2;
  }

  @Override
  public String toString() {
    return "ISBN: " + isbn + ", titulo: " + titulo + ", año publicacion: " + anoPublicacion;
  }

  

}
