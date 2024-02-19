/**
 * JUEGO SIETE Y MEDIA
 * 
 * 
 * @author David Márquez Córdoba
 * @author Enrique Capote Molina
 */

public class SieteYMedia {

  public static void main(String[] args) {

    //Atributos
    int ronda;
    String nombreJugador;
    int apuesta;
    boolean continuar = true;
    // int puntuacionManoJugador = 0;
    // int puntuacionManoIA = 0;
    Carta cartaEnJuego;

    boolean repetir;
    String sRepetir;

    boolean seguirJugado;
    String sSeguirJugando;
    
    //Lógica previa, creación de Jugador
    Jugador jugador1 = new Jugador();
    Jugador ia = new Jugador("IA");



    //Lógica
    System.out.println("---------------------------------------------------------------------\n");
    System.out.println("+===============================================================+");
    System.out.println("|\t\tBienvenido al juego SIETE y MEDIA\t\t|");
    System.out.println("+===============================================================+");
    System.out.println("\nJugarás contra la IA, sacarás cartas de la baraja hasta llegar");
    System.out.println("a 7 puntos y medio, pero sin pasarte\n");
    System.out.println("+ - - - - - - - - - - - +");
    System.out.println("|\tCOMENCEMOS\t|");
    System.out.println("+ - - - - - - - - - - - +\n");

    System.out.println("1º Creando baraja...");

    Baraja baraja1 = new Baraja();

    System.out.println("\n** Baraja creada con éxito **\n");

    
    // System.out.println("Barajas");
    // System.out.println("=======");
    // baraja1.mostrarBaraja();

    System.out.println("2º Ahora vamos a barajarlas...");

    baraja1.barajar();

    System.out.println("\n** Barajadas con éxito **\n");

    // System.out.println("Cartas barajadas");
    // System.out.println("================");
    // baraja1.mostrarBaraja();


    // System.out.println("\nAhora vamos a extraer una carta");
    // baraja1.extraerCarta();
    // baraja1.mostrarCartaExtraida();

    System.out.print("Ingrese su nombre: ");
    nombreJugador = System.console().readLine();
    jugador1.setNombre(nombreJugador);

    //Creamos la mano o turno del jugador
    Mano manoJugador = new Mano();

    
    do {
      //Reiniciamos valor
      repetir = false;

      //Comprueba si su saldo es igual o inferior a 0
      if (jugador1.getSaldo() <= 0) {
        System.out.println("\nLo siento, no te queda más dinero");
        //En ese caso, el juego finalizaría
        System.out.println(" **** F I N ****\n");
        //Y se pide al usuario si quiere repetir el juego
        System.out.print("¿Desea repetir el juego?: ");
        sRepetir = System.console().readLine();

        if (sRepetir.equalsIgnoreCase("si")) {
          repetir = true;
        } else if (sRepetir.equalsIgnoreCase("no")){
          repetir = false;
        }

      //En caso que tengamos dinero suficiente para apostar, pediremos cuánto 
      } else {

        //Reseteamos valor
        continuar = true;

        System.out.print("¿Cuánto quiere apostar "+jugador1.getNombre()+"?: ");
        apuesta = Integer.parseInt(System.console().readLine());
    
        //Evaluamos las distintas casuísticas
        // 1º Que la apuesta sea mayor al saldo restante
        // 2º Que apueste 0 €
        // 3º Que apueste números negativos
        if (apuesta > jugador1.getSaldo()) {
          System.out.println("\nLo siento, no puedes apostar más del dinero que tienes");
          System.out.println("Eres un ludópata, míratelo.\n");
          continuar=false;
        } else if (apuesta == 0){
          System.out.println("Debes apostar un mínimo");
          continuar = false;
        } else if (apuesta < 0) {
          System.out.println("No puedes apostar en negativo !!");
          continuar = false;
        }
      }

    } while (continuar == false || repetir == true);

    System.out.println("\n**********************************************");
    System.out.println("*** ¿Hasta dónde estás dispuesto a llegar? ***");
    System.out.println("**********************************************\n");

    do {

      seguirJugado = true;

      cartaEnJuego = baraja1.extraerCarta();
  
      System.out.print("Ha sacado ");
      baraja1.mostrarCartaExtraida();

      // System.out.println(cartaEnJuego.getValor());
      // manoJugador.acumula(cartaEnJuego.getValor());

      System.out.print("\nTotal puntos acumulador: " + cartaEnJuego.getValor());
  
      System.out.print("\n¿Desea continuar?: ");
      sSeguirJugando = System.console().readLine();
  
      if (sSeguirJugando.equalsIgnoreCase("si")) {
        seguirJugado = true;
      } else if (sSeguirJugando.equalsIgnoreCase("no")) {
        seguirJugado = false;
      }
    } while (seguirJugado);


  }
}
