package ArrayObjetosAlumnos;

public class Alumno {

  //Atributos
  private String codigoAlumno;
  private String nombre;
  private String curso;
  private double notaMedia;



  //Getters
  public String getCodigoAlumno() {
    return codigoAlumno;
  }

  public String getNombre() {
    return nombre;
  }

  public String getCurso() {
    return curso;
  }

  public double getNotaMedia() {
    return notaMedia;
  }
  
  //Setters
  public void setCodigoAlumno(String codigoAlumno) {
    this.codigoAlumno = codigoAlumno;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public void setNotaMedia(double notaMedia) {
    this.notaMedia = notaMedia;
  }

  //toString
  @Override
  public String toString() {

    String cadena = "\n---------------------";
          cadena+="\nCódigo Alumno: " + this.codigoAlumno;
          cadena+="\nNombre: " + this.nombre;
          cadena+="\nCurso: " + this.curso;
          cadena+="\nNota Media: " + this.notaMedia;
          cadena+= "\n---------------------";
          
    return cadena;
  }

  //Constructores

  /**
   * Inicializa los valores predeterminados
   */
  public Alumno(){
    this.codigoAlumno = "LIBRE";
    this.nombre = null;
    this.curso = null;
    this.notaMedia = 0;
  }

  /**
   * Construye un objeto tipo Alumno
   * 
   * @param codigoAlumno número identificativo propio del objeto
   * @param nombre  nombre del alumno
   * @param curso curso que cursará
   * @param notaMedia nota media del año pasado
   */
  public Alumno(String codigoAlumno, String nombre, String curso, double notaMedia){
    this.codigoAlumno = codigoAlumno;
    this.nombre = nombre;
    this.curso = curso;
    this.notaMedia = notaMedia;
  }



  //Métodos

  /**
   * Elimina una ficha de alumno
   */
  public void eliminar(){
    this.codigoAlumno = "LIBRE";
    this.nombre = null;
    this.curso = null;
    this.notaMedia = 0;
  }

  /**
   * Modifica una ficha de un alumno
   */
  public void modificar(){
    System.out.println("\nMODIFICACIÓN FICHA ALUMNO");
    System.out.println("=========================\n");

    System.out.print("Nuevo nombre: ");
    this.setNombre(System.console().readLine());
    
    
    System.out.print("Nuevo curso: ");
    this.setCurso(System.console().readLine());
    

    System.out.print("Nueva nota media: ");
    this.setNotaMedia(Double.parseDouble(System.console().readLine()));

    System.out.print("Nuevo código de alumno (X-1234): ");
    this.setCodigoAlumno(System.console().readLine());
  }

  /**
   * Crea nueva ficha de alumno
   */
  public void nuevaFicha(){
    System.out.println("\nNUEVA FICHA ALUMNO");
    System.out.println("===================\n");

    System.out.print("Nombre del nuevo alumno/a: ");
    this.setNombre(System.console().readLine());

    System.out.print("Curso en el que está matriculado: ");
    this.setCurso(System.console().readLine());

    System.out.print("Nota media del curso pasado: ");
    this.setNotaMedia(Double.parseDouble(System.console().readLine()));

    System.out.print("Código de alumno (X-1234): ");
    this.setCodigoAlumno(System.console().readLine());

  }
}
