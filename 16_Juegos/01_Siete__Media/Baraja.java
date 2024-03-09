/**
 * Clase Baraja
 * 
 * @author David Márquez Córdoba
 * @author Enrique Capote Molina
 */

public class Baraja {
  //El orden es siempre Aributo- constructores -metodos

  /////////////////////////////////
  ///////////ATRIBUTOS/////////////
  /////////////////////////////////

  private String [] palos = {"Oros", "Copas", "Espadas", "Bastos"};
  private String [] numeroCarta = {"1","2","3","4","5","6","7","Sota","Caballo","Rey"};
  private Carta [] carta;
  private int numCartas;
  private Carta cartaAuxiliar;
  private static int posicionCarta = -1;

  /////////////////////////////////
  ////////CONSTRUCTORES////////////
  /////////////////////////////////

  /**
   * Constructor por defecto de una baraja de cartas con 40 cartas
   */
  public Baraja (){

    //inicializamos el número de cartas multiplicando los palos por los valores (4*10=40)
    numCartas = this.palos.length * this.numeroCarta.length;

    //Declaramos un objeto de tipo carta con 40
    carta = new Carta [numCartas];

    //Llamamos al método inicializarBaraja para dejar cargada cada carta con valores (RECURSIVIDAD)
    inicializaBaraja();
  }

  /////////////////////////////////
  /////////METODOS/////////////////
  /////////////////////////////////
  
  /**
   * Inicializamos la baraja, otorgándole valor a cada una de las cartas de la misma
   */
  public void inicializaBaraja(){

    //Declaramos el índice que recorrerá el array carta
    int indice = 0;

      //Recorremos array a lo largo de palos y valores
      for (int i = 0; i < palos.length; i++) {
        for (int j = 0; j < numeroCarta.length; j++) {

          //Le vamos dando valor a cada carta pasándole por parámetros cada argumento
          carta[indice] = new Carta(numeroCarta[j], palos[i], valorCarta(j));

          //Aumentamos el índice
          indice++;
        }
      }
  }


  /**
   * Método auxiliar para determinar la puntuación de la carta según el valor
   * 
   * @param j valor obtenido del bucle for al inicializar la baraja, determina el número de carta
   * @return devuelve el valor del propio número de la carta o 0,5 en caso de las figuras
   */
  public double valorCarta(int j){
    //Si el valor sacado es menor o igual a 7, tendrá una puntuación equivalente a su valor
    j+=1; //Se le suma uno porque el parámetro recoge la variable de un for, que tiene un -1 por defecto
    if (j<=7) {
      return j;
      //Si es una figura, tan solo contará medio punto
    } else {
      return 0.5;
    }
  }

  /**
   * Método que muestra la baraja en el estado actual
   */
  public void mostrarBaraja(){
    for (int i = 0; i < carta.length; i++) {
      System.out.printf(carta[i].toString());
      System.out.println("");
    }
  }

  /**
   * Ordena de manera aleatoria la baraja, ya que al crearla se generan números correlativos
   */
  public void barajar(){
    for (int i = 0; i < carta.length; i++) {
      int indiceBarajar = (int)(Math.random()*carta.length);
      //Copiamos el valor de la posición del array en un objeto tipo Carta auxiliar
      cartaAuxiliar = carta[i];
      //Pisoteamos el valor real por el aleatorio
      carta[i] = carta[indiceBarajar];
      //Intercambiamos posiciones
      carta[indiceBarajar] = cartaAuxiliar;
    }
  }

  /**
   * Extrae una carta de la baraja
   * 
   * @return Devuelve una carta aleatoria.
   */
  public Carta extraerCarta(){


    posicionCarta++;
    return carta[posicionCarta];
    
  }
  public void cartaReinicia(){
    posicionCarta = 0;
  }

  /**
   * Muestra el contenido de la carta previamente extraida llamando a un toString directamente desde la clase
   */
  public void mostrarCartaExtraida(Carta cartaEnJuego){
    System.out.print(cartaEnJuego);
  }

}