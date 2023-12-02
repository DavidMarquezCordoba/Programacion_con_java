import java.util.Scanner;

/**
 * Escribe un programa que pinte por pantalla un par de calcetines, de los que
se ponen al lado del árbol de Navidad para que Papá Noel deje sus regalos.
El usuario debe introducir la altura. Suponemos que el usuario introduce una
altura mayor o igual a 4. Observa que la talla de los calcetines y la distancia
que hay entre ellos (dos espacios) no cambia, lo único que varía es la altura.


 * 
 * @author David Márquez Córdoba
 */

public class T05Ejercicio60 {
  public static void main(String[] args) {
    
    int altura = 0;

    Scanner teclado = new Scanner(System.in);

    do {
      System.out.print("Introduzca la altura de los calcetines: ");
      altura = teclado.nextInt();

      if (altura>=4) {
        for (int i = 0; i < altura-2; i++) {

          for (int j = 0; j < 3; j++) {
            System.out.print("*");
          }

          for (int j = 0; j < 4; j++) {
            System.out.print(" ");
          }

          for (int j = 0; j < 3; j++) {
            System.out.print("*");
          }

          System.out.println("");
        }

        for (int i = 0; i < 2; i++) {

          //IZQ
          for (int j = 0; j < 6; j++) {
            System.out.print("*");
          }

          //ESPACIO
          for (int j = 0; j < 1; j++) {
            System.out.print(" ");
          }

          //DCHA
          for (int j = 0; j < 6; j++) {
            System.out.print("*");
          }
          
          System.out.println("");
        }        
      }

      

    } while (altura<4);


    teclado.close();
  }
}


// ***    ***
// ***    ***
// ***    ***
// ***    ***
// ***    ***
// ****** ******
// ****** ******
