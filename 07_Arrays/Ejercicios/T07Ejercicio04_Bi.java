import java.util.Scanner;

/**
 * Modifica el programa anterior de tal forma que las sumas parciales y la suma
total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
que el ordenador se queda “pensando” antes de mostrar los números.
 * 
 * @author David Márquez Córdoba
 */
public class T07Ejercicio04_Bi {
  public static void main(String[] args) throws InterruptedException {

    System.out.println("+-------------------------------------------------------------------+");

    int [][] tabla = new int [4][5];

    int sumaFila;
    int sumaColumnas;
    int sumaTotal = 0;

    //Lo usaremos para los índices del bucle for
    int fila;
    int columna;

    // System.out.println("Número de filas");
    Scanner teclado = new Scanner(System.in);

    //Rellenar el Array
    for (fila = 0; fila < tabla.length; fila++) {
      for (columna = 0; columna < tabla[fila].length; columna++) {
        tabla[fila][columna] = (int)(Math.random()*900 + 100);
      }
    }

    //Mostrar el array bidi + sumatoria de cada fila
    for (fila = 0; fila < tabla.length; fila++) {
      sumaFila= 0;
      for (columna = 0; columna < tabla[fila].length; columna++) {
        System.out.printf("|%8d   ", tabla[fila][columna]);
        sumaFila+=tabla[fila][columna];
        Thread.sleep(200);
      }
      System.out.print("|");
      Thread.sleep(1000);
      System.out.print("  "+sumaFila);
      System.out.println(" |");
    }

    //Le damos la vuelta para hacer la sumatoria de columnas
    System.out.println("+-------------------------------------------------------------------+");

    for (int j = 0; j < tabla[0].length; j++) {
      sumaColumnas = 0;
      for (int i = 0; i < tabla.length; i++) {
        sumaColumnas+=tabla[i][j];
      }
      sumaTotal+=sumaColumnas;
      Thread.sleep(1000);
      System.out.printf("|%8d   ", sumaColumnas);
    }
    Thread.sleep(1500);
    System.out.printf("| %d |\n", sumaTotal);
    System.out.println("+-------------------------------------------------------------------+");

    teclado.close();
  }
}
