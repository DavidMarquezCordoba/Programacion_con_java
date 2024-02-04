package EjemploHerencia;
/**
 * Clase Profesor que hereda de Persona
 * 
 * @author David Márquez Córdoba
 */


public class Profesor extends Persona{

  //Atributos
  private String departamento;
  private double sueldo;


  //Constructor
  public Profesor (String nombre, int edad, String dni, String departamento, double sueldo){
    //Primero el constructor padre
    super(nombre, edad, dni);
    //Añadimos los atributos específicos
    this.departamento = departamento;
    this.sueldo = sueldo;
  }


  public String getDepartamento() {
    return departamento;
  }


  public double getSueldo() {
    return sueldo;
  }

  @Override
  public String toString() {
    return super.toString() + " [PROFESOR ->] [Departamento:" + departamento;
  }
}


