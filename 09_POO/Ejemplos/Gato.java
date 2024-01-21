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

  Gato(String nombre, String color, String raza, String sexo, int edad, double peso){
    this.nombre = nombre;
    this.color = color;
    this.raza = raza;
    this.sexo = sexo;
    this.edad = edad;
    this.peso = peso;
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

  //Comentario función
  void peleaCon(Gato rival){
    //THIS hace referencia al atributo de la clase para diferenciarlo del atributo como parámetro
    if (this.sexo.equals(rival.sexo) && this.sexo.equals("macho")) {
      System.out.println("Ven aquí, que te reviento");
    } else {
      System.out.println("No me gusta pelear");
    }
  }

}
