public class Baraja {
  //El orden es siempre Aributo- constructores -metodos

  ///////////Atributos
  private String [] palos = {"Oros", "Copas", "Espadas", "Bastos"};
  private String [] numeroCarta = {"1","2","3","4","5","6","7","Sota","Caballo","Rey"};
  private Carta [] carta;
  private int numCartas;

  ////////Contructores
  public Baraja (){
    //inicializamos el número de cartas multiplicando los palos por los valores (4*10=40)
    numCartas = this.palos.length * this.numeroCarta.length;
    //Declaramos un objeto de tipo carta con 40
    carta = new Carta [numCartas];
    //Llamamos al método inicializarBaraja para dejar cargada cada carta con valores
    inicializaBaraja();
  }


  /////METODOS
  
  // Inicializar es rellenar las cartas con valores
  public void inicializaBaraja(){
    //Declaramos el índice que recorrerá el array tomando valores en dada posición
    int indice = 0;

    //Mientras que el índice sea menor que el número de cartas inicializadas, continuará obteniendo valores
    while (indice < numCartas) {
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
  }

  //Método auxiliar para determinar la puntuación de la carta según el valor
  public double valorCarta(int j){
    //Si el valor sacado es menor o igual a 7, tendrá una puntuación equivalente a su valor
    if (j<=7) {
      return j;
      //Si es una figura, tan solo contará medio punto
    } else {
      return 0.5;
    }

    // Condicional ternario
    // return j<7? j+1 : 0.5;
  }

  public void mostrarBaraja(){
    for (int i = 0; i < carta.length; i++) {
      System.out.printf(carta[i].toString());
    }
  }

  public void barajar(){
    
  }
}
