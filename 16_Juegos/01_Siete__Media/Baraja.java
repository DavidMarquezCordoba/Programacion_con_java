public class Baraja {
  //El orden es siempre Aributo- constructores -metodos

  ///////////Atributos
  private String [] palos = {"Oros", "Copas", "Espadas", "Bastos"};
  private String [] valores = {"1","2","3","4","5","6","7","Sota","Caballo","Rey"};
  private Carta [] carta;
  private int numCartas;

  ////////Contructores
  public Baraja (){
    numCartas = this.palos.length * this.valores.length;      // 4 * 10 = 40
    carta = new Carta [numCartas];
    inicializaBaraja();
  }


  /////METODOS
  
  // inicializar es rellenar las cartas con valores
  public void inicializaBaraja(){
    int indice = 0;

    while (indice < numCartas) {
      for (int i = 0; i < palos.length; i++) {
        for (int j = 0; j < valores.length; j++) {
          carta[indice] = new Carta(valores[j], palos[i], puntuacionCarta(j));
          indice++;
        }
      }
    }
  }
  //Método auxiliar
  public double puntuacionCarta(int j){
    // if (j<7) {
    //   return j+1;
    // } else {
    //   return 0.5;
    // }
    return j<7? j+1 : 0.5;
  }

  public void mostrarBaraja(){
    for (int i = 0; i < carta.length; i++) {
      System.out.printf(carta[i].toString());
    }
  }
}
