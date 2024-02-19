public class Jugador {
  //El orden es siempre Aributo- constructores -metodos


  /////////////////////////////////
  ///////////ATRIBUTOS/////////////
  /////////////////////////////////

  private int saldo;      //Saldo inicial
  private String nombre;  //Nombre del jugador
  private int bote;       //Bote acumulado ** no sé si borrarlo


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

  public int getBote() {
    return bote;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    return "Jugador [saldo=" + saldo + ", nombre=" + nombre + ", bote=" + bote + "]";
  }
  
  /////////////////////////////////
  /////////METODOS/////////////////
  /////////////////////////////////
  

  // public void acumula(Carta carta){
    
  // }

  // public void puntuacionMano (){

  // }

  // public void recibirCartas(){

  // }

  // public void realizarApuesta(){
    
  // }



}
