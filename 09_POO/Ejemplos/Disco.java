/**
 * Definición de la clase Disco
 * 
 * 
 * 
 * @author David Márquez Córdoba
 */

public class Disco {

  //Atributos
  private String codigo = "LIBRE";
  private String autor;
  private String titulo;
  private String genero;
  private int duracion;




  //Getters

  public String getCodigo() {
    return codigo;
  }
  public String getAutor() {
    return autor;
  }
  public String getTitulo() {
    return titulo;
  }
  public String getGenero() {
    return genero;
  }
  public int getDuracion() {
    return duracion;
  }


  //Setters
  
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }
  public void setAutor(String autor) {
    this.autor = autor;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  public void setGenero(String genero) {
    this.genero = genero;
  }
  public void setDuracion(int duracion) {
    this.duracion = duracion;
  }

  //toString
  @Override
  public String toString() {
    String cadena = "\n---------------------";
          cadena+="\nCódigo: " + this.codigo;
          cadena+="\nAutor: " + this.autor;
          cadena+="\nTítulo: " + this.titulo;
          cadena+="\nGénero: " + this.genero;
          cadena+="\nDuración: " + this.titulo;
          cadena = "\n---------------------";
          
    return cadena;
  }




  //Contructores
  public Disco() { 
    
  }

  public Disco(String codigo, String autor, String titulo, String genero, int duracion){
    this.codigo = codigo;
    this.autor = autor;
    this.titulo = titulo;
    this.genero = genero;
    this.duracion = duracion;
  }








  //Métodos



}
