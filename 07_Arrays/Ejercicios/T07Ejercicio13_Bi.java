/**
 * Realiza un programa que calcule la estatura media, mínima y máxima en
centímetros de personas de diferentes países. El array que contiene los
nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”,
“Australia”}. Los datos sobre las estaturas se deben simular mediante un
array de 4 filas por 10 columnas con números aleatorios generados al azar entre
140 y 210. Los decimales de la media se pueden despreciar. Los nombres de
los países se deben mostrar utilizando el array de países (no se pueden escribir
directamente).
 * 
 * @author David Márquez Córdoba
 */

public class T07Ejercicio13_Bi {
  public static void main(String[] args) {
    
    String [] pais = {"España", "Rusia", "Japón", "Australia"};

    int [][] tabla = new int[4][10];

    int valorEstatura;
    int min;
    int max; 
    int suma;

    /**
     * 1er For para rellenar cada uno de los huecos
     */
    for (int i = 0; i < tabla.length; i++) {
      for (int j = 0; j < tabla[0].length; j++) {
        //Sacamos el número aleatorio
        valorEstatura = (int)((Math.random()*71)+140);
        //Asignamos a cada una de las posiciones
        tabla[i][j] = valorEstatura;
      }
    }

    System.out.printf("%67s %3s %3s\n", "MED", "MIN", "MAX");

    /**
     * 2º For para mostrar los resultados
     */
    for (int i = 0; i < tabla.length; i++) {

      System.out.printf("%9s:", pais[i]);

      /**
       * Reinicio de suma, mínimo  y máximo
       */
      suma = 0;
      min = Integer.MAX_VALUE;
      max = Integer.MIN_VALUE;

      for (int j = 0; j < tabla[0].length; j++) {
        System.out.printf("%5d", tabla[i][j]);

        /**
         * Suma de cada uno de los valores de todas las columnas de cada una de las filas (por orden)
         */
        suma += tabla[i][j];

        /**
         * Calcular mínimo y máximo de cada pais
         */
        if (tabla[i][j] > max) {
          max = tabla [i][j];
        } else if (tabla[i][j] < min) {
          min = tabla [i][j];
        }
      }

      System.out.printf("%3s", "|");

      System.out.printf("%4d %3d %3d", suma/tabla[0].length, min, max); //suma de cada columna / número columnas

      System.out.println("");
    }
  }
}
