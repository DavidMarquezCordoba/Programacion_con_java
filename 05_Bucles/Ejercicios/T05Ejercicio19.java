/*
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado.
 * 
 * @author David Márquez Córdoba
 */

import java.util.Scanner;

public class T05Ejercicio19 {
  public static void main(String[] args) {
    
    String caracter;
    int altura;
    int nivel=0;
    int longitudCaracter=1;

    Scanner teclado = new Scanner(System.in);

    System.out.printf("Introduce el caracter deseado: ");
    caracter = teclado.nextLine();

    System.out.printf("Introduce la altura deseada: ");
    altura = teclado.nextInt();

    teclado.close();

    //Controlamos los niveles
    while (nivel <= altura+3) {
      
      //Pintamos espacios en blanco - Control espacios
      for (int i = 1; i < altura; i++) {
        System.out.printf(" ");
      }

      //Pintamos los carácteres - Control de carácteres
      for (int i = 0; i < longitudCaracter; i++) {
        System.out.printf("%s", caracter);
      }
      
      System.out.println("");
      nivel++;
      altura--;
      longitudCaracter +=2;
    }

  }
}
