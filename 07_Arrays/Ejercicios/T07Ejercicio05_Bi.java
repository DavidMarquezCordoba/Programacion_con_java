/**
 * Realiza un programa que rellene un array de 6 filas por 10 columnas 
 * con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
 * A continuación, el programa deberá dar la posición tanto del máximo como del mínimo.
 * 
 * @author David Márquez Córdoba
 */

public class T07Ejercicio05_Bi {
  public static void main(String[] args) {

    int [][] array = new int [15][15];

    int minimo = Integer.MAX_VALUE;
    int maximo = Integer.MIN_VALUE;

    // Rellenamos
    for (int filas = 0; filas < array.length; filas++) {
      for (int columnas = 0; columnas < array[filas].length; columnas++) {
        array [filas][columnas] = (int)(Math.random()*1001);
        if (array[filas][columnas] > maximo) {
          maximo = array[filas][columnas];
        } else if (array[filas][columnas] < minimo) {
          minimo = array[filas][columnas];
        }
      }
    }

    // Mostramos el array por pantalla
    System.out.print("     ");
    //1er FOR para enumerar las columnas
    for (int i = 0; i < array[0].length; i++) {
      System.out.printf("%5s%d","C-", i);
    }
    System.out.print("\n-----------------------------------------------------------------");
    System.out.println("");

    //2o FOR para mostrar cada fila y cada columna
    for (int i = 0; i < array.length; i++) {
      System.out.printf("%s%d |", "F-", i);
      for (int j = 0; j < array[0].length; j++) {
        System.out.printf("%6d", array[i][j]);
      }
      System.out.println("");
    }

    // 3er FOR para recorrer el array en búsqueda de la posicón máximo y mínima
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        if (array[i][j] == maximo) {
          System.out.println("\nEl número máximo es el "+maximo+" y se encuentra en la fila "+i+" y la columna "+j);
        } else if (array[i][j] == minimo){
          System.out.println("\nEl número mínimo es el "+minimo+" y se encuentra en la fila "+i+" y la columna "+j);
        }
      }
    }
    
  }
}
