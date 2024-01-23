/**
 * Modifica el programa anterior de tal forma que no se repita ningún número en
el array.
 * 
 * @author David Márquez Córdoba
 */

public class T07Ejercicio06_Bi {
  public static void main(String[] args) {

    int [][] array = new int [10][10];

    int minimo = Integer.MAX_VALUE;
    int maximo = Integer.MIN_VALUE;
    boolean esRepetido = false;
    // Rellenamos
    for (int filas = 0; filas < array.length; filas++) {
      for (int columnas = 0; columnas < array[filas].length; columnas++) {
        
        //Ejecutamos al menos una vez la generación de un número aleatorio
        do {
          esRepetido=false;
          array [filas][columnas] = (int)(Math.random()*1001);
          //Para comprobar el número es necesario recorrer el array por si hubiera una coincidencia
          for (int i2 = 0; i2 < array.length; i2++) {
            for (int j2 = 0; j2 < array[0].length; j2++) {
              //Comprobamos si el número aleatorio es igual a otro que se encuentre en el array relleno
              if (array [filas][columnas] == array [i2][j2]) {
                esRepetido = true;  //Si lo encuentra ya no es único, es decir, false
              }
            }
          }
          //Se va a estar repitiendo el número aleatorio mientras
        } while (esRepetido);

        
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
