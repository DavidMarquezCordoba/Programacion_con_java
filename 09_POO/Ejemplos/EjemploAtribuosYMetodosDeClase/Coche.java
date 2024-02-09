package EjemploAtribuosYMetodosDeClase;
/**
 * Coche.java
 * 
 * Definición de la clase Coche
 * 
 * @author David Márquez Córdoba
 */

public class Coche {

  //Atributo de clase
  private static int kilometrajeTotal = 0;


  //Método de clase
  public static int getKilometrajeTotal() {   //Serviría igual si no se pone static?
    return kilometrajeTotal;
  }

  //Atributos normales
  private String marca;
  private String modelo;
  private int kilometraje;


  //Constructores de la clase Coche
  public Coche(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
  }


  //Getter
  /**
   * Cuántos kilómetros ha recorrido el coche en cuestión
   * @return el kilometraje del coche
   */
  public int getKilometraje() {
    return kilometraje;
  }

  /**
   * Devuelve la marca del coche
   * @return marca del coche
   */
  public String getMarca() {
    return marca;
  }


  /**
   * Devuelve el modelo del coche
   * @return el modelo del coche
   */
  public String getModelo() {
    return modelo;
  }

  /**
   * Método para indicarle cuantos kilómetros a recorrido
   * @param km que ha recorrido
   */
  public void recorre(int km){
    //Suma parcial de un objeto tipo coche, con su kilometraje propio
    kilometraje+=km;
    //Suma total de todos los kilómetros de todos los objetos tipo coche que usen el método recorre
    kilometrajeTotal+=km;
  }












}


