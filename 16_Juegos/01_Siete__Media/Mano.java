public class Mano {
  /////////////////////////////////
  ///////////ATRIBUTOS/////////////
  /////////////////////////////////
  private double puntosAcumulados;



  /////////////////////////////////
  ////////CONSTRUCTORES////////////
  /////////////////////////////////

  public Mano() {
    this.puntosAcumulados = 0;
  }

  /////////////////////////////////
  /////////GETTERS & SETTERS///////
  /////////////////////////////////



  public double getPuntosAcumulados() {
    return puntosAcumulados;
  }

  public void setPuntosAcumulados(int puntosAcumulados) {
    this.puntosAcumulados = puntosAcumulados;
  }


  
  /////////////////////////////////
  /////////METODOS/////////////////
  /////////////////////////////////

  /**
   * Acumula el valor obtenido al extraer una carta
   * @param d pasamos por parámetro la carta extraida
   */
  public void acumula(Carta cartaEnJuego){
    puntosAcumulados += cartaEnJuego.getValor();
  }
}
