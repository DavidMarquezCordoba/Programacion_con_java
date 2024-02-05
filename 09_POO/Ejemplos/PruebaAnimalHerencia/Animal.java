package PruebaAnimalHerencia;

/**
 * Animal.java
 * Definición de la clase Animal
 * @author David Márquez Córdoba
 */
public abstract class Animal {

  /**
   * Declaramos el atributo Sexo de tipo Sexo (enum en otra clase) private, para que solo sea visible en la clase Animal
   */
  private Sexo sexo;

  /**
   * Creamos por defecto que al instanciar un objeto de tipo Animal el sexo sea macho
   */
  public Animal() {
    this.sexo = Sexo.MACHO;
  }

  /**
   * Constructor que servirá para crear un objeto de tipo Animal con un sexo como parámetro
   * @param x Sexo que tendrá nuestro objeto de tipo Animal
   */
  public Animal (Sexo x) {
    this.sexo = x;
  }

  /**
   * Obtiene el valor de Sexo
   * @return devuelve el sexo del animal
   */
  public Sexo getSexo() {
    return this.sexo;
  }

  /**
   * Muestra por pantalla el sexo
   */
  @Override
  public String toString() {
    return "Sexo: " + this.sexo + "\n";
  }
  
  /**
   * Hace que el animal se eche a dormir.
   */
  public void duerme() {
    System.out.println("Zzzzzzz");
  }
  
  /**
   * Frase que dice el objeto animal cuando come
   */
  public void come() {
    System.out.println("¡Qué rico!");
  }
  
  /**
   * Qué dirá el animal cuando le des la comida que pone en el parámetro
   * 
   * @param comida  que le darás al animal
   */
  public void come(String comida) {
    System.out.println("¡Qué rico, me gusta comer " + comida + "!");
  }
}
