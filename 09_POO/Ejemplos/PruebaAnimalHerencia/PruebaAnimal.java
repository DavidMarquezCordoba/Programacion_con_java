package PruebaAnimalHerencia;

/**
 * PruebaAnimal.java
 * Programa que prueba la clase Animal y sus subclases
 * @author David Márquez Córdoba
 */
public class PruebaAnimal {
  public static void main(String[] args) {
    
    //Creamos 4 objetos de tipo Gato, cada uno usa un constructor diferente
    Gato garfield = new Gato(Sexo.MACHO, "romano");
    Gato tom = new Gato(Sexo.MACHO);
    Gato lisa = new Gato(Sexo.HEMBRA);
    Gato silvestre = new Gato();
    
    //Llamamos al método toString de la clase Gato, que a su vez contenía un super() invocando al método toString de la superclase Animal
    System.out.println(garfield);
    System.out.println(tom);
    System.out.println(lisa);
    System.out.println(silvestre);
    
    //Pasamos los métodos come() de la clase Animal, uno con parámetros y otro no, en ambos tienen comportamientos distintos
    silvestre.come();
    silvestre.come("pescado");
    
    //Creamos un objeto tipo Ave
    Ave miLoro = new Ave();

    //Invocamos a sus métodos aseate, vuela, come con parámetros y sin parámetros
    miLoro.aseate();
    miLoro.vuela();
    miLoro.come("hamburguesa");
    miLoro.come();
    
    //Creamos un objeto de tipo Pinguino, que tiene una sobracarga de métodos, ya que los pinguinos no son iguales a otras aves
    Pinguino pingu = new Pinguino(Sexo.HEMBRA);
    pingu.aseate();
    pingu.vuela();

    pingu.duerme();
  }
}