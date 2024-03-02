/**
 * Clase Jugador
 * 
 * @author David Márquez Córdoba
 * @author Enrique Capote Molina
 */

public class Jugador {
  //El orden es siempre Aributo- constructores -metodos


  /////////////////////////////////
  ///////////ATRIBUTOS/////////////
  /////////////////////////////////

  private int saldo;      //Saldo inicial
  private String nombre;  //Nombre del jugador


  /////////////////////////////////
  ////////CONSTRUCTORES////////////
  /////////////////////////////////

  /**
   * Constructor personalizado para crear
   * objetos de tipo Jugador.
   * 
   * Inicializamos el saldo a 1000 cuando 
   * se crea un nuevo jugador
   * 
   * @param nombre Nombre del jugador
   */
  public Jugador(String nombre){
    this.nombre = nombre;
    this.saldo = 1000;
  }

  /**
   * Constructor por defecto, que al inicializarlo,
   * genera un saldo inicial de 1000 pts
   */
  public Jugador(){
    this.saldo = 1000;
  }

  /////////////////////////////////
  /////////GETTERS & SETTERS///////
  /////////////////////////////////

  public int getSaldo() {
    return saldo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setSaldo(int saldo) {
    this.saldo = saldo;
  }

  public void setSaldoGanador(int saldo) {
    this.saldo += saldo;
  }
  public void setSaldoPerdedor(int saldo) {
    this.saldo -= saldo;
  }


}