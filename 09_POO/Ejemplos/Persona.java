/**
 * Superclase Persona
 * 
 * @author David Márquez Córdoba
 */

public class Persona {

  //Atributos//////
  protected String nombre;
  protected int edad;
  protected String dni;
  

  //Constructores////
  public Persona(String nombre, int edad, String dni) {
      this.nombre = nombre;
      this.edad = edad;
      this.dni = dni;
    }


  public String getNombre() {
    return this.nombre;
  }


  public int getEdad() {
    return this.edad;
  }

  //No es necesario el this. pero podemos acostumbrarnos a ponerlo
  public String getDni() {
    return this.dni;
  }

  @Override
  public String toString() {
    return "Nombre: "+nombre+"\t Edad: "+ edad+"\t Dni: "+dni;
  }



  public void mostrarDatos(){
    System.out.println("Nombre: "+nombre+"\t Edad: "+ edad+"\t Dni: "+dni);
  }



    









}
