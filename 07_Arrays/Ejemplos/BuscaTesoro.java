import java.util.InputMismatchException;
import java.util.Scanner;

/**
  * Minijuego "Busca el tesoro"
  *
  * Se colocan una mina y un tesoro de forma aleatoria en un cuadrante de
  * cuatro filas por cinco columnas. El usuario intentará averiguar dónde
  * está el tesoro.
 * 
 * @author David Márquez Córdoba
 */

public class BuscaTesoro {
  public static void main(String[] args) {
    
    try {
      // se definen constantes para representar el
      // contenido de las celdas
      final int VACIA = 0;
      final int TESORO = 1;
      final int MINA = 2;
      final int JUGADA = 3;
  
      Scanner teclado = new Scanner(System.in);
      //Creamos las variables que contendrá el valor de fila-columna que el usuario meta por teclado
      int fila;
      int columna;
  
      //Tablero de 4 filas y 5 columnas de momento vacio.
      int [][] tablero = new int [4][5];
  
      //Inicializamos el tablero con casillas vacias para guardarla en la constante "Vacia"
      for (int i = 0; i < tablero.length; i++) {
        for (int j = 0; j < tablero[0].length; j++) {
          //Es lo mismo que dar valor 0 a todas las casillas
          tablero[i][j] = VACIA;          //////////// 1/4 CONSTANTE ASIGNADA !!!!
        }
      }
  
      //Generamos la posición del TESORO de manera aleatoria en el tablero - Un nº aleatorio para la coordenada i y otra para la j
      int tesoroFila = (int) (Math.random()*4);     //Num aleatorio entero [4,0]
      int tesoroColumna = (int) (Math.random()*5);  //Num aleatorio entero [0,5]
  
      //Asignamos i - j con las coordenadas aleatorias y se la asignamos a TESORO
      tablero [tesoroFila][tesoroColumna] = TESORO;     //////////// 2/4 CONSTANTE ASIGNADA !!!!
  
  
      //Se coloca una casilla de MINA de manera aleatoria en el tablero
      //Pero debe ser distinta a la del Tesoro
      int minaFila;
      int minaColumna;
  
      do {
        //Asignamos al menos una vez las coordenadas para la mina
        minaFila = (int) (Math.random()*4); 
        minaColumna = (int) (Math.random()*5); 
        //Comprobamos que no coinciden ni el valor de fila ni columna para el tesoro con la mina
      } while ((tesoroFila == minaFila) && (tesoroColumna == minaFila));
  
      //Una vez con las coordenadas i -j diferentes a la del tesoro... asignamos a mina
      tablero [minaFila][minaColumna] = MINA;       //////////// 3/4 CONSTANTE ASIGNADA !!!
  
      ///////////////////////////////////
      //////Iniciamos el juego///////////
      ///////////////////////////////////
  
      System.out.println("\nJUEGO DEL TESORO");
      System.out.println("================");
      System.out.println("");
  
      //Creamos opcion booleana para saber si salimos del juego o continuamos
      boolean salida = false;
  
      do {
        //Pintamos el tablero al revés que empiece de 3 hasta el 0, básicamente para que quede más bonito
        for (int i = tablero.length - 1; i >= 0; i--) {
          //Esto pintará 3 |
          //             2 |
          //             1 | ...
          System.out.print(i + " |");
          for (int j = 0; j < tablero[i].length; j++) {
            //En la primera iteración no entrará la X, ya que de momento estamos pintando el tablero, solo pintará espacios en blanco
            if (tablero[i][j] == JUGADA) {
              System.out.printf("%2s", "X");
            } else {
              //Es necesario dejar los espacios para que pueda colocar la X en la columna que el usuario haya pedido
              System.out.printf("%2s", " ");
            }
          }
          System.out.println(""); //Saltamos de línea para pintar la línea siguiente
        }
  
        //Esquina inferior izquierda, espacios en blanco
        System.out.print("   ");
  
        //Pintamos más - para que quede un tablero uniforme por eso se hace 2.2 veces más grande
        for (int i = 0; i < (2.2*tablero[0].length); i++) {
          System.out.print("-");
        }
        
        System.out.print("\n   ");
        // Pinta las coordenadas de las columnas
        for (int j = 0; j < tablero[0].length; j++) {
          System.out.printf("%2d", j);
        }
        System.out.println();
  
        //Pido coordenadas
        System.out.println("Introduce fila: ");
        fila = teclado.nextInt();
  
        System.out.println("Introduce columna: ");
        columna = teclado.nextInt();
  
        //Compruebo lo que hay en las coordenadas introducidas por el jugador
        switch (tablero[fila][columna]) {
          //Va a entrar sí o sí en la primera iteración ya que aún no se ha asignado ninguna posición a la jugada, vacie es lo mismo que [0][0]
          case VACIA:
            tablero[fila][columna] = JUGADA;
            break;
  
          case MINA:
            System.out.println("Lo siento, has perdido");
            salida = true;
            break;
  
          case TESORO:
            System.out.println("ENHORABUENA !!, has encontrado el tesoro");
            salida = true;
            break;
        }
        
      } while (!salida); //Si salimos del bucle do while es porque toco mina o tesoro
      
  
  
      
      /////////////////FIN DEL JUEGO///////////////////////////
  
  
  
  
  
      //Pintamos el tablero final, una vez terminada la partida
      String c = "";
      for (int i = tablero.length - 1; i >= 0; i--) {
        System.out.print(i + " |");
        for (int j = 0; j < tablero[i].length; j++) {
          switch (tablero[i][j]) {
            case VACIA:
              c = " ";
              break;
            case MINA:
              c = "*";
              break;
            case TESORO:
              c = "$";
              break;
            case JUGADA:
              c = "X";
              break;
      default:
          }
          System.out.printf("%2s", c);
        }
        System.out.println();
      }
      System.out.print("   ");
      for (int i = 0; i < (2.2*tablero[0].length); i++) {
        System.out.print("-");
      }
      System.out.print("\n   ");
      for (int j = 0; j < tablero[0].length; j++) {
        System.out.printf("%2d", j);
      }
      teclado.close();
    } catch (InputMismatchException e) {
        System.out.println("");
        System.out.println("ERROR - Solo pueden introducirse números.");
        System.out.println("Clase de error - "+ e.getClass());
        System.out.println("Mensaje de error - "+e.getMessage());
    } finally {
        System.out.println("");
        System.out.println("\nHasta luego");
        System.out.println("");
    }
  }
}
