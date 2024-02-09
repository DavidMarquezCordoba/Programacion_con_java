package T09Ejercicio12;

/**
 * Definición de la subclase Revista
 * 
 * @author David Márquez Córdoba
 */

public class Revista extends Publicacion{



  //Atributos////
  private int numero;


  //Constructores
  public Revista(String isbn, String titulo, int anoPublicacion, int numero) {
    super(isbn, titulo, anoPublicacion);
    this.numero = numero;
  }


  @Override
  public String toString() {
    return super.toString() + " Número: "+ numero;
  }




}
