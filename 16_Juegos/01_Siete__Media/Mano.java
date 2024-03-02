/**
 * Clase Mano
 * 
 * @author David Márquez Córdoba
 * @author Enrique Capote Molina
 */

public class Mano {
  /////////////////////////////////
  ///////////ATRIBUTOS/////////////
  /////////////////////////////////

  private double puntosAcumulados;



  /////////////////////////////////
  ////////CONSTRUCTORES////////////
  /////////////////////////////////

  /**
   *  Constructor por defecto de la clase Mano que inicializa los puntos acumulados a 0
   */
  public Mano() {
    this.puntosAcumulados = 0;
  }

  /////////////////////////////////
  /////////GETTERS & SETTERS///////
  /////////////////////////////////


  /**
   * Obtiene el valor de puntos acumulados
   * @return los puntos acumulados de la mano
   */
  public double getPuntosAcumulados() {
    return puntosAcumulados;
  }

  /////////////////////////////////
  /////////METODOS/////////////////
  /////////////////////////////////

  /**
   * Acumula el valor obtenido al extraer una carta
   * @param d pasamos por parÃ¡metro la carta extraida
   */
  public void acumula(Carta cartaEnJuego){
    puntosAcumulados += cartaEnJuego.getValor();
  }

  /**
   * Reinicia los puntos acumulados de cada ronda
   */
  public void reinicia (){
    puntosAcumulados = 0;
  }
}