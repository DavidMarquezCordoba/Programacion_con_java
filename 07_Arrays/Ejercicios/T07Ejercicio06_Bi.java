/**
 * Modifica el programa anterior de tal forma que no se repita ningún número en
el array.
 * 
 * @author David Márquez Córdoba
 */

public class T07Ejercicio06_Bi {
  public static void main(String[] args) {

    int [][] array = new int [6][10];

    int minimo = Integer.MAX_VALUE;
    int maximo = Integer.MIN_VALUE;
    // boolean esRepetido = false;

    //Por defecto se inicializa en false
    boolean[] numerosUsados = new boolean[1001];

    // Rellenamos
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        int numeroAleatorio;
        do {
          //Se genera el número aleatorio
          numeroAleatorio = (int) (Math.random() * 1001);
          //Mientras sea la condición verdadera se va a repetir, pero como está false, continuamos
        } while (numerosUsados[numeroAleatorio]);
        //En la posición i j colocamos el número que ya ha pasado el filtro de si está o no repetido
        array[i][j] = numeroAleatorio;
        //Al valor oobtenido, le damos el valor true, para que si Random lo vuelve a sacar, se repita hasta que sea único
        numerosUsados[numeroAleatorio] = true;

        if (array[i][j] > maximo) {
          maximo = array[i][j];
        } else if (array[i][j] < minimo) {
          minimo = array[i][j];
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
