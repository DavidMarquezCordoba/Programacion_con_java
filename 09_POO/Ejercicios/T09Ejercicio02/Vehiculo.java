package T09Ejercicio02;
/**
 * Superclase Vehiculo
 * 
 * @author David Márquez Córdoba
 */
public abstract class Vehiculo {

  //Atributos de clase (Solo accesibles desde la clase)
  private static int vehiculosCreados = 0;
  private static int kilometrosTotales = 0;


  //Atributos////////////////
  private int kilometrosRecorridos;

  //Getters/////////////////
  public static int getVehiculosCreados() {
    return vehiculosCreados;
  }


  public static int getKilometrosTotales() {
    return kilometrosTotales;
  }


  public int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }  

  /**
   * Constructor de la la clase Vehiculo, inicializa los kilómetros a 0
   * @param kilometrosRecorridos del objeto
   */
  public Vehiculo(){
    this.kilometrosRecorridos = 0;
    Vehiculo.vehiculosCreados++;
  }


  /**
   * Método para indicarle cuántos km a recorrido un vehículo
   * @param km recorridos
   */
  public void recorre(int km){
    this.kilometrosRecorridos += km;
    //Se llama directamente desde la clase porque es estático
    Vehiculo.kilometrosTotales += km;
  }






}
