/**
 * Escribe un programa que lea 15 números por teclado 
 * y que los almacene en un array. Rota los elementos de ese array,
 *  es decir, el elemento de la posición 0 debe pasar a la posición 1, 
 * el de la 1 a la 2, etc. El número que se encuentra en la 
 * última posición debe pasar a la posición 0. Finalmente, 
 * muestra el contenido del array.
 * 
 * @author David Márquez Córdoba
 */

public class T07Ejercicio06 {
  public static void main(String[] args) {
    
    int [] numero = new int [5];

    System.out.println("Introduzca 5 números enteros y pulse INTRO: ");
    
    //Escritura de array

    //Vamos escribiendo en cada una de las posiciones hasta el máximo de longitud del array declarado (5)
    for (int i = 0; i < numero.length; i++) {
      numero [i] = Integer.parseInt(System.console().readLine());
    }

    //Salida por pantalla del array
    for (int i : numero) {
      System.out.printf("%3d", i);
    }

    //Rotamos

    //Para rotar, creamos una variable copiando la última posición, ya que todas las posiciones se aumentarán en 1
    //y si no copiamos el valor de la última posición se perderá

    int aux = numero[numero.length-1];

    //Recorremos el array al revés
    for (int i = numero.length - 1 ; i > 0; i--) {

      //La última posición tomará el valor del penúltimo y así sucesivamente hasta el principio
      numero [i] = numero [i -1];
    }

    //El valor de la posición 0 lo machacaremos con el valor copiado 
    numero[0] = aux;

    System.out.println("");
    
    //Salida por pantalla del array rotado
    for (int i : numero) {
      System.out.printf("%3d", i);
    }

    System.out.println("");
  }
}
