package EjemplosArrayList;



public class Gato implements Comparable<Gato>{

  // ATRIBUTOS
  String nombre;
  String color;
  String raza;
  // String sexo;
  int edad;
  // double peso;

  // CONSTRUCTORES
  Gato(String nombre) {
    this.nombre = nombre; // Puedes definirlo desde aqui
    this.color = "Azul";
    this.raza = "Romano";
  }

  // Gato(String nombre, String color, String raza, String sexo, int edad, double peso) {
  //   this.nombre = nombre;
  //   this.color = color;
  //   this.raza = raza;
  //   this.sexo = sexo;
  //   this.edad = edad;
  //   this.peso = peso;
  // }

  //Constructor para ejemplo de ArrayLIst
  Gato(String nombre, String color, String raza, int edad) {
    this.nombre = nombre;
    this.color = color;
    this.raza = raza;
  }

  //GEtters
  public String getNombre() {
    return nombre;
  }

  public String getColor() {
    return color;
  }

  public String getRaza() {
    return raza;
  }

  public int getEdad() {
    return edad;
  }
  // METODOS

  void maulla() {
    System.out.println("MIAUUUUUUUUUUUUUU!");
  }

  void ronronea() {
    System.out.println("RRRRRRRRRRRRRRRRRRRRRR");
  }

  void come(String comida) {
    if (comida.equalsIgnoreCase("Pescado")) {
      System.out.println("ÑAM ÑAM!");
    } else {
      System.out.println("SOY UN GATO Y SOLO COMO PESCADO");
    }
  }

  @Override
  public String toString() {
    return "Gato [nombre=" + nombre + ", color=" + color + ", raza=" + raza + "]";
  }

  //////////////////////EXPLICACIÓN//////////////////////
  // Si son iguales los objetos a comparar -> 0
  // Si el primer elemento que se compara es MENOR que el segundo -> num negativo
  // Si el primer elemento es MAYOR que el segundo -> num positivo

  //Si queremos comparar el nombre

  // @Override
  // public int compareTo(Gato o) {
  //   return (this.nombre).compareTo(o.getNombre());
  // }

  //Si lo queremos ordenar por color

  // @Override
  // public int compareTo(Gato o) {
  //   return (this.color).compareTo(o.getColor());
  // }

  //Si lo queremos ordenar por raza

  @Override
  public int compareTo(Gato o) {
    return Integer.compare(this.edad, o.getEdad());
    // return (this.edad).compareTo(o.getEdad());
  }
  ///////////////

  // void peleaCon(Gato contrincante) {
  //   if (this.sexo.equals(contrincante.sexo) && (this.sexo.equals("Macho"))) {
  //     System.out.println("Pelea");
  //   } else {
  //     System.out.println("No me gusta pelear");
  //   }
  // }

}
