/**
 * JUEGO SIETE Y MEDIA
 * 
 * 
 * @author David Márquez Córdoba
 * @author Enrique Capote Molina
 */

public class SieteYMedia {

  public static void main(String[] args) {

    // Atributos
    String nombreJugador;
    int apuesta = 0;
    boolean continuar = true;
    Carta cartaEnJuegoJugador;
    Carta cartaIA;
    boolean repetir;
    String sRepetir;
    boolean seguirJugado = true;
    String sSeguirJugando = "no";

    // Lógica previa, creación de Jugador
    Jugador jugador1 = new Jugador();

    // Lógica del juego. ///////

    //El juego se realizará al menos una vez, y se repetirá mientras haya saldo o el jugador quiera seguir jugando rondas o partidas.

    try {
      do {
  
        System.out.print("\033[H\033[2J");      // Limpieza de terminal
        System.out.flush();                     // Limpieza de terminal
  
        System.out.println("---------------------------------------------------------------------\n");
        System.out.println("+===============================================================+");
        System.out.println("|\t\tBienvenido al juego SIETE y MEDIA\t\t|");
        System.out.println("+===============================================================+");
        System.out.println("\nJugarás contra la IA, sacarás cartas de la baraja hasta llegar");
        System.out.println("a 7 puntos y medio, pero sin pasarte\n");
  
        System.out.printf("Nota: Empiezas con un saldo inicial de \033[0;32m1000 puntos.\033[0m\n\n");
  
        System.out.println("+ - - - - - - - - - - - +");
        System.out.println("|\tCOMENCEMOS\t|");
        System.out.println("+ - - - - - - - - - - - +\n");
  
        System.out.println("1º Creando baraja...");
  
        // Creamos una baraja
        Baraja baraja1 = new Baraja();
  
        System.out.println("\n\033[0;32m** Baraja creada con éxito **\033[0m\n");
  
        System.out.println("2º Ahora vamos a barajarlas...");
  
        // Barajamos las cartas de forma aleatoria
        baraja1.barajar();
  
        System.out.println("\n\033[0;32m** Barajadas con éxito **\033[0m\n");
  
        // Recogemos datos del jugador
        System.out.print("Ingrese su nombre: ");
        nombreJugador = System.console().readLine();
        jugador1.setNombre(nombreJugador);
        seguirJugado = true;
  
        // Creamos la mano o turno del jugador y de la IA
        Mano manoJugador = new Mano();
        Mano manoIA = new Mano();
  
        do {
  
          do {
            // Reiniciamos valor para valorarlo nuevamente.
            repetir = false;
  
            // Comprueba si su saldo es igual o inferior a 0
            if (jugador1.getSaldo() <= 0) {
  
              System.out.println("\nLo siento, no te queda más dinero\n");
              // En ese caso, el juego finalizaría
              System.out.println(" **** F I N ****\n");
  
              // Y se pide al usuario si quiere repetir el juego
              System.out.print("¿Desea repetir el juego? (si/no): ");
              sRepetir = System.console().readLine();
              System.out.println("");
  
              if (sRepetir.equalsIgnoreCase("si")) {
                // En caso que quiera repetir el juego, se tomarán nuevos valores
                repetir = true;
                continuar = true;
                seguirJugado = false;
                // Si el jugador no tiene saldo y quiere seguir jugando se reinicia el Saldo
                jugador1.setSaldo(1000);
  
              } else if (sRepetir.equalsIgnoreCase("no")) {
                // En caso que NO quiera repetir el juego, se tomarán nuevos valores para salir
                // del bucle
                repetir = false;
                seguirJugado = false;
                continuar = false;
              }
  
              // En caso que tengamos dinero suficiente para apostar, pediremos cuánto
            } else {
              // Reseteamos valor
              continuar = true;
  
              // Preguntamos cuanto quiere apostar el jugador
              System.out.print("\nTiene actualmente: "+jugador1.getSaldo()+" puntos. " + "¿Cuánto quiere apostar " + jugador1.getNombre() + "?: ");
              apuesta = Integer.parseInt(System.console().readLine());
  
              // Evaluamos las distintas casuísticas
              // 1º Que la apuesta sea mayor al saldo restante
              // 2º Que apueste 0 puntos
              // 3º Que apueste números negativos
              // 4º Que apueste menos de lo que tiene
              if (apuesta > jugador1.getSaldo()) {
                System.out.println("\nLo siento, no puedes apostar más del dinero que tienes");
                System.out.println("Eres un ludópata, míratelo.\n");
                continuar = false;
              } else if (apuesta == 0) {
                System.out.println("Debes apostar un mínimo");
                continuar = false;
              } else if (apuesta < 0) {
                System.out.println("¡¡No puedes apostar en negativo !!");
                continuar = false;
              } else if (apuesta <= jugador1.getSaldo()) {
                continuar = true;
                 repetir = true;
              }
            }
  
          } while (!continuar && repetir);
  
          //Si el jugador no quiere repetir el juego, continuar tomará el valor false, para que tampoco se ejecute el juego
          if (!repetir) {
            continuar = false;
          }
  
          //En el caso que que se quiera continuar y se pueda seguir jugando
          if (continuar && seguirJugado) {
  
            System.out.println("\n**********************************************");
            System.out.println("*** ¿Hasta dónde estás dispuesto a llegar? ***");
            System.out.println("**********************************************\n");
  
            ///////////////////////////////
            //////// TURNO JUGADOR////////
            /////////////////////////////
  
            //Barajamos de nuevo para la siguiente ronda
            baraja1.barajar();
            baraja1.cartaReinicia();
            //Reinciamos el contador de turno de IA y jugador
            manoIA.reinicia();
            manoJugador.reinicia();
  
            //Jugaremos al menos una vez, y se repetirá siempre y cuando no nos hayamos pasado, saquemos 7.5 o digamos que no queremos seguir tentando la a suerte.
            do {
              //Reiniciamos valor
              seguirJugado = true;
  
              // Creamos un objeto tipo Carta donde almacenaremos la carta extraida de la
              // baraja para poder acceder a sus datos
              cartaEnJuegoJugador = baraja1.extraerCarta();
  
              //Mostramos los valores de la carta extraida
              System.out.print("Ha sacado el ");
              baraja1.mostrarCartaExtraida(cartaEnJuegoJugador);
  
              // System.out.println(cartaEnJuego.getValor());
              manoJugador.acumula(cartaEnJuegoJugador);
  
              System.out.print("\n\nTotal puntos acumulados en esta ronda: " + manoJugador.getPuntosAcumulados() + "\n");
  
              // Valoramos distintas casuísticas ///////
  
              /**
               * 1º Casuística -> Que no hayamos alcanzado 7.5,  entonces nos pedirá si queremos o no continuar tentando a la suerte
               */
              if (manoJugador.getPuntosAcumulados() < 7.5) {
  
                //Controlamos que se introduce si o no y se repetirá la pregunta en caso contrario
                do {
                  System.out.print("\n¿Desea continuar?: ");
                  sSeguirJugando = System.console().readLine();
  
                  //En el caso que se introduzca otro valor distinto a si o no se repetirá la pregunta
                  if (!(sSeguirJugando.equalsIgnoreCase("si") || sSeguirJugando.equalsIgnoreCase("no"))) {
                    System.out.println("No has introducido un valor correcto ,  introduce si o no");
                  }
  
                } while (!sSeguirJugando.equalsIgnoreCase("si") && !sSeguirJugando.equalsIgnoreCase("no"));
  
                //Si se responde correctamente, le daremos el valor correspondiente, para continuar o no
                if (sSeguirJugando.equalsIgnoreCase("si")) {
                  seguirJugado = true;
                } else {
                  seguirJugado = false;
                }
  
              /**
               * 2º Casuística -> Que nos hayamos pasado
               */
              } else if (manoJugador.getPuntosAcumulados() > 7.5) {
  
                System.out.println("\033[0;31mTe has pasado\033[0m");
                jugador1.setSaldoPerdedor(apuesta);
                System.out.println("Tu nuevo saldo es: " + jugador1.getSaldo() + " puntos.");
                break;
  
              /**
               * 3º Casuística -> que hayamos sacado 7.5
               */
              } else if (manoJugador.getPuntosAcumulados() == 7.5) {
                System.out.println("Has llegado a 7,5 vamos a ver que hace la crupiere");
                break;
              }
  
            } while (seguirJugado);
  
            /////////////////////////////
            ////////// TURNO IA//////////
            /////////////////////////////
  
            //Si el jugador no se ha pasado la IA jugará para intentar superar al jugador
            if (manoJugador.getPuntosAcumulados() <= 7.5) {
  
              System.out.print("\033[H\033[2J");            // Limpieza de terminal
              System.out.flush();                           // Limpieza de terminal
  
              System.out.println("******************");
              System.out.println("*     TURNO IA   *");
              System.out.println("******************");
  
              // Reiniciamos el turno
              seguirJugado = true;
  
              //Repetirá el sacar cartas la IA hasta que supera al jugador, saca 7.5, iguala al jugador o se pasa
              do {
  
                //La IA extrae la carta
                cartaIA = baraja1.extraerCarta();
                System.out.print("El crupiere ha sacado el ");
                baraja1.mostrarCartaExtraida(cartaIA);
                System.out.println("\n");
  
                //Acumula su puntuación
                manoIA.acumula(cartaIA);
  
                //Comprobamos si los puntos acumulados de la IA es mayor que los del jugador Y si es inferior a 7.5
                if (manoIA.getPuntosAcumulados() > manoJugador.getPuntosAcumulados() && manoIA.getPuntosAcumulados() <= 7.5) {
  
                  seguirJugado = false;
                  //Se le resta la apuesta al saldo del jugador, ya que la IA ha ganado
                  jugador1.setSaldoPerdedor(apuesta);
  
                  //Mensaje personalizado para el jugador, que ha perdido
                  System.out.println("\033[0;31mHas perdido.\033[0m Lo sentimos, tu nuevo saldo es " + jugador1.getSaldo()+ " puntos.");
  
                //Valoramos si la IA se ha pasado de 7.5
                } else if (manoIA.getPuntosAcumulados() > 7.5) {
                  //Se le suma la apuesta al saldo del jugador, ya que el jugador ha ganado
                  jugador1.setSaldoGanador(apuesta);
                  //Se muestra mensaje personalizado, de que el jugador ha ganado la partida
                  System.out.println("\033[0;32mHas ganado.\033[0m Felicidades, tu nuevo saldo es " + jugador1.getSaldo()+ " puntos.");
                  seguirJugado = false;
                  break;
  
                  //Valoramos si el jugador y la IA han sacado los mismos puntos
                } else if (manoJugador.getPuntosAcumulados() == manoIA.getPuntosAcumulados()) {
                  System.out.println("Empate, esta ronda no habrá vencedor, tu apuesta ha sido devuelta");
                  seguirJugado = false;
  
                  //Valoramos si la IA ha sacado menos puntos que el jugador
                } else if (manoIA.getPuntosAcumulados() < manoJugador.getPuntosAcumulados()) {
                  seguirJugado = true;
                  
                } 
              } while (seguirJugado);
            }
  
            //Reinicio de valor
            seguirJugado = false;
  
            //Controlamos que se introduce si o no y se repetirá la pregunta en caso contrario
            do {
              System.out.print("\n¿Desea jugar otra ronda?: ");
              sSeguirJugando = System.console().readLine();
  
              //En el caso que se introduzca otro valor distinto a si o no se repetirá la pregunta
              if (!(sSeguirJugando.equalsIgnoreCase("si") || sSeguirJugando.equalsIgnoreCase("no"))) {
                System.out.println("No has introducido un valor correcto ,  introduce si o no");
              }
  
            } while (!sSeguirJugando.equalsIgnoreCase("si") && !sSeguirJugando.equalsIgnoreCase("no"));
  
            
            if (sSeguirJugando.equalsIgnoreCase("si")) {
              seguirJugado = true;
  
              System.out.print("\033[H\033[2J");            // Limpieza de terminal
              System.out.flush();                           // Limpieza de terminal
  
            } else if (sSeguirJugando.equalsIgnoreCase("no")) {
              seguirJugado = false;
  
              System.out.print("\033[H\033[2J");            // Limpieza de terminal
              System.out.flush();                           // Limpieza de terminal
  
            }
          }
  
        } while (seguirJugado);
  
        //Controla la salida del bucle en caso de no querer continuar
        if (sSeguirJugando.equalsIgnoreCase("no")) {
          seguirJugado = true;
          repetir = false;
        }
  
      } while (!seguirJugado && repetir);
      //Mensaje de salida
      System.out.println("Gracias por jugar con nosotros. ¡Hasta pronto!\n");

    } catch (NumberFormatException e) {
        System.out.println("");
        System.out.println("ERROR - Solo pueden introducirse números."); 
        System.out.println("Clase de error - "+ e.getClass());
        System.out.println("Mensaje de error - "+e.getMessage());
      } finally {
        System.out.println("");
        System.out.println("Hasta luego");
        System.out.println("");
      }
  }
}