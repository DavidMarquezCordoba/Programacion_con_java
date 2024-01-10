/**
 * Define un array de 12 números enteros con nombre num y asigna los valores
según la tabla que se muestra a continuación. Muestra el contenido de todos
los elementos del array. ¿Qué sucede con los valores de los elementos que no
han sido inicializados?
 * 
 * @author David Márquez Córdoba
 */

public class T07Ejercicio01 {
  public static void main(String[] args) {
    
    int [] num = new int [12];

    num [0] = 39;
    num [1] = -2;

    //Comentamos las posiciones que nos pide el ejercicio

    // num [2] = 39;
    // num [3] = 39;

    num [4] = 0;

    // num [5] = 39;

    num [6] = 14;

    // num [7] = 39;

    num [8] = 5;
    num [9] = 120;

    // num [10] = 39;
    // num [11] = 39;

    for (int i = 0; i < num.length; i++) {
      System.out.println("Posición " + i + " tiene un valor de : " +num[i]);
    }

    //En este caso, el bucle for each da fallo ya que utilizo los valores como índices.
    // for (int i : num) {
    //   System.out.println("Posición " + i + " tiene un valor de : " +num[i]);
    // }
  }
}
