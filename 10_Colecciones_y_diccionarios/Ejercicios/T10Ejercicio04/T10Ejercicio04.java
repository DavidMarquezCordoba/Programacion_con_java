package T10Ejercicio04;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Realiza un programa equivalente al anterior pero en esta ocasión, el programa
debe ordenar palabras en lugar de números.
 * 
 * @author David Márquez Córdoba
 */

public class T10Ejercicio04 {
  public static void main(String[] args) {

    String letraUsuario;
    int index = 0;

    ArrayList<String> arrayLetras = new ArrayList<String>();

    for (int i = 0; i < 10; i++) {
      System.out.print("Introduce una letra ("+(i+1)+"/10"+ "): ");
      letraUsuario = System.console().readLine();
      arrayLetras.add(letraUsuario);
    }

    //Ordenamos
    Collections.sort(arrayLetras);

    for (String numOrdenados : arrayLetras) {
      System.out.print(index+1 + ". ");
      System.out.println(numOrdenados);
      index++;
    }
  
  }
}
