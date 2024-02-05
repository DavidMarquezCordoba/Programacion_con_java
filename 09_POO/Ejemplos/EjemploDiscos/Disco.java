package EjemploDiscos;
/**
 * Definición de la clase Disco
 * 
 * 
 * 
 * @author David Márquez Córdoba
 */

public class Disco {

  //Atributos específicos de la clase Disco, solo se da valor a uno
  private String codigo = "LIBRE";
  private String autor;
  private String titulo;
  private String genero;
  private int duracion;




  //Getters para obtener el valor de cada uno de los atributos

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


  //Setters que modificará cada uno de los atributos
  
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

  //Contructores//

  //Constructor por defecto, al instanciar con él, todos los atributos sinvalor inicial, se crearán con sus valores por defecto (String=null)(int=0)..
  public Disco() { 
    
  }

  //Constructor con los parámetros de cada uno de los atributos
  public Disco(String codigo, String autor, String titulo, String genero, int duracion){
    this.codigo = codigo;
    this.autor = autor;
    this.titulo = titulo;
    this.genero = genero;
    this.duracion = duracion;
  }

  /**
   * Método toString que devolverá toda la información de los atributos de clase Disco
   */
  @Override
  public String toString() {
    String cadena = "\n---------------------";
          cadena+="\nCódigo: " + this.codigo;
          cadena+="\nAutor: " + this.autor;
          cadena+="\nTítulo: " + this.titulo;
          cadena+="\nGénero: " + this.genero;
          cadena+="\nDuración: " + this.duracion;
          cadena+= "\n---------------------";
          
    return cadena;
  }

  /**
   * Método que resetea los valores predeterminados
   */
  public void reset(){
    this.codigo = "LIBRE";
    this.autor = null;
    this.titulo = null;
    this.genero = null;
    this.duracion = 0;
  }
}
