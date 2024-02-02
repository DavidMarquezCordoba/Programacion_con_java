/**
 * Clase Estudiante que herada de la superclase Persona
 * 
 * @author David Márquez Córdoba
 */

 //////Se pone extends + clase padre

public class Estudiante extends Persona{

  //Atributos
  private int creditos;

  //Constructores
  public Estudiante(String nombre, int edad, String dni){

    super(nombre, edad,dni);

    this.creditos = 60;
  }

  public Estudiante (String nombre, int edad, String dni, int creditos){
    super(nombre,edad,dni);
    this.creditos = creditos;
  }

  public int getCreditos() {
    return creditos;
  }

  //Con protected si me deja, ya que protected solo es visible para hijos de la clase padre
  // public void mostrarDatos(){
  //   System.out.println("Nombre: "+nombre+"\t Edad: "+ edad+"\t Dni: "+dni+ "Créditos: "+creditos);
  // }

  //Con private si me deja, hay que llamar al get
  @Override
  public void mostrarDatos(){
    //Llamo al método mostrar Datos de la superclase Padre
    super.mostrarDatos();
    System.out.println("Estudiante matriculado de " +creditos+ " creditos");
  }

  @Override
  public String toString() {
    return super.toString() + "[ESTUDIANTE ->] [Créditos:" + creditos;
  }
}
