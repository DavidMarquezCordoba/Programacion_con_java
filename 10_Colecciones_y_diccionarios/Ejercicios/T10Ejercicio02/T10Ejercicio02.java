package T10Ejercicio02;

import java.util.ArrayList;

/**
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
y 20 elementos ambos inclusive.
 * 
 * @author David Márquez Córdoba
 */

public class T10Ejercicio02 {
  public static void main(String[] args) {
    
    int numAleatorio;
    int sizeArray;
    int index = 0;

    ArrayList<Integer> arrayNumeros = new ArrayList<Integer>();

    sizeArray = (int)((Math.random()*11)+10);

    //Generamos números aleatorios y lo vamos añadiendo al arraylist
    for (int i = 0; i < sizeArray; i++) {
      numAleatorio = (int)(Math.random()*101);
      arrayNumeros.add(numAleatorio);
    }

    System.out.println("\nLos números generados aleatoriamente entre 0 y 100 son: ");
    //Mostramos 
    for (Integer numeros : arrayNumeros) {
      System.out.print((index+1)+". ");
      System.out.println(numeros);
      index++;
    }

    System.out.println("");
  }
}
