package T10Ejercicio07;
/**
 * Clase Moneda
 * 
 * @author David Márquez Córdoba
 */
public class Moneda {

  //Atributos
  private String posiciones[] = {"cara", "cruz"};
  private String cantidades[] = {"1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos", "25 céntimos", "50 céntimos", "1 euro", "2 euros"};

  private String posicion;
  private String cantidad;


  /**
   * Constructor por defecto, lo inicializaremos de forma aleatoria tanto la cantidad como la posición
   */
  public Moneda(){
    this.posicion = posiciones[(int)(Math.random()*2)];
    this.cantidad = cantidades[(int)(Math.random()*8)];
  }


  /**
   * Obtiene el valor de la cantidad
   * @return String cantidad
   */
  public String getCantidad() {
    return cantidad;
  }

  /**
   * Obtiene el valor de la posición
   * @return String posición
   */
  public String getPosicion() {
    return posicion;
  }

  /**
   * Método toString
   */
  @Override
  public String toString() {
    return cantidad +" - "+ posicion;
  }

  
}
