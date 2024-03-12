package T10Ejercicio03;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Escribe un programa que ordene 10 números enteros introducidos por teclado
y almacenados en un objeto de la clase ArrayList.
 * 
 * @author David Márquez Córdoba
 */

public class T10Ejercicio03 {
  public static void main(String[] args) {
    
    int numUsuario;
    int index = 0;

    ArrayList<Integer> arrayNumeros = new ArrayList<Integer>();

    for (int i = 0; i < 10; i++) {
      System.out.print("Introduce un número ("+(i+1)+"/10"+ "): ");
      numUsuario = Integer.parseInt(System.console().readLine());
      arrayNumeros.add(numUsuario);
    }

    //Ordenamos
    Collections.sort(arrayNumeros);

    for (Integer numOrdenados : arrayNumeros) {
      System.out.print(index+1 + ". ");
      System.out.println(numOrdenados);
      index++;
    }
  }
}
