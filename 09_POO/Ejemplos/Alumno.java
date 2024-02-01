/**
 * Clase Alumno
 * 
 * @author David Márquez Córdoba
 */

public class Alumno {
  
  //Definimos atributos
  private String nombre;
  private double notaMedia =0;

  //Getters
  public String getNombre() {
    return nombre;
  }
  public double getNotaMedia() {
    return notaMedia;
  }

  //Setters
  //Aquí no sería nombreIntroducido ?
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public void setNotaMedia(double notaMedia) {
    this.notaMedia = notaMedia;
  }

  //toString
  @Override
  public String toString() {
    return "Alumno [nombre=" + nombre + ", notaMedia=" + notaMedia + "]";
  }

  //Constructores





  //Métodos






}
