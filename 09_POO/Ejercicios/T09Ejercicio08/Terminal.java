package T09Ejercicio08;

public class Terminal {

  //Atributos
  private String numero;
  private int tiempoConversacion; //En segundos

  //Getters/////
  public String getNumero() {
    return numero;
  }


  public int getTiempoConversacion() {
    return tiempoConversacion;
  }

  //Setters////
  public void setNumero(String numero) {
    this.numero = numero;
  }


  public void setTiempoConversacion(int tiempoConversacion) {
    this.tiempoConversacion = tiempoConversacion;
  }

  //Constructores
  public Terminal(String numero) {
    this.numero = numero;
  }

//Nº 678 11 22 33 - 0s de conversación
  @Override
  public String toString() {
    return "Nº "+numero+ " - "+ tiempoConversacion+"s de conversación.";
  }

  //Método
  public void llama(Terminal t, int tiempoConversacion){
    this.tiempoConversacion += tiempoConversacion;
    t.tiempoConversacion += tiempoConversacion;
  }








  
}
