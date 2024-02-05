package PruebaAnimalHerencia;

/**
 * Gato.java
 * Definición de la clase Gato
 * @author David Márquez Córdoba
 */

//Con extends decimos que Gato heredará de Animal
public class Gato extends Animal {

  ////atributos////////
  private String raza;

  //Constructores

  //Constructor 1 para pasarle un sexo que eligamos nosotros (de los enum)
  public Gato (Sexo s, String r) {
    //sexo s es un atributo heradado por lo que se le incluye el super(s)
    super(s);
    //Raza es un atributo específico de Gato
    this.raza = r;
  }
  
  //Constructor 2, en caso de elegir solo el sexo, la raza por defecto será Siamés
  public Gato (Sexo s) {
    super(s);
    raza = "siamés";
  }

  //Constructor 3, en caso de elegir solo la raza, el sexo por defecto será ahora Hembra(heredado de Animal)
  public Gato (String r) {
    super(Sexo.HEMBRA);
    this.raza = r;
  }
  
  //Constructor 4, si no se indican parámetros, el objeto de tipo gato será hembra y siamés
  public Gato () {
    super(Sexo.HEMBRA);
    this.raza = "siamés";
  }
  
  //Sobreescribimos el toString inicial que escribía el SEXO del objeto
  @Override
  public String toString() {
    return super.toString()
            + "Raza: " + this.raza
            + "\n*************************\n";
  }
  
  /**
   * Hace que el gato maulle.
   */
  public void maulla() {
    System.out.println("Miauuuu");
  }

  /**
   * Hace que el gato ronronee
   */ 
  public void ronronea() {
    System.out.println("mrrrrrr");
  }

  /**
   * Hace que el gato coma.
   * A los gatos les gusta el pescado, si le damos otra comida
   * la rechazará.
   * 
   * @param comida la comida que se le ofrece al gato
   */

  //Sobreescribiremos el método come (usado en Animal) para que diga algo específico de los gatos
  @Override
  public void come(String comida) {
    
    if (comida.equals("pescado")) {
      //Llamamos al método come() de Animal con el acceso "super." Imprimiendo así su frase original
      super.come(); // ejecuta el método come de la clase Animal
      //Además imprimirá lo siguiente:
      System.out.println("Hmmmm, gracias");
    } else {
      System.out.println("Lo siento, yo solo como pescado");
    }
  }

  /**
   * Pone a pelear dos gatos.
   * Solo se van a pelear dos machos entre sí.
   * 
   * @param contrincante es el gato contra el que pelear
   */
  public void peleaCon(Gato contrincante) {
    //Si el sexo establecido para nuestro objeto es hembra, significa que no luchará
    if (this.getSexo() == Sexo.HEMBRA) {
      System.out.println("no me gusta pelear");
    } else {
      //De lo contrario, si no es hembra, será macho por lo que evaluaremos ahora, si el contrincante es hembra o macho
      //Si es hembra el contrincante, no peleará
      if (contrincante.getSexo() == Sexo.HEMBRA) {
        System.out.println("no peleo contra gatitas");
      } else {
        //De lo contrario indicará que mi objeto es macho y el contrincante será macho, pelearán
        System.out.println("ven aquí que te vas a enterar");
      }
    }
  }
}