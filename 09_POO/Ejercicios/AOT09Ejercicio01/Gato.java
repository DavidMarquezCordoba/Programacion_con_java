package AOT09Ejercicio01;
/**
 * Utiliza la clase Gato para crear un array de cuatro gatos e introduce los datos
de cada uno de ellos mediante un bucle. Muestra a continuación los datos de
todos los gatos utilizando también un bucle.
 * 
 * @author David Márquez Córdoba
 */
public class Gato {

  //El orden es siempre Aributo- constructores -metodos

  //////Atributos
  String nombre;
  String color;
  String raza;
  String sexo;
  int edad;


  double peso;

  //Contructores
  Gato(String nombre){
    this.nombre = nombre;
  }

  Gato(String nombre, String color, String raza){
    this.nombre = nombre;
    this.color = color;
    this.raza = raza;
  }
  
  // Gato(String nombre, String color, String raza, String sexo, int edad, double peso){
  //   this.nombre = nombre;
  //   this.color = color;
  //   this.raza = raza;
  //   this.sexo = sexo;
  //   this.edad = edad;
  //   this.peso = peso;
  // }

  @Override
  public String toString() {

    String cadena = "Nombre = " + nombre + "\nColor = " + color + "\nRaza = " + raza;
    return cadena;
  }

  /////Métodos - Funciones (que hacen) de tipo void
  void maulla(){
    System.out.println("Miauuuuu!");
  }

  void ronronea(){
    System.out.println("Brrrrrrrrr");
  }

  void come(String comida){
    if (comida.equalsIgnoreCase("pescado")) {
      System.out.println("Ñam Ñam");
    } else {
      System.out.println("Soy un gato y solo como pescado");
    }
  }

  /**
   * Explica tu función aquí
   * 
   * @param x
   * 
   */
  void peleaCon(Gato rival){
    //THIS hace referencia al atributo de la clase para diferenciarlo del atributo como parámetro
    if (this.sexo.equals(rival.sexo) && this.sexo.equals("macho")) {
      System.out.println("Ven aquí, que te reviento");
    } else {
      System.out.println("No me gusta pelear");
    }
  }

}
