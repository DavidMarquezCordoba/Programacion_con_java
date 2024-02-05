package PruebaAnimalHerencia;

/**
 * Pinguino.java
 * Definición de la clase Pinguino
 * @author David Márquez Córdoba
 */
public class Pinguino extends Ave {

  //Definimos los dos constructores, el de por defecto, y en el caso que elijamos el sexo
  public Pinguino() {
    super();
  }
  
  public Pinguino(Sexo s) {
    super(s);
  }

  /**
   * El pingüino se siente triste porque no puede volar.
   * 
   * Se sobreescribe el valor del método vuela de la clase Ave, por el personalizado a la clase Pinguino
   */
  @Override
  public void vuela() {
    System.out.println("No puedo volar");
  }
}