package PruebaAnimalHerencia;

/**
 * Ave.java
 * Definición de la clase Ave
 * @author David Márquez Córdoba
 */
public class Ave extends Animal {
  
  //Con este constructor, elegiremos el sexo del objeto de la subclase Ave
  public Ave(Sexo s) {
    super(s);
  }

  //Constructor por defecto que implementará el sexo (único atributo de la superclase animal) por defecto como MACHO
  public Ave() {
    super();
  }

  /**
   * Hace que el ave se limpie.
   */  
  public void aseate() {
    System.out.println("Me estoy limpiando las plumas");
  }

  /**
   * Hace que el ave levante el vuelo.
   */  
  public void vuela() {
    System.out.println("Estoy volando");
  }
}