package AOT09Ejercicio02;

/**
 * Cambia el programa anterior de tal forma que los datos de los gatos se
introduzcan directamente en el código de la forma gatito[2].setColor("marrón") o
bien mediante el constructor, de la forma gatito[3] = new Gato("Garfield", "naranja",
"macho"). Muestra a continuación los datos de todos los gatos utilizando un bucle.
 * 
 * @author David Márquez Córdoba
 */
public class Gato {

  //El orden es siempre Aributo- constructores -metodos

  //////Atributos
  String nombre;
  String color;
  String raza;
  // String sexo;
  // int edad;


  double peso;

  //Contructores
  Gato(String nombre){
    this.nombre = nombre;
  }

  public Gato(){
    
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

  ////Getters y setters
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  // public String getSexo() {
  //   return sexo;
  // }

  // public void setSexo(String sexo) {
  //   this.sexo = sexo;
  // }

  // public int getEdad() {
  //   return edad;
  // }

  // public void setEdad(int edad) {
  //   this.edad = edad;
  // }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

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
  // void peleaCon(Gato rival){
  //   //THIS hace referencia al atributo de la clase para diferenciarlo del atributo como parámetro
  //   if (this.sexo.equals(rival.sexo) && this.sexo.equals("macho")) {
  //     System.out.println("Ven aquí, que te reviento");
  //   } else {
  //     System.out.println("No me gusta pelear");
  //   }
  // }


}
