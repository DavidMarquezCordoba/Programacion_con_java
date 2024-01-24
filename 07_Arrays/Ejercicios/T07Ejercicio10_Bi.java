/**
 * Realiza el juego de las tres en raya.
 * 
 * @author David Márquez Córdoba
 */

public class T07Ejercicio10_Bi {
  public static void main(String[] args) {
    
    //Creamos tablero 3x3
    char [][] tresEnRaya = new char [3][3];

    //Creamos array boleana 3x3 para comprobar que no se ha usado previamente esa casilla
    boolean [][] usado = new boolean[3][3];
    
    //Definimos símbolos para la jugada
    final char X = 'X';
    final char O = 'O';

    //CTE que usaremos para rellenar el tablero a 0
    // final int VACIA = 0;
    final char VACIA = ' ';
    // final int JUGADOR_1 = 0;
    // final int IA = 0;

    //Rellenamos vacío el array
    for (int i = 0; i < tresEnRaya.length; i++) {
      for (int j = 0; j < tresEnRaya[0].length; j++) {
        //Ponemos en todas las posiciones 0
        tresEnRaya[i][j] = VACIA;
      }
    }

    System.out.println("\nBienvenidos al juego 3 x 3");
    System.out.println("==========================\n");

    //Imprimimos las coordenadas del tablero VACIA

    ////////////////////////////////////////////////////////
    //Imprimimos coordenadas de (Columnas)
    System.out.print("    ");
    for (int i = 0; i < tresEnRaya.length; i++) {
      System.out.printf("%d    ", i);
    }
    System.out.println("");
    for (int i = 0; i < tresEnRaya[0].length; i++) {
      //Pintamos las coordenadas (Filas)
      System.out.printf("F%d", i);
      for (int j = 0; j < tresEnRaya.length; j++) {
        System.out.printf(" [%c] ", tresEnRaya[i][j]);
      }
      System.out.println("");
    }
    /////////////////////////////////////////////////////////
    
    System.out.println("");

    //Introducimos por teclado la fila y la columna que deseamos
    System.out.print("Introduce la fila: ");
    int filaJugador = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce la columna: ");
    int columnaJugador = Integer.parseInt(System.console().readLine());

    //Asignamos la coordenada elegida a la jugada del jugador 1
    tresEnRaya[filaJugador][columnaJugador] = X;

    //Imprimos tablero con la X del jugador
    System.out.print("    ");
    for (int i = 0; i < tresEnRaya.length; i++) {
      System.out.printf("%d ", i);
    }
    System.out.println("");

    for (int i = 0; i < tresEnRaya.length; i++) {
      System.out.printf("F-%d", i);
      for (int j = 0; j < tresEnRaya[0].length; j++) {
        if (tresEnRaya[i][j] == JUGADOR_1) {
          System.out.print("X");
          break;
        }
        System.out.println("");
      }
    }


















    //Asignaremos coordenadas aleatorias para la IA
    int filaIA;
    int columnaIA;

    do {
      filaIA = (int)(Math.random()*3);
      columnaIA = (int)(Math.random()*3);

    } while (usado[filaIA][columnaIA]);

    //Asignamos coordenada de la IA al array
    tresEnRaya[filaIA][columnaIA] = IA;
  }
}
