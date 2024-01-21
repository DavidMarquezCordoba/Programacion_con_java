/**
 * Clase de ejemplo coche
 * 
 * @author David Márquez Córdoba
 */

public class Coche {
  
  //Atributos
  String matricula;
  String marca;
  String modelo;
  String color;
  int puertas;
  int potencia;

  public static void main(String[] args) {
    
    // Nombre_clase nombre_objeto = new Nombre_clase();

    Coche coche1 = new Coche();
    Coche coche2 = new Coche();

    coche1.matricula = "1234ABC";
    coche2.matricula = "56789DEF";
    
    System.out.println("Matricula del coche 1: " + coche1.matricula);
    System.out.println("Potencia del coche 1: "+ coche1.potencia);

    System.out.println("Matricula del coche 2: " + coche2.matricula);
    System.out.println("Potencia del coche 2: "+ coche2.potencia);
  }
}
