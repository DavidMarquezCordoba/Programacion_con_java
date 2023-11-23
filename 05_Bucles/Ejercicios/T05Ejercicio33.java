/*
 * Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T05Ejercicio33 {
  public static void main(String[] args) {
    
    String asterisco = "*";
    int alturaU = 0;
    int nivel = 1;
    String espacios = " ";

    Scanner teclado = new Scanner(System.in);

    System.out.printf("Introduce la altura de la U: ");
    alturaU = teclado.nextInt();

    while (nivel < alturaU) {

      //Pintamos primer asterisco
      System.out.printf("%s", asterisco);

      //Pintamos espacios (altura -2)
      for (int i = 0; i < alturaU-2; i++) {
        System.out.printf("%s", espacios);
      }

      //Pintamos último asterisco
      System.out.printf("%s", asterisco);
      
      System.out.println("");

      nivel++;
    }

    //Pintamos base U
    System.out.printf(" ");
    for (int i = 0; i < alturaU-2; i++) {
      System.out.printf("%s", asterisco);
    }   
    
    teclado.close();
  }
}
