package T09Ejercicio12;
/**
 * Definición de la subclase Libro
 * 
 * @author David Márquez Córdoba
 */
public class Libro extends Publicacion implements Prestable{

  //Atributos /////
  private boolean prestado;


  public boolean getPrestado() {
    return prestado;
  }

  public void setPrestado(boolean prestado) {
    this.prestado = prestado;
  }


  //Constructor
  public Libro(String isbn, String titulo, int anoPublicacion) {
    super(isbn, titulo, anoPublicacion);
    this.prestado = false;
  }  

  //Métodos

  @Override
  public void devuelve() {
    this.prestado = false;
    
  }

  @Override
  public boolean esPrestado() {
    if (this.prestado) {
      // System.out.println("Lo siento, ese libro ya está prestado.");
      return true;
    }
    return false;
  }

  @Override
  public void presta() {
    this.prestado = true;
  }

  @Override
  public String toString() {
    if (prestado) {
      return super.toString() + " está prestado";
    } else {
      return super.toString() + " no está prestado";
    }
    
  }



}
