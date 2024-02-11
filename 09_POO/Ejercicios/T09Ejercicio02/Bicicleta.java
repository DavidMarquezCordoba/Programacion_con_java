package T09Ejercicio02;

/**
 * Subclase Bici
 * 
 * @author David Márquez Córdoba
 */

public class Bicicleta extends Vehiculo{

  //Atributos de la subclase
  private int kilometrajeBici;



  //Getter
  public int getKilometrajeBici() {
    return kilometrajeBici;
  }

  //¿?¿? Constructor ¿?
  // public Bicicleta(int kilometrosRecorridos) {
  //   super(kilometrosRecorridos);
    
  // }

  /**
   * Constructor predefinido
   * @param kilometrosRecorridos
   * @param kilometrajeBici
   */
  //Constructor para la clase bicicleta
  // public Bicicleta(int kilometrosRecorridos, int kilometrajeBici) {
  //   super(kilometrosRecorridos);
  //   this.kilometrajeBici = kilometrajeBici;
  // }

  public Bicicleta(int kilometrajeBici){
    super();
    this.kilometrajeBici = kilometrajeBici;
    
  }

  //Métodos
  public void andaBici(){
    System.out.println("\n**Estoy andando con la bici**\n");
  }

  public void caballitoBici(){
    System.out.println("\n**Estoy haciendo un caballito con la bici, me voy a caer**\n");
  }



}
